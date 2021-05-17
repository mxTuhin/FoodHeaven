package com.scorpionsstudio.FoodHeaven;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FetchRestaurant", value = "/FetchRestaurant")
public class FetchRestaurant extends ConnectionBlock{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean checkAv=false;
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        try{
            System.out.println();
            ps = con.prepareStatement("SELECT * FROM admin WHERE type=? AND city=? ");

            ps.setString(1, "restaurant");
            ps.setString(2, request.getParameter("city"));
            rs = ps.executeQuery();
            //boolean loginCredential = false;

            while(rs.next() == true)
            {
                checkAv=true;
                out.println("<div class=\"col-md-3\">\n" +
                        "                <div class=\"products\">\n" +
                        "                    <a href=\"../shop/?id="+rs.getInt("id")+"\">\n" +
                        "                        <img style=\"height: 280px !important;\" src=\""+StaticVars.baseURL+"uploads/"+rs.getString("logo")+"\" alt=\"\">\n" +
                        "                    </a>\n" +
                        "                    <a href=\"../shop/?id="+rs.getInt("id")+"\">\n" +
                        "                        <h4>"+rs.getString("restaurant_name")+"</h4>\n" +
                        "                    </a>\n" +
                        "                    <a class=\"view-link shutter\" href=\"../shop/?id="+rs.getInt("id")+"\">\n" +
                        "                        Check Offers</a>\n" +
                        "                </div>\t<!-- End of /.products -->\n" +
                        "            </div>\t<!-- End of /.col-md-3 -->");
            }
            if(checkAv==false){
                out.println("<div id=\"noResLog\" align=\"center\" class=\"row\"><b>No Restaurants in this city. Showing Suggestions</b></div><br><br>");
                ps = con.prepareStatement("SELECT * FROM admin WHERE type=? ");

                ps.setString(1, "restaurant");
                rs = ps.executeQuery();
                while(rs.next() == true)
                {
                    out.println("<div class=\"col-md-3\">\n" +
                            "                <div class=\"products\">\n" +
                            "                    <a href=\"../shop/?id="+rs.getInt("id")+"&name="+rs.getString("restaurant_name")+"\">\n" +
                            "                        <img style=\"height: 280px !important;\" src=\""+StaticVars.baseURL+"uploads/"+rs.getString("logo")+"\" alt=\"\">\n" +
                            "                    </a>\n" +
                            "                    <a href=\"../shop/?id="+rs.getInt("id")+"&name="+rs.getString("restaurant_name")+"\">\n" +
                            "                        <h4>"+rs.getString("restaurant_name")+"</h4>\n" +
                            "                    </a>\n" +
                            "                    <a class=\"view-link shutter\" href=\"../shop/?id="+rs.getInt("id")+"$name="+rs.getString("restaurant_name")+"\">\n" +
                            "                        Check Offers</a>\n" +
                            "                </div>\t<!-- End of /.products -->\n" +
                            "            </div>\t<!-- End of /.col-md-3 -->");
                }
            }


        }
        catch (Exception e){
            out.println("<b>Error Fetching Data. Please Refresh</b>");


        }

    }
}
