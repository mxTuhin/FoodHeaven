package com.scorpionsstudio.FoodHeaven;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AddToTempCart", value = "/AddToTempCart")
public class AddToTempCart extends ConnectionBlock{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        try{
            ps = con.prepareStatement("INSERT INTO temp_cart (id, user_id, admin_id, food_name, quantity, price, sub_total, image) VALUES(null,?, ?, ?, ?, ?, ?, ?)");

            ps.setString(1, request.getParameter("user_id"));
            ps.setString(2, request.getParameter("admin_id"));
            ps.setString(3, request.getParameter("food_name"));
            ps.setString(4, "1");
            ps.setString(5, request.getParameter("price"));
            ps.setString(6, request.getParameter("sub_total"));
            ps.setString(7, request.getParameter("image"));


            ps.executeUpdate();
        }
        catch (Exception e){

        }
    }
}
