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
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
</head>
<body>
<jsp:include page="base.jsp"></jsp:include>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">admin</a>
        </div>
        <form class="navbar-form navbar-left" role="search">
            <div class="form-group">
                <input type="text" class="form-control" placeholder="Search">
            </div>
            <button type="submit" class="btn btn-default">提交</button>
        </form>
        <div>
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">招聘信息</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        我的信息 <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="#">个人资料</a></li>
                        <li><a href="#">我的简历</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>

</body>
</html>
