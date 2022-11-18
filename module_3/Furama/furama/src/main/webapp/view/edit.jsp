<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 11/10/2022
  Time: 12:19 AM
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
<div>
    <nav class="navbar navbar-expand-lg bg-light" style="padding: 0">
        <div class="container-fluid " style="background-color: #e6dbb9;">
            <div class="col-md-3">
                <img src="https://cdn.nhanlucnganhluat.vn/uploads/images/051D288B/logo/2018-12/Logo-FURAMA-RESORT.jpg"
                     style="width: 200px;height: 200px">
                <a class="navbar-brand" href="#"></a>
            </div>
            <div class="col-md-3">
                <img src="https://1000logos.net/wp-content/uploads/2019/08/Tripadvisor-Logo.png"
                     style="width: 200px; height:200px">
                2.746 reviewers
            </div>
            <div class="col-md-3">
                <a>
                    <p>
                        <img src="https://banner2.cleanpng.com/20180407/hhq/kisspng-computer-icons-social-media-villa-business-social-location-logo-5ac8fa5f4399e9.6298794015231207352769.jpg"
                             height="30px" width="50px">
                        103 – 105 Đường Võ Nguyên Giáp, Phường Khuê Mỹ, Quận Ngũ hành Sơn, Tp. Đà Nẵng, Việt Nam
                        7.0 km từ Sân bay Quốc tế Đà Nẵng</p>
                </a>
            </div>
            <div class="col-md-3">
                <p>
                    <img src="https://media.istockphoto.com/vectors/telephone-icon-logo-vector-id1279896450"
                         height="30px" width="30px">
                    84-236-3847 333/888
                </p>
                <p>
                    <img src="https://png.pngtree.com/png-clipart/20190920/original/pngtree-cartoon-mailbox-icon-free-illustration-png-image_4688785.jpg"
                         height="30px" width="30px">
                    reservation@furamavietnam.com
                </p>
            </div>
        </div>
    </nav>
    <nav class="navbar navbar-expand-lg bg-light">
        <div class="collapse navbar-collapse container-fluid" id="navbarNav" style="background-color: #e6dbb9; ">
            <ul class="d-flex" style="width: 80%;justify-content: space-around; list-style: none; margin-top: 10px">
                <li class="nav-item">
                    <a class="nav-link "
                       href="/"
                       style="font-weight: 700">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link "
                       href="//"
                       style="font-weight: 700">Facility</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link"
                       href="/furama?action=showCustomer"
                       style="font-weight: 700">Customer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link"
                       href="http://localhost:63342/module_3/case_study_web/facility/list_employee.html?_ijt=6n4s9saobfuor3332m2cnflqbi"
                       style="font-weight: 700">Employee</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link "
                       href="http://localhost:63342/module_3/case_study_web/contract/list_contract.html?_ijt=9qblh38jrlukogvrvfu09dad7t"
                       style="font-weight: 700">Contract</a>
                </li>
            </ul>
        </div>
    </nav>
</div>
<%--<a href="/furama?action=showCustomer">Quay lại trang list</a>--%>
<%--phần giữa--%>
<div style="margin-left: 40%">

    <form action="/furama?action=edit" method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Edit New Customer</h2>
            </caption>
            <tr>
                <th>ID</th>
                <td>
                    <input type="number" name="id" value="${customer.getId()}" size="45"/>
                </td>
            </tr>

            <tr>
                <th>Name</th>
                <td>
                    <input type="text" name="Name" value="${customer.getName()}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Birthday</th>
                <td>
                    <input type="date" name="Birthday" value="${customer.getDateOfBirth()}" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Gender</th>
                <td>
                    <input type="radio" name="Gender" ${customer.getGender()==true ? "checked":""}>
                    <label>Nam</label>
                    <input type="radio" name="Gender" ${customer.getGender()==false ? "checked":""}>
                    <label>Nữ</label>
                </td>
            </tr>
            <tr>
                <th>IdCard</th>
                <td>
                    <input type="text" name="IdCard" value="${customer.getId()}" size="15"/>
                </td>
            </tr>
            <tr>
                <th>PhoneNumber</th>
                <td>
                    <input type="text" name="PhoneNumber" value="${customer.getPhoneNumber()}" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Email</th>
                <td>
                    <input type="text" name="Email" value="${customer.getEmail()}" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Address</th>
                <td>
                    <input type="text" name="Address" value="${customer.getAddress()}" size="15"/>
                </td>
            </tr>
            <tr>
                <th>CustomerType</th>
                <td>
                    <input type="text" name="CustomerType" value="${customer.getCustomerTypeId()}" size="45"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
    <h2>
        <button onclick="location.href='/furama?action=showCustomer'">List All Customer</button>
    </h2>
