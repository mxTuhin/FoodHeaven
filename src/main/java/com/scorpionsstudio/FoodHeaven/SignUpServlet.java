package com.scorpionsstudio.FoodHeaven;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SignUpServlet", value = "/SignUpServlet")
public class SignUpServlet extends ConnectionBlock {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        try{
            ps = con.prepareStatement("SELECT email FROM user WHERE email = ?");
            ps.setString(1, request.getParameter("email"));
            rs = ps.executeQuery();

            if(rs.next() != true)
            {
                ps = con.prepareStatement("INSERT INTO user (id, name, cellnum, email, password) VALUES(null,?, ?, ?,?)");

                ps.setString(1, request.getParameter("name"));
                ps.setString(2, request.getParameter("cellnum"));
                ps.setString(3, request.getParameter("email"));
                ps.setString(4, request.getParameter("password"));

                ps.executeUpdate();
                response.sendRedirect("");
            }
            else
            {
                out.println("User Already Exists");
            }
        }
        catch (Exception e){
            out.println(e);
        }

    }

}


//@WebServlet(name = "SignUpServlet", value = "/SignUpServlet")
//class SignUpServlet extends ConnectionBlock {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
//
//        PrintWriter out=response.getWriter();
//        out.println("<html><body>");
//        out.println("meow");
//        try{
//
//            ps = con.prepareStatement("INSERT INTO user (id, name, cellnum, email, password) VALUES(?, ?, ?,?)");
//
//            ps.setString(1, request.getParameter("name"));
//            ps.setString(2, request.getParameter("cellnum"));
//            ps.setString(3, request.getParameter("email"));
//            ps.setString(4, request.getParameter("password"));
//
//            ps.executeUpdate();
////            response.sendRedirect("/index.jsp");
//        }
//        catch (Exception e){
//            out.println(e);
//        }
//        out.println("</body></html>");
//
//
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//}