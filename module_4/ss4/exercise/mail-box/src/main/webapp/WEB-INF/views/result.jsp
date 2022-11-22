<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 11/22/2022
  Time: 2:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>Languages:</td>
        <td>${setting.getLanguages()}</td>
    </tr>
    <tr>
        <td>Pages Size:</td>
        <td>${setting.getPageSize()}</td>
    </tr>
    <tr>
        <td>spam filters:</td>
        <td>${setting.getSpamsFillter()}</td>
    </tr>
    <tr>
        <td>Signature:</td>
        <td>${setting.getSignature()}</td>
    </tr>
</table>
</body>
</html>
