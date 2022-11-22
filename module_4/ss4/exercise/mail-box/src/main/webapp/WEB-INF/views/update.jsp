<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 11/22/2022
  Time: 2:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Settings</h1>
<form:form action="update" method="post" modelAttribute="setting">
    <form:label path="languages">Language:</form:label>
    <form:select path="languages" items="${languageList}">
    </form:select>
    <br>
    <form:label path="pageSize">Page Size: show </form:label>
    <form:select path="pageSize" items="${pageSizeList}"/> emails per page
    <br>
    <form:label path="spamsFillter"/> SpamsFillter:
    <form:checkbox path="spamsFillter"/>

    <br>
    <form:label path="signature">Signature:</form:label>
    <br>
    <form:textarea path="signature"/>
    <br>
    <input type="submit" value="Update">
    <input type="reset" value="Cancel">
</form:form>
</body>
</html>
