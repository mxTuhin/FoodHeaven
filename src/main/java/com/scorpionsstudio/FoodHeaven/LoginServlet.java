package com.scorpionsstudio.FoodHeaven;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.http.HttpSession;


@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends ConnectionBlock {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out=response.getWriter();
        try{



            ps = con.prepareStatement("SELECT * FROM user WHERE email = ? AND password = ?");

            ps.setString(1, request.getParameter("email"));
            ps.setString(2, request.getParameter("password"));
            rs = ps.executeQuery();
            //boolean loginCredential = false;
            if (rs.next() == true)
            {
                HttpSession session = request.getSession();
                session.setAttribute("isLoggedIn", "true");
                session.setAttribute("user", rs);
                response.sendRedirect("");

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


