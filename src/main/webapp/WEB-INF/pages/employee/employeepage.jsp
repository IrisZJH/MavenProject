<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
    <title>menu</title>
    <link rel="stylesheet" href="skin/css/base.css" type="text/css" />
    <link rel="stylesheet" href="skin/css/menu.css" type="text/css" />
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
    <script language='javascript'>var curopenItem = '1';</script>
    <script language="javascript" type="text/javascript" src="skin/js/frame/menu.js"></script>
    <base target="main" />
</head>
<body target="main">
<table width='99%' height="100%" border='0' cellspacing='0' cellpadding='0'>
    <tr>
        <td style='padding-left:3px;padding-top:8px' valign="top">
            您好：员工 ${requestScope.visitor.name}，您可以有以下操作！
            <!-- Item 1 Strat -->
            <dl class='bitem'>
                <dt onClick='showHide("items1_1")'><b>招聘</b></dt>
                <dd style='display:block' class='sitem' id='items1_1'>
                    <ul class='sitemu'>
                        <li>
                            <div class='items'>
                                <div class='fllct'><a href="/admin/toRecruitmentPage" target='main'>发布招聘信息</a></div>
                            </div>
                        </li>
                        <li><a href="/visitor/queryResumsByVid?vid=${requestScope.visitor.id}" target='main'>查看简历并通知面试</a> </li>
                        <li><a href="/visitor/queryResumsByVid?vid=${requestScope.visitor.id}" target='main'>录用</a> </li>

                    </ul>
                </dd>
            </dl>
            <!-- Item 1 End -->
            <!-- Item 2 Strat -->
            <%--<dl class='bitem'>--%>
                <%--<dt onClick='showHide("items2_1")'><b>简历操作</b></dt>--%>
                <%--<dd style='display:block' class='sitem' id='items2_1'>--%>
                    <%--<ul class='sitemu'>--%>
                        <%--<li><a href='showJianLisForOut.action' target='main'>修改简历</a></li>--%>
                        <%--<li><a href='showWaifa.action' target='main'>外发简历</a></li>--%>
                    <%--</ul>--%>
                <%--</dd>--%>
                <%--</dd>--%>
            <%--</dl>--%>
            <!-- Item 2 End -->
            <!-- Item 3 Strat -->
            <%--<dl class='bitem'>--%>
                <%--<dt onClick='showHide("items3_1")'><b>工作机会</b></dt>--%>
                <%--<dd style='display:block' class='sitem' id='items3_1'>--%>
                    <%--<ul class='sitemu'>--%>
                        <%--<li><a href='showUserSearchZhiWei.action' target='main'>职位搜索</a></li>--%>
                        <%--<li><a href='showMianshiTongzhi.action' target='main'>面试通知单</a></li>--%>
                        <%--<li><a href='showShenqingjilu.action' target='main'>职位申请列表</a></li>--%>
                    <%--</ul>--%>
                <%--</dd>--%>
                <%--</dd>--%>
            <%--</dl>--%>
            <!-- Item 3 End -->
        </td>
    </tr>
</table>
</body>
</html>