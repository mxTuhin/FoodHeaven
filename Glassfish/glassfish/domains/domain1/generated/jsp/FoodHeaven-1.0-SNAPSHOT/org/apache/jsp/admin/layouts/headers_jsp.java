package org.apache.jsp.admin.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.scorpionsstudio.FoodHeaven.*;
import com.scorpionsstudio.FoodHeaven.LogoutServlet;
import java.sql.ResultSet;

public final class headers_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    ResultSet rsLoc= (ResultSet) session.getAttribute("user");

      out.write("\r\n");
      out.write("<header class=\"navbar pcoded-header navbar-expand-lg navbar-light headerpos-fixed\">\r\n");
      out.write("    <div class=\"m-header\">\r\n");
      out.write("        <a class=\"mobile-menu\" id=\"mobile-collapse1\" href=\"#!\"><span></span></a>\r\n");
      out.write("        <a href=\"index.html\" class=\"b-brand\">\r\n");
      out.write("            <img src=\"");
      out.print( StaticVars.baseURL);
      out.write("admin/images/logo.svg\" alt=\"\" class=\"logo images\">\r\n");
      out.write("            <img src=\"");
      out.print( StaticVars.baseURL);
      out.write("admin/images/logo-icon.svg\" alt=\"\" class=\"logo-thumb images\">\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <a class=\"mobile-menu\" id=\"mobile-header\" href=\"#!\">\r\n");
      out.write("        <i class=\"feather icon-more-horizontal\"></i>\r\n");
      out.write("    </a>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\">\r\n");
      out.write("        <a href=\"#!\" class=\"mob-toggler\"></a>\r\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <div class=\"main-search open\">\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <input type=\"text\" id=\"m-search\" class=\"form-control\" placeholder=\"Search . . .\">\r\n");
      out.write("                        <a href=\"#!\" class=\"input-group-append search-close\">\r\n");
      out.write("\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <span class=\"input-group-append search-btn btn btn-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"feather icon-search input-group-text\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\r\n");
      out.write("            <li>\r\n");
      out.write("                <div class=\"dropdown drp-user\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                        <i class=\"fas fa-cogs\"></i><i class=\" icon-settings\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right profile-notification\">\r\n");
      out.write("                        <div class=\"pro-head\">\r\n");
      out.write("                            <img style=\"height: 50px\" src=\"");
      out.print( StaticVars.baseURL);
      out.write("uploads/");
      out.print(rsLoc.getString("logo"));
      out.write("\" class=\"img-radius\" alt=\"User-Profile-Image\">\r\n");
      out.write("                            <span>");
      out.print(rsLoc.getString("restaurant_name"));
      out.write("</span>\r\n");
      out.write("                            <a href=\"");
      out.print( StaticVars.serverExtension );
      out.write("/LogoutServlet\" class=\"dud-logout\" title=\"Logout\">\r\n");
      out.write("                                <i class=\"feather icon-log-out\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <ul class=\"pro-body\">\r\n");
      out.write("\r\n");
      out.write("                            <li><a href=\"#!\" class=\"dropdown-item\"><i class=\"feather icon-user\"></i> Profile</a></li>\r\n");
      out.write("\r\n");
      out.write("                            <li><a href=\"");
      out.print( StaticVars.serverExtension );
      out.write("/LogoutServlet\" class=\"dropdown-item\"><i class=\"feather icon-lock\"></i>Log Out</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>");
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