</div>
<%--phần cuối--%>
<div style="margin-top: 30px " ; class="footer">
    <nav class="navbar navbar-expand-lg bg-light">
        <div class="col-md-4" ; style="margin-left: 20px">
            <h1 style="color: #13653f ; margin-left: 40px">Hướng dẫn di chuyển</h1>
            <p style="margin-left: 40px">Khu nghỉ dưỡng Furama là cơ sở hàng đầu để khám phá một trong những điểm
                đến hấp dẫn nhất Châu Á. Chỉ
                cách Đà Nẵng một quãng lái xe ngắn là bốn Di sản Văn hóa Thế giới được UNESCO công nhận:</p>
            <form action="https://www.google.com/maps/place/Furama+Resort+Danang/@16.0399456,108.2488794,17z/data=!3m1!4b1!4m8!3m7!1s0x31420fdbc8cc38ef:0x9a6a3e31121225d2!5m2!4m1!1i2!8m2!3d16.0399456!4d108.2510681?hl=vi">
                <button class="csw-btn-button" type="submit"
                        style="background-color:#20c997; margin-left: 50px;border-radius: 200px">Xem trên bản đồ
                </button>
            </form>
            <div class="d-flex flex-column mb-3" style="margin-left: 50px">
                <h4 style="font-weight: 700; color: #13653f;margin-top: 30px">Địa điểm</h4>
                <div class="p-2">1. Cố đô Huế - 2 tiếng</div>
                <hr>
                <div class="p-2">2. Phố cổ Hội An - 30 phút</div>
                <hr>
                <div class="p-2">3. Thánh địa Mỹ sơn - 90 phút</div>
                <hr>
                <div class="p-2">4. Động Phong Nha - 3 tiếng</div>
                <hr>
            </div>
        </div>
        <div class="col-md-3">
            <ul style="margin-left: 70px; margin-bottom: 450px">
                <li>Giá công bố</li>
                <li>Lifestyle Blog</li>
                <li>Tuyển dụng</li>
                <li>Liên hệ</li>
            </ul>
        </div>
        <div class="col-md-4" style="margin-bottom: 50px">
            <img src="https://png.pngtree.com/png-vector/20191118/ourlarge/pngtree-location-icon-creative-design-template-png-image_1998518.jpg"
                 width="30" height="30">
            103 - 105 Vo Nguyen Giap Street, Khue My Ward, Ngu Hanh Son District, Danang City, Vietnam
            Tel.: 84-236-3847 333/888 * Fax: 84-236-3847 666
            Email: reservation@furamavietnam.com * www.furamavietnam.com GDS Codes: Amadeus-GD DADFUR,
            Galileo/Apollo-GD 16236, Sabre-GD 032771, Worldspan- GD DADFU
            <hr>
            <div>
                <img src="https://sugarbeeapple.com/wp-content/uploads/2021/08/facebook-icon-1.png" ;
                     style="width: 30px;height: 30px">
                <img src="https://cdn-icons-png.flaticon.com/512/152/152810.png" ;
                     style="width: 40px; height: 40px">
                <img src="https://cdn.icon-icons.com/icons2/2973/PNG/512/instagram_logo_icon_186929.png" ;
                     style="width: 30px;height: 30px">
            </div>
            <img src="https://www.furama.com/images/LOGOFurama_4C_Normal.png"
                 style="width: 500px;height: 70px; margin-top: 100px">
            <p style="margin-bottom: 100px; margin-left: 120px">@1998 Furama Resort Đà Nẵng</p>
        </div>
    </nav>
</div>

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>
<script>
    <c:if test="${mess != null}">
    alert("${mess}");
    </c:if>
</script>
</body>
</html>
