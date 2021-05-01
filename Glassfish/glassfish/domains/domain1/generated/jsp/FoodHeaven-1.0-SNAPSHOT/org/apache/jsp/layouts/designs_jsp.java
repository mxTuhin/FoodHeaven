package org.apache.jsp.layouts;

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
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <!-- Fonts -->\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("    <!-- Css -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(StaticVars.baseURL);
      out.write("css/nivo-slider.css\" type=\"text/css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(StaticVars.baseURL);
      out.write("css/owl.carousel.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(StaticVars.baseURL);
      out.write("css/owl.theme.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(StaticVars.baseURL);
      out.write("css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(StaticVars.baseURL);
      out.write("css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(StaticVars.baseURL);
      out.write("css/responsive.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- jS -->\r\n");
      out.write("    <script src=\"");
      out.print(StaticVars.baseURL);
      out.write("js/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(StaticVars.baseURL);
      out.write("js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(StaticVars.baseURL);
      out.write("js/jquery.nivo.slider.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(StaticVars.baseURL);
      out.write("js/owl.carousel.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(StaticVars.baseURL);
      out.write("js/jquery.nicescroll.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(StaticVars.baseURL);
      out.write("js/jquery.scrollUp.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(StaticVars.baseURL);
      out.write("js/main.js\" type=\"text/javascript\"></script>\r\n");
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
