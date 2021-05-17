package org.apache.jsp.admin.report;

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
      out.write("                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../layouts/analytics.jsp", out, false);
      out.write("\r\n");
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
      out.write("                                    <div style=\"overflow: auto\" class=\"card-block\">\r\n");
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

                                                    int i =1;
                                                    while (rsFood.next()){


                                                
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
      out.write("                                                                    <button onclick=\"update_foods('");
      out.print(rsFood.getInt("id"));
      out.write("','");
      out.print(rsFood.getString("name"));
      out.write("', '");
      out.print(rsFood.getString("price"));
      out.write("', '");
      out.print(rsFood.getString("description"));
      out.write("', '");
      out.print(rsFood.getString("image"));
      out.write("' )\" style=\"width: 55px\" class=\"btn btn-info\" data-toggle=\"modal\" data-target=\"#FoodUpdateModal\">\r\n");
      out.write("                                                                        <i class=\"fas fa-edit\"></i>\r\n");
      out.write("                                                                    </button>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                                <div class=\"col-6 col-sm-6\">\r\n");
      out.write("                                                                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/DeleteFoodServlet?id=");
      out.print(rsFood.getInt("id"));
      out.write("\" style=\"width: 55px; color: white\" class=\"btn btn-danger\">\r\n");
      out.write("                                                                        <i class=\"fas fa-times\"></i>\r\n");
      out.write("                                                                    </a>\r\n");
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
      out.write("                                                    <div align=\"center\" style=\"padding-top: 10px\" class=\"container\">\r\n");
      out.write("                                                        <input type=\"submit\" class=\"btn btn-info form-control w-75\" value=\"Submit\">\r\n");
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
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"FoodUpdateModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"FoodUpdateModalTitle\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-dialog-centered  modal-lg\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"FoodUpdateModalTitle\">Update Food Information</h5>\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <form method=\"POST\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/UpdateFoodServlet\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div align=\"center\" class=\"col-12 col-sm-12\">\r\n");
      out.write("                            <img id=\"food_image_existing\" src=\"");
      out.print( StaticVars.baseURL);
      out.write("uploads/69.6180287518262category-image-1.jpg\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-6 col-sm-6\">\r\n");
      out.write("                            <label>Food Name</label>\r\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"food_id\" id=\"food_id\" placeholder=\"ID of the Food\" hidden>\r\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"food_name\" id=\"food_name\" placeholder=\"Name of the Food\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-6 col-sm-6\">\r\n");
      out.write("                            <label>Food Price</label>\r\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"food_price\" id=\"food_price\" placeholder=\"Price of the Food\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-12 col-sm-12\">\r\n");
      out.write("                            <label>Food Description</label>\r\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"food_price\" id=\"food_description\" placeholder=\"Description of the Food\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <br><br><br><br><br>\r\n");
      out.write("                        <div align=\"center\" class=\"col-12 col-sm-12\">\r\n");
      out.write("                            <input type=\"submit\" class=\"form-control w-75 btn btn-info\" name=\"food_image_update\" value=\"Submit\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("    function update_foods(id, name, price, description, image){\r\n");
      out.write("        document.getElementById(\"food_id\").value=id;\r\n");
      out.write("        document.getElementById(\"food_name\").value=name;\r\n");
      out.write("        document.getElementById(\"food_price\").value=price;\r\n");
      out.write("        document.getElementById(\"food_description\").value=description;\r\n");
      out.write("        document.getElementById(\"food_image_existing\").src=\"");
      out.print( StaticVars.baseURL);
      out.write("\"+\"uploads/\"+image;\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
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
