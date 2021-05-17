package org.apache.jsp.restaurant;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.scorpionsstudio.FoodHeaven.*;
import com.scorpionsstudio.FoodHeaven.ConnectionBlock;
import java.sql.ResultSet;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      response.setHeader("X-Powered-By", "JSP/2.3");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../layouts/app.jsp", out, false);
      out.write('\r');
      out.write('\n');

    ResultSet rsLoc= (ResultSet) session.getAttribute("user");
    ConnectionBlock cb=new ConnectionBlock();
    ResultSet restaurants=null;
    try{
        cb.ps = cb.con.prepareStatement("SELECT * FROM admin WHERE is_superadmin!=1 ORDER BY id DESC");
        cb.rs = cb.ps.executeQuery();
        restaurants= cb.rs;
    }
    catch (Exception e){
        System.out.println("meow");
    }



      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>FoodHeaven</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        #noResLog{\r\n");
      out.write("            color: #1d87be;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"addNavActive()\">\r\n");
      out.write("\r\n");
      out.write("<!-- SLIDER Start\r\n");
      out.write("================================================== -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- FEATURES Start\r\n");
      out.write("================================================== -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- PRODUCTS Start\r\n");
      out.write("================================================== -->\r\n");
      out.write("\r\n");
      out.write("<section id=\"products\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("                <div class=\"products-heading\">\r\n");
      out.write("                    <h2>Restaurants <small>(Allow Location access to auto sort your nearby restaurants)</small></h2>\r\n");
      out.write("                    <form>\r\n");
      out.write("                        <select id=\"citySelect\" onchange=\"trigger_city()\" class=\"form-control\">\r\n");
      out.write("                            <option value=\"NotSelected\" selected disabled>Select A City</option>\r\n");
      out.write("                            <option value=\"Dhaka\">Dhaka</option>\r\n");
      out.write("                            <option value=\"Narayanganj\">Narayanganj</option>\r\n");
      out.write("                            <option value=\"Narayanganj\">Chittagong</option>\r\n");
      out.write("                            <option value=\"Narayanganj\">Sylhet</option>\r\n");
      out.write("                            <option value=\"Narayanganj\">Rajshahi</option>\r\n");
      out.write("                            <option value=\"Narayanganj\">Khulna</option>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div id=\"restaurant_list\" class=\"row\">\r\n");
      out.write("            ");

                int i =1;
                while (restaurants.next()){


            
      out.write("\r\n");
      out.write("            <div class=\"col-md-3\">\r\n");
      out.write("                <div class=\"products\">\r\n");
      out.write("                    <a href=\"../shop/?id=");
      out.print(restaurants.getInt("id"));
      out.write("&name=");
      out.print(restaurants.getString("restaurant_name"));
      out.write("\">\r\n");
      out.write("                        <img style=\"height: 280px !important;\" src=\"");
      out.print(StaticVars.baseURL);
      out.write("uploads/");
      out.print(restaurants.getString("logo"));
      out.write("\" alt=\"\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"../shop/?id=");
      out.print(restaurants.getInt("id"));
      out.write("&name=");
      out.print(restaurants.getString("restaurant_name"));
      out.write("\">\r\n");
      out.write("                        <h4>");
      out.print(restaurants.getString("restaurant_name"));
      out.write("</h4>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a class=\"view-link shutter\" href=\"../shop/?id=");
      out.print(restaurants.getInt("id"));
      out.write("&name=");
      out.print(restaurants.getString("restaurant_name"));
      out.write("\">\r\n");
      out.write("                        Check Offers</a>\r\n");
      out.write("                </div>\t<!-- End of /.products -->\r\n");
      out.write("            </div>\t<!-- End of /.col-md-3 -->\r\n");
      out.write("            ");

                }
            
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\t<!-- End of /.row -->\r\n");
      out.write("    </div>\t<!-- End of /.container -->\r\n");
      out.write("</section>\t<!-- End of Section -->\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../layouts/free_Shipping.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- CALL TO ACTION Start\r\n");
      out.write("================================================== -->\r\n");
      out.write("\r\n");
      out.write("<section id=\"call-to-area\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("                <div class=\"block\">\r\n");
      out.write("                    <div class=\"block-heading\">\r\n");
      out.write("                        <h2>Our Partners</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\t<!-- End of /.block -->\r\n");
      out.write("                <div id=\"owl-example\" class=\"owl-carousel\">\r\n");
      out.write("\r\n");
      out.write("                    <div> <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/company-1.png\" alt=\"\"></div>\r\n");
      out.write("                    <div> <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/company-2.png\" alt=\"\"></div>\r\n");
      out.write("                    <div> <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/company-3.png\" alt=\"\"></div>\r\n");
      out.write("                    <div> <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/company-4.png\" alt=\"\"></div>\r\n");
      out.write("                    <div> <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/company-5.png\" alt=\"\"></div>\r\n");
      out.write("                    <div> <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/company-6.png\" alt=\"\"></div>\r\n");
      out.write("                    <div> <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/company-8.png\" alt=\"\"></div>\r\n");
      out.write("                    <div> <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/company-9.png\" alt=\"\"></div>\r\n");
      out.write("                </div>\t<!-- End of /.Owl-Slider -->\r\n");
      out.write("            </div>\t<!-- End of /.col-md-12 -->\r\n");
      out.write("        </div> <!-- End Of /.Row -->\r\n");
      out.write("    </div> <!-- End Of /.Container -->\r\n");
      out.write("</section>\t<!-- End of Section -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- FOOTER Start\r\n");
      out.write("================================================== -->\r\n");
      out.write("<script>\r\n");
      out.write("    function addNavActive(){\r\n");
      out.write("        document.getElementById(\"restaurantNavButton\").classList.add(\"active\");\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("    // Step 1: Get user coordinates\r\n");
      out.write("    function getCoordintes() {\r\n");
      out.write("        var options = {\r\n");
      out.write("            enableHighAccuracy: true,\r\n");
      out.write("            timeout: 5000,\r\n");
      out.write("            maximumAge: 0\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        function success(pos) {\r\n");
      out.write("            var crd = pos.coords;\r\n");
      out.write("            var lat = crd.latitude.toString();\r\n");
      out.write("            var lng = crd.longitude.toString();\r\n");
      out.write("            var coordinates = [lat, lng];\r\n");
      out.write("            console.log(`Latitude: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lat}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", Longitude: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lng}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("`);\r\n");
      out.write("            getCity(coordinates);\r\n");
      out.write("            return;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function error(err) {\r\n");
      out.write("            console.warn(`ERROR(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${err.code}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("): ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${err.message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("`);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        navigator.geolocation.getCurrentPosition(success, error, options);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // Step 2: Get city name\r\n");
      out.write("    function getCity(coordinates) {\r\n");
      out.write("        var xhr = new XMLHttpRequest();\r\n");
      out.write("        var lat = coordinates[0];\r\n");
      out.write("        var lng = coordinates[1];\r\n");
      out.write("\r\n");
      out.write("        // Paste your LocationIQ token below.\r\n");
      out.write("        xhr.open('GET', \"https://us1.locationiq.com/v1/reverse.php?key=pk.c1769988a8486760e61cfdbd148bf12d&lat=\" +\r\n");
      out.write("            lat + \"&lon=\" + lng + \"&format=json\", true);\r\n");
      out.write("        xhr.send();\r\n");
      out.write("        xhr.onreadystatechange = processRequest;\r\n");
      out.write("        xhr.addEventListener(\"readystatechange\", processRequest, false);\r\n");
      out.write("\r\n");
      out.write("        function processRequest(e) {\r\n");
      out.write("            if (xhr.readyState == 4 && xhr.status == 200) {\r\n");
      out.write("                var response = JSON.parse(xhr.responseText);\r\n");
      out.write("                var city = response.address.city;\r\n");
      out.write("                console.log(city);\r\n");
      out.write("                fetch_city_restaurant(city);\r\n");
      out.write("                return;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    getCoordintes();\r\n");
      out.write("\r\n");
      out.write("    function trigger_city(){\r\n");
      out.write("        var city=document.getElementById(\"citySelect\").value;\r\n");
      out.write("        fetch_city_restaurant(city);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function fetch_city_restaurant(city){\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type : 'post',\r\n");
      out.write("            url : '");
      out.print(request.getContextPath());
      out.write("/FetchRestaurant',\r\n");
      out.write("            data:{\r\n");
      out.write("                'city':city\r\n");
      out.write("\r\n");
      out.write("            },\r\n");
      out.write("            success:function(data){\r\n");
      out.write("                console.log(data);\r\n");
      out.write("                document.getElementById(\"restaurant_list\").innerHTML=data;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../layouts/footer.jsp", out, false);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
