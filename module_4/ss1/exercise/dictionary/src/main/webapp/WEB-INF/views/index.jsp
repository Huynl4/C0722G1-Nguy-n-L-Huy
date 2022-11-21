<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 11/18/2022
  Time: 3:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<c:if test="${value != null}">
    ${map.get(value)}
</c:if>
<c:if test="${value.length() == 0 or !map.containsKey(value)}">
    ${notFound}
</c:if>
</body>
</html>
