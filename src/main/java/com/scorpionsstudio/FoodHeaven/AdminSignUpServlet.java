package com.scorpionsstudio.FoodHeaven;



import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Random;

import javax.servlet.http.HttpSession;
import com.scorpionsstudio.FoodHeaven.ConnectionBlock;

@WebServlet(name = "AdminSignUpServlet", value = "/AdminSignUpServlet")
@MultipartConfig(fileSizeThreshold=1024*1024*2, // 2MB
        maxFileSize=1024*1024*10,      // 10MB
        maxRequestSize=1024*1024*50)   // 50MB
public class AdminSignUpServlet extends ConnectionBlock {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }
    private static final String SAVE_DIR = "resources";
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Part filePart = request.getPart("file_logo");
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
            ps = con.prepareStatement("SELECT email FROM admin WHERE email = ?");
            ps.setString(1, request.getParameter("email"));
            rs = ps.executeQuery();

            if(rs.next() != true)
            {
                ps = con.prepareStatement("INSERT INTO admin (id, restaurant_name, city, email, password, logo) VALUES(null,?, ?, ?, ?, ?)");

                ps.setString(1, request.getParameter("restaurant_name"));
                ps.setString(2, request.getParameter("city"));
                ps.setString(3, request.getParameter("email"));
                ps.setString(4, request.getParameter("password"));
                ps.setString(5, tempName);


                ps.executeUpdate();
                response.sendRedirect("");
            }
            else
            {
                writer.println("User Already Exists");
            }

            request.setAttribute("message", "Success");
            response.sendRedirect("admin");

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
