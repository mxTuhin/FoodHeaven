<%
    if(session.getAttribute("isLoggedInAdmin")=="true"){
%>
<%--
  Created by IntelliJ IDEA.
  User: mtuhi
  Date: 5/1/2021
  Time: 8:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@
        page import="com.scorpionsstudio.FoodHeaven.*"
%>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="com.scorpionsstudio.FoodHeaven.ConnectionBlock" %>
<jsp:include page="../layouts/app.jsp"/>
<%
    ResultSet rsLoc= (ResultSet) session.getAttribute("user");
    ConnectionBlock cb=new ConnectionBlock();
    ResultSet rsFood=null;
    ResultSet rsConversation=null;
    ResultSet chat=null;
    try{
        cb.ps = cb.con.prepareStatement("SELECT * FROM foods WHERE admin_id=?");

        cb.ps.setString(1, rsLoc.getString(1));
        cb.rs = cb.ps.executeQuery();
        rsFood= cb.rs;
    }
    catch (Exception e){
        System.out.println("meow");
    }
    try{
        String senderId= request.getParameter("id");
        cb.ps = cb.con.prepareStatement("SELECT * FROM save_conversation WHERE sender_id=?");
        cb.ps.setString(1, senderId);
        cb.rs = cb.ps.executeQuery();
        chat=cb.rs;

    }
    catch (Exception e){
        System.out.println("meow");
    }


%>
<head>
    <title>Chat</title>
    <style>

        #center-text {
            display: flex;
            flex: 1;
            flex-direction:column;
            justify-content: center;
            align-items: center;
            height:100%;

        }
        #chat-circle {
            position: fixed;
            bottom: 50px;
            right: 50px;
            background: #5A5EB9;
            width: 80px;
            height: 80px;
            border-radius: 50%;
            color: white;
            padding: 28px;
            cursor: pointer;

        }

        .btn#my-btn {
            background: white;
            padding-top: 13px;
            padding-bottom: 12px;
            border-radius: 45px;
            padding-right: 40px;
            padding-left: 40px;
            color: #5865C3;
        }
        #chat-overlay {
            background: rgba(255,255,255,0.1);
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            border-radius: 50%;
            display: block;
        }


        .chat-box {
            display:block;
            background: #efefef;
            width:850px;
            max-width: 85vw;
            max-height:100vh;
            border-radius:5px;
            /*   box-shadow: 0px 5px 35px 9px #464a92; */
        }
        .chat-box-toggle {
            float:right;
            margin-right:15px;
            cursor:pointer;
        }
        .chat-box-header {
            background: #5A5EB9;
            height:70px;
            border-top-left-radius:5px;
            border-top-right-radius:5px;
            color:white;
            text-align:center;
            font-size:20px;
            padding-top:17px;
        }
        .chat-box-body {
            position: relative;
            height:370px;
            height:auto;
            border:1px solid #ccc;
            overflow: hidden;
        }
        .chat-box-body:after {
            content: "";
            background-image: url('data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iMjAwIiBoZWlnaHQ9IjIwMCIgdmlld0JveD0iMCAwIDIwMCAyMDAiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyI+PGcgdHJhbnNmb3JtPSJ0cmFuc2xhdGUoMTAgOCkiIGZpbGw9Im5vbmUiIGZpbGwtcnVsZT0iZXZlbm9kZCI+PGNpcmNsZSBzdHJva2U9IiMwMDAiIHN0cm9rZS13aWR0aD0iMS4yNSIgY3g9IjE3NiIgY3k9IjEyIiByPSI0Ii8+PHBhdGggZD0iTTIwLjUuNWwyMyAxMW0tMjkgODRsLTMuNzkgMTAuMzc3TTI3LjAzNyAxMzEuNGw1Ljg5OCAyLjIwMy0zLjQ2IDUuOTQ3IDYuMDcyIDIuMzkyLTMuOTMzIDUuNzU4bTEyOC43MzMgMzUuMzdsLjY5My05LjMxNiAxMC4yOTIuMDUyLjQxNi05LjIyMiA5LjI3NC4zMzJNLjUgNDguNXM2LjEzMSA2LjQxMyA2Ljg0NyAxNC44MDVjLjcxNSA4LjM5My0yLjUyIDE0LjgwNi0yLjUyIDE0LjgwNk0xMjQuNTU1IDkwcy03LjQ0NCAwLTEzLjY3IDYuMTkyYy02LjIyNyA2LjE5Mi00LjgzOCAxMi4wMTItNC44MzggMTIuMDEybTIuMjQgNjguNjI2cy00LjAyNi05LjAyNS0xOC4xNDUtOS4wMjUtMTguMTQ1IDUuNy0xOC4xNDUgNS43IiBzdHJva2U9IiMwMDAiIHN0cm9rZS13aWR0aD0iMS4yNSIgc3Ryb2tlLWxpbmVjYXA9InJvdW5kIi8+PHBhdGggZD0iTTg1LjcxNiAzNi4xNDZsNS4yNDMtOS41MjFoMTEuMDkzbDUuNDE2IDkuNTIxLTUuNDEgOS4xODVIOTAuOTUzbC01LjIzNy05LjE4NXptNjMuOTA5IDE1LjQ3OWgxMC43NXYxMC43NWgtMTAuNzV6IiBzdHJva2U9IiMwMDAiIHN0cm9rZS13aWR0aD0iMS4yNSIvPjxjaXJjbGUgZmlsbD0iIzAwMCIgY3g9IjcxLjUiIGN5PSI3LjUiIHI9IjEuNSIvPjxjaXJjbGUgZmlsbD0iIzAwMCIgY3g9IjE3MC41IiBjeT0iOTUuNSIgcj0iMS41Ii8+PGNpcmNsZSBmaWxsPSIjMDAwIiBjeD0iODEuNSIgY3k9IjEzNC41IiByPSIxLjUiLz48Y2lyY2xlIGZpbGw9IiMwMDAiIGN4PSIxMy41IiBjeT0iMjMuNSIgcj0iMS41Ii8+PHBhdGggZmlsbD0iIzAwMCIgZD0iTTkzIDcxaDN2M2gtM3ptMzMgODRoM3YzaC0zem0tODUgMThoM3YzaC0zeiIvPjxwYXRoIGQ9Ik0zOS4zODQgNTEuMTIybDUuNzU4LTQuNDU0IDYuNDUzIDQuMjA1LTIuMjk0IDcuMzYzaC03Ljc5bC0yLjEyNy03LjExNHpNMTMwLjE5NSA0LjAzbDEzLjgzIDUuMDYyLTEwLjA5IDcuMDQ4LTMuNzQtMTIuMTF6bS04MyA5NWwxNC44MyA1LjQyOS0xMC44MiA3LjU1Ny00LjAxLTEyLjk4N3pNNS4yMTMgMTYxLjQ5NWwxMS4zMjggMjAuODk3TDIuMjY1IDE4MGwyLjk0OC0xOC41MDV6IiBzdHJva2U9IiMwMDAiIHN0cm9rZS13aWR0aD0iMS4yNSIvPjxwYXRoIGQ9Ik0xNDkuMDUgMTI3LjQ2OHMtLjUxIDIuMTgzLjk5NSAzLjM2NmMxLjU2IDEuMjI2IDguNjQyLTEuODk1IDMuOTY3LTcuNzg1LTIuMzY3LTIuNDc3LTYuNS0zLjIyNi05LjMzIDAtNS4yMDggNS45MzYgMCAxNy41MSAxMS42MSAxMy43MyAxMi40NTgtNi4yNTcgNS42MzMtMjEuNjU2LTUuMDczLTIyLjY1NC02LjYwMi0uNjA2LTE0LjA0MyAxLjc1Ni0xNi4xNTcgMTAuMjY4LTEuNzE4IDYuOTIgMS41ODQgMTcuMzg3IDEyLjQ1IDIwLjQ3NiAxMC44NjYgMy4wOSAxOS4zMzEtNC4zMSAxOS4zMzEtNC4zMSIgc3Ryb2tlPSIjMDAwIiBzdHJva2Utd2lkdGg9IjEuMjUiIHN0cm9rZS1saW5lY2FwPSJyb3VuZCIvPjwvZz48L3N2Zz4=');
            opacity: 0.1;
            top: 0;
            left: 0;
            bottom: 0;
            right: 0;
            height:100%;
            position: absolute;
            z-index: -1;
        }
        #chat-input {
            background: #f4f7f9;
            width:100%;
            position:relative;
            height:47px;
            padding-top:10px;
            padding-right:50px;
            padding-bottom:10px;
            padding-left:15px;
            border:none;
            resize:none;
            outline:none;
            border:1px solid #ccc;
            color:#888;
            border-top:none;
            border-bottom-right-radius:5px;
            border-bottom-left-radius:5px;
            overflow:hidden;
        }
        .chat-input > form {
            margin-bottom: 0;
        }
        #chat-input::-webkit-input-placeholder { /* Chrome/Opera/Safari */
            color: #ccc;
        }
        #chat-input::-moz-placeholder { /* Firefox 19+ */
            color: #ccc;
        }
        #chat-input:-ms-input-placeholder { /* IE 10+ */
            color: #ccc;
        }
        #chat-input:-moz-placeholder { /* Firefox 18- */
            color: #ccc;
        }
        .chat-submit {
            position:absolute;
            bottom:3px;
            right:10px;
            background: transparent;
            box-shadow:none;
            border:none;
            border-radius:50%;
            color:#5A5EB9;
            width:35px;
            height:35px;
        }
        .chat-logs {
            padding:15px;
            height:370px;
            overflow-y:scroll;
        }

        .chat-logs::-webkit-scrollbar-track
        {
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3);
            background-color: #F5F5F5;
        }

        .chat-logs::-webkit-scrollbar
        {
            width: 5px;
            background-color: #F5F5F5;
        }

        .chat-logs::-webkit-scrollbar-thumb
        {
            background-color: #5A5EB9;
        }



        @media only screen and (max-width: 500px) {
            .chat-logs {
                height:40vh;
            }
        }

        .chat-msg.user > .msg-avatar img {
            width:45px;
            height:45px;
            border-radius:50%;
            float:left;
            width:15%;
        }
        .chat-msg.self > .msg-avatar img {
            width:45px;
            height:45px;
            border-radius:50%;
            float:right;
            width:15%;
        }
        .cm-msg-text {
            background:white;
            padding:10px 15px 10px 15px;
            color:#666;
            max-width:75%;
            float:left;
            margin-left:10px;
            position:relative;
            margin-bottom:20px;
            border-radius:30px;
        }
        .chat-msg {
            clear:both;
        }
        .chat-msg.self > .cm-msg-text {
            float:right;
            margin-right:10px;
            background: #5A5EB9;
            color:white;
        }
        .cm-msg-button>ul>li {
            list-style:none;
            float:left;
            width:50%;
        }
        .cm-msg-button {
            clear: both;
            margin-bottom: 70px;
        }
    </style>
