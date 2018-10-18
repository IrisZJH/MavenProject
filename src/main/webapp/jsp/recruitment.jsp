<%--
  Created by IntelliJ IDEA.
  User: 18221
  Date: 2018/10/13
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>

    <script>
        $(function() {
            $( "#datepicker" ).datepicker(new Date());
        });
    </script>

</head>
<body>
<form action="${pageContext.request.contextPath}/admin/addRecruitment" method="post">
    <table width="80%" border="0" align="center" valign="bottom">
        <tr>
            <td width="30%" align="right">
                公司名称：
            </td>
            <td>
                <input type="text" name="name">
            </td>
        </tr>
        <tr>
            <td width="50%" align="right">
                公司地址：
            </td>
            <td>
                <input type="text" name="address">
            </td>
        </tr>
        <tr>
            <td width="50%" align="right">职位：</td>
            <td width="70%" align="left">
                <select name="pid" id="pname">
                    <c:if test="${not empty sessionScope.postList}">
                        <c:forEach items="${sessionScope.postList}" var="list2">
                            <option value="${list2.pid}">${list2.pname}</option>
                        </c:forEach>
                    </c:if>
                </select>
            </td>
        </tr>
        <tr>
            <td width="50%" align="right">描述</td>
            <td><input type="text" name="describe"></td>
        </tr>
        <tr>

            <td width="50%" align="right">发布时间</td>
            <td><input name="date" id="datepicker" required/></td>
        </tr>

        </tr>
        <tr align="center" >
            <td colspan="2" style="padding-right:80px" >
                <input type="submit" name="Submit" value="发布招聘信息">
                <a href="admin_sd.jsp"><input type="button" value="返回"></a>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
