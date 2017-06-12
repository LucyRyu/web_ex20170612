<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-12
  Time: 오후 2:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Amigo 등록하기</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>


<div class="container">
    <div class="header clearfix">
        <nav>
            <ul class="nav nav-pills pull-right">
                <li role="presentation" class="active"><a href="#">Home</a></li>
                <li role="presentation"><a href="#">About</a></li>
                <li role="presentation"><a href="#">Contact</a></li>
            </ul>
        </nav>
        <h3 class="text-muted">Amigo 등록</h3>
    </div>

    <div class="jumbotron">
        <form action="/amigo/regist" method="post">

            <div class="form-group">
                <label class="amigoName">이름</label>
                <input type="text" class="form-control" name="amigoName" placeholder="이름">
                <br>
            </div>
            <br>
            <div class="form-group">
                <label class="amigoPhone">핸드폰</label>
                <input type="text" class="form-control" name="amigoPhone" placeholder="핸드폰번호">
                <br>
            </div>
            <br>
            <div class="form-group">
                <label class="amigoEmail">이메일</label>
                <input type="email" class="form-control" name="amigoEmail" placeholder="id@example.com">
                <br>
            </div>
            <br>
            <button type="submit" class="btn btn-default">등록</button>
        </form>
    </div>

    <div class="row marketing">
        <div class="col-lg-6">
            <h4>Subheading</h4>
            <p>Donec id elit non mi porta gravida at eget metus. Maecenas faucibus mollis interdum.</p>

            <h4>Subheading</h4>
            <p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Cras mattis consectetur purus sit amet
                fermentum.</p>

            <h4>Subheading</h4>
            <p>Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
        </div>

        <div class="col-lg-6">
            <h4>Subheading</h4>
            <p>Donec id elit non mi porta gravida at eget metus. Maecenas faucibus mollis interdum.</p>

            <h4>Subheading</h4>
            <p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Cras mattis consectetur purus sit amet
                fermentum.</p>

            <h4>Subheading</h4>
            <p>Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
        </div>
    </div>

    <footer class="footer right-arrow">
        <p>&copy; 2016 Company, Inc.</p>
    </footer>

</div> <!-- /container -->


</body>
</html>
