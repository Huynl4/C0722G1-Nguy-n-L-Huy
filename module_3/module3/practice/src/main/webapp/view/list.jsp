<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 11/15/2022
  Time: 11:47 PM
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

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
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
                    <a class="nav-link"
                       href="/furama?action=showCustomer"
                       style="font-weight: 700">Danh Sách Của Bệnh Viện</a>
                </li>
            </ul>
        </div>
    </nav>
</div>

<div align="center">
    <table class="table table-dark table-striped" id="tableBenhAn">
        <thead>
        <tr>
            <th>STT</th>
            <th>maBenhAn</th>
            <th>maBenhNhan</th>
            <th>tenBenhNhan</th>
            <th>ngaNhapVien</th>
            <th>ngayRavien</th>
            <th>liDoNhapVien</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="benhAn" items="${benhAnList}" varStatus="status">
            <tr>
                <td>
                    <c:forEach var="benhNhan" items="${benhNhan}">

                        <c:if test="${benhAn.maBenhNhan==benhNhan.getMaBenhNhan()}">
                            ${benhNhan.getMaBenhNhan()}
                        </c:if>

                    </c:forEach>

                </td>
                <td scope="row">${STT.count()}</td>
                <td>${benhAn.getMaBenhAn()}</td>
                <td>${benhAn.getMaBenhNhan()}</td>
                <td>${benhAn.getTenBenhNhan()}</td>
                <td>${benhAn.getNgayRaVien()}</td>
                <td>${benhAn.getNgayNhapVien()}</td>
                <td>${benhAn.getLyDoNhapVien()}</td>
                <td>
                    <a href="/practice?action=edit&id=${benhAn.getMaBenhAn()}" class="btn btn-primary">Edit</a>
                </td>
                <td>
                    <button onclick="infoDelete('${benhAn.getMaBenhAn()}','${benhAn.getMaBenhNhan()}')" type="button"
                            class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                        Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fs-5" id="exampleModalLabel">Modal title</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <span>Bạn có muốn xóa khách hàng?</span>
                <span style="color: brown" id="deleteName"></span>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                <form action="/furama" method="get">
                    <input type="text" hidden name="action" value="delete">
                    <input type="text" hidden id="deleteId" name="deleteById">
                    <button type="submit" class="btn btn-primary">Delete</button>

                </form>
            </div>
        </div>
    </div>
</div>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>
<%--phân trang--%>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
<script src="../../jquery/jquery-3.5.1.min.js"></script>
<script src="../../datatables/js/jquery.dataTables.min.js"></script>
<script src="../../datatables/js/dataTables.bootstrap5.min.js"></script>
<script style="align-content: center">
    $(document).ready(function () {
        $('#tableBenhAn').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>

</body>

</html>
