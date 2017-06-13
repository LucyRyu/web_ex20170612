
<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-13
  Time: 오후 1:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>Amigo 등록리스트</h3>
<c:forEach var="amigo" items="${list}">
    <ul>
        <li>친구 이름: <a href="/amigo/${amigo.amigoName}"> ${amigo.amigoName} </a> </li>
        <li>핸드폰: ${amigo.amigoPhone}</li>
        <li>이메일: ${amigo.amigoEmail}</li>
    </ul>
</c:forEach>
</body>
</html>
