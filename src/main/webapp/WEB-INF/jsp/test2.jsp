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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/dingding/dingtalk.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/dingding/demo1.js"></script>
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
    </div>
    <ul class="mui-table-view">
        <li class="mui-table-view-cell">
            <p>资产编号:123456</p>
        </li>
        <li class="mui-table-view-cell">
            <p id="r_saoma">扫码结果</p>
            <button type="button" id="saoma" class="mui-btn mui-btn-primary">
                扫码
            </button>
        </li>
        <li class="mui-table-view-cell">
            <img class="mui-media-object" id="assertImage" src="${pageContext.request.contextPath}/image/avatar.png">
            <button type="button" id="pai" class="mui-btn mui-btn-primary">
                拍照
            </button>
        </li>
        <li class="mui-table-view-cell">
            <p id="ll">经纬度</p>
        </li>
        <li class="mui-table-view-cell">
            <p>大致位置：白马湖5楼</p>
        </li>
        <li class="mui-table-view-cell">
            <div class="mui-input-row" style="margin: 10px 5px;">
                <textarea id="textarea" rows="5" placeholder="备注:"></textarea>
            </div>
        </li>
    </ul>

        <div class="mui-content-padded" >
            <button id='queren' class="mui-btn mui-btn-block mui-btn-primary">确认</button>
        </div>


</div>
<script>
    $('#queren').click(function(){
        window.location.href="${pageContext.request.contextPath}/dingdinglogin/test1";
    });
    $('#saoma').click(function(){
        click_sao();
    });
    $('#pai').click(function(){
        click_pai();
    });
</script>

</body>
</html>
