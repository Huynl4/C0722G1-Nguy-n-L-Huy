<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 11/6/2022
  Time: 10:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
<h1>Search Product Follow Name</h1>
<a href="/product">Back list</a>

<form action="/product?action=search" method="post">
    <pre>Name search:   <input type="text" name="name"></pre>
    <pre>               <button>Search</button></pre>
</form>

<table class="table">
    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Name</th>
        <th scope="col">Origin</th>
        <th scope="col">Color</th>
        <th scope="col">Cost</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="product" items="${productList}">
        <tr>
            <c:forEach var="product" items="${productList}">
                <th scope="row">${product.getId()}</th>
                <td>${product.getName()}</td>
                <td>${product.getOrigin()}</td>
                <td>${product.getColor()}</td>
                <td>${product.getCost()}</td>
            </c:forEach>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>
</html>
