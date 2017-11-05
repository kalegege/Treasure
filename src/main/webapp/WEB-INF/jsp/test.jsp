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
    <title>首页</title>
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
<div class="head">
    <img src="${ctx}/image/head.jpg" style="width:100%"  alt="大标题" />
    <input type="hidden" value="${ctx}" id="head"/>
</div>
<div class="tab" id="tab-switch">
    <ul>
        <li class="own">
            <span>个人资产</span>
        </li>
        <li class="recom">
            <span>未盘点(数量)</span>
        </li>
    </ul>
</div>
<div>
    <ul>
        <li class="item">
            <a href="${pageContext.request.contextPath}/dingdinglogin/test">
                <div class="content">
                    <div class="tNo">654321</div>
                    <div class="tName">笔记本电脑</div>
                    <div class="tType">个人资产</div>
                    <div class="tNum">200</div>
                </div>
            </a>
        </li>
        <li class="item">
            <a href="${pageContext.request.contextPath}/dingdinglogin/test1">
                <div class="content">
                    <div class="tNo">123456</div>
                    <div class="tName">台式电脑</div>
                    <div class="tType">个人资产</div>
                    <div class="tNum">100</div>
                </div>
            </a>
        </li>
    </ul>
</div>
</div>
<script>
    function fun(){
        var obj = document.getElementById("tab-switch");
        for(i=0;i<obj.length;i++){
            if(obj[i].value==str)
                obj[i].selected = true;
        }
    }
    $('.own').click(function(){
        $('.own').toggleClass("selected");
        if($('.recom').hasClass("selected")){
            $('.recom').removeClass("selected");
            $(".tNo").css("width","33%");
            $(".tName").css("width","33%");
            $(".tType").css("width","33%");
            $(".tNum").css("display","none");
        }
    });
    $('.recom').click(function(){
        $('.recom').toggleClass("selected");
        if($('.own').hasClass("selected")){
            $('.own').removeClass("selected");
            $(".tNo").css("width","25%");
            $(".tName").css("width","25%");
            $(".tType").css("width","25%");
            $(".tNum").css("width","25%");
            $(".tNum").css("display","block");
        }
    });
</script>
</body>
</html>
