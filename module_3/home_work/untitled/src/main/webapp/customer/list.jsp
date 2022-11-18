<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 11/9/2022
  Time: 11:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Customer</title>
    <link rel="stylesheet" href="../../bootstrap-5.2.2-dist/css/bootstrap.css">
    <script src="../../bootstrap-5.2.2-dist/js/bootstrap.js"></script>
</head>
<body>
<div class=" container-fluid vh-100" style="width: 100%">
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
                           href="http://localhost:63342/module_3/case_study_web/Furama_web/furama.html?_ijt=r6rcptvnt05t7vc835a85oa319"
                           style="font-weight: 700">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link "
                           href="http://localhost:63342/module_3/case_study_web/facility/list_facility.html?_ijt=r6rcptvnt05t7vc835a85oa319"
                           style="font-weight: 700">Facility</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link"
                           href="http://localhost:63342/module_3/case_study_web/customer/list_customer.html?_ijt=rf3khn0r15dubn534s5nlod2p3"
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
<center>
    <h1>Customer</h1>
    <h2>
        <a href="/customer?action=add">Add New customer</a>
    </h2>
    <form >
        <input  placeholder="Input Name Customer" type="text" name="search">
        <button>Search</button></form>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <tr>
            <th>STT</th>
            <th>CustomerTypeId</th>
            <th>Name</th>
            <th>DateOfBirth</th>
            <th>Gender</th>
            <th>IdCard</th>
            <th>PhoneNumber</th>
            <th>Email</th>
            <th>Address</th>
        </tr>
        <c:forEach var="customer" items="${customerList}">
            <tr>
                <td><c:out value="${customer.id}"/></td>
                <td><c:out value="${customer.customerTypeId}"/></td>
                <td><c:out value="${customer.name}"/></td>
                <td><c:out value="${customer.dateOfBirth}"/></td>
                <td><c:out value="${customer.gender}"/></td>
                <td><c:out value="${customer.idCard}"/></td>
                <td><c:out value="${customer.phoneNumber}"/></td>
                <td><c:out value="${customer.email}"/></td>
                <td><c:out value="${customer.address}"/></td>
                <td>
                    <a href="/customer?action=edit&id=${customer.id}">Edit</a>
                    <a href="/customer?action=delete&id=${customer.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
    <div style="margin-top: 30px " ; class="footer">
        <nav class="navbar navbar-expand-lg bg-light">
            <div class="col-md-4" ; style="margin-left: 20px">
                <h1 style="color: #13653f ; margin-left: 40px">Hướng dẫn di chuyển</h1>
                <p style="margin-left: 40px">Khu nghỉ dưỡng Furama là cơ sở hàng đầu để khám phá một trong những điểm
                    đến hấp dẫn nhất Châu Á. Chỉ
                    cách Đà Nẵng một quãng lái xe ngắn là bốn Di sản Văn hóa Thế giới được UNESCO công nhận:</p>
                <!--                <button type="button" class="btn btn-lg btn-danger" data-bs-toggle="popover"-->
                <!--                        data-bs-title="Popover title"-->
                <!--                        data-bs-content="And here's some amazing content. It's very engaging. Right?"-->
                <!--                        style="margin-left: 50px">Xem trên bản đồ-->
                <!--                </button>-->
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
</div>
</body>
</html>
