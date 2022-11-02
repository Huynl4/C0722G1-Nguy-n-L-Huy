<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 11/2/2022
  Time: 2:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <h2>Product Discount Calculator</h2>
  <form action="/convert" method="post">
    <label>Product Description: </label><br/>
    <input type="text" name="productdescription" placeholder="Product Description" value=""/><br/>
    <label>List Price: </label><br/>
    <input type="text" name="listprice" placeholder="List Price" value=""/><br/>
    <label>Discount Percen: </label><br/>
    <input type="text" name="discountpercen" placeholder="Discount Percen" value=""/><br/>
    <button type="submit">ccl</button>
  </form>
  </body>
</html>
