<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@
    page import="com.scorpionsstudio.FoodHeaven.*"
%>
<%@ page import="com.scorpionsstudio.FoodHeaven.ConnectionBlock" %>
<%@ page import="java.sql.ResultSet" %>
<jsp:include page="layouts/app.jsp"/>
<%
    ResultSet rsLoc= (ResultSet) session.getAttribute("user");
    ConnectionBlock cb=new ConnectionBlock();
    ResultSet restaurants=null;
    ResultSet chat=null;
    try{
        cb.ps = cb.con.prepareStatement("SELECT * FROM admin WHERE is_superadmin!=1 ORDER BY id DESC");
        cb.rs = cb.ps.executeQuery();
        restaurants= cb.rs;
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


%>
<head>
    <title>FoodHeaven</title>
</head>
<body onload="addNavActive()">

<!-- SLIDER Start
================================================== -->


<section id="slider-area">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div id="slider" class="nivoSlider">
                    <img src="<%=StaticVars.baseURL%>images/slider.jpg" alt="" />
                    <img src="<%=StaticVars.baseURL%>images/slider1.jpg" alt=""/>
                    <img src="<%=StaticVars.baseURL%>images/slider2.jpg" alt="" />
                </div>	<!-- End of /.nivoslider -->
            </div>	<!-- End of /.col-md-12 -->
        </div>	<!-- End of /.row -->
    </div>	<!-- End of /.container -->
</section> <!-- End of Section -->


<!-- FEATURES Start
================================================== -->

<jsp:include page="layouts/free_Shipping.jsp"/>


<!-- CATAGORIE Start
================================================== -->

<section id="catagorie">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="block">
                    <div class="block-heading">
                        <h2>OUR FOOD CATEGORIES</h2>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-md-4">
                            <div class="thumbnail">
                                <a class="catagotie-head" href="blog-single.html">
                                    <img src="<%=StaticVars.baseURL%>images/category-image-1.jpg" alt="...">
                                    <h3>Beef Steak</h3>
                                </a>
                                <div class="caption">
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Iste, aut, esse, laborum placeat id illo a expedita aperiam...</p>
                                    <p>
                                        <a href="blog-single.html" class="btn btn-default btn-transparent" role="button">
                                            <span>Check Items</span>
                                        </a>
                                    </p>
                                </div>	<!-- End of /.caption -->
                            </div>	<!-- End of /.thumbnail -->
                        </div>	<!-- End of /.col-sm-6 col-md-4 -->
                        <div class="col-sm-6 col-md-4">
                            <div class="thumbnail">
                                <a class="catagotie-head" href="blog-single.html">
                                    <img src="<%=StaticVars.baseURL%>images/category-image-2.jpg" alt="...">
                                    <h3>Miscellaneous</h3>
                                </a>
                                <div class="caption">
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Iste, aut, esse, laborum placeat id illo a expedita aperiam...</p>
                                    <p>
                                        <a href="blog-single.html" class="btn btn-default btn-transparent" role="button">
                                            <span>Check Items</span>
                                        </a>
                                    </p>
                                </div>	<!-- End of /.caption -->
                            </div>	<!-- End of /.thumbnail -->
                        </div>	<!-- End of /.col-sm-6 col-md-4 -->
                        <div class="col-sm-6 col-md-4">
                            <div class="thumbnail">
                                <a class="catagotie-head" href="blog-single.html">
                                    <img src="<%=StaticVars.baseURL%>images/category-image-3.jpg" alt="...">
                                    <h3>Elegant Apparel</h3>
                                </a>
                                <div class="caption">
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Iste, aut, esse, laborum placeat id illo a expedita aperiam...</p>
                                    <p>
                                        <a href="blog-single.html" class="btn btn-default btn-transparent" role="button">
                                            <span>Check Items</span>
                                        </a>
                                    </p>
                                </div>	<!-- End of /.caption -->
                            </div>	<!-- End of /.thumbnail -->
                        </div>	<!-- End of /.col-sm-6 col-md-4 -->
                    </div>	<!-- End of /.row -->
                </div>	<!-- End of /.block -->
            </div>	<!-- End of /.col-md-12 -->
        </div>	<!-- End of /.row -->
    </div>	<!-- End of /.container -->
</section>	<!-- End of Section -->




<!-- PRODUCTS Start
================================================== -->

<section id="products">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="products-heading">
                    <h2>Restaurants</h2>
                </div>
            </div>
        </div>
        <div class="row">
            <%
                int i =1;
                while (restaurants.next()){


            %>
            <div class="col-md-3">
                <div class="products">
                    <a href="shop/?id=<%=restaurants.getInt("id")%>">
                        <img style="height: 280px !important;" src="<%=StaticVars.baseURL%>uploads/<%=restaurants.getString("logo")%>" alt="">
                    </a>
                    <a href="single-product.html">
                        <h4><%=restaurants.getString("restaurant_name")%></h4>
                    </a>
                    <a class="view-link shutter" href="#">
                        Check Offers</a>
                </div>	<!-- End of /.products -->
            </div>	<!-- End of /.col-md-3 -->
            <%
                }
            %>

<%--            <div class="col-md-3">--%>
<%--                <div class="products">--%>
<%--                    <a href="single-product.html">--%>
<%--                        <img style="height: 280px !important;" src="<%=StaticVars.baseURL%>uploads/<%=restaurants.getString("logo")%>" alt="">--%>
<%--                    </a>--%>
<%--                    <a href="single-product.html">--%>
<%--                        <h4><%=restaurants.getString("restaurant_name")%></h4>--%>
<%--                    </a>--%>
<%--                    <p class="price">From: £69.99</p>--%>
<%--                    <a class="view-link shutter" href="#">--%>
<%--                        <i class="fa fa-plus-circle"></i>Add To Cart</a>--%>
<%--                </div>	<!-- End of /.products -->--%>
<%--            </div>	<!-- End of /.col-md-3 -->--%>

        </div>	<!-- End of /.row -->
    </div>	<!-- End of /.container -->
</section>	<!-- End of Section -->




<!-- CALL TO ACTION Start
================================================== -->

<section id="call-to-area">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="block">
                    <div class="block-heading">
                        <h2>Our Partners</h2>
                    </div>
                </div>	<!-- End of /.block -->
                <div id="owl-example" class="owl-carousel">

                    <div> <img src="<%=StaticVars.baseURL%>images/company-1.png" alt=""></div>
                    <div> <img src="<%=StaticVars.baseURL%>images/company-2.png" alt=""></div>
                    <div> <img src="<%=StaticVars.baseURL%>images/company-3.png" alt=""></div>
                    <div> <img src="<%=StaticVars.baseURL%>images/company-4.png" alt=""></div>
                    <div> <img src="<%=StaticVars.baseURL%>images/company-5.png" alt=""></div>
                    <div> <img src="<%=StaticVars.baseURL%>images/company-6.png" alt=""></div>
                    <div> <img src="<%=StaticVars.baseURL%>images/company-8.png" alt=""></div>
                    <div> <img src="<%=StaticVars.baseURL%>images/company-9.png" alt=""></div>
                </div>	<!-- End of /.Owl-Slider -->
            </div>	<!-- End of /.col-md-12 -->
        </div> <!-- End Of /.Row -->
    </div> <!-- End Of /.Container -->
</section>	<!-- End of Section -->



<!-- FOOTER Start
================================================== -->
<script>
    function addNavActive(){
        document.getElementById("homeNavButton").classList.add("active");
    }
</script>

</body>
<jsp:include page="layouts/footer.jsp"/>