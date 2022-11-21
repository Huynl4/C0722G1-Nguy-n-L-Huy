<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 11/21/2022
  Time: 2:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/caculate" method="post">
    <h1>Caculator</h1>
    <input type="text" name="num1" placeholder="số 1">
    <input type="text" name="num2" placeholder="số 2">
    <input type="submit" name="choise" value="+">
    <input type="submit" name="choise" value="-">
    <input type="submit" name="choise" value="*">
    <input type="submit" name="choise" value="/">
</form>
<p>${result}</p>
</body>
</html>
