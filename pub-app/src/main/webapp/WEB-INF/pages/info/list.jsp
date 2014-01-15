<%--
  Created by IntelliJ IDEA.
  User: matmoe
  Date: 15.01.14
  Time: 08:37
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <h1>App information lies here</h1>
    <table border="true" cellpadding="10" cellspacing="0">
        <thead>
        <th>Type</th>
        <th>Info</th>
        </thead>
        <tbody>
        <%--@elvariable id="infoList" type="java.util.List<no.pub.model.Info>" --%>
        <c:forEach items="${infoList}"  var="info" >
            <c:url value="/info/${info.id}" var="infoUrl"/>
            <tr>

                <td>${info.type}</td>
                <td>${info.info}</td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</body>
</html>
