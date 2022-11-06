<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 11/6/2022
  Time: 12:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/product">Quay về list</a>
<form action="/product?action=add" method="post">
    <pre>Id:       <input type="text" name="id"></pre>
    <pre>Name:     <input type="text" name="name"></pre>
    <pre>Origin:   <input type="text" name="origin"></pre>
    <pre>Color:    <input type="text" name="color"></pre>
    <pre>Price:    <input type="text" name="price"></pre>
    <button>Save</button>
</form>
<p>${mess}</p>
</body>
</html>
