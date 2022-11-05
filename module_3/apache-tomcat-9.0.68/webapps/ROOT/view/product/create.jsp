<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 11/4/2022
  Time: 10:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Trang thêm mới</h1>
<a href="/product">Quay lại list</a>
<c:if test="${mess!=null}">
    <span style="color: aqua">${mess}</span>
</c:if>
<form action="/product?action=add" method="post">
    <pre>ID:       <input type="text" name="id"/> </pre>
    <pre>Name:       <input type="text" name="name"/> </pre>
    <pre>Origin:       <input type="text" name="origin"/> </pre>
    <pre>Color:       <select name="color"> <option value="">Chọn màu sắc</option>
                                             <option value="yellow">yellow</option>
                                             <option value="red">red</option>
                                             <option value="green">green</option>
                      </select>
    </pre>
    <pre>Cost:       <input type="text" name="cost"/> </pre>
    <pre><button>Save</button></pre>
</form>
</body>
</html>
