<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Pub app</title>
</head>
<body>
<h1>
<spring:message code="startMessage" />
</h1>
    <ul>
        <li><a href="<c:url value="/pub" />">Pub list</a></li>
        <li><a href="<c:url value="/info" />">Pub info</a></li>
    </ul>
</body>
</html>