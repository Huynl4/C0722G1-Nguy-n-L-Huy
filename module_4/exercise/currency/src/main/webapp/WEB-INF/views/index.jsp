<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 11/18/2022
  Time: 1:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency</title>
</head>
<body>
<h1>Currency Convert</h1>
<form action="/currency/change" method="post">
        <input type="text" name="usd">

<%--    <select name="" id="from">--%>
<%--        <option value="vnd">USD</option>--%>
<%--        <option value="usd">VNĐ</option>--%>
<%--    </select>--%>
<%--    <select name="" id="to">--%>
<%--        <option value="vnd">VNĐ</option>--%>
<%--        <option value="usd">USD</option>--%>
<%--    </select>--%>
<input type="submit" value="kết quả">
</form>
<p id="ket qua">${number} vnd</p>
<%--<p id="ket qua la">${number1} usd</p>--%>



</body>
</html>
