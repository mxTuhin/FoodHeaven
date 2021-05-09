package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.scorpionsstudio.FoodHeaven.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Admin SignUp</title>\r\n");
      out.write("</head>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/indexApp.jsp", out, false);
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"auth-wrapper\">\r\n");
      out.write("    <div class=\"auth-content container\">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("            <div class=\"row align-items-center\">\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("admin/images/logo-dark.png\" alt=\"\" class=\"img-fluid mb-4\">\r\n");
      out.write("                        <h4 class=\"mb-3 f-w-400\">Login to your account</h4>\r\n");
      out.write("                        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AdminSignUpServlet\" method=\"POST\" enctype=\"multipart/form-data\">\r\n");
      out.write("                            <div class=\"input-group mb-2\">\r\n");
      out.write("                                <div class=\"input-group-prepend\">\r\n");
      out.write("                                    <span class=\"input-group-text\"><i class=\"fas fa-file-signature\"></i></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"restaurant_name\" placeholder=\"Restaurant Name\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"input-group mb-2\">\r\n");
      out.write("                                <div class=\"input-group-prepend\">\r\n");
      out.write("                                    <span class=\"input-group-text\"><i class=\"fas fa-map-marked-alt\"></i></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <select class=\"form-control\" name=\"city\" placeholder=\"Restaurant City\" required>\r\n");
      out.write("                                    <option value=\"NotSelected\" disabled selected>Select Your City</option>\r\n");
      out.write("                                    <option value=\"Dhaka\">Dhaka</option>\r\n");
      out.write("                                    <option value=\"Chittagong\">Chittagong</option>\r\n");
      out.write("                                    <option value=\"Rajshahi\">Rajshahi</option>\r\n");
      out.write("                                    <option value=\"Khulna\">Khulna</option>\r\n");
      out.write("                                    <option value=\"Sylhet\">Sylhet</option>\r\n");
      out.write("                                    <option value=\"Narayanganj\">Narayanganj</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"input-group mb-2\">\r\n");
      out.write("                                <div class=\"input-group-prepend\">\r\n");
      out.write("                                    <span class=\"input-group-text\"><i class=\"feather icon-mail\"></i></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Email address\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"input-group mb-3\">\r\n");
      out.write("                                <div class=\"input-group-prepend\">\r\n");
      out.write("                                    <span class=\"input-group-text\"><i class=\"feather icon-lock\"></i></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"input-group mb-2\">\r\n");
      out.write("                                <div class=\"input-group-prepend\">\r\n");
      out.write("                                    <span class=\"input-group-text\"><label>Upload Your Logo</label></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <input type=\"file\" class=\"form-control\" name=\"file_logo\" placeholder=\"Upload Logo\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <input type=\"submit\" value=\"Sign Up\" class=\"btn btn-primary mb-4\">\r\n");
      out.write("                            <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                        <p class=\"mb-0 text-muted\">Already have an account? <a href=\"index.jsp\" class=\"f-w-400\">Sign In</a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6 d-none d-md-block\">\r\n");
      out.write("                    <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/food.png\" alt=\"\" class=\"img-fluid\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
