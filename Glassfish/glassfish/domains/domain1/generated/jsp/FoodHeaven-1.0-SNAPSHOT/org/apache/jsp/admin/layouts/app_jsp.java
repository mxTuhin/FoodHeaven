package org.apache.jsp.admin.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.scorpionsstudio.FoodHeaven.*;
import java.sql.ResultSet;

public final class app_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "designs.jsp", out, false);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"\">\r\n");
      out.write("<!-- [ Pre-loader ] start -->\r\n");
      out.write("<div class=\"loader-bg\">\r\n");
      out.write("    <div class=\"loader-track\">\r\n");
      out.write("        <div class=\"loader-fill\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- [ Pre-loader ] End -->\r\n");
      out.write("\r\n");
      out.write("<!-- [ navigation menu ] start -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar_links.jsp", out, false);
      out.write("\r\n");
      out.write("<!-- [ navigation menu ] end -->\r\n");
      out.write("\r\n");
      out.write("<!-- [ Header ] start -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headers.jsp", out, false);
      out.write("\r\n");
      out.write("<!-- [ Header ] end -->\r\n");
      out.write("\r\n");
      out.write("<!-- [ Main Content ] start -->\r\n");
      out.write("\r\n");
      out.write("<!-- [ Main Content ] end -->\r\n");
      out.write("\r\n");
      out.write("<!-- Warning Section start -->\r\n");
      out.write("<!-- Older IE warning message -->\r\n");
      out.write("<!--[if lt IE 11]>\r\n");
      out.write("<div class=\"ie-warning\">\r\n");
      out.write("    <h1>Warning!!</h1>\r\n");
      out.write("    <p>You are using an outdated version of Internet Explorer, please upgrade\r\n");
      out.write("        <br/>to any of the following web browsers to access this website.\r\n");
      out.write("    </p>\r\n");
      out.write("    <div class=\"iew-container\">\r\n");
      out.write("        <ul class=\"iew-download\">\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"http://www.google.com/chrome/\">\r\n");
      out.write("                    <img src=\"../assets/images/browser/chrome.png\" alt=\"Chrome\">\r\n");
      out.write("                    <div>Chrome</div>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"https://www.mozilla.org/en-US/firefox/new/\">\r\n");
      out.write("                    <img src=\"../assets/images/browser/firefox.png\" alt=\"Firefox\">\r\n");
      out.write("                    <div>Firefox</div>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"http://www.opera.com\">\r\n");
      out.write("                    <img src=\"../assets/images/browser/opera.png\" alt=\"Opera\">\r\n");
      out.write("                    <div>Opera</div>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"https://www.apple.com/safari/\">\r\n");
      out.write("                    <img src=\"../assets/images/browser/safari.png\" alt=\"Safari\">\r\n");
      out.write("                    <div>Safari</div>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"http://windows.microsoft.com/en-us/internet-explorer/download-ie\">\r\n");
      out.write("                    <img src=\"../assets/images/browser/ie.png\" alt=\"\">\r\n");
      out.write("                    <div>IE (11 & above)</div>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <p>Sorry for the inconvenience!</p>\r\n");
      out.write("</div>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<!-- Warning Section Ends -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
