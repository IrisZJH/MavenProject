<%--
  Created by IntelliJ IDEA.
  User: 18221
  Date: 2018/10/16
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
</head>
<body>
<form action="${pageContext.request.contextPath}/admin/addInvitation" method="post">
    姓名：<input type="text" name="name"><br>
    内容：<textarea rows="5" cols="20" name="text"></textarea><br/>
    邀请人：<input type="text" name="aName"><br>
    <input type="submit" value="发送邀请">
</form>

</body>
</html>
