<%--
  Created by IntelliJ IDEA.
  User: mtuhi
  Date: 4/19/2021
  Time: 12:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.scorpionsstudio.FoodHeaven.*" %>
<%@ page import="java.sql.ResultSet" %>
<%
    ResultSet rsLoc=null;
    ConnectionBlock cb=null;
    ResultSet cart_food=null;

    try{
        rsLoc= (ResultSet) session.getAttribute("user");
        cb=new ConnectionBlock();


        cb.ps = cb.con.prepareStatement("SELECT * FROM temp_cart WHERE user_id=? ORDER BY id ASC");
        cb.ps.setString(1, ""+rsLoc.getInt("id"));
        cb.rs = cb.ps.executeQuery();
        cart_food= cb.rs;
    }
    catch (Exception e){
        System.out.println("meow");
    }


%>
<!-- TOP HEADER Start
================================================== -->

<section id="top" class="customBlock">
    <div class="container ">
        <div class="row">
            <div class="col-md-5 ">
                <p class="contact-action "><i class="fa fa-phone-square"></i>IN CASE OF ANY QUESTIONS, CALL THIS NUMBER: <strong>+880 1678710456</strong></p>
            </div>
            <div class="col-md-5 clearfix">
                <ul class="login-cart">

                    <%
                        String isLoggedIn = (String)session.getAttribute("isLoggedIn");
                        if(isLoggedIn!="true"){


                    %>
                    <li>
                        <a data-toggle="modal" data-target="#LoginModal" href="#">
                            <i class="fa fa-user"></i>
                            Login
                        </a>
                    </li>
                    <li>
                        <a data-toggle="modal" data-target="#SignUpModal" href="#">
                            <i class="fa fa-user"></i>
                            SignUp
                        </a>
                    </li>
                    <%
                        }else{
                    %>
                    <li>
                        <a href="<%=request.getContextPath()%>/LogoutServlet">
                            <i class="fas fa-sign-out-alt"></i>
                            Logout
                        </a>
                    </li>
                    <li>
                        <div style="z-index: 100000 !important;" class="cart dropdown">
                            <a data-toggle="dropdown" href="#"><i class="fa fa-shopping-cart"></i>Food Bag (<span id="cardCounter">0</span> Foods)</a>
                            <div style="width: 450px" class="dropdown-menu dropup">
                                <span class="caret"></span>
                                <div id="cartBoxCustom" class="row">
                                    <div style="padding-bottom: 10px" class="col-11 col-sm-11">
                                        <div class="col-2 col-sm-2">
                                            <img class="pull-left" src="<%=StaticVars.baseURL%>images/product-item.jpg" alt="">
                                        </div>
                                        <div class="col-5 col-sm-5">
                                            <div style="color: black" class="col-12 col-sm-12">
                                                Food name
                                            </div><br>
                                            <div style="color: black" class="col-12 col-sm-12">
                                                Quantity
                                            </div>
                                        </div>
                                        <div style="color: black; padding-top: 25px" class="col-3 col-sm-3">
                                            Price
                                        </div>
                                        <div style="color: black; padding-top: 25px" class="col-2 col-sm-2">
                                            Subtotal
                                        </div>
                                    </div>
                                    <%
                                        while(cart_food.next()){
                                    %>
                                    <div style="padding-bottom: 10px" class="col-11 col-sm-11">
                                        <div class="col-2 col-sm-2">
                                            <img class="pull-left" src="<%=StaticVars.baseURL%>uploads/<%=cart_food.getString("image")%>" alt="">
                                        </div>
                                        <div class="col-5 col-sm-5">
                                            <div style="color: black" class="col-12 col-sm-12">
                                                <%=cart_food.getString("food_name")%>
                                            </div><br>
                                            <div style="color: black" class="col-12 col-sm-12">
                                                <%=cart_food.getInt("quantity")%>
                                            </div>
                                        </div>
                                        <div style="color: black; padding-top: 25px" class="col-3 col-sm-3">
                                            <%=cart_food.getFloat("price")%>
                                        </div>
                                        <div style="color: black; padding-top: 25px" class="col-2 col-sm-2">
                                            <%=cart_food.getFloat("sub_total")%>
                                        </div>
                                    </div>
                                    <%
                                        }
                                    %>





                                </div>

                                <a href="#" style="color: white" class="btn btn-primary btn-sm">Checkout</a>
                            </div>
                        </div>
                    </li>
                    <%
                        }
                    %>


                </ul>
            </div>
            <div class="col-md-2">
                <div class="search-box">
                    <div class="input-group">
                        <input placeholder="Search Here" type="text" class="form-control">
                        <span class="input-group-btn">
					        	<button class="btn btn-default" type="button"></button>
					      	</span>
                    </div><!-- /.input-group -->
                </div><!-- /.search-box -->
            </div>
        </div> <!-- End Of /.row -->
    </div>	<!-- End Of /.Container -->


</section>  <!-- End of /Section -->

<!-- Modal -->
<div class="modal fade" id="LoginModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="LoginModallLongTitle">Login Here</h5>

            </div>
            <div class="modal-body"><br>
                <form action="<%=request.getContextPath()%>/LoginServlet" method="POST">
                    <div>
                        <label>Email</label>
                        <input placeholder="E-mail address" type="text" name="email" value="" class="form-control"><br>
                    </div>
                    <div >
                        <label>Password</label>
                        <input placeholder="Password" type="password"name="password" value="" class="form-control"><br>
                    </div>
                    <div align="center" class="container ">
                        <input type="submit" class="bt btn-info form-control" value="SignIn"><br>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>

            </div>
        </div>
    </div>
</div>

<!-- Modal -->
<div class="modal fade" id="SignUpModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="SignUpModalLongTitle">Sign Up Here</h5>

            </div>
            <div class="modal-body"><br>
                <form action="<%=request.getContextPath()%>/SignUpServlet" method="GET">
                    <div>
                        <label>Name</label>
                        <input placeholder="Enter Your Name" type="text" name="name" value="" class="form-control"><br>
                    </div>
                    <div>
                        <label>Cell Number</label>
                        <input placeholder="Enter Your Cell Number" type="text" name="cellnum" value="" class="form-control"><br>
                    </div>
                    <div>
                        <label>Email</label>
                        <input placeholder="Enter Your Email" type="text" name="email" value="" class="form-control"><br>
                    </div>
                    <div >
                        <label>Password</label>
                        <input placeholder="Enter Your password" type="password" name="password" value="" class="form-control"><br>
                    </div>
                    <div align="center" class="container ">
                        <input type="submit" class="bt btn-info form-control" value="SignUp"><br>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>

            </div>
        </div>
    </div>
</div>



<!-- LOGO Start
================================================== -->

<header>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <a href="<%=request.getContextPath() %>">
                    <img src="<%=StaticVars.baseURL%>images/logo.png" alt="logo">
                </a>
            </div>	<!-- End of /.col-md-12 -->
        </div>	<!-- End of /.row -->
    </div>	<!-- End of /.container -->
</header> <!-- End of /Header -->

<jsp:include page="sidebar_links.jsp"/>