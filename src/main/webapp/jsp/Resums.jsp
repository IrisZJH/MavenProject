<%--
  Created by IntelliJ IDEA.
  User: 18221
  Date: 2018/10/12
  Time: 12:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>

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
<body style="background-image:url(${request.pageContext.contextPath}/img/p2.jpg); background-size:100%,100%">
<p><b>新建简历</b></p>
<form action="/visitor/addResums" method="post">
    姓名：<input type="text" name="name"><br>
    性别：<input type="radio" name="sex" checked="checked" value="男">男
    &nbsp;<input name="sex" type="radio" value="女">女<br>
    年龄：<input type="text"  name="age"><br>
    学历：<select name="school">
    <option>小学</option>
    <option>初中</option>
    <option>中专</option>
    <option>高中</option>
    <option>大专</option>
    <option>本科</option>
    <option>硕士</option>
    <option>博士</option>
</select><br/>
    工作年限：<select name="experience">
    <option>无经验</option>
    <option>一年以下</option>
    <option>一年以上</option>
    <option>两年以上</option>
    <option>三年以上</option>
    <option>五年以上</option>
    <option>十年以上</option>
</select><br/>

    技能特长：<textarea rows="5" cols="20" name="skill"></textarea><br>
    兴趣爱好：<textarea rows="5" cols="20" name="hobby"></textarea><br>
    优点：<textarea rows="5" cols="20" name="advantage"></textarea><br/>
    缺点：<textarea rows="5" cols="20" name="weakness"></textarea><br/>
    <input type="hidden" name="vid" value="${requestScope.visitor.id}">
    <input type="submit" value="保存并返回"></form>
</body>
</body>
</html>
