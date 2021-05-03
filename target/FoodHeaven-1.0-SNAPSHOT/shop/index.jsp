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
    ResultSet foods=null;
    try{
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
        <div class="row">
            <%
                while(foods.next()){
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
                        <button class="btn btn-info" >
                            <i class="fa fa-plus-circle"></i>
                            Add To Cart
                        </button>
                    </div>
                </div>	<!-- End of /.products -->
            </div>
            <%
                }
            %>

        </div>
    </div>
</section>	<!-- End of Section -->



</body>
<jsp:include page="../layouts/footer.jsp"/>
