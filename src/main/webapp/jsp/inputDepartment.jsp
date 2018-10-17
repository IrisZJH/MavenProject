<%--
  Created by IntelliJ IDEA.
  User: 18221
  Date: 2018/10/17
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="background-image:url(${request.pageContext.contextPath}/img/p2.jpg); background-size:100%,100%">
<div>
    <form action="${pageContext.request.contextPath}/admin/addDepartment">
    部门名字：<input type="text" name="name">
    <input type="submit">
    </form>
</div>
</body>
</html>
