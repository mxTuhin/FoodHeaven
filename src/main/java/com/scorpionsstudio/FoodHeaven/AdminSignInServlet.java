package com.scorpionsstudio.FoodHeaven;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AdminSignInServlet", value = "/AdminSignInServlet")
public class AdminSignInServlet extends ConnectionBlock{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out=response.getWriter();
        try{



            ps = con.prepareStatement("SELECT * FROM admin WHERE email = ? AND password = ?");

            ps.setString(1, request.getParameter("email"));
            ps.setString(2, request.getParameter("password"));
            rs = ps.executeQuery();
            //boolean loginCredential = false;
            if (rs.next() == true)
            {
                HttpSession session = request.getSession();
                session.setAttribute("isLoggedInAdmin", "true");
                session.setAttribute("user", rs);
                ps = con.prepareStatement("SELECT * FROM foods WHERE admin_id=?");
                ps.setString(1, rs.getString(1));
                rs = ps.executeQuery();
                session.setAttribute("foods", rs);
                response.sendRedirect("admin/dashboard/");
//                out.println("Correct Username Or password");

            }
            else{
                out.println("Incorrect Username Or password");
            }
        }
        catch (Exception e){
            out.println(e);
        }

    }
}
