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
    <div><form:errors path=""/></div>

    <div>Name: <form:input path="name"/> <form:errors path="name"/></div>
    <div>Type: <form:input path="type"/> <form:errors path="type"/></div>
    <div>Rating: <form:input path="rating"/> <form:errors path="rating"/></div>
    <div>Lat: <form:input path="lat"/> <form:errors path="lat"/></div>
    <div>Lon: <form:input path="lon"/> <form:errors path="lon"/></div>
    <div>Postal code: <form:input path="postalCode"/> <form:errors path="postalCode"/> ${postalCodeArea}</div>
    <form:button>Lagre</form:button>
</form:form>
</body>
</html>