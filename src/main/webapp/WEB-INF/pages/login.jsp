<%--
  Created by IntelliJ IDEA.
  User: 18221
  Date: 2018/10/12
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <link href="../../bootstrap/css/bootstrap.css" rel="stylesheet">
    <script src="../../bootstrap/js/jquery-1.10.2.min.js"></script>
    <script src="../../bootstrap/js/bootstrap.min.js"></script>
    <style>
        html,body{
            height: 100%;
            background:url(../../img/2.jpg) no-repeat;background-size: cover;font-size: 16px;
        }
        .outer-wrap{
            height: 100%;
            position: relative;
        }
        .login-panel{
            position: absolute;
            top: 50%;
            left: 50%;
            margin-top: -150px;
            margin-left: -200px;
        }

    </style>
</head>
<body>
<%--<jsp:include page="base.jsp"></jsp:include>--%>
<div class="outer-wrap">
    <div class="login-panel">
        <form class="form-horizontal" role="form" action="/visitor/findVisitorByNameAndPassword" method="post">
            <div class="form-group">
                <label for="name" class="col-sm-2 control-label"></label>
                <div class="col-sm-10">
                    <input type="text" name="name" class="form-control" id="name" placeholder="name">
                </div>
            </div>
            <div class="form-group">
                <label for="Password" class="col-sm-2 control-label"></label>
                <div class="col-sm-10">
                    <input type="text" name="password" class="form-control" id="password" placeholder="password">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <div class="checkbox">
                        <label>
                            <input type="checkbox">请记住我
                        </label>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-danger btn-lg">登录</button>
                    <a href="/visitor/regist">没有账号？点击免费注册</a>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
