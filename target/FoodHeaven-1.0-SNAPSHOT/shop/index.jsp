<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@
        page import="com.scorpionsstudio.FoodHeaven.*"
%>
<%@ page import="com.scorpionsstudio.FoodHeaven.ConnectionBlock" %>
<%@ page import="java.sql.ResultSet" %>
<jsp:include page="../layouts/app.jsp"/>
<%
    ResultSet rsLoc=null;
    ConnectionBlock cb=null;
    ResultSet foods=null;

    try{
        rsLoc= (ResultSet) session.getAttribute("user");
        cb=new ConnectionBlock();
        foods=null;

        cb.ps = cb.con.prepareStatement("SELECT * FROM foods WHERE admin_id=? ORDER BY id DESC");
        cb.ps.setString(1, request.getParameter("id"));
        cb.rs = cb.ps.executeQuery();
        foods= cb.rs;
    }
    catch (Exception e){
        System.out.println("meow");
    }


%>
<head>
    <title>FoodHeaven</title>
</head>
<body>


<section id="shop">
    <div class="container">
        <div align="center" class="row">
            <h3><u><%=request.getParameter("name")%></u></h3>
        </div>
        <div class="row">
            <%
                String isLoggedIn="";
                try{
                    isLoggedIn = (String)session.getAttribute("isLoggedIn");
                }
                catch (Exception e){
                    System.out.println("meow");

                }

                while(foods.next()){
                    if(isLoggedIn.equalsIgnoreCase("true")){
            %>
            <div class="col-3 col-sm-3">
                <div class="products">
                    <div style="height: 250px">
                        <a  href="#">
                            <img src="<%=StaticVars.baseURL%>uploads/<%=foods.getString("image")%>" alt="">
                        </a>

                    </div>
                    <a href="#">
                        <h4><%=foods.getString("name")%></h4>
                    </a>
                    <p class="price"><%=foods.getFloat("price")%></p>

                    <div align="center" >
                        <button class="btn btn-info"
                                onclick="add_to_cart('<%=rsLoc.getInt("id")%>', '<%=request.getParameter("id")%>', '<%=foods.getString("name")%>', '<%=foods.getFloat("price")%>', '<%=foods.getString("image")%>')"

                        >
                            <i class="fa fa-plus-circle"></i>
                            Add To Cart
                        </button>
                    </div>
                </div>	<!-- End of /.products -->
            </div>
            <%
                    }
                    else{

                    %>
            <div class="col-3 col-sm-3">
                <div class="products">
                    <div style="height: 250px">
                        <a  href="#">
                            <img src="<%=StaticVars.baseURL%>uploads/<%=foods.getString("image")%>" alt="">
                        </a>

                    </div>
                    <a href="#">
                        <h4><%=foods.getString("name")%></h4>
                    </a>
                    <p class="price"><%=foods.getFloat("price")%></p>

                    <div align="center" >
                        <button class="btn btn-info"
                                onclick="show_to_login()"

                        >
                            <i class="fa fa-plus-circle"></i>
                            Add To Cart
                        </button>
                    </div>
                </div>	<!-- End of /.products -->
            </div>

            <%
                    }
                }
            %>

        </div>
    </div>
</section>	<!-- End of Section -->

<script>
    function add_to_cart(user_id, admin_id, food_name, price, food_image){
        console.log(user_id);
        console.log(admin_id);
        console.log(food_name);
        console.log(price);
        var str="";


        var str = '<div style="padding-bottom: 10px" class="col-11 col-sm-11">'+
            '                                        <div class="col-2 col-sm-2">'+
            '                                            <img class="pull-left" src="<%=StaticVars.baseURL%>uploads/'+food_image+'" alt="">'+
            '                                        </div>'+
            '                                        <div class="col-5 col-sm-5">'+
            '                                            <div style="color: black" class="col-12 col-sm-12">'+
            '                                                '+food_name+' '+
            '                                            </div><br>'+
            '                                            <div style="color: black" class="col-12 col-sm-12">'+
            '                                                1'+
            '                                            </div>'+
            '                                        </div>'+
            '                                        <div style="color: black; padding-top: 25px" class="col-3 col-sm-3">'+
            '                                            '+price+' '+
            '                                        </div>'+
            '                                        <div style="color: black; padding-top: 25px" class="col-2 col-sm-2">'+
            '                                           '+price+'  '+
            '                                        </div>'+
            '                                    </div>';

        document.getElementById("cartBoxCustom").innerHTML+=str;
        var cardC= document.getElementById("cardCounter")
        cardC.innerText = parseInt(cardC.innerText)+1;
        $.ajax({
            type : 'post',
            url : '<%=request.getContextPath()%>/AddToTempCart',
            data:{
                'user_id': user_id,
                'admin_id': admin_id,
                'food_name': food_name,
                'price': price,
                'sub_total': price,
                'image': food_image

            },
            success:function(data){
                console.log(data);
                primData=data;

            }
        });


    }

    function show_to_login(){
        alert("Please Login First")
    }
</script>

</body>
<jsp:include page="../layouts/footer.jsp"/>
