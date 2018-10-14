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
<title>tab页切换</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript">
    function switchTab(ProTag, ProBox) {
        for (i = 1; i < 5; i++) {
            if ("tab" + i == ProTag) {
                document.getElementById(ProTag).getElementsByTagName("a")[0].className = "on";
            } else {
                document.getElementById("tab" + i).getElementsByTagName("a")[0].className = "";
            }
            if ("con" + i == ProBox) {
                document.getElementById(ProBox).style.display = "";
            } else {
                document.getElementById("con" + i).style.display = "none";
            }
        }
    }
</script>
<style type="text/css">
    *
    {
        padding: 0;
        margin: 0;
        line-height: 25px;
        font-size: 12px;
        list-style:none
    }
    #tabContainer
    {
        margin: 30px;
    }
    #tabContainer li
    {
        float: left;
        width: 80px;
        margin: 0 3px;
        background: #efefef;
        text-align: center;
    }
    #tabContainer a
    {
        display: block;
    }
    #tabContainer a.on
    {
        background: pink;
    }
</style>
</head>
<body>
<div id="tabContainer">
    <ul>
        <li id="tab1"><a href="#" class="on" onclick="switchTab('tab1','con1');this.blur();return false;">
            命运</a></li>
        <li id="tab2"><a href="#" onclick="switchTab('tab2','con2');this.blur();return false;">
            运势</a></li>
        <li id="tab3"><a href="#" onclick="switchTab('tab3','con3');this.blur();return false;">
            缘分</a></li>
        <li id="tab4"><a href="#" onclick="switchTab('tab4','con4');this.blur();return false;">
            人生</a></li>
    </ul>
    <div style="clear: both">
    </div>
    <div id="con1">
        命运是个神马玩意儿...
    </div>
    <div id="con2" style="display: none">
        霉运也是一种运气...
    </div>
    <div id="con3" style="display: none">
        缘份纯粹是蒙人的东西...
    </div>
    <div id="con4" style="display: none">
        人生就是人"生"出来之后的过程...
    </div>
</div>
</body>
</html>
