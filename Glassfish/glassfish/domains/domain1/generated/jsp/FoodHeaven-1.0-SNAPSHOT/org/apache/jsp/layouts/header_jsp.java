package org.apache.jsp.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.scorpionsstudio.FoodHeaven.*;
import java.sql.ResultSet;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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

    ResultSet rsLoc=null;
    ConnectionBlock cb=null;
    ResultSet cart_food=null;

    try{
        rsLoc= (ResultSet) session.getAttribute("user");
        cb=new ConnectionBlock();


        cb.ps = cb.con.prepareStatement("SELECT * FROM temp_cart WHERE user_id=? ORDER BY id ASC");
        cb.ps.setString(1, ""+rsLoc.getInt("id"));
        cb.rs = cb.ps.executeQuery();
        cart_food= cb.rs;
    }
    catch (Exception e){
        System.out.println("meow");
    }



      out.write("\r\n");
      out.write("<!-- TOP HEADER Start\r\n");
      out.write("================================================== -->\r\n");
      out.write("\r\n");
      out.write("<section id=\"top\" class=\"customBlock\">\r\n");
      out.write("    <div class=\"container \">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-5 \">\r\n");
      out.write("                <p class=\"contact-action \"><i class=\"fa fa-phone-square\"></i>IN CASE OF ANY QUESTIONS, CALL THIS NUMBER: <strong>+880 1678710456</strong></p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-5 clearfix\">\r\n");
      out.write("                <ul class=\"login-cart\">\r\n");
      out.write("\r\n");
      out.write("                    ");

                        String isLoggedIn = (String)session.getAttribute("isLoggedIn");
                        if(isLoggedIn!="true"){


                    
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a data-toggle=\"modal\" data-target=\"#LoginModal\" href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-user\"></i>\r\n");
      out.write("                            Login\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a data-toggle=\"modal\" data-target=\"#SignUpModal\" href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-user\"></i>\r\n");
      out.write("                            SignUp\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    ");

                        }else{
                    
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/LogoutServlet\">\r\n");
      out.write("                            <i class=\"fas fa-sign-out-alt\"></i>\r\n");
      out.write("                            Logout\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <div style=\"z-index: 100000 !important;\" class=\"cart dropdown\">\r\n");
      out.write("                            <a data-toggle=\"dropdown\" href=\"#\"><i class=\"fa fa-shopping-cart\"></i>Food Bag (<span id=\"cardCounter\">0</span> Foods)</a>\r\n");
      out.write("                            <div style=\"width: 450px\" class=\"dropdown-menu dropup\">\r\n");
      out.write("                                <span class=\"caret\"></span>\r\n");
      out.write("                                <div id=\"cartBoxCustom\" class=\"row\">\r\n");
      out.write("                                    <div style=\"padding-bottom: 10px\" class=\"col-11 col-sm-11\">\r\n");
      out.write("                                        <div class=\"col-2 col-sm-2\">\r\n");
      out.write("                                            <img class=\"pull-left\" src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/product-item.jpg\" alt=\"\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-5 col-sm-5\">\r\n");
      out.write("                                            <div style=\"color: black\" class=\"col-12 col-sm-12\">\r\n");
      out.write("                                                Food name\r\n");
      out.write("                                            </div><br>\r\n");
      out.write("                                            <div style=\"color: black\" class=\"col-12 col-sm-12\">\r\n");
      out.write("                                                Quantity\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div style=\"color: black; padding-top: 25px\" class=\"col-3 col-sm-3\">\r\n");
      out.write("                                            Price\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div style=\"color: black; padding-top: 25px\" class=\"col-2 col-sm-2\">\r\n");
      out.write("                                            Subtotal\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    ");

                                        while(cart_food.next()){
                                    
      out.write("\r\n");
      out.write("                                    <div style=\"padding-bottom: 10px\" class=\"col-11 col-sm-11\">\r\n");
      out.write("                                        <div class=\"col-2 col-sm-2\">\r\n");
      out.write("                                            <img class=\"pull-left\" src=\"");
      out.print(StaticVars.baseURL);
      out.write("uploads/");
      out.print(cart_food.getString("image"));
      out.write("\" alt=\"\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-5 col-sm-5\">\r\n");
      out.write("                                            <div style=\"color: black\" class=\"col-12 col-sm-12\">\r\n");
      out.write("                                                ");
      out.print(cart_food.getString("food_name"));
      out.write("\r\n");
      out.write("                                            </div><br>\r\n");
      out.write("                                            <div style=\"color: black\" class=\"col-12 col-sm-12\">\r\n");
      out.write("                                                ");
      out.print(cart_food.getInt("quantity"));
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div style=\"color: black; padding-top: 25px\" class=\"col-3 col-sm-3\">\r\n");
      out.write("                                            ");
      out.print(cart_food.getFloat("price"));
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div style=\"color: black; padding-top: 25px\" class=\"col-2 col-sm-2\">\r\n");
      out.write("                                            ");
      out.print(cart_food.getFloat("sub_total"));
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <a href=\"#\" style=\"color: white\" class=\"btn btn-primary btn-sm\">Checkout</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    ");

                        }
                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-2\">\r\n");
      out.write("                <div class=\"search-box\">\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <input placeholder=\"Search Here\" type=\"text\" class=\"form-control\">\r\n");
      out.write("                        <span class=\"input-group-btn\">\r\n");
      out.write("\t\t\t\t\t        \t<button class=\"btn btn-default\" type=\"button\"></button>\r\n");
      out.write("\t\t\t\t\t      \t</span>\r\n");
      out.write("                    </div><!-- /.input-group -->\r\n");
      out.write("                </div><!-- /.search-box -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div> <!-- End Of /.row -->\r\n");
      out.write("    </div>\t<!-- End Of /.Container -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</section>  <!-- End of /Section -->\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"LoginModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-dialog-centered modal-lg\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"LoginModallLongTitle\">Login Here</h5>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\"><br>\r\n");
      out.write("                <form action=\"");
      out.print(request.getContextPath());
      out.write("/LoginServlet\" method=\"POST\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <label>Email</label>\r\n");
      out.write("                        <input placeholder=\"E-mail address\" type=\"text\" name=\"email\" value=\"\" class=\"form-control\"><br>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div >\r\n");
      out.write("                        <label>Password</label>\r\n");
      out.write("                        <input placeholder=\"Password\" type=\"password\"name=\"password\" value=\"\" class=\"form-control\"><br>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div align=\"center\" class=\"container \">\r\n");
      out.write("                        <input type=\"submit\" class=\"bt btn-info form-control\" value=\"SignIn\"><br>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"SignUpModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-dialog-centered modal-lg\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"SignUpModalLongTitle\">Sign Up Here</h5>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\"><br>\r\n");
      out.write("                <form action=\"");
      out.print(request.getContextPath());
      out.write("/SignUpServlet\" method=\"GET\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <label>Name</label>\r\n");
      out.write("                        <input placeholder=\"Enter Your Name\" type=\"text\" name=\"name\" value=\"\" class=\"form-control\"><br>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <label>Cell Number</label>\r\n");
      out.write("                        <input placeholder=\"Enter Your Cell Number\" type=\"text\" name=\"cellnum\" value=\"\" class=\"form-control\"><br>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <label>Email</label>\r\n");
      out.write("                        <input placeholder=\"Enter Your Email\" type=\"text\" name=\"email\" value=\"\" class=\"form-control\"><br>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div >\r\n");
      out.write("                        <label>Password</label>\r\n");
      out.write("                        <input placeholder=\"Enter Your password\" type=\"password\" name=\"password\" value=\"\" class=\"form-control\"><br>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div align=\"center\" class=\"container \">\r\n");
      out.write("                        <input type=\"submit\" class=\"bt btn-info form-control\" value=\"SignUp\"><br>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- LOGO Start\r\n");
      out.write("================================================== -->\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath() );
      out.write("\">\r\n");
      out.write("                    <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/logo.png\" alt=\"logo\">\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\t<!-- End of /.col-md-12 -->\r\n");
      out.write("        </div>\t<!-- End of /.row -->\r\n");
      out.write("    </div>\t<!-- End of /.container -->\r\n");
      out.write("</header> <!-- End of /Header -->\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar_links.jsp", out, false);
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
