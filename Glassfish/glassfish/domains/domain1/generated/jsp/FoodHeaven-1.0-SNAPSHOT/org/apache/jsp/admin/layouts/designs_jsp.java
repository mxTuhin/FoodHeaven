package org.apache.jsp.admin.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.scorpionsstudio.FoodHeaven.*;

public final class designs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("<meta name=\"description\" content=\"Flash Able Bootstrap admin template made using Bootstrap 4 and it has huge amount of ready made feature, UI components, pages which completely fulfills any dashboard needs.\" />\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("      content=\"admin templates, bootstrap admin templates, bootstrap 4, dashboard, dashboard templets, sass admin templets, html admin templates, responsive, bootstrap admin templates free download,premium bootstrap admin templates, Flash Able, Flash Able bootstrap admin template\">\r\n");
      out.write("<meta name=\"author\" content=\"Codedthemes\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Favicon icon -->\r\n");
      out.write("<link rel=\"icon\" href=\"");
      out.print(StaticVars.baseURL);
      out.write("/images/food.png\" type=\"image/x-icon\">\r\n");
      out.write("<!-- fontawesome icon -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(StaticVars.baseURL);
      out.write("admin/fonts/fontawesome/css/fontawesome-all.min.css\">\r\n");
      out.write("<!-- animation css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(StaticVars.baseURL);
      out.write("admin/plugins/animation/css/animate.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- vendor css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(StaticVars.baseURL);
      out.write("admin/css/style.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Required Js -->\r\n");
      out.write("<script src=\"");
      out.print(StaticVars.baseURL);
      out.write("admin/js/vendor-all.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(StaticVars.baseURL);
      out.write("admin/plugins/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(StaticVars.baseURL);
      out.write("admin/js/pcoded.min.js\"></script>\r\n");
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
