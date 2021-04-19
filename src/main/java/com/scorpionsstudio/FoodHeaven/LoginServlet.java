package com.scorpionsstudio.FoodHeaven;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out=response.getWriter();
        out.println("<html><body>");
        out.println("meow");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cse_310_demo_project?", "root", "");
            Statement st ;
            ResultSet rs;
            PreparedStatement ps;
            ps = con.prepareStatement("SELECT email, password FROM user_information WHERE email = ? AND password = ?");

            ps.setString(1, request.getParameter("email"));
            ps.setString(2, request.getParameter("password"));
            rs = ps.executeQuery();
            //boolean loginCredential = false;
            if (rs.next() == true)
            {
                response.sendRedirect("landingPage");
            }
            else{
                out.println("Incorrect Username Or password");
            }
        }
        catch (Exception e){
            out.println(e);
        }
        out.println("</body></html>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
