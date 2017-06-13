<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-12
  Time: 오후 2:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Amigo 확인하기</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>


<h3>Amigo 등록완료</h3>

<ul>
    <li>친구 이름: ${amigo.amigoName}</li>
    <li>핸드폰: ${amigo.amigoPhone}</li>
    <li>이메일: ${amigo.amigoEmail}</li>
</ul>

<a href="/amigo/list"> Amigo List </a>


</body>
</html>
