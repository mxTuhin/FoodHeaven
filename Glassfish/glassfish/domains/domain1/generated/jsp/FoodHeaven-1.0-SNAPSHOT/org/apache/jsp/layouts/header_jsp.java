package org.apache.jsp.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.scorpionsstudio.FoodHeaven.*;

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
      out.write("<!-- TOP HEADER Start\r\n");
      out.write("================================================== -->\r\n");
      out.write("\r\n");
      out.write("<section id=\"top\" class=\"customBlock\">\r\n");
      out.write("    <div class=\"container \">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-7 \">\r\n");
      out.write("                <p class=\"contact-action \"><i class=\"fa fa-phone-square\"></i>IN CASE OF ANY QUESTIONS, CALL THIS NUMBER: <strong>+880 1678710456</strong></p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3 clearfix\">\r\n");
      out.write("                <ul class=\"login-cart\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a data-toggle=\"modal\" data-target=\"#myModal\" href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-user\"></i>\r\n");
      out.write("                            Login\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <div class=\"cart dropdown\">\r\n");
      out.write("                            <a data-toggle=\"dropdown\" href=\"#\"><i class=\"fa fa-shopping-cart\"></i>Cart(1)</a>\r\n");
      out.write("                            <div class=\"dropdown-menu dropup\">\r\n");
      out.write("                                <span class=\"caret\"></span>\r\n");
      out.write("                                <ul class=\"media-list\">\r\n");
      out.write("                                    <li class=\"media\">\r\n");
      out.write("                                        <img class=\"pull-left\" src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/product-item.jpg\" alt=\"\">\r\n");
      out.write("                                        <div class=\"media-body\">\r\n");
      out.write("                                            <h6>Italian Sauce\r\n");
      out.write("                                                <span>$250</span>\r\n");
      out.write("                                            </h6>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                                <button class=\"btn btn-primary btn-sm\">Checkout</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
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
      out.write("    <!-- MODAL Start\r\n");
      out.write("        ================================================== -->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                    <h4 class=\"modal-title\" id=\"myModalLabel\">Introduce Yourself</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body clearfix\">\r\n");
      out.write("\r\n");
      out.write("                    <form action=\"#\" method=\"post\" id=\"create-account_form\" class=\"std\">\r\n");
      out.write("                        <fieldset>\r\n");
      out.write("                            <h3>Create your account</h3>\r\n");
      out.write("                            <div class=\"form_content clearfix\">\r\n");
      out.write("                                <h4>Enter your e-mail address to create an account.</h4>\r\n");
      out.write("                                <p class=\"text\">\r\n");
      out.write("                                    <label for=\"email_create\">E-mail address</label>\r\n");
      out.write("                                    <span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input placeholder=\"E-mail address\"  type=\"text\" id=\"email_create\" name=\"email_create\" value=\"\" class=\"account_input\">\r\n");
      out.write("\t\t\t\t\t                    </span>\r\n");
      out.write("                                </p>\r\n");
      out.write("                                <p class=\"submit\">\r\n");
      out.write("                                    <button class=\"btn btn-primary\">Create Your Account</button>\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </fieldset>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <form action=\"LoginServlet\" method=\"GET\" id=\"login_form\" class=\"std\">\r\n");
      out.write("                        <fieldset>\r\n");
      out.write("                            <h3>Already registered?</h3>\r\n");
      out.write("                            <div class=\"form_content clearfix\">\r\n");
      out.write("                                <p class=\"text\">\r\n");
      out.write("                                    <label for=\"email\">E-mail address</label>\r\n");
      out.write("                                    <span><input placeholder=\"E-mail address\" type=\"text\" id=\"email\" name=\"email\" value=\"\" class=\"account_input\"></span>\r\n");
      out.write("                                </p>\r\n");
      out.write("                                <p class=\"text\">\r\n");
      out.write("                                    <label for=\"passwd\">Password</label>\r\n");
      out.write("                                    <span><input placeholder=\"Password\" type=\"password\" id=\"passwd\" name=\"password\" value=\"\" class=\"account_input\"></span>\r\n");
      out.write("                                </p>\r\n");
      out.write("                                <p class=\"lost_password\">\r\n");
      out.write("                                    <a href=\"#popab-password-reset\" class=\"popab-password-link\">Forgot your password?</a>\r\n");
      out.write("                                </p>\r\n");
      out.write("                                <p class=\"submit\">\r\n");
      out.write("                                    <button class=\"btn btn-success\">Log in</button>\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </fieldset>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>  <!-- End of /Section -->\r\n");
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
      out.write("                <a href=\"#\">\r\n");
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
