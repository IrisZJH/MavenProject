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
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
    <title>网上招聘系统主页</title>
    <link href="css/index.css" rel="stylesheet" type="text/css" />
</head>
<body style="text-align: center;">

<div id="contion">

    <div id="top">
        <%--<%@ include file="head.jsp" %>--%>
    </div>
    <div id="sec">
        <div id="sec_right">
            <%--<iframe frameborder="0" style="width:200px;height:165px;" src="jsp/web_note.jsp">--%>

            <%--</iframe>--%>
        </div>
        <div id="sec_left">

        </div>
    </div>

    <div id="third">
        <div id="third1">
            <div style="width:202px; height:30px; background-image:url(img/log.jpg);"></div>
            <div style="width:202px; height:135px; text-align: left; background-color: #C3E5FE;">
                <form id="form1" method="post" action="/visitor/findVisitorByNameAndPassword" style="padding-left: 10px;">
                    <br />
                    用户：<input type="text" name="name" style="height: 15px;width: 120px;"  /><br /><br/>
                    密码：<input type="password" name="password" style="height: 15px;width: 120px;" /><br /><br/>
                    类别： <select name="status">
                    <option value="visitor">游客</option>
                    <option value="admin">管理员</option>
                </select><br/><br/>
                    <center>
                        <input type="submit" value="登录" />&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="reset"  value="重置" /><br/>
                    </center>
                </form>
                <div style="font-size: 15px;text-align: center;">
                    <a href="/visitor/regist" style="color: #F10301;">【游客注册】</a>
                </div>
                <div style="height: 15px;"></div>
            </div>
            <div style="background-color:#000000; height: 150px;background-image: url(img/x.jpg);"></div>
        </div>
        <div id="third2">
            <div style="height: 25px; background-color: #FEFBBC;">
                <div style="padding-top: 5px;">最新人才信息</div>
            </div>
            <div style="height:170px;">
                <%--<div style="width760px；height:170px; background-color:#996600;">--%>
                    <%--&lt;%&ndash;<%@ include file="jsp/index_person.jsp" %>&ndash;%&gt;--%>
                <%--</div>--%>
            </div>
            <div style="width: 760px; height: 20px; background-color: #FEFBBC;">
                <div style="padding-top: 4px;">最新招聘信息</div>
            </div>
            <div style="height:170px;">
                <div style="float:left; height:170px; background-color:#996666;">
                    <iframe style="width: 760px; height:175px; background-color:#996666;" frameborder="0" scrolling="no" src="jsp/index_company.jsp">
                    </iframe>
                </div>
            </div>
        </div>
    </div>

</div>
</body>
</html>