</head>
<body>
<div class="pcoded-main-container">
    <div class="pcoded-wrapper">
        <div class="pcoded-content">
            <div class="pcoded-inner-content">
                <div class="main-body">
                    <div class="page-wrapper">
                        <!-- [ breadcrumb ] start -->
                        <div class="page-header">
                            <div class="page-block">
                                <div class="row align-items-center">
                                    <div class="col-md-12">
                                        <div class="page-header-title">
                                            <h5>Home</h5>
                                        </div>
                                        <ul class="breadcrumb">
                                            <li class="breadcrumb-item"><a href="index.html"><i class="feather icon-home"></i></a></li>
                                            <li class="breadcrumb-item"><a href="#!">Analytics Dashboard</a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- [ breadcrumb ] end -->
                        <!-- [ Main Content ] start -->
                        <div class="row">

                            <!-- product profit start -->
                            <jsp:include page="../layouts/analytics.jsp"/>
                            <!-- product profit end -->
                            <div class="container">
                                <div class="col-md-12 col-xl-12">
                                    <div class="card card-social">
                                        <div class="card-block border-bottom">
                                            <div class="row align-items-center justify-content-center">

                                                <div class="col text-right">
                                                    <h3>Chatbox</h3>
                                                    <h6 class="text-c-blue mb-0"> <span class="text-muted">Sorted as Recent</span></h6>
                                                </div>
                                            </div>
                                        </div>
                                        <br>
                                        <div align="center" class="container">
                                            <div id="body">
                                                <div class="chat-box">
                                                    <div class="chat-box-header">
                                                        Reply To <%=request.getParameter("name")%>

                                                    </div>
                                                    <div class="chat-box-body">
                                                        <div class="chat-box-overlay">
                                                        </div>
                                                        <div align="left" class="chat-logs">


                                                        </div><!--chat-log -->
                                                        <div class="chat-input">
                                                            <form>
                                                                <input type="text" id="chat-input" placeholder="Send a message..."/>
                                                                <button type="submit" class="chat-submit" id="chat-submit"><i class="material-icons">send</i></button>
                                                            </form>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </div>




                        </div>

                        <!-- [ Main Content ] end -->
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Modal -->
<div class="modal fade" id="FoodUpdateModal" tabindex="-1" role="dialog" aria-labelledby="FoodUpdateModalTitle" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered  modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="FoodUpdateModalTitle">Update Food Information</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form method="POST" action="${pageContext.request.contextPath}/UpdateFoodServlet">
                    <div class="row">
                        <div align="center" class="col-12 col-sm-12">
                            <img id="food_image_existing" src="<%= StaticVars.baseURL%>uploads/69.6180287518262category-image-1.jpg">
                        </div>
                        <div class="col-6 col-sm-6">
                            <label>Food Name</label>
                            <input class="form-control" type="text" name="food_id" id="food_id" placeholder="ID of the Food" hidden>
                            <input class="form-control" type="text" name="food_name" id="food_name" placeholder="Name of the Food">
                        </div>
                        <div class="col-6 col-sm-6">
                            <label>Food Price</label>
                            <input class="form-control" type="text" name="food_price" id="food_price" placeholder="Price of the Food">
                        </div>
                        <div class="col-12 col-sm-12">
                            <label>Food Description</label>
                            <input class="form-control" type="text" name="food_price" id="food_description" placeholder="Description of the Food">
                        </div>


                        <br><br><br><br><br>
                        <div align="center" class="col-12 col-sm-12">
                            <input type="submit" class="form-control w-75 btn btn-info" name="food_image_update" value="Submit" required>
                        </div>


                    </div>


                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>

            </div>
        </div>
    </div>
