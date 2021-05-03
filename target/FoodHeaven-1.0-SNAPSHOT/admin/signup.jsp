<%@ page import="com.scorpionsstudio.FoodHeaven.*" %>

<%--
  Created by IntelliJ IDEA.
  User: mtuhi
  Date: 5/1/2021
  Time: 9:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin SignUp</title>
</head>
<jsp:include page="layouts/indexApp.jsp"/>
<body>
<div class="auth-wrapper">
    <div class="auth-content container">
        <div class="card">
            <div class="row align-items-center">
                <div class="col-md-6">
                    <div class="card-body">
                        <img src="<%=StaticVars.baseURL%>admin/images/logo-dark.png" alt="" class="img-fluid mb-4">
                        <h4 class="mb-3 f-w-400">Login to your account</h4>
                        <form action="${pageContext.request.contextPath}/AdminSignUpServlet" method="POST" enctype="multipart/form-data">
                            <div class="input-group mb-2">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-file-signature"></i></span>
                                </div>
                                <input type="text" class="form-control" name="restaurant_name" placeholder="Restaurant Name" required>
                            </div>
                            <div class="input-group mb-2">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-map-marked-alt"></i></span>
                                </div>
                                <select class="form-control" name="city" placeholder="Restaurant City" required>
                                    <option value="NotSelected" disabled selected>Select Your City</option>
                                    <option value="Dhaka">Dhaka</option>
                                    <option value="Chittagong">Chittagong</option>
                                    <option value="Rajshahi">Rajshahi</option>
                                    <option value="Khulna">Khulna</option>
                                    <option value="Sylhet">Sylhet</option>
                                    <option value="Narayanganj">Narayanganj</option>
                                </select>
                            </div>

                            <div class="input-group mb-2">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="feather icon-mail"></i></span>
                                </div>
                                <input type="email" class="form-control" name="email" placeholder="Email address" required>
                            </div>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="feather icon-lock"></i></span>
                                </div>
                                <input type="password" class="form-control" name="password" placeholder="Password" required>
                            </div>
                            <div class="input-group mb-2">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><label>Upload Your Logo</label></span>
                                </div>
                                <input type="file" class="form-control" name="file_logo" placeholder="Upload Logo">
                            </div>


                            <input type="submit" value="Sign Up" class="btn btn-primary mb-4">
                            <h3>${requestScope.message}</h3>
                        </form>
                        <%--                        <p class="mb-2 text-muted">Forgot password? <a href="auth-reset-password.html" class="f-w-400">Reset</a></p>--%>
                        <p class="mb-0 text-muted">Already have an account? <a href="index.jsp" class="f-w-400">Sign In</a></p>
                    </div>
                </div>
                <div class="col-md-6 d-none d-md-block">
                    <img src="<%=StaticVars.baseURL%>images/food.png" alt="" class="img-fluid">
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
