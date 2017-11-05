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
    <title>资产盘点</title>
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
    <div>
        <div class="box" style="margin-top: 20px;">
            <div style="float: left;">
                <div>
                    <label>资产编号:123456</label>
                </div>
                <div>
                    <label id="saoma">扫码结果</label>
                </div>
            </div>
            <button class="sao" onclick="click_sao()" style="float: right">扫码</button>
        </div>
        <div class="box" style="height:300px;">
            <button class="pai" onclick="click_pai()">拍照</button>
        </div>
        <div class="fullbox" style="line-height: 30px;">
            <div>
                <label>经纬度</label>
            </div>
            <div>
                <label>大致位置</label>
            </div>
        </div>
        <div class="fullbox" style="line-height: 60px;">
            <div>
                <label>备注:</label>
                <input type="text" style="width: 20%;"/>
            </div>
        </div>
    </div>

    <div class="pandian" style="margin-top: 60px;">
        <ul>
            <li class="btn">
                <span style="color:white;">确认</span>
            </li>
        </ul>
    </div>

</div>
<script>
    function click_sao() {
        alert("saoma");
    }
    function click_pai() {
        alert("paizhao");
    }
    $('.btn').click(function(){
        window.location.href="${pageContext.request.contextPath}/dingdinglogin/test1";
    });
</script>

</body>
</html>
