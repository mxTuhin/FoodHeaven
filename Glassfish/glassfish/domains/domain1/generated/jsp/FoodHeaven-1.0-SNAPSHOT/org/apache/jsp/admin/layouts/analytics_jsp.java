package org.apache.jsp.admin.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class analytics_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"col-xl-3 col-md-6\">\r\n");
      out.write("    <div class=\"card prod-p-card bg-c-red\">\r\n");
      out.write("        <div class=\"card-body\">\r\n");
      out.write("            <div class=\"row align-items-center m-b-25\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <h6 class=\"m-b-5 text-white\">Total Profit </h6>\r\n");
      out.write("                    <h3 class=\"m-b-0 text-white\">$1,783</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-auto\">\r\n");
      out.write("                    <i class=\"fas fa-money-bill-alt text-c-red f-18\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <p class=\"m-b-0 text-white\"><span class=\"label label-danger m-r-10\">+11%</span>From Previous Month</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-xl-3 col-md-6\">\r\n");
      out.write("    <div class=\"card prod-p-card bg-c-blue\">\r\n");
      out.write("        <div class=\"card-body\">\r\n");
      out.write("            <div class=\"row align-items-center m-b-25\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <h6 class=\"m-b-5 text-white\">Total Orders</h6>\r\n");
      out.write("                    <h3 class=\"m-b-0 text-white\">15,830</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-auto\">\r\n");
      out.write("                    <i class=\"fas fa-database text-c-blue f-18\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <p class=\"m-b-0 text-white\"><span class=\"label label-primary m-r-10\">+12%</span>From Previous Month</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-xl-3 col-md-6\">\r\n");
      out.write("    <div class=\"card prod-p-card bg-c-green\">\r\n");
      out.write("        <div class=\"card-body\">\r\n");
      out.write("            <div class=\"row align-items-center m-b-25\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <h6 class=\"m-b-5 text-white\">Average Price</h6>\r\n");
      out.write("                    <h3 class=\"m-b-0 text-white\">$6,780</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-auto\">\r\n");
      out.write("                    <i class=\"fas fa-dollar-sign text-c-green f-18\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <p class=\"m-b-0 text-white\"><span class=\"label label-success m-r-10\">+52%</span>From Previous Month</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-xl-3 col-md-6\">\r\n");
      out.write("    <div class=\"card prod-p-card bg-c-yellow\">\r\n");
      out.write("        <div class=\"card-body\">\r\n");
      out.write("            <div class=\"row align-items-center m-b-25\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <h6 class=\"m-b-5 text-white\">Product Sold</h6>\r\n");
      out.write("                    <h3 class=\"m-b-0 text-white\">6,784</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-auto\">\r\n");
      out.write("                    <i class=\"fas fa-tags text-c-yellow f-18\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <p class=\"m-b-0 text-white\"><span class=\"label label-warning m-r-10\">+52%</span>From Previous Month</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
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
