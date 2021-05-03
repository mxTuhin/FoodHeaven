package org.apache.jsp.admin.dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.scorpionsstudio.FoodHeaven.*;
import java.sql.ResultSet;
import com.scorpionsstudio.FoodHeaven.ConnectionBlock;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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


    if(session.getAttribute("isLoggedInAdmin")=="true"){

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../layouts/app.jsp", out, false);
      out.write('\r');
      out.write('\n');

    ResultSet rsLoc= (ResultSet) session.getAttribute("user");
    ConnectionBlock cb=new ConnectionBlock();
    ResultSet rsFood=null;
    try{
        cb.ps = cb.con.prepareStatement("SELECT * FROM foods WHERE admin_id=?");

        cb.ps.setString(1, rsLoc.getString(1));
        cb.rs = cb.ps.executeQuery();
        rsFood= cb.rs;
    }
    catch (Exception e){
        System.out.println("meow");
    }



      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Admin Dashboard</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"pcoded-main-container\">\r\n");
      out.write("    <div class=\"pcoded-wrapper\">\r\n");
      out.write("        <div class=\"pcoded-content\">\r\n");
      out.write("            <div class=\"pcoded-inner-content\">\r\n");
      out.write("                <div class=\"main-body\">\r\n");
      out.write("                    <div class=\"page-wrapper\">\r\n");
      out.write("                        <!-- [ breadcrumb ] start -->\r\n");
      out.write("                        <div class=\"page-header\">\r\n");
      out.write("                            <div class=\"page-block\">\r\n");
      out.write("                                <div class=\"row align-items-center\">\r\n");
      out.write("                                    <div class=\"col-md-12\">\r\n");
      out.write("                                        <div class=\"page-header-title\">\r\n");
      out.write("                                            <h5>Home</h5>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <ul class=\"breadcrumb\">\r\n");
      out.write("                                            <li class=\"breadcrumb-item\"><a href=\"index.html\"><i class=\"feather icon-home\"></i></a></li>\r\n");
      out.write("                                            <li class=\"breadcrumb-item\"><a href=\"#!\">Analytics Dashboard</a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- [ breadcrumb ] end -->\r\n");
      out.write("                        <!-- [ Main Content ] start -->\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                            <!-- product profit start -->\r\n");
      out.write("                            <div class=\"col-xl-3 col-md-6\">\r\n");
      out.write("                                <div class=\"card prod-p-card bg-c-red\">\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <div class=\"row align-items-center m-b-25\">\r\n");
      out.write("                                            <div class=\"col\">\r\n");
      out.write("                                                <h6 class=\"m-b-5 text-white\">Total Profit </h6>\r\n");
      out.write("                                                <h3 class=\"m-b-0 text-white\">$1,783</h3>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-auto\">\r\n");
      out.write("                                                <i class=\"fas fa-money-bill-alt text-c-red f-18\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <p class=\"m-b-0 text-white\"><span class=\"label label-danger m-r-10\">+11%</span>From Previous Month</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-xl-3 col-md-6\">\r\n");
      out.write("                                <div class=\"card prod-p-card bg-c-blue\">\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <div class=\"row align-items-center m-b-25\">\r\n");
      out.write("                                            <div class=\"col\">\r\n");
      out.write("                                                <h6 class=\"m-b-5 text-white\">Total Orders</h6>\r\n");
      out.write("                                                <h3 class=\"m-b-0 text-white\">15,830</h3>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-auto\">\r\n");
      out.write("                                                <i class=\"fas fa-database text-c-blue f-18\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <p class=\"m-b-0 text-white\"><span class=\"label label-primary m-r-10\">+12%</span>From Previous Month</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-xl-3 col-md-6\">\r\n");
      out.write("                                <div class=\"card prod-p-card bg-c-green\">\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <div class=\"row align-items-center m-b-25\">\r\n");
      out.write("                                            <div class=\"col\">\r\n");
      out.write("                                                <h6 class=\"m-b-5 text-white\">Average Price</h6>\r\n");
      out.write("                                                <h3 class=\"m-b-0 text-white\">$6,780</h3>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-auto\">\r\n");
      out.write("                                                <i class=\"fas fa-dollar-sign text-c-green f-18\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <p class=\"m-b-0 text-white\"><span class=\"label label-success m-r-10\">+52%</span>From Previous Month</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-xl-3 col-md-6\">\r\n");
      out.write("                                <div class=\"card prod-p-card bg-c-yellow\">\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <div class=\"row align-items-center m-b-25\">\r\n");
      out.write("                                            <div class=\"col\">\r\n");
      out.write("                                                <h6 class=\"m-b-5 text-white\">Product Sold</h6>\r\n");
      out.write("                                                <h3 class=\"m-b-0 text-white\">6,784</h3>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-auto\">\r\n");
      out.write("                                                <i class=\"fas fa-tags text-c-yellow f-18\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <p class=\"m-b-0 text-white\"><span class=\"label label-warning m-r-10\">+52%</span>From Previous Month</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- product profit end -->\r\n");
      out.write("                            <div class=\"col-md-12 col-xl-7\">\r\n");
      out.write("                                <div class=\"card card-social\">\r\n");
      out.write("                                    <div class=\"card-block border-bottom\">\r\n");
      out.write("                                        <div class=\"row align-items-center justify-content-center\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"col text-right\">\r\n");
      out.write("                                                <h3>Manage Foods</h3>\r\n");
      out.write("                                                <h5 class=\"text-c-blue mb-0\"> <span class=\"text-muted\">Food List</span></h5>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"card-block\">\r\n");
      out.write("                                        <div class=\"row align-items-center justify-content-center card-active\">\r\n");
      out.write("                                            <table class=\"table table-inverse\">\r\n");
      out.write("                                                <thead>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th>#</th>\r\n");
      out.write("                                                    <th>Food Name</th>\r\n");
      out.write("                                                    <th>Food Description</th>\r\n");
      out.write("                                                    <th>Food Price</th>\r\n");
      out.write("                                                    <th><div align=\"center\">\r\n");
      out.write("                                                        Action\r\n");
      out.write("\r\n");
      out.write("                                                    </div></th>\r\n");
      out.write("\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                </thead>\r\n");
      out.write("                                                <tbody>\r\n");
      out.write("                                                ");

                                                    while (rsFood.next()){
                                                        int i =1;

                                                
      out.write("\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td>");
      out.print(i);
      out.write("</td>\r\n");
      out.write("                                                    <td>");
      out.print(rsFood.getString("name"));
      out.write("</td>\r\n");
      out.write("                                                    <td>");
      out.print(rsFood.getString("description"));
      out.write("</td>\r\n");
      out.write("                                                    <td>");
      out.print(rsFood.getString("price"));
      out.write("</td>\r\n");
      out.write("                                                    <td style=\"width: 150px\">\r\n");
      out.write("                                                        <div align=\"center\" class=\"container\">\r\n");
      out.write("                                                            <div class=\"row\">\r\n");
      out.write("                                                                <div class=\"col-6 col-sm-6\">\r\n");
      out.write("                                                                    <button style=\"width: 55px\" class=\"btn btn-info\">\r\n");
      out.write("                                                                        <i class=\"fas fa-edit\"></i>\r\n");
      out.write("                                                                    </button>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                                <div class=\"col-6 col-sm-6\">\r\n");
      out.write("                                                                    <button style=\"width: 55px\" class=\"btn btn-danger\">\r\n");
      out.write("                                                                        <i class=\"fas fa-times\"></i>\r\n");
      out.write("                                                                    </button>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                ");

                                                        ++i;
                                                    }
                                                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                </tbody>\r\n");
      out.write("                                            </table>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-12 col-xl-5\">\r\n");
      out.write("                                <div class=\"card card-social\">\r\n");
      out.write("                                    <div class=\"card-block border-bottom\">\r\n");
      out.write("                                        <div class=\"row align-items-center justify-content-center\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"col text-right\">\r\n");
      out.write("                                                <h3>Add New Food</h3>\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"card-block\">\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"row align-items-center justify-content-center card-active\">\r\n");
      out.write("                                            <h5>Upload Food Info</h5>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"container\">\r\n");
      out.write("                                                <form method=\"POST\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/UploadFoodInfoServlet\" enctype=\"multipart/form-data\">\r\n");
      out.write("                                                    <div>\r\n");
      out.write("                                                        <label>Food Name</label>\r\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"admin_id\" value=\"");
      out.print(rsLoc.getInt("id"));
      out.write("\" placeholder=\"Admin ID\" hidden required>\r\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"name\" placeholder=\"Name of the Food\" required>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div>\r\n");
      out.write("                                                        <label>Food Description</label>\r\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"description\" placeholder=\"Description of the Food\" required>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div>\r\n");
      out.write("                                                        <label>Food Price</label>\r\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"price\" placeholder=\"Price of the Food\" required>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div>\r\n");
      out.write("                                                        <label>Food Image</label>\r\n");
      out.write("                                                        <input type=\"file\" class=\"form-control\" name=\"food_image\" required>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div style=\"padding-top: 10px\" class=\"container\">\r\n");
      out.write("                                                        <input type=\"submit\" class=\"btn btn-info form-control\" value=\"Submit\">\r\n");
      out.write("                                                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                </form>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- [ Main Content ] end -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");

    }else{
        response.sendRedirect("../");

      out.write('\r');
      out.write('\n');

    }

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
