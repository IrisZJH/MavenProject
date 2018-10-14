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
<p><b>第一步 - 创建基本信息</b></p>
<form action="/visitor/addResums" method="post">
    简历名称：<input type="text" name="userDail.jianLiName"><br>
    姓&nbsp;&nbsp;&nbsp;&nbsp;名：<input type="text" name="userDail.name"><br>
    性&nbsp;&nbsp;&nbsp;&nbsp;别：<input type="radio" name="userDail.sex" checked="checked" value="男">男
    &nbsp;<input name="userDail.sex" type="radio" value="女">女<br>
    民&nbsp;&nbsp;&nbsp;&nbsp;族：<select name="userDail.miZhu">
    <option>汉族</option>
    <option>苗族</option>
    <option>蒙古族</option>
    <option>回族</option>
    <option>藏族</option>
    <option>维吾尔族</option>
    <option>其他</option>
</select><br/>
    生&nbsp;&nbsp;&nbsp;&nbsp;日：<input id="startTime" name="userDail.birthday" value="<fmt:formatDate value='${active.startDate}' pattern='yyyy-MM-dd HH:mm:ss' />" type="text" onClick="WdatePicker()" class="Wdate"/><br/>
    年&nbsp;&nbsp;&nbsp;&nbsp;龄：<input type="text"  name="userDail.age"><br>
    工作年限：<select name="userDail.gongZuoNianXian">
    <option>无经验</option>
    <option>一年以下</option>
    <option>一年以上</option>
    <option>两年以上</option>
    <option>三年以上</option>
    <option>五年以上</option>
    <option>十年以上</option>
</select><br/>
    户&nbsp;&nbsp;&nbsp;&nbsp;籍：<input type="text" name="userDail.huJi"><br>
    学&nbsp;&nbsp;&nbsp;&nbsp;历：<select name="userDail.xueLi">
    <option>小学</option>
    <option>初中</option>
    <option>中专</option>
    <option>高中</option>
    <option>大专</option>
    <option>本科</option>
    <option>硕士</option>
    <option>博士</option>
</select><br/>
    现&nbsp;居&nbsp;地：<input type="text" name="userDail.address"><br>
    专&nbsp;&nbsp;&nbsp;&nbsp;业：<input type="text" name="userDail.zhuanYe"><br>
    电&nbsp;&nbsp;&nbsp;&nbsp;话：<input type="text" name="userDail.phone"><br>
    邮&nbsp;&nbsp;&nbsp;&nbsp;箱：<input type="text" name="userDail.email"><br>
    Q&nbsp;&nbsp;&nbsp;Q &nbsp;&nbsp;：<input type="text" name="userDail.qq"><br>
    求职类型：<select name="userDail.qiuZhiType">
    <option>全职</option>
    <option>兼职</option>
    <option>实习</option>
</select><br/>
    意向岗位：<SELECT name="userDail.yiXiangGuangWei">
    <s:iterator value="gangWeis" id="i">
        <option value="<s:property value='#i.name'/>"><s:property value="#i.name"/></option>
    </s:iterator>
</SELECT><br/>
    目前状态：<select name="userDail.muQianState">
    <option>应届生</option>
    <option>正在找</option>
    <option>已就业</option>
</select><br/>
    意向地区：<input type="text" name="userDail.yiXiangDiQu"><br>
    可到时间：<input type="text" name="userDail.keDaoShiJian"><br>
    技能特长：<textarea rows="5" cols="20" name="userDail.jiNenTeChang"></textarea><br>
    关&nbsp;键&nbsp;字：<input type="text" name="userDail.jianLiGuanJianZi"><br>
    自我评价：<textarea rows="5" cols="20" name="userDail.ziWoPinJia"></textarea><br>
    <input type="submit" value="保存并下一步"></form>
</body>
</html>
