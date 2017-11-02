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
    <meta name="shenma-site-verification" content="f28da5e2e3fb6e2afd372a3eedfda998">
    <meta name="baidu-site-verification" content="eafwEzRbnz">
    <meta name="copyright" content="Copyright (c) 1998-2017 Tencent.">
    <meta name="x5-page-mode" content="no-title">
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
    <%--<img src="${ctx}/image/head.jpg" style="width:100%"  alt="大标题" />--%>
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
        <li>
            <a href="ww.baidu.com">
                <div>
                    <div>笔记本电脑</div>
                    <div>1000</div>
                    <div>未盘点</div>
                </div>
            </a>
        </li>
        <li>
            <a href="ww.qq.com">
                <div>
                    <div>台式电脑</div>
                    <div>2000</div>
                    <div>已盘点</div>
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
        }
    });
    $('.recom').click(function(){
        $('.recom').toggleClass("selected");
        if($('.own').hasClass("selected")){
            $('.own').removeClass("selected");
        }
    });
</script>
</body>
</html>
