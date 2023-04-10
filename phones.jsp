<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Manager</title>
    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>
</head>
<body>
<div align="center">
    <h2>Phone Book Manager</h2>
    <form method="GET" action="search">
        <input type="text" name="search" placeholder="Search..."/>
        <input type="submit" value="Search" />
    </form>

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

    <c:url value="/add" var="add"/>
    <a href="${add}"><img src="/res/add_ico.png" width="50"
                          height="50" alt="Add Phone">
    </a>
</div>
</body>
</html>
