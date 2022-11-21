<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 11/21/2022
  Time: 2:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="spice" items="${spices}">
    <p>${spice}</p>
</c:forEach>

</body>
</html>
