<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit</title>
    <link href="<c:url value="/res/style_add_edit.css"/>" rel="stylesheet" type="text/css"/>
</head>
<body>
<div align="center">
<c:url value="/add" var="var"/>
<form action="${var}" method="POST">
    <p><h2>Add Menu</h2></p>
    <p><input type="text" name="name" placeholder="name" value="${phone.name}" maxlength="100" required>
    <p><input type="number" name="number" placeholder="number" value="${phone.number}" required>

    <p><input type="submit" value="Add"></p>
    <a href="/"><img src="/res/back_ico.png" width="50"
                     height="50" alt="Back">
    </a>
</form>
</div>
</body>
</html>