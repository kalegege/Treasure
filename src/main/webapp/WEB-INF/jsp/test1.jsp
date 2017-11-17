<%--
  Created by IntelliJ IDEA.
  User: kale
  Date: 2017/10/23
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>资产详情</title>
    <script type="text/javascript">
        var agentid='${conf.agentid}';
        var corpId='${conf.corpId}';
        var timeStamp='${conf.timeStamp}';
        var nonceStr='${conf.nonceStr}';
        var signature='${conf.signature}';
        <%--var url_db='${url_db}';--%>
    </script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/app.css" type="text/css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/mui.min.css" type="text/css"/>
    <%--<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.0.3.min.js"></script>--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/dingding/zepto.min.js"></script>
    <script type="text/javascript" src="https://g.alicdn.com/dingding/open-develop/1.9.0/dingtalk.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/dingding/demo2.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/my.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/mui.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1,user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">

</head>
<body>
<div class="page">
<div>
    <%--<img src="${ctx}/image/head.jpg" style="width:100%"  alt="大标题" />--%>
    <input type="hidden" value="${ctx}" id="head"/>
    <input type="hidden" value="${a.assetcode}" id="assetcode"/>
    <input type="hidden" value="${userid}" id="userid"/>
    <input type="hidden" value="${id}" id="id"/>
    <input type="hidden" value="${members}" id="members"/>
</div>
    <ul class="mui-table-view">
        <li class="mui-table-view-cell">资产编号:${a.assetcode}</li>
        <li class="mui-table-view-cell">资产类别:${a.assetsortname}</li>
        <li class="mui-table-view-cell">资产名称:${a.name}</li>
        <li class="mui-table-view-cell">数量:${a.numbers}</li>
        <li class="mui-table-view-cell">部门:${a.deptname}</li>
        <li class="mui-table-view-cell">归属人:${a.place}</li>
        <li class="mui-table-view-cell">供货方:${a.manufacturer}</li>
        <li class="mui-table-view-cell">购入时间:
            <fmt:formatDate value="${a.buydate}" type="date"/>
        </li>
        <li class="mui-table-view-cell">项目编号:${a.projectid}</li>
        <li class="mui-table-view-cell">项目名称:${a.projectname}</li>
        <li class="mui-table-view-cell">资产备注:${a.remark}</li>
        <%--<li class="mui-table-view-cell">详细存放地:${a.detailedlocation}</li>--%>
        <%--<li class="mui-table-view-cell">最新盘点位置:${a.address}</li>--%>
        <li class="mui-table-view-cell">最新盘点备注:${a.inventoryRemark}</li>
        <li class="mui-table-view-cell">盘点人:${a.inventoryUser}</li>
    </ul>
    <c:choose>
        <c:when test="${pandian == '1'}">
            <div class="mui-content-padded">
                <button id='login' class="mui-btn mui-btn-block mui-btn-primary">盘点</button>
            </div>
        </c:when>
        <c:when test="${pandian == '2'}">
            <div class="mui-content-padded">
                <button id='choose' class="mui-btn mui-btn-block mui-btn-primary">指定盘点人</button>
            </div>
        </c:when>
    </c:choose>
</div>
<script>
    $('#login').click(function(){
//        alert("switch page");
        window.location.href="${pageContext.request.contextPath}/dingdinglogin/test2?assetcode=${a.assetcode}&userid=${userid}&id=${id}";
    });
    $('#choose').click(function(){
//        alert("switch page");
        click_dept1();
    });
</script>

</body>
</html>
