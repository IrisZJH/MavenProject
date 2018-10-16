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
<p><b>面试通知</b></p>
<table border=2px cellspacing="0">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>text</td>
        <td>date</td>
        <td>aName</td>
    </tr>
    <c:forEach items="${requestScope.invitations}" var="invitations">
        <tr>
            <td>${invitations.id}</td>
            <td>${invitations.name}</td>
            <td>${invitations.text}</td>
            <td>${invitations.date}</td>
            <td>${invitations.aName}</td>
        <td><a href="${pageContext.request.contextPath}/visitor/acceptInvitation?id=${invitations.id}">确认面试</a></td>
        </tr>
    </c:forEach>
    </table>
<a href="${pageContext.request.contextPath}/visitor/returnmenu?vid=${requestScope.visitor.id}">返回主菜单</a>

</body>
</html>
