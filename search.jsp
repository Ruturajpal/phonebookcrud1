<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Search</title>
    <link href="<c:url value="/res/style_add_edit.css"/>" rel="stylesheet" type="text/css"/>
</head>
<body>
<div align="center">
<h2>Search Menu</h2>
    <c:url value="/search" var="var"/>
        <table class="style">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Number</th>
                <th>Action</th>
            </tr>
            <c:forEach var="phone" items="${phonesList}">
                <tr>
                    <td>${phone.id}</td>
                    <td>${phone.name}</td>
                    <td>${phone.number}</td>
                    <td>
                        <a href="/edit/${phone.id}">edit</a>
                        <a href="/delete/${phone.id}">delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    <a href="/"><img src="/res/back_ico.png" width="50"
                          height="50" alt="Back">
    </a>
</body>
</html>
