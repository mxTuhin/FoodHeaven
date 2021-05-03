package com.scorpionsstudio.FoodHeaven;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DeleteFoodServlet", value = "/DeleteFoodServlet")
public class DeleteFoodServlet extends ConnectionBlock {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        try{
            ps = con.prepareStatement("DELETE FROM foods WHERE id=?");

            ps.setString(1, request.getParameter("id"));
            ps.executeUpdate();
            response.sendRedirect("admin/dashboard/");
        }
        catch (Exception e){
            out.println(e);
        }

        out.println(request.getParameter("id"));
    }
}
