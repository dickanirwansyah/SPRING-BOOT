<%-- 
    Document   : index
    Created on : Feb 22, 2017, 7:24:23 AM
    Author     : dicka
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Data Kategori Barang</title>
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap-theme.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <div class="container-fluid">
                <div class="col-lg-9">
                    <div class="page-header">
                        <br/>
                        <br/>
                        <h3>Data Kategori Barang</h3>
                    </div>
                    <button class="btn btn-primary">
                        <span class="glyphicon glyphicon-plus"></span>
                        Tambah Data
                    </button>
                    <div class="page-header">
                        <table class="table table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>kd-kategori</th>
                                    <th>kategori</th>
                                    <th>opsi</th>
                                </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${list}" var="kategori">
                                <tr>
                                    <td>${kategori.idkategori}</td>
                                    <td>${kategori.nama}</td>
                                    <td>
                                        <a href="" class="btn btn-default">
                                            <span class="glyphicon glyphicon-pencil"></span>
                                        </a>
                                        <a href="" class="btn btn-default">
                                            <span class="glyphicon glyphicon-trash"></span>
                                        </a>
                                    </td>
                                </tr> 
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
