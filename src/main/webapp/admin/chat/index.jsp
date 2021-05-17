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
        cb.ps = cb.con.prepareStatement("SELECT * FROM save_conversation GROUP BY sender_id");
        cb.rs = cb.ps.executeQuery();
        rsConversation=cb.rs;

    }
    catch (Exception e){
        System.out.println("meow");
    }


%>
<head>
    <title>Admin Dashboard</title>
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
                                                    <h3>Conversations</h3>
                                                    <h6 class="text-c-blue mb-0"> <span class="text-muted">Sorted as Recent</span></h6>
                                                </div>
                                            </div>
                                        </div>
                                        <br>
                                        <div style="padding: 20px" align="center" class="row">
                                            <%
                                                while (rsConversation.next()){
                                            %>
                                            <div class="col-6 col-sm-3">
                                                <div style="border: 1px solid #3058DC; border-radius: 20px; padding-top: 20px; padding-bottom: 20px" class="container">
                                                    <h3><%=rsConversation.getString("sender_name")%></h3><br>
                                                    <a style="color: white" href="conversation.jsp?id=<%=rsConversation.getInt("sender_id")%>&name=<%=rsConversation.getString("sender_name")%>" class="btn btn-info">Open Conversation</a>
                                                </div>
                                            </div>
                                            <%
                                                }
                                            %>

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
</body>
<%
}else{
    response.sendRedirect("../");
%>
<%
    }
%>