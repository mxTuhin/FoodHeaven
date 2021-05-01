<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@
    page import="com.scorpionsstudio.FoodHeaven.*"
%>
<jsp:include page="layouts/app.jsp"/>
<head>
    <title>FoodHeaven</title>
</head>
<body>

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

<section id="features">
    <div class="container">
        <div class="row">
            <div  class="col-md-4">
                <div  class="block customBlock">
                    <div class="media">
                        <div class="pull-left" href="#">
                            <i class="fa fa-ambulance"></i>
                        </div>
                        <div class="media-body">
                            <h4 class="media-heading">Free Shipping</h4>
                            <p>You will get Free Shipping for orders over 599.</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="block customBlock">
                    <div class="media">
                        <div class="pull-left" href="#">
                            <i class=" fab fa-foursquare"></i>
                        </div>
                        <div class="media-body">
                            <h4 class="media-heading">Facebook Post Discount</h4>
                            <p>You will get a 5% discount for uploading a picture on Facebook by tagging us.</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="block customBlock">
                    <div class="media">
                        <div class="pull-left" href="#">
                            <i class=" fa fa-phone"></i>
                        </div>
                        <div class="media-body">
                            <h4 class="media-heading">Call Us</h4>
                            <p>Any Problem? Never hesitate to call us.</p>
                        </div>	<!-- End of /.media-body -->
                    </div>	<!-- End of /.media -->
                </div>	<!-- End of /.block -->
            </div> <!-- End of /.col-md-4 -->
        </div>	<!-- End of /.row -->
    </div>	<!-- End of /.container -->
</section>	<!-- End of section -->



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
                    <h2>Add Foods To Cart</h2>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-3">
                <div class="products">
                    <a href="single-product.html">
                        <img src="<%=StaticVars.baseURL%>images/product-image.jpg" alt="">
                    </a>
                    <a href="single-product.html">
                        <h4>Amazing Italian Sauces</h4>
                    </a>
                    <p class="price">From: £69.99</p>
                    <a class="view-link shutter" href="#">
                        <i class="fa fa-plus-circle"></i>Add To Cart</a>
                </div>	<!-- End of /.products -->
            </div>	<!-- End of /.col-md-3 -->
            <div class="col-md-3">
                <div class="products">
                    <a href="single-product.html">
                        <img src="<%=StaticVars.baseURL%>images/product-image-2.jpg" alt="">
                    </a>
                    <a href="single-product.html">
                        <h4>Amazing Italian Sauces</h4>
                    </a>
                    <p class="price">From: £69.99</p>
                    <a class="view-link shutter" href="#">
                        <i class="fa fa-plus-circle"></i>Add To Cart</a>
                </div>	<!-- End of /.products -->
            </div> <!-- End Of Col-md-3 -->
            <div class="col-md-3">
                <div class="products">
                    <a href="single-product.html">
                        <img src="<%=StaticVars.baseURL%>images/product-image-3.jpg" alt="">
                    </a>
                    <a href="single-product.html">
                        <h4>Amazing Italian Sauces</h4>
                    </a>
                    <p class="price">From: £69.99</p>
                    <a class="view-link shutter" href="#">
                        <i class="fa fa-plus-circle"></i>Add To Cart</a>
                </div>	<!-- End of /.products -->
            </div> <!-- End Of /.Col-md-3 -->
            <div class="col-md-3">
                <div class="products">
                    <a href="single-product.html">
                        <img src="<%=StaticVars.baseURL%>images/product-image-4.jpg" alt="">
                    </a>
                    <a href="single-product.html">
                        <h4>Amazing Italian Sauces</h4>
                    </a>
                    <p class="price">From: £69.99</p>
                    <a class="view-link shutter" href="#">
                        <i class="fa fa-plus-circle"></i>Add To Cart</a>
                </div>	<!-- End of /.products -->
            </div> <!-- End Of /.Col-md-3 -->
            <div class="col-md-3">
                <div class="products">
                    <a href="single-product.html">
                        <img src="<%=StaticVars.baseURL%>images/product-image-5.jpg" alt="">
                    </a>
                    <a href="single-product.html">
                        <h4>Amazing Italian Sauces</h4>
                    </a>
                    <p class="price">From: £69.99</p>
                    <a class="view-link shutter" href="#">
                        <i class="fa fa-plus-circle"></i>Add To Cart</a>
                </div>	<!-- End of /.products -->
            </div> <!-- End Of /.Col-md-3 -->
            <div class="col-md-3">
                <div class="products">
                    <a href="single-product.html">
                        <img src="<%=StaticVars.baseURL%>images/product-image-6.jpg" alt="">
                    </a>
                    <a href="single-product.html">
                        <h4>Amazing Italian Sauces</h4>
                    </a>
                    <p class="price">From: £69.99</p>
                    <a class="view-link shutter" href="#">
                        <i class="fa fa-plus-circle"></i>Add To Cart</a>
                </div>	<!-- End of /.products -->
            </div> <!-- End Of /.Col-md-3 -->
            <div class="col-md-3">
                <div class="products">
                    <a href="single-product.html">
                        <img src="<%=StaticVars.baseURL%>images/product-image-7.jpg" alt="">
                    </a>
                    <a href="single-product.html">
                        <h4>Amazing Italian Sauces</h4>
                    </a>
                    <p class="price">From: £69.99</p>
                    <a class="view-link shutter" href="#">
                        <i class="fa fa-plus-circle"></i>Add To Cart</a>
                </div>	<!-- End of /.products -->
            </div> <!-- End Of /.Col-md-3 -->
            <div class="col-md-3">
                <div class="products">
                    <a href="single-product.html">
                        <img src="<%=StaticVars.baseURL%>images/product-image-8.jpg" alt="">
                    </a>
                    <a href="single-product.html">
                        <h4>Amazing Italian Sauces</h4>
                    </a>
                    <p class="price">From: £69.99</p>
                    <div >
                        <a class="view-link shutter" href="#">
                            <i class="fa fa-plus-circle"></i>Add To Cart</a>
                    </div>
                </div>	<!-- End of /.products -->
            </div> <!-- End Of /.Col-md-3 -->
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

</body>
<jsp:include page="layouts/footer.jsp"/>