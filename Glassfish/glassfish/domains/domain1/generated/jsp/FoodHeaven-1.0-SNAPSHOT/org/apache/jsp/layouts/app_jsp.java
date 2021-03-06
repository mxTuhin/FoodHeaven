package org.apache.jsp.layouts;

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
    ConnectionBlock cb=new ConnectionBlock();
    ResultSet chat=null;
    try{
        String isLoggedIn = (String)session.getAttribute("isLoggedIn");
        if(isLoggedIn=="true"){
            int sender_id=rsLoc.getInt("id");

            cb.ps = cb.con.prepareStatement("SELECT * FROM save_conversation WHERE sender_id=sender_id");
            cb.rs = cb.ps.executeQuery();
            chat=cb.rs;
        }

    }
    catch (Exception e){
        System.out.println("meow");
    }



      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "designs.jsp", out, false);
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("    #center-text {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex: 1;\r\n");
      out.write("    flex-direction:column;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    height:100%;\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    #chat-circle {\r\n");
      out.write("    position: fixed;\r\n");
      out.write("    bottom: 50px;\r\n");
      out.write("    right: 50px;\r\n");
      out.write("    background: #5A5EB9;\r\n");
      out.write("    width: 80px;\r\n");
      out.write("    height: 80px;\r\n");
      out.write("    border-radius: 50%;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 28px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .btn#my-btn {\r\n");
      out.write("    background: white;\r\n");
      out.write("    padding-top: 13px;\r\n");
      out.write("    padding-bottom: 12px;\r\n");
      out.write("    border-radius: 45px;\r\n");
      out.write("    padding-right: 40px;\r\n");
      out.write("    padding-left: 40px;\r\n");
      out.write("    color: #5865C3;\r\n");
      out.write("    }\r\n");
      out.write("    #chat-overlay {\r\n");
      out.write("    background: rgba(255,255,255,0.1);\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    border-radius: 50%;\r\n");
      out.write("    display: none;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    .chat-box {\r\n");
      out.write("    display:none;\r\n");
      out.write("    background: #efefef;\r\n");
      out.write("    position:fixed;\r\n");
      out.write("    right:30px;\r\n");
      out.write("    bottom:50px;\r\n");
      out.write("    width:350px;\r\n");
      out.write("    max-width: 85vw;\r\n");
      out.write("    max-height:100vh;\r\n");
      out.write("    border-radius:5px;\r\n");
      out.write("    /*   box-shadow: 0px 5px 35px 9px #464a92; */\r\n");
      out.write("    }\r\n");
      out.write("    .chat-box-toggle {\r\n");
      out.write("    float:right;\r\n");
      out.write("    margin-right:15px;\r\n");
      out.write("    cursor:pointer;\r\n");
      out.write("    }\r\n");
      out.write("    .chat-box-header {\r\n");
      out.write("    background: #5A5EB9;\r\n");
      out.write("    height:70px;\r\n");
      out.write("    border-top-left-radius:5px;\r\n");
      out.write("    border-top-right-radius:5px;\r\n");
      out.write("    color:white;\r\n");
      out.write("    text-align:center;\r\n");
      out.write("    font-size:20px;\r\n");
      out.write("    padding-top:17px;\r\n");
      out.write("    }\r\n");
      out.write("    .chat-box-body {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    height:370px;\r\n");
      out.write("    height:auto;\r\n");
      out.write("    border:1px solid #ccc;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    }\r\n");
      out.write("    .chat-box-body:after {\r\n");
      out.write("    content: \"\";\r\n");
      out.write("    background-image: url('data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iMjAwIiBoZWlnaHQ9IjIwMCIgdmlld0JveD0iMCAwIDIwMCAyMDAiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyI+PGcgdHJhbnNmb3JtPSJ0cmFuc2xhdGUoMTAgOCkiIGZpbGw9Im5vbmUiIGZpbGwtcnVsZT0iZXZlbm9kZCI+PGNpcmNsZSBzdHJva2U9IiMwMDAiIHN0cm9rZS13aWR0aD0iMS4yNSIgY3g9IjE3NiIgY3k9IjEyIiByPSI0Ii8+PHBhdGggZD0iTTIwLjUuNWwyMyAxMW0tMjkgODRsLTMuNzkgMTAuMzc3TTI3LjAzNyAxMzEuNGw1Ljg5OCAyLjIwMy0zLjQ2IDUuOTQ3IDYuMDcyIDIuMzkyLTMuOTMzIDUuNzU4bTEyOC43MzMgMzUuMzdsLjY5My05LjMxNiAxMC4yOTIuMDUyLjQxNi05LjIyMiA5LjI3NC4zMzJNLjUgNDguNXM2LjEzMSA2LjQxMyA2Ljg0NyAxNC44MDVjLjcxNSA4LjM5My0yLjUyIDE0LjgwNi0yLjUyIDE0LjgwNk0xMjQuNTU1IDkwcy03LjQ0NCAwLTEzLjY3IDYuMTkyYy02LjIyNyA2LjE5Mi00LjgzOCAxMi4wMTItNC44MzggMTIuMDEybTIuMjQgNjguNjI2cy00LjAyNi05LjAyNS0xOC4xNDUtOS4wMjUtMTguMTQ1IDUuNy0xOC4xNDUgNS43IiBzdHJva2U9IiMwMDAiIHN0cm9rZS13aWR0aD0iMS4yNSIgc3Ryb2tlLWxpbmVjYXA9InJvdW5kIi8+PHBhdGggZD0iTTg1LjcxNiAzNi4xNDZsNS4yNDMtOS41MjFoMTEuMDkzbDUuNDE2IDkuNTIxLTUuNDEgOS4xODVIOTAuOTUzbC01LjIzNy05LjE4NXptNjMuOTA5IDE1LjQ3OWgxMC43NXYxMC43NWgtMTAuNzV6IiBzdHJva2U9IiMwMDAiIHN0cm9rZS13aWR0aD0iMS4yNSIvPjxjaXJjbGUgZmlsbD0iIzAwMCIgY3g9IjcxLjUiIGN5PSI3LjUiIHI9IjEuNSIvPjxjaXJjbGUgZmlsbD0iIzAwMCIgY3g9IjE3MC41IiBjeT0iOTUuNSIgcj0iMS41Ii8+PGNpcmNsZSBmaWxsPSIjMDAwIiBjeD0iODEuNSIgY3k9IjEzNC41IiByPSIxLjUiLz48Y2lyY2xlIGZpbGw9IiMwMDAiIGN4PSIxMy41IiBjeT0iMjMuNSIgcj0iMS41Ii8+PHBhdGggZmlsbD0iIzAwMCIgZD0iTTkzIDcxaDN2M2gtM3ptMzMgODRoM3YzaC0zem0tODUgMThoM3YzaC0zeiIvPjxwYXRoIGQ9Ik0zOS4zODQgNTEuMTIybDUuNzU4LTQuNDU0IDYuNDUzIDQuMjA1LTIuMjk0IDcuMzYzaC03Ljc5bC0yLjEyNy03LjExNHpNMTMwLjE5NSA0LjAzbDEzLjgzIDUuMDYyLTEwLjA5IDcuMDQ4LTMuNzQtMTIuMTF6bS04MyA5NWwxNC44MyA1LjQyOS0xMC44MiA3LjU1Ny00LjAxLTEyLjk4N3pNNS4yMTMgMTYxLjQ5NWwxMS4zMjggMjAuODk3TDIuMjY1IDE4MGwyLjk0OC0xOC41MDV6IiBzdHJva2U9IiMwMDAiIHN0cm9rZS13aWR0aD0iMS4yNSIvPjxwYXRoIGQ9Ik0xNDkuMDUgMTI3LjQ2OHMtLjUxIDIuMTgzLjk5NSAzLjM2NmMxLjU2IDEuMjI2IDguNjQyLTEuODk1IDMuOTY3LTcuNzg1LTIuMzY3LTIuNDc3LTYuNS0zLjIyNi05LjMzIDAtNS4yMDggNS45MzYgMCAxNy41MSAxMS42MSAxMy43MyAxMi40NTgtNi4yNTcgNS42MzMtMjEuNjU2LTUuMDczLTIyLjY1NC02LjYwMi0uNjA2LTE0LjA0MyAxLjc1Ni0xNi4xNTcgMTAuMjY4LTEuNzE4IDYuOTIgMS41ODQgMTcuMzg3IDEyLjQ1IDIwLjQ3NiAxMC44NjYgMy4wOSAxOS4zMzEtNC4zMSAxOS4zMzEtNC4zMSIgc3Ryb2tlPSIjMDAwIiBzdHJva2Utd2lkdGg9IjEuMjUiIHN0cm9rZS1saW5lY2FwPSJyb3VuZCIvPjwvZz48L3N2Zz4=');\r\n");
      out.write("    opacity: 0.1;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    bottom: 0;\r\n");
      out.write("    right: 0;\r\n");
      out.write("    height:100%;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    z-index: -1;\r\n");
      out.write("    }\r\n");
      out.write("    #chat-input {\r\n");
      out.write("    background: #f4f7f9;\r\n");
      out.write("    width:100%;\r\n");
      out.write("    position:relative;\r\n");
      out.write("    height:47px;\r\n");
      out.write("    padding-top:10px;\r\n");
      out.write("    padding-right:50px;\r\n");
      out.write("    padding-bottom:10px;\r\n");
      out.write("    padding-left:15px;\r\n");
      out.write("    border:none;\r\n");
      out.write("    resize:none;\r\n");
      out.write("    outline:none;\r\n");
      out.write("    border:1px solid #ccc;\r\n");
      out.write("    color:#888;\r\n");
      out.write("    border-top:none;\r\n");
      out.write("    border-bottom-right-radius:5px;\r\n");
      out.write("    border-bottom-left-radius:5px;\r\n");
      out.write("    overflow:hidden;\r\n");
      out.write("    }\r\n");
      out.write("    .chat-input > form {\r\n");
      out.write("    margin-bottom: 0;\r\n");
      out.write("    }\r\n");
      out.write("    #chat-input::-webkit-input-placeholder { /* Chrome/Opera/Safari */\r\n");
      out.write("    color: #ccc;\r\n");
      out.write("    }\r\n");
      out.write("    #chat-input::-moz-placeholder { /* Firefox 19+ */\r\n");
      out.write("    color: #ccc;\r\n");
      out.write("    }\r\n");
      out.write("    #chat-input:-ms-input-placeholder { /* IE 10+ */\r\n");
      out.write("    color: #ccc;\r\n");
      out.write("    }\r\n");
      out.write("    #chat-input:-moz-placeholder { /* Firefox 18- */\r\n");
      out.write("    color: #ccc;\r\n");
      out.write("    }\r\n");
      out.write("    .chat-submit {\r\n");
      out.write("    position:absolute;\r\n");
      out.write("    bottom:3px;\r\n");
      out.write("    right:10px;\r\n");
      out.write("    background: transparent;\r\n");
      out.write("    box-shadow:none;\r\n");
      out.write("    border:none;\r\n");
      out.write("    border-radius:50%;\r\n");
      out.write("    color:#5A5EB9;\r\n");
      out.write("    width:35px;\r\n");
      out.write("    height:35px;\r\n");
      out.write("    }\r\n");
      out.write("    .chat-logs {\r\n");
      out.write("    padding:15px;\r\n");
      out.write("    height:370px;\r\n");
      out.write("    overflow-y:scroll;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .chat-logs::-webkit-scrollbar-track\r\n");
      out.write("    {\r\n");
      out.write("    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3);\r\n");
      out.write("    background-color: #F5F5F5;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .chat-logs::-webkit-scrollbar\r\n");
      out.write("    {\r\n");
      out.write("    width: 5px;\r\n");
      out.write("    background-color: #F5F5F5;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .chat-logs::-webkit-scrollbar-thumb\r\n");
      out.write("    {\r\n");
      out.write("    background-color: #5A5EB9;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    @media only screen and (max-width: 500px) {\r\n");
      out.write("    .chat-logs {\r\n");
      out.write("    height:40vh;\r\n");
      out.write("    }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .chat-msg.user > .msg-avatar img {\r\n");
      out.write("    width:45px;\r\n");
      out.write("    height:45px;\r\n");
      out.write("    border-radius:50%;\r\n");
      out.write("    float:left;\r\n");
      out.write("    width:15%;\r\n");
      out.write("    }\r\n");
      out.write("    .chat-msg.self > .msg-avatar img {\r\n");
      out.write("    width:45px;\r\n");
      out.write("    height:45px;\r\n");
      out.write("    border-radius:50%;\r\n");
      out.write("    float:right;\r\n");
      out.write("    width:15%;\r\n");
      out.write("    }\r\n");
      out.write("    .cm-msg-text {\r\n");
      out.write("    background:white;\r\n");
      out.write("    padding:10px 15px 10px 15px;\r\n");
      out.write("    color:#666;\r\n");
      out.write("    max-width:75%;\r\n");
      out.write("    float:left;\r\n");
      out.write("    margin-left:10px;\r\n");
      out.write("    position:relative;\r\n");
      out.write("    margin-bottom:20px;\r\n");
      out.write("    border-radius:30px;\r\n");
      out.write("    }\r\n");
      out.write("    .chat-msg {\r\n");
      out.write("    clear:both;\r\n");
      out.write("    }\r\n");
      out.write("    .chat-msg.self > .cm-msg-text {\r\n");
      out.write("    float:right;\r\n");
      out.write("    margin-right:10px;\r\n");
      out.write("    background: #5A5EB9;\r\n");
      out.write("    color:white;\r\n");
      out.write("    }\r\n");
      out.write("    .cm-msg-button>ul>li {\r\n");
      out.write("    list-style:none;\r\n");
      out.write("    float:left;\r\n");
      out.write("    width:50%;\r\n");
      out.write("    }\r\n");
      out.write("    .cm-msg-button {\r\n");
      out.write("    clear: both;\r\n");
      out.write("    margin-bottom: 70px;\r\n");
      out.write("    }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\r');
      out.write('\n');

    String isLoggedIn = (String)session.getAttribute("isLoggedIn");
    if(isLoggedIn=="true"){

      out.write("\r\n");
      out.write("<div style=\"z-index: 100 !important;\" id=\"body\">\r\n");
      out.write("\r\n");
      out.write("    <div id=\"chat-circle\" class=\"btn btn-raised\">\r\n");
      out.write("        <div id=\"chat-overlay\"></div>\r\n");
      out.write("        <i class=\"material-icons\">speaker_phone</i>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"chat-box\">\r\n");
      out.write("        <div class=\"chat-box-header\">\r\n");
      out.write("            Communicate With Admin\r\n");
      out.write("            <span class=\"chat-box-toggle\"><i class=\"material-icons\">close</i></span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"chat-box-body\">\r\n");
      out.write("            <div class=\"chat-box-overlay\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"chat-logs\">\r\n");
      out.write("\r\n");
      out.write("            </div><!--chat-log -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"chat-input\">\r\n");
      out.write("            <form>\r\n");
      out.write("                <input type=\"text\" id=\"chat-input\" placeholder=\"Send a message...\"/>\r\n");
      out.write("                <button type=\"submit\" class=\"chat-submit\" id=\"chat-submit\"><i class=\"material-icons\">send</i></button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");

    }
    else{

      out.write("\r\n");
      out.write("<div id=\"body\">\r\n");
      out.write("\r\n");
      out.write("    <div id=\"chat-circle\" class=\"btn btn-raised\">\r\n");
      out.write("        <div id=\"chat-overlay\"></div>\r\n");
      out.write("        <i class=\"material-icons\">speaker_phone</i>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"chat-box\">\r\n");
      out.write("        <div class=\"chat-box-header\">\r\n");
      out.write("            Communicate with Admin\r\n");
      out.write("            <span class=\"chat-box-toggle\"><i class=\"material-icons\">close</i></span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"chat-box-body\">\r\n");
      out.write("            <div class=\"chat-box-overlay\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"chat-logs\">\r\n");
      out.write("                <b>Please Login First to start chatting</b>\r\n");
      out.write("\r\n");
      out.write("            </div><!--chat-log -->\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");

    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("    $(function() {\r\n");
      out.write("        ");

        if(isLoggedIn=="true"){
        while (chat.next()){
            String identifier ="";
            if(chat.getString("identifier").equals("User")){
                identifier="self";
            }
            else{
                identifier="user";
            }
        
      out.write("\r\n");
      out.write("        generate_message(\"");
      out.print(chat.getString("msg"));
      out.write("\", \"");
      out.print(identifier);
      out.write("\")\r\n");
      out.write("        ");

        }
        }
        
      out.write("\r\n");
      out.write("        var INDEX = 0;\r\n");
      out.write("        $(\"#chat-submit\").click(function(e) {\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("            var msg = $(\"#chat-input\").val();\r\n");
      out.write("            if(msg.trim() == ''){\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            generate_message(msg, 'self');\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type : 'post',\r\n");
      out.write("                url : '");
      out.print(request.getContextPath());
      out.write("/UserPostMessage',\r\n");
      out.write("                data:{\r\n");
      out.write("                    'msg':msg,\r\n");
      out.write("                    'identifier': \"User\"\r\n");
      out.write("\r\n");
      out.write("                },\r\n");
      out.write("                success:function(data){\r\n");
      out.write("                    console.log(data);\r\n");
      out.write("                    primData=data;\r\n");
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("            var buttons = [\r\n");
      out.write("                {\r\n");
      out.write("                    name: 'Existing User',\r\n");
      out.write("                    value: 'existing'\r\n");
      out.write("                },\r\n");
      out.write("                {\r\n");
      out.write("                    name: 'New User',\r\n");
      out.write("                    value: 'new'\r\n");
      out.write("                }\r\n");
      out.write("            ];\r\n");
      out.write("            // setTimeout(function() {\r\n");
      out.write("            //     generate_message(\"Please Wait. Our Service Executive will connect to you soon\", 'user');\r\n");
      out.write("            // }, 1000)\r\n");
      out.write("\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("        function generate_message(msg, type) {\r\n");
      out.write("            var profImg=\"\";\r\n");
      out.write("            if(type==\"self\"){\r\n");
      out.write("                profImg=\"");
      out.print(request.getContextPath() );
      out.write("/resources/uploads/profile.png\";\r\n");
      out.write("            }\r\n");
      out.write("            else{\r\n");
      out.write("                profImg=\"");
      out.print(request.getContextPath() );
      out.write("/resources/images/food.png\";\r\n");
      out.write("            }\r\n");
      out.write("            INDEX++;\r\n");
      out.write("            var str=\"\";\r\n");
      out.write("            str += \"<div id='cm-msg-\"+INDEX+\"' class=\\\"chat-msg \"+type+\"\\\">\";\r\n");
      out.write("            str += \"          <span class=\\\"msg-avatar\\\">\";\r\n");
      out.write("            str += \"            <img src=\"+profImg+\">\";\r\n");
      out.write("            str += \"          <\\/span>\";\r\n");
      out.write("            str += \"          <div class=\\\"cm-msg-text\\\">\";\r\n");
      out.write("            str += msg;\r\n");
      out.write("            str += \"          <\\/div>\";\r\n");
      out.write("            str += \"        <\\/div>\";\r\n");
      out.write("            $(\".chat-logs\").append(str);\r\n");
      out.write("            $(\"#cm-msg-\"+INDEX).hide().fadeIn(300);\r\n");
      out.write("            if(type == 'self'){\r\n");
      out.write("                $(\"#chat-input\").val('');\r\n");
      out.write("            }\r\n");
      out.write("            $(\".chat-logs\").stop().animate({ scrollTop: $(\".chat-logs\")[0].scrollHeight}, 1000);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function generate_button_message(msg, buttons){\r\n");
      out.write("            /* Buttons should be object array\r\n");
      out.write("              [\r\n");
      out.write("                {\r\n");
      out.write("                  name: 'Existing User',\r\n");
      out.write("                  value: 'existing'\r\n");
      out.write("                },\r\n");
      out.write("                {\r\n");
      out.write("                  name: 'New User',\r\n");
      out.write("                  value: 'new'\r\n");
      out.write("                }\r\n");
      out.write("              ]\r\n");
      out.write("            */\r\n");
      out.write("            INDEX++;\r\n");
      out.write("            var btn_obj = buttons.map(function(button) {\r\n");
      out.write("                return  \"              <li class=\\\"button\\\"><a href=\\\"javascript:;\\\" class=\\\"btn btn-primary chat-btn\\\" chat-value=\\\"\"+button.value+\"\\\">\"+button.name+\"<\\/a><\\/li>\";\r\n");
      out.write("            }).join('');\r\n");
      out.write("            var str=\"\";\r\n");
      out.write("            str += \"<div id='cm-msg-\"+INDEX+\"' class=\\\"chat-msg user\\\">\";\r\n");
      out.write("            str += \"          <span class=\\\"msg-avatar\\\">\";\r\n");
      out.write("            str += \"            <img src=\\\"https:\\/\\/image.crisp.im\\/avatar\\/operator\\/196af8cc-f6ad-4ef7-afd1-c45d5231387c\\/240\\/?1483361727745\\\">\";\r\n");
      out.write("            str += \"          <\\/span>\";\r\n");
      out.write("            str += \"          <div class=\\\"cm-msg-text\\\">\";\r\n");
      out.write("            str += msg;\r\n");
      out.write("            str += \"          <\\/div>\";\r\n");
      out.write("            str += \"          <div class=\\\"cm-msg-button\\\">\";\r\n");
      out.write("            str += \"            <ul>\";\r\n");
      out.write("            str += btn_obj;\r\n");
      out.write("            str += \"            <\\/ul>\";\r\n");
      out.write("            str += \"          <\\/div>\";\r\n");
      out.write("            str += \"        <\\/div>\";\r\n");
      out.write("            $(\".chat-logs\").append(str);\r\n");
      out.write("            $(\"#cm-msg-\"+INDEX).hide().fadeIn(300);\r\n");
      out.write("            $(\".chat-logs\").stop().animate({ scrollTop: $(\".chat-logs\")[0].scrollHeight}, 1000);\r\n");
      out.write("            $(\"#chat-input\").attr(\"disabled\", true);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        $(document).delegate(\".chat-btn\", \"click\", function() {\r\n");
      out.write("            var value = $(this).attr(\"chat-value\");\r\n");
      out.write("            var name = $(this).html();\r\n");
      out.write("            $(\"#chat-input\").attr(\"disabled\", false);\r\n");
      out.write("            generate_message(name, 'self');\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("        $(\"#chat-circle\").click(function() {\r\n");
      out.write("            $(\"#chat-circle\").toggle('scale');\r\n");
      out.write("            $(\".chat-box\").toggle('scale');\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("        $(\".chat-box-toggle\").click(function() {\r\n");
      out.write("            $(\"#chat-circle\").toggle('scale');\r\n");
      out.write("            $(\".chat-box\").toggle('scale');\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
