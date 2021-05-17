package org.apache.jsp.shop;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.scorpionsstudio.FoodHeaven.*;
import com.scorpionsstudio.FoodHeaven.ConnectionBlock;
import java.sql.ResultSet;

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
      response.setContentType("text/html; charset=UTF-8");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../layouts/app.jsp", out, false);
      out.write('\r');
      out.write('\n');

    ResultSet rsLoc=null;
    ConnectionBlock cb=null;
    ResultSet foods=null;

    try{
        rsLoc= (ResultSet) session.getAttribute("user");
        cb=new ConnectionBlock();
        foods=null;

        cb.ps = cb.con.prepareStatement("SELECT * FROM foods WHERE admin_id=? ORDER BY id DESC");
        cb.ps.setString(1, request.getParameter("id"));
        cb.rs = cb.ps.executeQuery();
        foods= cb.rs;
    }
    catch (Exception e){
        System.out.println("meow");
    }



      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>FoodHeaven</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section id=\"shop\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div align=\"center\" class=\"row\">\r\n");
      out.write("            <h3><u>");
      out.print(request.getParameter("name"));
      out.write("</u></h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            ");

                String isLoggedIn="";
                try{
                    isLoggedIn = (String)session.getAttribute("isLoggedIn");
                }
                catch (Exception e){
                    System.out.println("meow");

                }

                while(foods.next()){
                    if(isLoggedIn.equalsIgnoreCase("true")){
            
      out.write("\r\n");
      out.write("            <div class=\"col-3 col-sm-3\">\r\n");
      out.write("                <div class=\"products\">\r\n");
      out.write("                    <div style=\"height: 250px\">\r\n");
      out.write("                        <a  href=\"#\">\r\n");
      out.write("                            <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("uploads/");
      out.print(foods.getString("image"));
      out.write("\" alt=\"\">\r\n");
      out.write("                        </a>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <h4>");
      out.print(foods.getString("name"));
      out.write("</h4>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <p class=\"price\">");
      out.print(foods.getFloat("price"));
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("                    <div align=\"center\" >\r\n");
      out.write("                        <button class=\"btn btn-info\"\r\n");
      out.write("                                onclick=\"add_to_cart('");
      out.print(rsLoc.getInt("id"));
      out.write("', '");
      out.print(request.getParameter("id"));
      out.write("', '");
      out.print(foods.getString("name"));
      out.write("', '");
      out.print(foods.getFloat("price"));
      out.write("', '");
      out.print(foods.getString("image"));
      out.write("')\"\r\n");
      out.write("\r\n");
      out.write("                        >\r\n");
      out.write("                            <i class=\"fa fa-plus-circle\"></i>\r\n");
      out.write("                            Add To Cart\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\t<!-- End of /.products -->\r\n");
      out.write("            </div>\r\n");
      out.write("            ");

                    }
                    else{

                    
      out.write("\r\n");
      out.write("            <div class=\"col-3 col-sm-3\">\r\n");
      out.write("                <div class=\"products\">\r\n");
      out.write("                    <div style=\"height: 250px\">\r\n");
      out.write("                        <a  href=\"#\">\r\n");
      out.write("                            <img src=\"");
      out.print(StaticVars.baseURL);
      out.write("uploads/");
      out.print(foods.getString("image"));
      out.write("\" alt=\"\">\r\n");
      out.write("                        </a>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <h4>");
      out.print(foods.getString("name"));
      out.write("</h4>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <p class=\"price\">");
      out.print(foods.getFloat("price"));
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("                    <div align=\"center\" >\r\n");
      out.write("                        <button class=\"btn btn-info\"\r\n");
      out.write("                                onclick=\"show_to_login()\"\r\n");
      out.write("\r\n");
      out.write("                        >\r\n");
      out.write("                            <i class=\"fa fa-plus-circle\"></i>\r\n");
      out.write("                            Add To Cart\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\t<!-- End of /.products -->\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            ");

                    }
                }
            
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\t<!-- End of Section -->\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    function add_to_cart(user_id, admin_id, food_name, price, food_image){\r\n");
      out.write("        console.log(user_id);\r\n");
      out.write("        console.log(admin_id);\r\n");
      out.write("        console.log(food_name);\r\n");
      out.write("        console.log(price);\r\n");
      out.write("        var str=\"\";\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        var str = '<div style=\"padding-bottom: 10px\" class=\"col-11 col-sm-11\">'+\r\n");
      out.write("            '                                        <div class=\"col-2 col-sm-2\">'+\r\n");
      out.write("            '                                            <img class=\"pull-left\" src=\"");
      out.print(StaticVars.baseURL);
      out.write("uploads/'+food_image+'\" alt=\"\">'+\r\n");
      out.write("            '                                        </div>'+\r\n");
      out.write("            '                                        <div class=\"col-5 col-sm-5\">'+\r\n");
      out.write("            '                                            <div style=\"color: black\" class=\"col-12 col-sm-12\">'+\r\n");
      out.write("            '                                                '+food_name+' '+\r\n");
      out.write("            '                                            </div><br>'+\r\n");
      out.write("            '                                            <div style=\"color: black\" class=\"col-12 col-sm-12\">'+\r\n");
      out.write("            '                                                1'+\r\n");
      out.write("            '                                            </div>'+\r\n");
      out.write("            '                                        </div>'+\r\n");
      out.write("            '                                        <div style=\"color: black; padding-top: 25px\" class=\"col-3 col-sm-3\">'+\r\n");
      out.write("            '                                            '+price+' '+\r\n");
      out.write("            '                                        </div>'+\r\n");
      out.write("            '                                        <div style=\"color: black; padding-top: 25px\" class=\"col-2 col-sm-2\">'+\r\n");
      out.write("            '                                           '+price+'  '+\r\n");
      out.write("            '                                        </div>'+\r\n");
      out.write("            '                                    </div>';\r\n");
      out.write("\r\n");
      out.write("        document.getElementById(\"cartBoxCustom\").innerHTML+=str;\r\n");
      out.write("        var cardC= document.getElementById(\"cardCounter\")\r\n");
      out.write("        cardC.innerText = parseInt(cardC.innerText)+1;\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type : 'post',\r\n");
      out.write("            url : '");
      out.print(request.getContextPath());
      out.write("/AddToTempCart',\r\n");
      out.write("            data:{\r\n");
      out.write("                'user_id': user_id,\r\n");
      out.write("                'admin_id': admin_id,\r\n");
      out.write("                'food_name': food_name,\r\n");
      out.write("                'price': price,\r\n");
      out.write("                'sub_total': price,\r\n");
      out.write("                'image': food_image\r\n");
      out.write("\r\n");
      out.write("            },\r\n");
      out.write("            success:function(data){\r\n");
      out.write("                console.log(data);\r\n");
      out.write("                primData=data;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function show_to_login(){\r\n");
      out.write("        alert(\"Please Login First\")\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../layouts/footer.jsp", out, false);
      out.write('\r');
      out.write('\n');
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
