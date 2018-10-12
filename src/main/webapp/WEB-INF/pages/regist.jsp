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
    <script src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
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
    <script type="text/javascript">
        $(function(){
            $("#name").blur(function() {
                var value = $("#name").val();
                verifyUserName(value);
            });
            $("#name").focus(function() {
                $("#userNameErr").text("");
            });
        });

        function verifyUserName(userName){
            var value = $("#name").val();
            $.ajax({
                type:"GET",
                cache:false,
                async:false,
                url:"/visitor/verifyUserName",
                data:{method:"verifyUserName",name:value},
                dataType:"json",
                success:function(result){
                    if(result.ifreg =="true"){
                        $("#userNameErr").text("该用户名已被注册！");
                    }
                }
            });
        }
    </script>
</head>
<body>
<%--<jsp:include page="base.jsp"></jsp:include>--%>
<div class="outer-wrap">
    <div class="login-panel">
        <form class="form-horizontal" role="form" action="/visitor/addVisitor" method="post">
            <div class="form-group">
                <label for="name" class="col-sm-2 control-label"></label>
                <div class="col-sm-10">
                    <input type="text"   name="name" class="form-control" id="name" placeholder="name">
                    <label id = "userNameErr"></label><br/>
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
                    <button type="submit" class="btn btn-danger btn-lg">注册</button>
                    <a href="/visitor/regist">点击登录</a>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
