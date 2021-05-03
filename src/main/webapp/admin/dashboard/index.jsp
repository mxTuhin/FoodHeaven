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
    try{
        cb.ps = cb.con.prepareStatement("SELECT * FROM foods WHERE admin_id=?");

        cb.ps.setString(1, rsLoc.getString(1));
        cb.rs = cb.ps.executeQuery();
        rsFood= cb.rs;
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
                            <div class="col-md-12 col-xl-7">
                                <div class="card card-social">
                                    <div class="card-block border-bottom">
                                        <div class="row align-items-center justify-content-center">

                                            <div class="col text-right">
                                                <h3>Manage Foods</h3>
                                                <h5 class="text-c-blue mb-0"> <span class="text-muted">Food List</span></h5>
                                            </div>
                                        </div>
                                    </div>
                                    <div style="overflow: auto" class="card-block">
                                        <div class="row align-items-center justify-content-center card-active">
                                            <table class="table table-inverse">
                                                <thead>
                                                <tr>
                                                    <th>#</th>
                                                    <th>Food Name</th>
                                                    <th>Food Description</th>
                                                    <th>Food Price</th>
                                                    <th><div align="center">
                                                        Action

                                                    </div></th>

                                                </tr>
                                                </thead>
                                                <tbody>
                                                <%
                                                    int i =1;
                                                    while (rsFood.next()){


                                                %>
                                                <tr>
                                                    <td><%=i%></td>
                                                    <td><%=rsFood.getString("name")%></td>
                                                    <td><%=rsFood.getString("description")%></td>
                                                    <td><%=rsFood.getString("price")%></td>
                                                    <td style="width: 150px">
                                                        <div align="center" class="container">
                                                            <div class="row">
                                                                <div class="col-6 col-sm-6">
                                                                    <button onclick="update_foods('<%=rsFood.getInt("id")%>','<%=rsFood.getString("name")%>', '<%=rsFood.getString("price")%>', '<%=rsFood.getString("description")%>', '<%=rsFood.getString("image")%>' )" style="width: 55px" class="btn btn-info" data-toggle="modal" data-target="#FoodUpdateModal">
                                                                        <i class="fas fa-edit"></i>
                                                                    </button>
                                                                </div>
                                                                <div class="col-6 col-sm-6">
                                                                    <a href="${pageContext.request.contextPath}/DeleteFoodServlet?id=<%=rsFood.getInt("id")%>" style="width: 55px; color: white" class="btn btn-danger">
                                                                        <i class="fas fa-times"></i>
                                                                    </a>
                                                                </div>

                                                            </div>

                                                        </div>
                                                    </td>

                                                </tr>
                                                <%
                                                        ++i;
                                                    }
                                                %>

                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="col-md-12 col-xl-5">
                                <div class="card card-social">
                                    <div class="card-block border-bottom">
                                        <div class="row align-items-center justify-content-center">

                                            <div class="col text-right">
                                                <h3>Add New Food</h3>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="card-block">

                                        <div class="row align-items-center justify-content-center card-active">
                                            <h5>Upload Food Info</h5>

                                            <div class="container">
                                                <form method="POST" action="${pageContext.request.contextPath}/UploadFoodInfoServlet" enctype="multipart/form-data">
                                                    <div>
                                                        <label>Food Name</label>
                                                        <input type="text" class="form-control" name="admin_id" value="<%=rsLoc.getInt("id")%>" placeholder="Admin ID" hidden required>
                                                        <input type="text" class="form-control" name="name" placeholder="Name of the Food" required>
                                                    </div>
                                                    <div>
                                                        <label>Food Description</label>
                                                        <input type="text" class="form-control" name="description" placeholder="Description of the Food" required>
                                                    </div>
                                                    <div>
                                                        <label>Food Price</label>
                                                        <input type="text" class="form-control" name="price" placeholder="Price of the Food" required>
                                                    </div>
                                                    <div>
                                                        <label>Food Image</label>
                                                        <input type="file" class="form-control" name="food_image" required>
                                                    </div>
                                                    <div align="center" style="padding-top: 10px" class="container">
                                                        <input type="submit" class="btn btn-info form-control w-75" value="Submit">
                                                    </div>


                                                </form>
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
</body>
<%
    }else{
        response.sendRedirect("../");
%>
<%
    }
%>