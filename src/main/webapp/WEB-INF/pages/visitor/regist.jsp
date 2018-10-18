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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
    <style type="text/css">
        #d{
            position: absolute;
            top: 50%;
            left: 50%;
            margin:-150px 0 0 -100px;
            width:200px;
            height:100px;
        }
    </style>
</head>
<body  style="background-image:url(${request.pageContext.contextPath}/img/p2.jpg); background-size:100%,100%">
<div id="d">
    <div style="font: 30px '微软雅黑';margin-left: 30px"> 游客注册</div><br>
    <div style="width:202px; height:135px; text-align: left; background-color: #C3E5FE;">
        <form id="form1" method="post" action="/visitor/addVisitor" style="padding-left: 10px;">
            <br />
            用户名：<input type="text"   name="name" id="name"><br>
            密 码 ：<input type="password" name="password" id="pwd"/>
            <div style="color: red">${requestScope.str}</div><br/><br/>
            <br/>
            <div >
                <input type="submit" value="注册" id="btnRegin">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"></div>
        </form>
        <div style="height: 15px;"></div>
    </div>
</div>
</body>
</html>
