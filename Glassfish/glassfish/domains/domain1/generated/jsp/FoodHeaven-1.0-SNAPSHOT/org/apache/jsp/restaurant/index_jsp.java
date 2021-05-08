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
      out.write("                    <h2>Restaurants</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            ");

                int i =1;
                while (restaurants.next()){


            
      out.write("\r\n");
      out.write("            <div class=\"col-md-3\">\r\n");
      out.write("                <div class=\"products\">\r\n");
      out.write("                    <a href=\"shop/?id=");
      out.print(restaurants.getInt("id"));
      out.write("\">\r\n");
      out.write("                        <img style=\"height: 280px !important;\" src=\"");
      out.print(StaticVars.baseURL);
      out.write("uploads/");
      out.print(restaurants.getString("logo"));
      out.write("\" alt=\"\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"single-product.html\">\r\n");
      out.write("                        <h4>");
      out.print(restaurants.getString("restaurant_name"));
      out.write("</h4>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a class=\"view-link shutter\" href=\"#\">\r\n");
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
