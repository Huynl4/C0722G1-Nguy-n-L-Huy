<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 11/6/2022
  Time: 2:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit Product</h1>
<a href="/product">Back list</a>

<c:if test="${message != null}">
    <span style="color: blue">${message}</span>
</c:if>

<form method="post">
    <pre>Name:           <input type="text" name="name" value="${product.getName()}"></pre>
    <pre>Origin:         <input type="text" name="origin" value="${product.getOrigin()}"></pre>
    <pre>Color:          <input type="text" name="color" value="${product.getColor()}"></pre>
    <pre>Cost:           <input type="text" name="cost" value="${product.getCost()}"></pre>
    <pre>             <button>Edit Product</button></pre>
</form>
</body>
</html>
