<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 11/6/2022
  Time: 12:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/product?action=add">Thêm mới</a>
<form action="/product?action=search" method="post">
    <input placeholder="Input Name Product" type="text" name="input">
    <button>Search</button></form>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Origin</th>
        <th>Color</th>
        <th>Price</th>
        <th></th>
        <th></th>
    </tr>
<c:forEach var="product" items="${products}">
<tr>
    <td>${product.getId()}</td>
    <td>${product.getName()}</td>
    <td>${product.getOrigin()}</td>
    <td>${product.getColor()}</td>
    <td>${product.getPrice()}</td>
    <td><a href="/product?action=edit&id=${product.getId()}">Edit</a></td>
    <td><a href="/product?action=delete&id=${product.getId()}">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>
