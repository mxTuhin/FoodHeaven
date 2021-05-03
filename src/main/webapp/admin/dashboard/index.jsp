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
                            <div class="col-xl-3 col-md-6">
                                <div class="card prod-p-card bg-c-red">
                                    <div class="card-body">
                                        <div class="row align-items-center m-b-25">
                                            <div class="col">
                                                <h6 class="m-b-5 text-white">Total Profit </h6>
                                                <h3 class="m-b-0 text-white">$1,783</h3>
                                            </div>
                                            <div class="col-auto">
                                                <i class="fas fa-money-bill-alt text-c-red f-18"></i>
                                            </div>
                                        </div>
                                        <p class="m-b-0 text-white"><span class="label label-danger m-r-10">+11%</span>From Previous Month</p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-3 col-md-6">
                                <div class="card prod-p-card bg-c-blue">
                                    <div class="card-body">
                                        <div class="row align-items-center m-b-25">
                                            <div class="col">
                                                <h6 class="m-b-5 text-white">Total Orders</h6>
                                                <h3 class="m-b-0 text-white">15,830</h3>
                                            </div>
                                            <div class="col-auto">
                                                <i class="fas fa-database text-c-blue f-18"></i>
                                            </div>
                                        </div>
                                        <p class="m-b-0 text-white"><span class="label label-primary m-r-10">+12%</span>From Previous Month</p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-3 col-md-6">
                                <div class="card prod-p-card bg-c-green">
                                    <div class="card-body">
                                        <div class="row align-items-center m-b-25">
                                            <div class="col">
                                                <h6 class="m-b-5 text-white">Average Price</h6>
                                                <h3 class="m-b-0 text-white">$6,780</h3>
                                            </div>
                                            <div class="col-auto">
                                                <i class="fas fa-dollar-sign text-c-green f-18"></i>
                                            </div>
                                        </div>
                                        <p class="m-b-0 text-white"><span class="label label-success m-r-10">+52%</span>From Previous Month</p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-3 col-md-6">
                                <div class="card prod-p-card bg-c-yellow">
                                    <div class="card-body">
                                        <div class="row align-items-center m-b-25">
                                            <div class="col">
                                                <h6 class="m-b-5 text-white">Product Sold</h6>
                                                <h3 class="m-b-0 text-white">6,784</h3>
                                            </div>
                                            <div class="col-auto">
                                                <i class="fas fa-tags text-c-yellow f-18"></i>
                                            </div>
                                        </div>
                                        <p class="m-b-0 text-white"><span class="label label-warning m-r-10">+52%</span>From Previous Month</p>
                                    </div>
                                </div>
                            </div>
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
                                    <div class="card-block">
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
                                                    while (rsFood.next()){
                                                        int i =1;

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
                                                                    <button style="width: 55px" class="btn btn-info">
                                                                        <i class="fas fa-edit"></i>
                                                                    </button>
                                                                </div>
                                                                <div class="col-6 col-sm-6">
                                                                    <button style="width: 55px" class="btn btn-danger">
                                                                        <i class="fas fa-times"></i>
                                                                    </button>
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
                                                    <div style="padding-top: 10px" class="container">
                                                        <input type="submit" class="btn btn-info form-control" value="Submit">
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
</body>
<%
    }else{
        response.sendRedirect("../");
%>
<%
    }
%>