<%@ page import="com.scorpionsstudio.FoodHeaven.*" %><%--
  Created by IntelliJ IDEA.
  User: mtuhi
  Date: 5/1/2021
  Time: 8:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.scorpionsstudio.FoodHeaven.LogoutServlet" %>
<header class="navbar pcoded-header navbar-expand-lg navbar-light headerpos-fixed">
    <div class="m-header">
        <a class="mobile-menu" id="mobile-collapse1" href="#!"><span></span></a>
        <a href="index.html" class="b-brand">
            <img src="<%= StaticVars.baseURL%>admin/images/logo.svg" alt="" class="logo images">
            <img src="<%= StaticVars.baseURL%>admin/images/logo-icon.svg" alt="" class="logo-thumb images">
        </a>
    </div>
    <a class="mobile-menu" id="mobile-header" href="#!">
        <i class="feather icon-more-horizontal"></i>
    </a>
    <div class="collapse navbar-collapse">
        <a href="#!" class="mob-toggler"></a>
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <div class="main-search open">
                    <div class="input-group">
                        <input type="text" id="m-search" class="form-control" placeholder="Search . . .">
                        <a href="#!" class="input-group-append search-close">

                        </a>
                        <span class="input-group-append search-btn btn btn-primary">
								<i class="feather icon-search input-group-text"></i>
							</span>
                    </div>
                </div>
            </li>
        </ul>
        <ul class="navbar-nav ml-auto">

            <li>
                <div class="dropdown drp-user">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fas fa-cogs"></i><i class=" icon-settings"></i>
                    </a>
                    <div class="dropdown-menu dropdown-menu-right profile-notification">
                        <div class="pro-head">
                            <img src="<%= StaticVars.baseURL%>admin/images/user/avatar-1.jpg" class="img-radius" alt="User-Profile-Image">
                            <span>John Doe</span>
                            <a href="LogoutServlet" class="dud-logout" title="Logout">
                                <i class="feather icon-log-out"></i>
                            </a>
                        </div>
                        <ul class="pro-body">
                            <li><a href="#!" class="dropdown-item"><i class="feather icon-settings"></i> Settings</a></li>
                            <li><a href="#!" class="dropdown-item"><i class="feather icon-user"></i> Profile</a></li>
                            <li><a href="message.html" class="dropdown-item"><i class="feather icon-mail"></i> My Messages</a></li>
                            <li><a href="/<%= StaticVars.serverExtension %>LogoutServlet" class="dropdown-item"><i class="feather icon-lock"></i>Log Out</a></li>
                        </ul>
                    </div>
                </div>
            </li>
        </ul>
    </div>
</header>
