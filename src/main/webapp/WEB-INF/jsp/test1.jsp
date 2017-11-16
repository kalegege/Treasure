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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/app.css" type="text/css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/mui.min.css" type="text/css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/my.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/mui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.0.3.min.js"></script>
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
</div>
    <ul class="mui-table-view">
        <li class="mui-table-view-cell">资产编号:${a.assetcode}</li>
        <li class="mui-table-view-cell">资产类别:${a.assetsortname}</li>
        <li class="mui-table-view-cell">资产名称:${a.name}</li>
        <li class="mui-table-view-cell">数量:${a.numbers}</li>
        <li class="mui-table-view-cell">状态:
<c:choose>
    <c:when test="${a.state} == 1">正常</c:when>
    <c:otherwise>异常</c:otherwise>
</c:choose></li>
        <li class="mui-table-view-cell">部门:${a.deptname}</li>
        <li class="mui-table-view-cell">生产厂家:戴尔</li>
        <li class="mui-table-view-cell">购入时间:${a.buydate}</li>
        <li class="mui-table-view-cell">资产备注:无</li>
        <li class="mui-table-view-cell">详细存放地:${a.detailedlocation}</li>
        <li class="mui-table-view-cell">最新盘点位置:${a.address}</li>
        <li class="mui-table-view-cell">个人备注:太卡</li>
    </ul>
    <div class="mui-content-padded">
        <button id='login' class="mui-btn mui-btn-block mui-btn-primary">盘点</button>
        </div>
    </div>
    <%--<div class="pandian" >--%>
        <%--<ul>--%>
            <%--<li class="btn">--%>
                <%--<span style="color:white;">盘点</span>--%>
            <%--</li>--%>
        <%--</ul>--%>
    <%--</div>--%>

</div>
<script>
    $('#login').click(function(){
//        alert("switch page");
        window.location.href="${pageContext.request.contextPath}/dingdinglogin/test2?assetcode=${a.assetcode}";
    });
</script>

</body>
</html>
