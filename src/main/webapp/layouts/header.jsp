<%--
  Created by IntelliJ IDEA.
  User: mtuhi
  Date: 4/19/2021
  Time: 12:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.scorpionsstudio.FoodHeaven.*" %>
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
                    <li>
                        <div class="cart dropdown">
                            <a data-toggle="dropdown" href="#"><i class="fa fa-shopping-cart"></i>Cart (<span id="cardCounter">0</span>)</a>
                            <div class="dropdown-menu dropup">
                                <span class="caret"></span>
                                <ul class="media-list">
                                    <li class="media">
                                        <img class="pull-left" src="<%=StaticVars.baseURL%>images/product-item.jpg" alt="">
                                        <div class="media-body">
                                            <h6>Italian Sauce
                                                <span>$250</span>
                                            </h6>
                                        </div>
                                    </li>
                                </ul>
                                <button class="btn btn-primary btn-sm">Checkout</button>
                            </div>
                        </div>
                    </li>
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
                <form action="LoginServlet" method="GET">
                    <div>
                        <input placeholder="E-mail address" type="text" name="email" value="" class="form-control"><br>
                    </div>
                    <div >
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
                <form action="LoginServlet" method="GET">
                    <div>
                        <input placeholder="E-mail address" type="text" name="email" value="" class="form-control"><br>
                    </div>
                    <div >
                        <input placeholder="Password" type="password"name="password" value="" class="form-control"><br>
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
                <a href="#">
                    <img src="<%=StaticVars.baseURL%>images/logo.png" alt="logo">
                </a>
            </div>	<!-- End of /.col-md-12 -->
        </div>	<!-- End of /.row -->
    </div>	<!-- End of /.container -->
</header> <!-- End of /Header -->

<jsp:include page="sidebar_links.jsp"/>