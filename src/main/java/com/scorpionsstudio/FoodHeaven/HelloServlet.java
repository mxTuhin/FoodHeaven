package com.scorpionsstudio.FoodHeaven;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "landingPage", value = "/hello")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Object data="Random Data To SHow";
        request.setAttribute("data", data);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    public void destroy() {
    }
}