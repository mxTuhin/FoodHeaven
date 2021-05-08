package org.apache.jsp.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class free_005fShipping_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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

      out.write("<section id=\"features\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div  class=\"col-md-4\">\r\n");
      out.write("                <div  class=\"block customBlock\">\r\n");
      out.write("                    <div class=\"media\">\r\n");
      out.write("                        <div class=\"pull-left\" href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-ambulance\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"media-body\">\r\n");
      out.write("                            <h4 class=\"media-heading\">Free Shipping</h4>\r\n");
      out.write("                            <p>You will get Free Shipping for orders over 599.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("                <div class=\"block customBlock\">\r\n");
      out.write("                    <div class=\"media\">\r\n");
      out.write("                        <div class=\"pull-left\" href=\"#\">\r\n");
      out.write("                            <i class=\" fab fa-foursquare\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"media-body\">\r\n");
      out.write("                            <h4 class=\"media-heading\">Facebook Post Discount</h4>\r\n");
      out.write("                            <p>You will get a 5% discount for uploading a picture on Facebook by tagging us.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("                <div class=\"block customBlock\">\r\n");
      out.write("                    <div class=\"media\">\r\n");
      out.write("                        <div class=\"pull-left\" href=\"#\">\r\n");
      out.write("                            <i class=\" fa fa-phone\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"media-body\">\r\n");
      out.write("                            <h4 class=\"media-heading\">Call Us</h4>\r\n");
      out.write("                            <p>Any Problem? Never hesitate to call us.</p>\r\n");
      out.write("                        </div>\t<!-- End of /.media-body -->\r\n");
      out.write("                    </div>\t<!-- End of /.media -->\r\n");
      out.write("                </div>\t<!-- End of /.block -->\r\n");
      out.write("            </div> <!-- End of /.col-md-4 -->\r\n");
      out.write("        </div>\t<!-- End of /.row -->\r\n");
      out.write("    </div>\t<!-- End of /.container -->\r\n");
      out.write("</section>\t<!-- End of section -->");
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
