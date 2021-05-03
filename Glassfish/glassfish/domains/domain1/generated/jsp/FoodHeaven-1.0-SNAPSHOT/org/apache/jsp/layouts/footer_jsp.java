package org.apache.jsp.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.scorpionsstudio.FoodHeaven.*;
import com.scorpionsstudio.FoodHeaven.ConnectionBlock;
import java.sql.ResultSet;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

    ResultSet rsLoc= (ResultSet) session.getAttribute("user");
    ConnectionBlock cb=new ConnectionBlock();
    ResultSet latestFood=null;
    try{
        cb.ps = cb.con.prepareStatement("SELECT * FROM foods ORDER BY id DESC LIMIT 6");
        cb.rs = cb.ps.executeQuery();
        latestFood= cb.rs;
    }
    catch (Exception e){
        System.out.println("meow");
    }



      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("                <div class=\"block clearfix\">\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/footer-logo.png\" alt=\"\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        FoodHeaven is an emerging food delivery service that promises to deliver the best quality food within lowest possible times.\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <h4 class=\"connect-heading\">CONNECT WITH US</h4>\r\n");
      out.write("                    <ul class=\"social-icon\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"facebook-icon\" href=\"#\">\r\n");
      out.write("                                <i class=\"fab fa-facebook-f\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"twitter-icon\" href=\"#\">\r\n");
      out.write("                                <i class=\"fab fa-twitter\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"linkedin-icon\" href=\"#\">\r\n");
      out.write("                                <i class=\"fab fa-linkedin\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\t<!-- End Of /.social-icon -->\r\n");
      out.write("                </div>\t<!-- End Of /.block -->\r\n");
      out.write("            </div> <!-- End Of /.Col-md-4 -->\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("                <div class=\"block\">\r\n");
      out.write("                    <h4>GET IN TOUCH</h4>\r\n");
      out.write("                    <p ><i class=\"fa  fa-map-marker\"></i> <span><a style=\"color: white\" href=\"https://goo.gl/maps/kmoRyQDNo2UyMpnL7\" target=\"_blank\">Scorpions Studio,</a> </span>Narayanganj</p>\r\n");
      out.write("                    <p> <i class=\"fa  fa-phone\"></i> <span>Phone:</span> +880 1678710456 </p>\r\n");
      out.write("\r\n");
      out.write("                    <p class=\"mail\"><i class=\"fa  fa-envelope\"></i>Eamil: <span>mail@mxtuhin.ninja</span></p>\r\n");
      out.write("                </div>\t<!-- End Of /.block -->\r\n");
      out.write("            </div> <!-- End Of Col-md-3 -->\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("                <div class=\"block\">\r\n");
      out.write("                    <h4>Featured</h4>\r\n");
      out.write("                    <div class=\"media\">\r\n");
      out.write("                        ");


                            while (latestFood.next()){


                        
      out.write("\r\n");
      out.write("                        <a class=\"pull-left\" href=\"#\">\r\n");
      out.write("                            <img class=\"media-object\" src=\"");
      out.print(StaticVars.baseURL);
      out.write("uploads/");
      out.print(latestFood.getString("image"));
      out.write("\" alt=\"...\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                       ");

                           }
                       
      out.write("\r\n");
      out.write("                    </div>\t<!-- End Of /.media -->\r\n");
      out.write("                </div>\t<!-- End Of /.block -->\r\n");
      out.write("            </div> <!-- End Of Col-md-3 -->\r\n");
      out.write("        </div> <!-- End Of /.row -->\r\n");
      out.write("    </div> <!-- End Of /.Container -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- FOOTER-BOTTOM Start\r\n");
      out.write("    ================================================== -->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"footer-bottom\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <ul class=\"cash-out pull-left\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <img style=\"height: 40px\" src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/nagad.png\" alt=\"\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <img style=\"height: 40px\" src=\"");
      out.print(StaticVars.baseURL);
      out.write("images/bkash.png\" alt=\"\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <p class=\"copyright-text pull-right\"><script type=\"text/javascript\">\r\n");
      out.write("                        document.write(new Date().getFullYear());\r\n");
      out.write("                    </script> | Made with &#10084; for FoodHeaven by<a href=\"https://www.facebook.com/tuhin.mridha.5\" class=\"font-weight-bold ml-1\" target=\"_blank\"> Tuhin Mridha</a></p>\r\n");
      out.write("                </div>\t<!-- End Of /.col-md-12 -->\r\n");
      out.write("            </div>\t<!-- End Of /.row -->\r\n");
      out.write("        </div>\t<!-- End Of /.container -->\r\n");
      out.write("    </div>\t<!-- End Of /.footer-bottom -->\r\n");
      out.write("</footer> <!-- End Of Footer -->\r\n");
      out.write("\r\n");
      out.write("<a id=\"back-top\" href=\"#\"></a>");
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
