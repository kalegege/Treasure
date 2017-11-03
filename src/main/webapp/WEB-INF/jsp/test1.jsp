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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/mystyle.css" type="text/css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/my.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.0.3.min.js"></script>
    <meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,user-scalable=no,shrink-to-fit=no">
    <meta name="MobileOptimized" content="320">
    <meta http-equiv="Cache-Control" content="no-cache, must-revalidate">
    <meta http-equiv="Pragma" content="no-cache">
    <meta name="HandheldFriendly" content="true">

    <script>
        (function() {
            var baseFontSize = 100;
            var baseWidth = 375;
            var clientWidth = document.documentElement.clientWidth || window.innerWidth;
            var innerWidth = Math.max(Math.min(clientWidth, 480), 360);

            var rem = 100;
            if (innerWidth >= 414) {
                rem = Math.floor(innerWidth / baseWidth * baseFontSize * 0.98);
            } else {
                rem = Math.floor(innerWidth / baseWidth * baseFontSize);
            }

            document.querySelector('html').style.fontSize = rem + 'px';
        }());

    </script>
</head>
<body>
<div class="page">
<div>
    <%--<img src="${ctx}/image/head.jpg" style="width:100%"  alt="大标题" />--%>
    <input type="hidden" value="${ctx}" id="head"/>
</div>
<form>
    <div class="info">
        <div>
            <label>资产编号:123456</label>
        </div>
        <div>
            <label>资产类别:个人资产</label>
        </div>
        <div>
            <label>资产名称:笔记本电脑</label>
        </div>
        <div>
            <label>数量:1</label>
        </div>
        <div>
            <label>状态:正常</label>
        </div>
        <div>
            <label>部门:IT管理部</label>
        </div>
        <div>
            <label>生产厂家:戴尔</label>
        </div>
        <div>
            <label>购入时间:2010年</label>
        </div>
        <div>
            <label>资产备注:无</label>
        </div>
        <div>
            <label>详细存放地:白马湖5楼</label>
        </div>
        <div>
            <label>最新盘点位置:白马湖5楼</label>
        </div>
        <div>
            <label>个人备注:太卡</label>
        </div>
    </div>
</form>
    <div class="pandian" >
        <ul>
            <li class="btn">
                <span style="color:white;">盘点</span>
            </li>
        </ul>
    </div>

</div>
<script>
    $('.btn').click(function(){
//        alert("switch page");
        window.location.href="${pageContext.request.contextPath}/dingdinglogin/test2";
    });
</script>

</body>
</html>
