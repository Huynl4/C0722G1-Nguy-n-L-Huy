<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 11/18/2022
  Time: 3:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<h1>Dictionary</h1>
<form action="" method="post">
    <input type="text" name="value">
    <input type="submit">
</form>
<p>${map.get(value)}</p>
</body>
</html>
