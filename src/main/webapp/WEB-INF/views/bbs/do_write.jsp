<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-12
  Time: 오전 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<h1>다음과 같이 등록되었습니다.</h1>

<ul>
    <li>글번호: ${article.articleId}</li>
    <li>제목: ${article.title}</li>
    <li>작성자: ${article.author}</li>
    <li>내용: ${article.content}</li>
</ul>

<a href="/bbs">전체 글 보기</a>
</body>
</html>
