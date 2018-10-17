<%--
  Created by IntelliJ IDEA.
  User: 18221
  Date: 2018/10/12
  Time: 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
    <title>Insert title here</title>
    <script type="text/javascript">
        window.onload = function ajaxSend() {
            		alert("asd");
            $.ajax({
                type : "post",// 指定是post还是get
                //data : "username=" + username + "&userpass=" + userpass,//发送到服务器的数据
                url : "${pageContext.request.contextPath}admin/queryDepartment",//发送请求的地址
                dataType : "json",
                error : function(err) {//如果确定能正确运行,可不写
                    alert(err.code);
                },
                success : ajaxSendCallBack
            })
        }
        function ajaxSendCallBack(data) {
            //alert(data[0].name);
            for ( var i = 0; i < data.length; i++) {
                var op = document.createElement("option");//创建一个指名名称元素
                op.value = data[i].name;//设置op的实际值为当前的省份名称
                var textNode = document.createTextNode(data[i].name);//创建文本节点
                op.appendChild(textNode);//把文本子节点添加到op元素中，指定其显示值

                document.getElementById("p").appendChild(op);
            }
        }

        function position() {
            //alert("asd");

            var departmentname = $("#p").val();

            $.ajax({
                type : "post",// 指定是post还是get
                data : "department.name=" + departmentname,//发送到服务器的数据
                url : "${pageContext.request.contextPath}admin/queryPosition",//发送请求的地址
                dataType : "json",
                error : function(err) {//如果确定能正确运行,可不写
                    alert(err.code);
                },
                success : ajaxSendCallBackcity
            })
        }

        function ajaxSendCallBackcity(data) {
            //如果是jsonArray这样返回
            //alert(data[0].name);
            //返回json结果
            /*
             把select中的所有option移除（除了请选择）
             */
            var citySelect = document.getElementById("c");
            // 获取其所有子元素
            var optionEleList = citySelect.getElementsByTagName("option");
            // 循环遍历每个option元素，然后在citySelect中移除
            while (optionEleList.length > 1) {//子元素的个数如果大于1就循环，等于1就不循环了！
                citySelect.removeChild(optionEleList[1]);//总是删除1下标，因为1删除了，2就变成1了！
            }

            for ( var i = 0; i < data.length; i++) {
                var op = document.createElement("option");//创建一个指名名称元素
                op.value = data[i].name;//设置op的实际值为当前的省份名称
                var textNode = document.createTextNode(data[i].name);//创建文本节点
                op.appendChild(textNode);//把文本子节点添加到op元素中，指定其显示值

                document.getElementById("c").appendChild(op);
            }
        }
    </script>
</head>
<body>
<h1>二级联动</h1>
<%--<select name="department" id="p" onchange="position()">--%>
    <%--<option>===请选择部门===</option>--%>
<%--</select>--%>

<%--<select name="position" id="c">--%>
    <%--<option>===请选择岗位===</option>--%>
<%--</select>--%>
<body>
<s:select theme="simple" id="province" headerKey="" headerValue="请选择" list="provinceList" listKey="pid" listValue="pname" />
<select id="city" name="city"><option>请选择</option></select>
<select id="town" name="town"><option>请选择</option></select>
</body>
</body>
</html>