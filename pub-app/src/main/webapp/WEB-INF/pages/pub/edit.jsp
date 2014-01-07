<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
Pub:
<form:form modelAttribute="pub" method="post">
    Name: <form:input path="name"/> <br>
    Type: <form:input path="type"/> <br>
    Rating: <form:input path="rating"/> <br>
    Lat: <form:input path="lat"/> <br>
    Lon: <form:input path="lon"/> <br>
    <form:button>Lagre</form:button>
</form:form>
</body>
</html>