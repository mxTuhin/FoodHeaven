package org.apache.jsp;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/app.jsp", out, false);
      out.write('\n');

    ResultSet rsLoc= (ResultSet) session.getAttribute("user");
    ConnectionBlock cb=new ConnectionBlock();
    ResultSet restaurants=null;
    ResultSet chat=null;
    try{
        cb.ps = cb.con.prepareStatement("SELECT * FROM admin WHERE is_superadmin!=1 ORDER BY id DESC");
        cb.rs = cb.ps.executeQuery();
        restaurants= cb.rs;
        String isLoggedIn = (String)session.getAttribute("isLoggedIn");
        if(isLoggedIn=="true"){
            int sender_id=rsLoc.getInt("id");

            cb.ps = cb.con.prepareStatement("SELECT * FROM save_conversation WHERE sender_id=sender_id");
            cb.rs = cb.ps.executeQuery();
            chat=cb.rs;
        }

    }
    catch (Exception e){
        System.out.println("meow");
    }



      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>FoodHeaven</title>\n");
      out.write("</head>\n");
      out.write("<body onload=\"addNavActive()\">\n");
      out.write("\n");
      out.write("<!-- SLIDER Start\n");
      out.write("================================================== -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<section id=\"slider-area\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div id=\"slider\" class=\"nivoSlider\">\n");
      out.write("                    <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/slider.jpg\" alt=\"\" />\n");
      out.write("                    <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/slider1.jpg\" alt=\"\"/>\n");
      out.write("                    <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/slider2.jpg\" alt=\"\" />\n");
      out.write("                </div>\t<!-- End of /.nivoslider -->\n");
      out.write("            </div>\t<!-- End of /.col-md-12 -->\n");
      out.write("        </div>\t<!-- End of /.row -->\n");
      out.write("    </div>\t<!-- End of /.container -->\n");
      out.write("</section> <!-- End of Section -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- FEATURES Start\n");
      out.write("================================================== -->\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/free_Shipping.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- CATAGORIE Start\n");
      out.write("================================================== -->\n");
      out.write("\n");
      out.write("<section id=\"catagorie\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"block\">\n");
      out.write("                    <div class=\"block-heading\">\n");
      out.write("                        <h2>OUR FOOD CATEGORIES</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6 col-md-4\">\n");
      out.write("                            <div class=\"thumbnail\">\n");
      out.write("                                <a class=\"catagotie-head\" href=\"blog-single.html\">\n");
      out.write("                                    <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/category-image-1.jpg\" alt=\"...\">\n");
      out.write("                                    <h3>Beef Steak</h3>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"caption\">\n");
      out.write("                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Iste, aut, esse, laborum placeat id illo a expedita aperiam...</p>\n");
      out.write("                                    <p>\n");
      out.write("                                        <a href=\"blog-single.html\" class=\"btn btn-default btn-transparent\" role=\"button\">\n");
      out.write("                                            <span>Check Items</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\t<!-- End of /.caption -->\n");
      out.write("                            </div>\t<!-- End of /.thumbnail -->\n");
      out.write("                        </div>\t<!-- End of /.col-sm-6 col-md-4 -->\n");
      out.write("                        <div class=\"col-sm-6 col-md-4\">\n");
      out.write("                            <div class=\"thumbnail\">\n");
      out.write("                                <a class=\"catagotie-head\" href=\"blog-single.html\">\n");
      out.write("                                    <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/category-image-2.jpg\" alt=\"...\">\n");
      out.write("                                    <h3>Miscellaneous</h3>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"caption\">\n");
      out.write("                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Iste, aut, esse, laborum placeat id illo a expedita aperiam...</p>\n");
      out.write("                                    <p>\n");
      out.write("                                        <a href=\"blog-single.html\" class=\"btn btn-default btn-transparent\" role=\"button\">\n");
      out.write("                                            <span>Check Items</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\t<!-- End of /.caption -->\n");
      out.write("                            </div>\t<!-- End of /.thumbnail -->\n");
      out.write("                        </div>\t<!-- End of /.col-sm-6 col-md-4 -->\n");
      out.write("                        <div class=\"col-sm-6 col-md-4\">\n");
      out.write("                            <div class=\"thumbnail\">\n");
      out.write("                                <a class=\"catagotie-head\" href=\"blog-single.html\">\n");
      out.write("                                    <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/category-image-3.jpg\" alt=\"...\">\n");
      out.write("                                    <h3>Elegant Apparel</h3>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"caption\">\n");
      out.write("                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Iste, aut, esse, laborum placeat id illo a expedita aperiam...</p>\n");
      out.write("                                    <p>\n");
      out.write("                                        <a href=\"blog-single.html\" class=\"btn btn-default btn-transparent\" role=\"button\">\n");
      out.write("                                            <span>Check Items</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\t<!-- End of /.caption -->\n");
      out.write("                            </div>\t<!-- End of /.thumbnail -->\n");
      out.write("                        </div>\t<!-- End of /.col-sm-6 col-md-4 -->\n");
      out.write("                    </div>\t<!-- End of /.row -->\n");
      out.write("                </div>\t<!-- End of /.block -->\n");
      out.write("            </div>\t<!-- End of /.col-md-12 -->\n");
      out.write("        </div>\t<!-- End of /.row -->\n");
      out.write("    </div>\t<!-- End of /.container -->\n");
      out.write("</section>\t<!-- End of Section -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- PRODUCTS Start\n");
      out.write("================================================== -->\n");
      out.write("\n");
      out.write("<section id=\"products\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"products-heading\">\n");
      out.write("                    <h2>Restaurants</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            ");

                int i =1;
                while (restaurants.next()){


            
      out.write("\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                <div class=\"products\">\n");
      out.write("                    <a href=\"shop/?id=");
      out.print(restaurants.getInt("id"));
      out.write("&name=");
      out.print(restaurants.getString("restaurant_name"));
      out.write("\">\n");
      out.write("                        <img style=\"height: 280px !important;\" src=\"");
      out.print(StaticVars.baseURL);
      out.write("uploads/");
      out.print(restaurants.getString("logo"));
      out.write("\" alt=\"\">\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"shop/?id=");
      out.print(restaurants.getInt("id"));
      out.write("&name=");
      out.print(restaurants.getString("restaurant_name"));
      out.write("\">\n");
      out.write("                        <h4>");
      out.print(restaurants.getString("restaurant_name"));
      out.write("</h4>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"view-link shutter\" href=\"shop/?id=");
      out.print(restaurants.getInt("id"));
      out.write("&name=");
      out.print(restaurants.getString("restaurant_name"));
      out.write("\">\n");
      out.write("                        Check Offers</a>\n");
      out.write("                </div>\t<!-- End of /.products -->\n");
      out.write("            </div>\t<!-- End of /.col-md-3 -->\n");
      out.write("            ");

                }
            
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("        </div>\t<!-- End of /.row -->\n");
      out.write("    </div>\t<!-- End of /.container -->\n");
      out.write("</section>\t<!-- End of Section -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- CALL TO ACTION Start\n");
      out.write("================================================== -->\n");
      out.write("\n");
      out.write("<section id=\"call-to-area\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"block\">\n");
      out.write("                    <div class=\"block-heading\">\n");
      out.write("                        <h2>Our Partners</h2>\n");
      out.write("                    </div>\n");
      out.write("                </div>\t<!-- End of /.block -->\n");
      out.write("                <div id=\"owl-example\" class=\"owl-carousel\">\n");
      out.write("\n");
      out.write("                    <div> <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/company-1.png\" alt=\"\"></div>\n");
      out.write("                    <div> <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/company-2.png\" alt=\"\"></div>\n");
      out.write("                    <div> <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/company-3.png\" alt=\"\"></div>\n");
      out.write("                    <div> <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/company-4.png\" alt=\"\"></div>\n");
      out.write("                    <div> <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/company-5.png\" alt=\"\"></div>\n");
      out.write("                    <div> <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/company-6.png\" alt=\"\"></div>\n");
      out.write("                    <div> <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/company-8.png\" alt=\"\"></div>\n");
      out.write("                    <div> <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/company-9.png\" alt=\"\"></div>\n");
      out.write("                </div>\t<!-- End of /.Owl-Slider -->\n");
      out.write("            </div>\t<!-- End of /.col-md-12 -->\n");
      out.write("        </div> <!-- End Of /.Row -->\n");
      out.write("    </div> <!-- End Of /.Container -->\n");
      out.write("</section>\t<!-- End of Section -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- FOOTER Start\n");
      out.write("================================================== -->\n");
      out.write("<script>\n");
      out.write("    function addNavActive(){\n");
      out.write("        document.getElementById(\"homeNavButton\").classList.add(\"active\");\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/footer.jsp", out, false);
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
