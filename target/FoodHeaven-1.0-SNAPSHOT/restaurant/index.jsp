<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@
        page import="com.scorpionsstudio.FoodHeaven.*"
%>
<%@ page import="com.scorpionsstudio.FoodHeaven.ConnectionBlock" %>
<%@ page import="java.sql.ResultSet" %>
<jsp:include page="../layouts/app.jsp"/>
<%
    ResultSet rsLoc= (ResultSet) session.getAttribute("user");
    ConnectionBlock cb=new ConnectionBlock();
    ResultSet restaurants=null;
    try{
        cb.ps = cb.con.prepareStatement("SELECT * FROM admin WHERE is_superadmin!=1 ORDER BY id DESC");
        cb.rs = cb.ps.executeQuery();
        restaurants= cb.rs;
    }
    catch (Exception e){
        System.out.println("meow");
    }


%>
<head>
    <title>FoodHeaven</title>
    <style>
        #noResLog{
            color: #1d87be;
        }
    </style>
</head>
<body onload="addNavActive()">

<!-- SLIDER Start
================================================== -->




<!-- FEATURES Start
================================================== -->




<!-- PRODUCTS Start
================================================== -->

<section id="products">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="products-heading">
                    <h2>Restaurants <small>(Allow Location access to auto sort your nearby restaurants)</small></h2>
                    <form>
                        <select id="citySelect" onchange="trigger_city()" class="form-control">
                            <option value="NotSelected" selected disabled>Select A City</option>
                            <option value="Dhaka">Dhaka</option>
                            <option value="Narayanganj">Narayanganj</option>
                            <option value="Narayanganj">Chittagong</option>
                            <option value="Narayanganj">Sylhet</option>
                            <option value="Narayanganj">Rajshahi</option>
                            <option value="Narayanganj">Khulna</option>


                        </select>
                    </form>
                </div>
            </div>
        </div>
        <br>
        <div id="restaurant_list" class="row">
            <%
                int i =1;
                while (restaurants.next()){


            %>
            <div class="col-md-3">
                <div class="products">
                    <a href="../shop/?id=<%=restaurants.getInt("id")%>&name=<%=restaurants.getString("restaurant_name")%>">
                        <img style="height: 280px !important;" src="<%=StaticVars.baseURL%>uploads/<%=restaurants.getString("logo")%>" alt="">
                    </a>
                    <a href="../shop/?id=<%=restaurants.getInt("id")%>&name=<%=restaurants.getString("restaurant_name")%>">
                        <h4><%=restaurants.getString("restaurant_name")%></h4>
                    </a>
                    <a class="view-link shutter" href="../shop/?id=<%=restaurants.getInt("id")%>&name=<%=restaurants.getString("restaurant_name")%>">
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

<jsp:include page="../layouts/free_Shipping.jsp"/>


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
        document.getElementById("restaurantNavButton").classList.add("active");
    }
</script>
<script>
    // Step 1: Get user coordinates
    function getCoordintes() {
        var options = {
            enableHighAccuracy: true,
            timeout: 5000,
            maximumAge: 0
        };

        function success(pos) {
            var crd = pos.coords;
            var lat = crd.latitude.toString();
            var lng = crd.longitude.toString();
            var coordinates = [lat, lng];
            console.log(`Latitude: ${lat}, Longitude: ${lng}`);
            getCity(coordinates);
            return;

        }

        function error(err) {
            console.warn(`ERROR(${err.code}): ${err.message}`);
        }

        navigator.geolocation.getCurrentPosition(success, error, options);
    }

    // Step 2: Get city name
    function getCity(coordinates) {
        var xhr = new XMLHttpRequest();
        var lat = coordinates[0];
        var lng = coordinates[1];

        // Paste your LocationIQ token below.
        xhr.open('GET', "https://us1.locationiq.com/v1/reverse.php?key=pk.c1769988a8486760e61cfdbd148bf12d&lat=" +
            lat + "&lon=" + lng + "&format=json", true);
        xhr.send();
        xhr.onreadystatechange = processRequest;
        xhr.addEventListener("readystatechange", processRequest, false);

        function processRequest(e) {
            if (xhr.readyState == 4 && xhr.status == 200) {
                var response = JSON.parse(xhr.responseText);
                var city = response.address.city;
                console.log(city);
                fetch_city_restaurant(city);
                return;
            }
        }
    }

    getCoordintes();

    function trigger_city(){
        var city=document.getElementById("citySelect").value;
        fetch_city_restaurant(city);
    }

    function fetch_city_restaurant(city){
        $.ajax({
            type : 'post',
            url : '<%=request.getContextPath()%>/FetchRestaurant',
            data:{
                'city':city

            },
            success:function(data){
                console.log(data);
                document.getElementById("restaurant_list").innerHTML=data;

            }
        });
    }
</script>
</body>
<jsp:include page="../layouts/footer.jsp"/>