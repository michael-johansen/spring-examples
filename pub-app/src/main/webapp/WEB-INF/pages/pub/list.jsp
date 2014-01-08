<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<table>
    <thead>
    <th>Name</th>
    <th>Type</th>
    <th>Rating</th>
    <th>Latitude</th>
    <th>Longitude</th>
    <th>Postal code</th>
    <th>Options</th>
    </thead>
    <tbody>
    <%--@elvariable id="pubList" type="java.util.List<no.pub.model.Pub>" --%>
    <c:forEach items="${pubList}" var="pub">
        <c:url value="/pub/${pub.id}" var="pubUrl"/>
        <tr>
            <td>${pub.name}</td>
            <td>${pub.type}</td>
            <td>${pub.rating}</td>
            <td>${pub.lat}</td>
            <td>${pub.lon}</td>
            <td>${pub.postalCode}</td>
            <td>
                <a href="${pubUrl}">edit</a>
                <form:form modelAttribute="pub" action="${pubUrl}" method="DELETE">
                    <button>Delete</button>
                </form:form>
            </td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>