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
</div>
    <ul class="mui-table-view">
        <li class="mui-table-view-cell">资产编号:123456</li>
        <li class="mui-table-view-cell">资产类别:个人资产</li>
        <li class="mui-table-view-cell">资产名称:笔记本电脑</li>
        <li class="mui-table-view-cell">数量:1</li>
        <li class="mui-table-view-cell">状态:正常</li>
        <li class="mui-table-view-cell">部门:IT管理部</li>
        <li class="mui-table-view-cell">生产厂家:戴尔</li>
        <li class="mui-table-view-cell">购入时间:2010年</li>
        <li class="mui-table-view-cell">资产备注:无</li>
        <li class="mui-table-view-cell">详细存放地:白马湖5楼</li>
        <li class="mui-table-view-cell">最新盘点位置:白马湖5楼</li>
        <li class="mui-table-view-cell">个人备注:太卡</li>
    </ul>
    <c:if test="${pandian == 1}">
    <div class="mui-content-padded">
        <button id='login' class="mui-btn mui-btn-block mui-btn-primary">盘点</button>
        </div>
    </div>
    </c:if>
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
        window.location.href="${pageContext.request.contextPath}/dingdinglogin/test2";
    });
</script>

</body>
</html>
