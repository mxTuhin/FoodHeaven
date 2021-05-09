package org.apache.jsp.admin.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.scorpionsstudio.FoodHeaven.StaticVars;
import java.sql.ResultSet;

public final class sidebar_005flinks_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");

    ResultSet rsLoc = (ResultSet) session.getAttribute("user");

      out.write("\r\n");
      out.write("<nav class=\"pcoded-navbar menupos-fixed menu-light brand-blue \">\r\n");
      out.write("    <div class=\"navbar-wrapper \">\r\n");
      out.write("        <div class=\"navbar-brand header-logo\">\r\n");
      out.write("            <a href=\"../dashboard\" class=\"b-brand\">\r\n");
      out.write("                <img style=\"height: 50px\" src=\"");
      out.print( StaticVars.baseURL);
      out.write("admin/images/logo.png\" alt=\"\" class=\"logo images\">\r\n");
      out.write("                <img src=\"");
      out.print( StaticVars.baseURL);
      out.write("admin/images/logo-icon.svg\" alt=\"\" class=\"logo-thumb images\">\r\n");
      out.write("            </a>\r\n");
      out.write("            <a class=\"mobile-menu\" id=\"mobile-collapse\" href=\"#!\"><span></span></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"navbar-content scroll-div\">\r\n");
      out.write("            <ul class=\"nav pcoded-inner-navbar\">\r\n");
      out.write("                <li class=\"nav-item pcoded-menu-caption\">\r\n");
      out.write("                    <label>Navigation</label>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a href=\"../dashboard\" class=\"nav-link\"><span class=\"pcoded-micon\"><i class=\"feather icon-home\"></i></span><span class=\"pcoded-mtext\">Dashboard</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"nav-item pcoded-menu-caption\">\r\n");
      out.write("                    <label>Pages</label>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a href=\"index.html\" class=\"nav-link\">\r\n");
      out.write("                        <span class=\"pcoded-micon\"><i class=\"feather icon-home\"></i></span>\r\n");
      out.write("                        <span class=\"pcoded-mtext\">Orders</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");

                    if(rsLoc.getString("is_superadmin").equals("1")){
                
      out.write("\r\n");
      out.write("                <li class=\"nav-item pcoded-menu-caption\">\r\n");
      out.write("                    <label>Communication</label>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/chat/\" class=\"nav-link\">\r\n");
      out.write("                        <span class=\"pcoded-micon\"><i class=\"feather icon-home\"></i></span>\r\n");
      out.write("                        <span class=\"pcoded-mtext\">ChatBox</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/report/\" class=\"nav-link\">\r\n");
      out.write("                        <span class=\"pcoded-micon\"><i class=\"feather icon-home\"></i></span>\r\n");
      out.write("                        <span class=\"pcoded-mtext\">Reports</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                ");

                    }

                
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>");
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
