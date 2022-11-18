<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 11/9/2022
  Time: 12:50 PM
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
<a href="/customer">Quay lại list</a>

<form action="/customer?action=add" method="post">
    <pre>CustomerTypeId:       <input type="text" name="customerId" id="customerId"/> </pre>
    <pre>Name:                 <input type="text" name="name" id="name"/> </pre>
    <pre>DateOfBirth:          <input type="date" name="dateOfBirth" id="dateOfBirth"/> </pre>
<%--    <pre>Gender:               <input type="radio" name="gender" value="true"/> Nam <input type="radio" name="gender"--%>
<%--                                                                                           value="false"/> Nữ </pre>--%>
    <pre>Gender:    <input type="text" name="gender" id="gender">       </pre>
    <pre>IdCard:               <input type="text" name="idCard" id="idCard"/> </pre>
    <pre>PhoneNumber:          <input type="text" name="phoneNumber" id="phoneNumber"/> </pre>
    <pre>Email:                <input type="text" name="email" id="email"/> </pre>
    <pre>Address:              <input type="text" name="address" id="address"/> </pre>
    <pre><button>Save</button></pre>
    <p>${mess}</p>

</form>
</body>
</html>
