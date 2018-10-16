<%--
  Created by IntelliJ IDEA.
  User: 18221
  Date: 2018/10/12
  Time: 12:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<p><b>简历信息</b></p>
<table border=2px cellspacing="0">
    <tr>
        <td>id</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>学历</td>
        <td>工作经验</td>
        <td>技能</td>
        <td>爱好</td>
        <td>优点</td>
        <td>缺点</td>
    </tr>
    <c:forEach items="${requestScope.resums}" var="resums">
        <tr>
            <td>${resums.id}</td>
            <td>${resums.name}</td>
            <td>${resums.sex}</td>
            <td>${resums.age}</td>
            <td>${resums.school}</td>
            <td>${resums.experience}</td>
            <td>${resums.skill}</td>
            <td>${resums.advantage}</td>
            <td>${resums.weakness}</td>
            <td><a href="${pageContext.request.contextPath}/admin/toInvitationPage?vid=${resums.vid}">通知面试</a></td>
            <td><a href="${pageContext.request.contextPath}/admin/resumsRead?id=${resums.id}">已阅</a></td>
        </tr>
    </c:forEach>
    <%--<a href=""--%>
</table>
<a href="${pageContext.request.contextPath}/admin/returnmenu?vid=${requestScope.visitor.id}">返回主菜单</a>
</body>
</html>
