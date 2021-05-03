package com.scorpionsstudio.FoodHeaven;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
import java.sql.ResultSet;
import javax.servlet.http.HttpSession;

@WebServlet(name = "UploadFoodInfoServlet", value = "/UploadFoodInfoServlet")
@MultipartConfig(fileSizeThreshold=1024*1024*5, // 5MB
        maxFileSize=1024*1024*10,      // 10MB
        maxRequestSize=1024*1024*50)   // 50MB
public class UploadFoodInfo extends ConnectionBlock {

    private static final String SAVE_DIR = "resources";
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Part filePart = request.getPart("food_image");
        String photo="";
        String path="E:\\Java projects\\FoodHeaven\\src\\main\\webapp\\resources\\uploads";
        File file=new File(path);
        file.mkdir();
        String fileName = getFileName(filePart);

        OutputStream out = null;

        InputStream filecontent = null;

        PrintWriter writer = response.getWriter();
        String tempName=get_random_string()+fileName;
        try {
            out = new FileOutputStream(new File(path + File.separator+tempName));

            filecontent = filePart.getInputStream();


            int read = 0;
            final byte[] bytes = new byte[10240];

            while ((read = filecontent.read(bytes)) != -1) {
                out.write(bytes, 0, read);

                photo=path+"/"+fileName+"1";


            }
            ps = con.prepareStatement("INSERT INTO foods (id, admin_id , name, description, price, image) VALUES(null,?, ?, ?, ?, ?)");

            ps.setString(1, request.getParameter("admin_id"));
            ps.setString(2, request.getParameter("name"));
            ps.setString(3, request.getParameter("description"));
            ps.setString(4, request.getParameter("price"));
            ps.setString(5, tempName);


            ps.executeUpdate();
            request.setAttribute("message", "Success");
            response.sendRedirect("admin/dashboard");

        }
        catch(Exception e)
        {
            request.setAttribute("message", e);

        }
    }

    private String getFileName(final Part part) {
        final String partHeader = part.getHeader("content-disposition");

        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }
    public String get_random_string() {
        String meep = "";
        meep+= Math.random()*100;


        return meep;
    }
}
