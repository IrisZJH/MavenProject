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
    <%--<script src="js/common.js" language="javascript"></script>--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->

    <script type="text/javascript">
        $(function(){
            $("#name").blur(function() {
                var value = $("#name").val();
                verifyUserName(value);
            });
            $("#name").focus(function() {
                $("#userNameErr").text("");
            });
        });

        function verifyUserName(userName){
            var value = $("#name").val();
            $.ajax({
                type:"GET",
                cache:false,
                async:false,
                url:"/visitor/verifyUserName",
                data:{method:"verifyUserName",userName:value},
                dataType:"json",
                success:function(result){
                    if(result.ifreg =="true"){
                        $("#userNameErr").text("该用户名已被注册！");
                    }
                }
            });
        }
        <%--$(document).ready(function(){--%>
            <%--//当鼠标移开name的控件时就执行--%>
<%--//            $("#name").blur(function() {--%>

                <%--&lt;%&ndash;if($("#name").val()==""){&ndash;%&gt;--%>
                    <%--&lt;%&ndash;$("#nameNote").css("color","red");&ndash;%&gt;--%>
                    <%--&lt;%&ndash;$("#nameNote").text("请输入用户名!");&ndash;%&gt;--%>
                    <%--&lt;%&ndash;return;&ndash;%&gt;--%>
                <%--&lt;%&ndash;}&ndash;%&gt;--%>

                <%--&lt;%&ndash;//Math.random()是取随机数，可以解决缓存问题&ndash;%&gt;--%>
                <%--&lt;%&ndash;$.post("<%=basePath%>name.action" ,{name:$("#name").val(),id:Math.random(),radio:'<%=session.getAttribute("radio")%>'},function(data){&ndash;%&gt;--%>
                    <%--&lt;%&ndash;if(data.json == "fail"){&ndash;%&gt;--%>
                        <%--&lt;%&ndash;$("#nameNote").css("color","red");&ndash;%&gt;--%>
                        <%--&lt;%&ndash;$("#nameNote").text("该用户名已存在!");&ndash;%&gt;--%>
                        <%--&lt;%&ndash;return;&ndash;%&gt;--%>
                    <%--&lt;%&ndash;}else{&ndash;%&gt;--%>
                        <%--&lt;%&ndash;$("#nameNote").css("color","green");&ndash;%&gt;--%>
                        <%--&lt;%&ndash;$("#nameNote").text("该用户名可以使用!");&ndash;%&gt;--%>
                    <%--&lt;%&ndash;}&ndash;%&gt;--%>
                <%--&lt;%&ndash;},"json");&ndash;%&gt;--%>

            <%--&lt;%&ndash;});&ndash;%&gt;--%>

            <%--$("#pwd").blur( function() {--%>
                <%--$("#pwdNote").css("color","green");--%>
                <%--$("#pwdNote").text("该密码可以使用!");--%>
            <%--});--%>

            <%--$("#pwd2").blur( function() {--%>
                <%--if($("#pwd2").val()!=$("#pwd").val()){--%>
                    <%--$("#pwd2Note").css("color","red");--%>
                    <%--$("#pwd2Note").text("两次密码不一致!");--%>
                    <%--return;--%>
                <%--}else{--%>
                    <%--$("#pwd2Note").css("color","green");--%>
                    <%--$("#pwd2Note").text("两次密码一致!");--%>
                    <%--if($("#nameNote").html()=="该用户名可以使用!" ){--%>
                        <%--$("#btnRegin").attr("disabled", false);--%>
                    <%--}--%>
                <%--}--%>
            <%--});--%>

            <%--$("#pwd").blur(function(){--%>
                <%--if($("#pwd").val()==""){--%>
                    <%--$("#pwdNote").css("color","red");--%>
                    <%--$("#pwdNote").text("密码不能为空!");--%>
                    <%--alter("密码不能为空")--%>
                <%--}--%>
            <%--});--%>

        <%--});--%>
    </script>
    <style type="text/css">
        #all{
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
<form name="form" id="form" action="/visitor/addVisitor" method="post">
    <div id="all">
        <div style="font: 30px '微软雅黑';margin-left: 30px"> 注册界面</div><br>
        用户名： <input type="text"   name="name" id="name" placeholder="name">
        <label id = "userNameErr"></label><br/>
        密 码 ：<input type="password" name="password" id="pwd"/>
        <div id="pwdNote"></div><br>
        确认密码：<input type="password" name="password2" id="pwd2" >
        <div id="pwd2Note"></div><br>
        <div >
            <input type="submit" value="注册" id="btnRegin">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"></div>
    </div>
    <%--disabled="disabled"--%>
</form>
</body>
</html>
