<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 11/7/2022
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Search User</title>
    <a href="\users">Quay lại list</a>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
    </tr>
<tr>
    <td>${users.getId()}</td>
    <td>${users.getName()}</td>
    <td>${users.getEmail()}</td>
    <td>${users.getCountry()}</td>
</tr>
</table>
</head>
<body>

</body>
</html>
