<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 11/6/2022
  Time: 2:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
//<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/product">Quay về List</a>
<p>${mess}</p>
<form action="/product?action=edit&id=${product.getId()}"method="post">
    <pre>Name:     <input type="text" name="name" value="${product.getName()}"></pre>
    <pre>Origin:   <input type="text" name="origin" value="${product.getOrigin()}"></pre>
    <pre>Color:    <input type="text" name="color" value="${product.getColor()}"></pre>
    <pre>Price:    <input type="text" name="price" value="${product.getPrice()}"></pre>
    <button>Save</button>
</form>
</body>
</html>
