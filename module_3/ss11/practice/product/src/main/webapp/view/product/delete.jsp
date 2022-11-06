<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 11/6/2022
  Time: 1:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/product">Quay lại List</a>
<form action="/product?action=delete&id=${product.getId()}" method="post">
    <button>Are you sure?</button>
</form>
<p>${mess}</p>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Origin</th>
        <th>Color</th>
        <th>Price</th>
    </tr>
    <tr>
        <td>${product.getId()}</td>
        <td>${product.getName()}</td>
        <td>${product.getOrigin()}</td>
        <td>${product.getColor()}</td>
        <td>${product.getPrice()}</td>
    </tr>
</table>

</body>
</html>
