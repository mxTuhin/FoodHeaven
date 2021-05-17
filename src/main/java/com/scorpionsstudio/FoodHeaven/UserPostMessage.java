package com.scorpionsstudio.FoodHeaven;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

@WebServlet(name = "UserPostMessage", value = "/UserPostMessage")
public class UserPostMessage extends ConnectionBlock {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("meep");
        ResultSet rsLoc=(ResultSet) request.getSession().getAttribute("user");
        try {


            ps = con.prepareStatement("INSERT INTO save_conversation (id, sender_id, sender_name, msg, identifier) VALUES(null, ?, ?, ?, ?)");

            ps.setString(1, ""+rsLoc.getInt("id"));
            if(request.getParameter("identifier").equalsIgnoreCase("Admin")){
                ps.setString(2, rsLoc.getString("restaurant_name"));
            }
            else if(request.getParameter("identifier").equalsIgnoreCase("User")){
                ps.setString(2, rsLoc.getString("name"));
            }

            ps.setString(3, request.getParameter("msg"));
            ps.setString(4, request.getParameter("identifier"));


            ps.executeUpdate();

        }
        catch(Exception e)
        {
            request.setAttribute("message", e);
            writer.println(e);

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        ResultSet rsLoc=(ResultSet) request.getSession().getAttribute("user");

        try {

            ps = con.prepareStatement("INSERT INTO save_conversation (id, sender_id, sender_name, msg, identifier) VALUES(null, ?, ?, ?, ?)");


            if(request.getParameter("identifier").equalsIgnoreCase("Admin")){
                ps.setString(1, request.getParameter("id"));
                ps.setString(2, rsLoc.getString("restaurant_name"));
            }
            else if(request.getParameter("identifier").equalsIgnoreCase("User")){
                ps.setString(1, ""+rsLoc.getInt("id"));
                ps.setString(2, rsLoc.getString("name"));
            }

            ps.setString(3, request.getParameter("msg"));
            ps.setString(4, request.getParameter("identifier"));


            ps.executeUpdate();

        }
        catch(Exception e)
        {
            request.setAttribute("message", e);
            writer.println(e);

        }
    }
}
