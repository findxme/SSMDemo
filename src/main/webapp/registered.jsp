
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setAttribute("ctx",request.getContextPath());
%>


<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>SSM框架后台管理员注册</title>
    <meta name="description" content="particles.js is a lightweight JavaScript library for creating particles.">
    <meta name="author" content="Vincent Garreau">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <link rel="stylesheet" media="screen" href="${ctx}/static/signUp/resources/admin/login/css/style.css">
<%--    resources/admin/login/css/style.css--%>
    <link rel="stylesheet" type="text/css" href="${ctx}/static/signUp/resources/admin/login/css/reset.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/static/bootstrap/fonts/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/login.css"/>
<body>


<div id="particles-js">
    <nav style="" class="navbar navbar-default navbar-fixed-top navbar-inverse" role="navigation">
        <div class="container-fluid">
           <p class="navbar-text text-center"
               style="color: #ffffff;font-size: 36px;font-weight: bold;">${config.web_title}熊熊系统注册${msg5}44
            </p>
        </div>
    </nav>
    <form action="${ctx}/user/SignUp" method="post">
        <div class="login" style="display: block;">
            <div class="login-top">
                注册${msg}
            </div>
            <div class="login-center clearfix">
                <div class="login-center-img"><img src="${ctx}/static/signUp/resources/admin/login/images/name.png"></div>
                <div class="login-center-input">
                    <input id="usercode" type="text" name="username" required class="username" value="" placeholder="请输入您的账号" onfocus="this.placeholder=&#39;&#39;" onblur="this.placeholder=&#39;请输入您的用户名&#39;">
                    <div class="login-center-input-text">账号</div>
                </div>
            </div>
            <div class="login-center clearfix">
                <div class="login-center-img"><img src="${ctx}/static/signUp/resources/admin/login/images/password.png"></div>
                <div class="login-center-input">
                    <input id="password" type="password" name="password" required class="password" value="" placeholder="请输入您的密码" onfocus="this.placeholder=&#39;&#39;" onblur="this.placeholder=&#39;请输入您的密码&#39;">
                    <div class="login-center-input-text">密码</div>
<%--                    <center><input type="submit" class="login-button" value="注册" /></center>--%>
<%--                        <center> <button class="login-button" id="look">登陆</button></center>--%>
                </div>
                <center></center>
                <input type="submit" class="login-button" value="注册" />
                <a  id="look">  <center> <button class="login-button" type="button" >登陆</button></center></a>
            </div>

        </div>
    </form>
    <div class="sk-rotating-plane"></div>
    <canvas class="particles-js-canvas-el" width="1147" height="952" style="width: 100%; height: 100%;"></canvas></div>

<!-- scripts -->
<script src="${ctx}/static/signUp/resources/admin/login/js/particles.min.js"></script>
<script src="${ctx}/static/signUp/resources/admin/login/js/app.js"></script>
<script src="${ctx}/static/signUp/resources/admin/login/js/jquery-1.8.0.min.js"></script>

<script>
    // function login(){
    //     //得到name输入框对象
    //     var name = document.getElementById("username");
    //     //判断输入框是否有内容
    //     if(name.value.length==null){
    //         confirm("用户名不能为空");
    //         return false;
    //     }
    //     var pass = document.getElementById("password");
    //     if(pass.value.length==null){
    //         confirm("密码不能为空");
    //         return false;
    //     }
    //     return true;
    // }
</script>



</body></html>