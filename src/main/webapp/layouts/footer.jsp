<%--
  Created by IntelliJ IDEA.
  User: mtuhi
  Date: 4/19/2021
  Time: 12:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@
        page import="com.scorpionsstudio.FoodHeaven.*"
%>
<%@ page import="com.scorpionsstudio.FoodHeaven.ConnectionBlock" %>
<%@ page import="java.sql.ResultSet" %>
<%
    ResultSet rsLoc= (ResultSet) session.getAttribute("user");
    ConnectionBlock cb=new ConnectionBlock();
    ResultSet latestFood=null;
    try{
        cb.ps = cb.con.prepareStatement("SELECT * FROM foods ORDER BY id DESC LIMIT 6");
        cb.rs = cb.ps.executeQuery();
        latestFood= cb.rs;
    }
    catch (Exception e){
        System.out.println("meow");
    }


%>
<footer>
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <div class="block clearfix">
                    <a href="#">
                        <img src="<%=StaticVars.baseURL%>images/footer-logo.png" alt="">
                    </a>
                    <p>
                        FoodHeaven is an emerging food delivery service that promises to deliver the best quality food within lowest possible times.
                    </p>
                    <h4 class="connect-heading">CONNECT WITH US</h4>
                    <ul class="social-icon">
                        <li>
                            <a class="facebook-icon" href="#">
                                <i class="fab fa-facebook-f"></i>
                            </a>
                        </li>

                        <li>
                            <a class="twitter-icon" href="#">
                                <i class="fab fa-twitter"></i>
                            </a>
                        </li>

                        <li>
                            <a class="linkedin-icon" href="#">
                                <i class="fab fa-linkedin"></i>
                            </a>
                        </li>
                    </ul>	<!-- End Of /.social-icon -->
                </div>	<!-- End Of /.block -->
            </div> <!-- End Of /.Col-md-4 -->
            <div class="col-md-4">
                <div class="block">
                    <h4>GET IN TOUCH</h4>
                    <p ><i class="fa  fa-map-marker"></i> <span><a style="color: white" href="https://goo.gl/maps/kmoRyQDNo2UyMpnL7" target="_blank">Scorpions Studio,</a> </span>Narayanganj</p>
                    <p> <i class="fa  fa-phone"></i> <span>Phone:</span> +880 1678710456 </p>

                    <p class="mail"><i class="fa  fa-envelope"></i>Eamil: <span>mail@mxtuhin.ninja</span></p>
                </div>	<!-- End Of /.block -->
            </div> <!-- End Of Col-md-3 -->
            <div class="col-md-4">
                <div class="block">
                    <h4>Featured</h4>
                    <div class="media">
                        <%

                            while (latestFood.next()){


                        %>
                        <a class="pull-left" href="#">
                            <img class="media-object" src="<%=StaticVars.baseURL%>uploads/<%=latestFood.getString("image")%>" alt="...">
                        </a>
                       <%
                           }
                       %>
                    </div>	<!-- End Of /.media -->
                </div>	<!-- End Of /.block -->
            </div> <!-- End Of Col-md-3 -->
        </div> <!-- End Of /.row -->
    </div> <!-- End Of /.Container -->



    <!-- FOOTER-BOTTOM Start
    ================================================== -->

    <div class="footer-bottom">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <ul class="cash-out pull-left">
                        <li>
                            <a href="#">
                                <img style="height: 40px" src="<%=StaticVars.baseURL%>images/nagad.png" alt="">
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <img style="height: 40px" src="<%=StaticVars.baseURL%>images/bkash.png" alt="">
                            </a>
                        </li>

                    </ul>
                    <p class="copyright-text pull-right"><script type="text/javascript">
                        document.write(new Date().getFullYear());
                    </script> | Made with &#10084; for FoodHeaven by<a href="https://www.facebook.com/tuhin.mridha.5" class="font-weight-bold ml-1" target="_blank"> Tuhin Mridha</a></p>
                </div>	<!-- End Of /.col-md-12 -->
            </div>	<!-- End Of /.row -->
        </div>	<!-- End Of /.container -->
    </div>	<!-- End Of /.footer-bottom -->
</footer> <!-- End Of Footer -->

<a id="back-top" href="#"></a>