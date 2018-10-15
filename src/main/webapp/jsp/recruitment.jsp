<%--
  Created by IntelliJ IDEA.
  User: 18221
  Date: 2018/10/13
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/admin/addRecruitment" method="post">
    Department：<select name="departmentId">
    <c:forEach items="${requestScope.departments }" var="department">
        <option value="${department.id}">${department.name}</option>
    </c:forEach>
</select><p/>
    描述：<input type="text" name="email"><p/>
    <input type="hidden" name="aName" value="${requestScope.visitor.name}">
    <input type="submit">
</form>

</body>
</html>
