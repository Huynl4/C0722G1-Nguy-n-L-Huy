<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 11/2/2022
  Time: 1:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Huynl$</title>
  </head>
  <style type="text/css">
    .login {
      background-color: rosybrown;
      height:200px; width:230px;
      margin:0;
      padding:10px;
      border:1px #CCC solid;
    }
    .login input {
      padding:10px; margin:5px
    }
  </style>
  <body>
  <form method="post" action="${pageContext.request.contextPath}/login">
    <div class="login">
      <h2>Login</h2>
      <input type="text" name="username" size="30"  placeholder="username" />
      <input type="password" name="password" size="30" placeholder="password" />
      <input type="submit" value="Sign in"/>
    </div>
  </form>
  </body>
</html>
