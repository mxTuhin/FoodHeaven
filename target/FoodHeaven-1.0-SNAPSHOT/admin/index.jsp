<%@ page import="com.scorpionsstudio.FoodHeaven.StaticVars" %><%--
  Created by IntelliJ IDEA.
  User: mtuhi
  Date: 5/1/2021
  Time: 9:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
                        <div class="input-group mb-2">
                            <div class="input-group-prepend">
                                <span class="input-group-text"><i class="feather icon-mail"></i></span>
                            </div>
                            <input type="email" class="form-control" placeholder="Email address">
                        </div>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text"><i class="feather icon-lock"></i></span>
                            </div>
                            <input type="password" class="form-control" placeholder="Password">
                        </div>


                        <button class="btn btn-primary mb-4">Login</button>
                        <h3>${requestScope.message}</h3>
                        <%--                        <p class="mb-2 text-muted">Forgot password? <a href="auth-reset-password.html" class="f-w-400">Reset</a></p>--%>
                        <p class="mb-0 text-muted">Don’t have an account? <a href="signup.jsp" class="f-w-400">Signup</a></p>
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
