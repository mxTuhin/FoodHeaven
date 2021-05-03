package org.apache.jsp.admin.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.scorpionsstudio.FoodHeaven.StaticVars;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"pcoded-navbar menupos-fixed menu-light brand-blue \">\r\n");
      out.write("    <div class=\"navbar-wrapper \">\r\n");
      out.write("        <div class=\"navbar-brand header-logo\">\r\n");
      out.write("            <a href=\"index.html\" class=\"b-brand\">\r\n");
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
      out.write("                    <a href=\"index.html\" class=\"nav-link\"><span class=\"pcoded-micon\"><i class=\"feather icon-home\"></i></span><span class=\"pcoded-mtext\">Dashboard</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item pcoded-menu-caption\">\r\n");
      out.write("                    <label>UI Element</label>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item pcoded-hasmenu\">\r\n");
      out.write("                    <a href=\"#!\" class=\"nav-link\"><span class=\"pcoded-micon\"><i class=\"feather icon-box\"></i></span><span class=\"pcoded-mtext\">Componant</span></a>\r\n");
      out.write("                    <ul class=\"pcoded-submenu\">\r\n");
      out.write("                        <li class=\"\"><a href=\"bc_button.html\" class=\"\">Button</a></li>\r\n");
      out.write("                        <li class=\"\"><a href=\"bc_badges.html\" class=\"\">Badges</a></li>\r\n");
      out.write("                        <li class=\"\"><a href=\"bc_breadcrumb-pagination.html\" class=\"\">Breadcrumb & paggination</a></li>\r\n");
      out.write("                        <li class=\"\"><a href=\"bc_collapse.html\" class=\"\">Collapse</a></li>\r\n");
      out.write("                        <li class=\"\"><a href=\"bc_progress.html\" class=\"\">Progress</a></li>\r\n");
      out.write("                        <li class=\"\"><a href=\"bc_tabs.html\" class=\"\">Tabs & pills</a></li>\r\n");
      out.write("                        <li class=\"\"><a href=\"bc_typography.html\" class=\"\">Typography</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item pcoded-menu-caption\">\r\n");
      out.write("                    <label>Forms &amp; table</label>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a href=\"form_elements.html\" class=\"nav-link\"><span class=\"pcoded-micon\"><i class=\"feather icon-file-text\"></i></span><span class=\"pcoded-mtext\">Form elements</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a href=\"tbl_bootstrap.html\" class=\"nav-link\"><span class=\"pcoded-micon\"><i class=\"feather icon-align-justify\"></i></span><span class=\"pcoded-mtext\">Bootstrap table</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item pcoded-menu-caption\">\r\n");
      out.write("                    <label>Chart & Maps</label>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a href=\"chart-morris.html\" class=\"nav-link\"><span class=\"pcoded-micon\"><i class=\"feather icon-pie-chart\"></i></span><span class=\"pcoded-mtext\">Chart</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a href=\"map-google.html\" class=\"nav-link\"><span class=\"pcoded-micon\"><i class=\"feather icon-map\"></i></span><span class=\"pcoded-mtext\">Maps</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item pcoded-menu-caption\">\r\n");
      out.write("                    <label>Pages</label>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item pcoded-hasmenu\">\r\n");
      out.write("                    <a href=\"#!\" class=\"nav-link\"><span class=\"pcoded-micon\"><i class=\"feather icon-lock\"></i></span><span class=\"pcoded-mtext\">Authentication</span></a>\r\n");
      out.write("                    <ul class=\"pcoded-submenu\">\r\n");
      out.write("                        <li class=\"\"><a href=\"auth-signup.html\" class=\"\" target=\"_blank\">Sign up</a></li>\r\n");
      out.write("                        <li class=\"\"><a href=\"auth-signin.html\" class=\"\" target=\"_blank\">Sign in</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\"><a href=\"sample-page.html\" class=\"nav-link\"><span class=\"pcoded-micon\"><i class=\"feather icon-sidebar\"></i></span><span class=\"pcoded-mtext\">Sample page</span></a></li>\r\n");
      out.write("                <li class=\"nav-item disabled\"><a href=\"#!\" class=\"nav-link\"><span class=\"pcoded-micon\"><i class=\"feather icon-power\"></i></span><span class=\"pcoded-mtext\">Disabled menu</span></a></li>\r\n");
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