</div>
<script>
    function update_foods(id, name, price, description, image){
        document.getElementById("food_id").value=id;
        document.getElementById("food_name").value=name;
        document.getElementById("food_price").value=price;
        document.getElementById("food_description").value=description;
        document.getElementById("food_image_existing").src="<%= StaticVars.baseURL%>"+"uploads/"+image;

    }
</script>
<script>

    $(function() {
        <%
        while (chat.next()){
            String identifier ="";
            if(chat.getString("identifier").equals("User")){
                identifier="self";
            }
            else{
                identifier="user";
            }
        %>
        generate_message("<%=chat.getString("msg")%>", "<%=identifier%>")
        <%
        }
        %>
        var INDEX = 0;
        $("#chat-submit").click(function(e) {
            e.preventDefault();
            var msg = $("#chat-input").val();
            if(msg.trim() == ''){
                return false;
            }
            generate_message(msg, 'user');
            $("#chat-input").val("");
            $.ajax({
                type : 'post',
                url : '<%=request.getContextPath()%>/UserPostMessage',
                data:{
                    'msg':msg,
                    'identifier': "Admin",
                    'id': <%=request.getParameter("id")%>

                },
                success:function(data){
                    console.log(data);
                    primData=data;

                }
            });
            var buttons = [
                {
                    name: 'Existing User',
                    value: 'existing'
                },
                {
                    name: 'New User',
                    value: 'new'
                }
            ];
            // setTimeout(function() {
            //     generate_message("Please Wait. Our Service Executive will connect to you soon", 'user');
            // }, 1000)

        })

        function generate_message(msg, type) {
            var profImg="";
            if(type=="self"){
                profImg="<%=request.getContextPath() %>/resources/uploads/profile.png";
            }
            else{
                profImg="<%=request.getContextPath() %>/resources/images/food.png";
            }
            INDEX++;
            var str="";
            str += "<div id='cm-msg-"+INDEX+"' class=\"chat-msg "+type+"\">";
            str += "          <span class=\"msg-avatar\">";
            str += "            <img style='width: 50px' src="+profImg+">";
            str += "          <\/span>";
            str += "          <div class=\"cm-msg-text\">";
            str += msg;
            str += "          <\/div>";
            str += "        <\/div>";
            $(".chat-logs").append(str);
            $("#cm-msg-"+INDEX).hide().fadeIn(300);
            if(type == 'self'){
                $("#chat-input").val('');
            }
            $(".chat-logs").stop().animate({ scrollTop: $(".chat-logs")[0].scrollHeight}, 1000);
        }

        function generate_button_message(msg, buttons){
            /* Buttons should be object array
              [
                {
                  name: 'Existing User',
                  value: 'existing'
                },
                {
                  name: 'New User',
                  value: 'new'
                }
              ]
            */
            INDEX++;
            var btn_obj = buttons.map(function(button) {
                return  "              <li class=\"button\"><a href=\"javascript:;\" class=\"btn btn-primary chat-btn\" chat-value=\""+button.value+"\">"+button.name+"<\/a><\/li>";
            }).join('');
            var str="";
            str += "<div id='cm-msg-"+INDEX+"' class=\"chat-msg user\">";
            str += "          <span class=\"msg-avatar\">";
            str += "            <img src=\"https:\/\/image.crisp.im\/avatar\/operator\/196af8cc-f6ad-4ef7-afd1-c45d5231387c\/240\/?1483361727745\">";
            str += "          <\/span>";
            str += "          <div class=\"cm-msg-text\">";
            str += msg;
            str += "          <\/div>";
            str += "          <div class=\"cm-msg-button\">";
            str += "            <ul>";
            str += btn_obj;
            str += "            <\/ul>";
            str += "          <\/div>";
            str += "        <\/div>";
            $(".chat-logs").append(str);
            $("#cm-msg-"+INDEX).hide().fadeIn(300);
            $(".chat-logs").stop().animate({ scrollTop: $(".chat-logs")[0].scrollHeight}, 1000);
            $("#chat-input").attr("disabled", true);
        }

        $(document).delegate(".chat-btn", "click", function() {
            var value = $(this).attr("chat-value");
            var name = $(this).html();
            $("#chat-input").attr("disabled", false);
            generate_message(name, 'self');
        })

        $("#chat-circle").click(function() {
            $("#chat-circle").toggle('scale');
            $(".chat-box").toggle('scale');
        })

        $(".chat-box-toggle").click(function() {
            $("#chat-circle").toggle('scale');
            $(".chat-box").toggle('scale');
        })

    })
</script>
</body>
<%
}else{
    response.sendRedirect("../");
%>
<%
    }
%>