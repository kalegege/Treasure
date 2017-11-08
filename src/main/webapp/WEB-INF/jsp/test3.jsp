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
    <meta charset="utf-8">
    <title>首页</title>
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
    <nav class="mui-bar mui-bar-tab">
        <a class="mui-tab-item mui-active" href="#tabbar">
            <span class="mui-icon mui-icon-home"></span>
            <span class="mui-tab-label">个人资产</span>
        </a>
        <a class="mui-tab-item" href="#tabbar-with-chat">
            <span class="mui-icon mui-icon-email"><span class="mui-badge">2</span></span>
            <span class="mui-tab-label">未盘点</span>
        </a>
    </nav>
    <div class="mui-content">
        <div id="tabbar" class="mui-control-content mui-active">
            <ul class="mui-table-view mui-table-view-striped mui-table-view-condensed">
                <li class="mui-table-view-cell">
                    <div class="mui-table">
                        <div class="mui-table-cell mui-col-xs-10">
                            <h4 class="mui-ellipsis">笔记本电脑</h4>
                            <h5>申请人：黄渤</h5>
                            <p class="mui-h6 mui-ellipsis">白马湖D座5楼</p>
                        </div>
                        <div class="mui-table-cell mui-col-xs-2 mui-text-right">
                            <span class="mui-h5">12:25</span>
                        </div>
                    </div>
                </li>
                <li class="mui-table-view-cell">
                    <a href="${pageContext.request.contextPath}/dingdinglogin/test1">
                        <div class="mui-table">
                            <div class="mui-table-cell mui-col-xs-10">
                                <h4 class="mui-ellipsis-2">台式电脑</h4>
                                <h5>申请人：刘德华</h5>
                                <p class="mui-h6 mui-ellipsis">华数机房2-1-11</p>
                            </div>
                            <div class="mui-table-cell mui-col-xs-2 mui-text-right">
                                <span class="mui-h5">14:36</span>

                            </div>
                        </div>
                    </a>
                </li>
            </ul>
        </div>
        <div id="tabbar-with-chat" class="mui-control-content">
            <ul class="mui-table-view mui-table-view-striped mui-table-view-condensed">
                <li class="mui-table-view-cell">
                    <div class="mui-table">
                        <div class="mui-table-cell mui-col-xs-10">
                            <h4 class="mui-ellipsis">笔记本电脑</h4>
                            <h5>申请人：李四</h5>
                            <p class="mui-h6 mui-ellipsis">白马湖A座5楼</p>
                        </div>
                        <div class="mui-table-cell mui-col-xs-2 mui-text-right">
                            <span class="mui-h5">12:25</span>
                        </div>
                    </div>
                </li>
                <li class="mui-table-view-cell">
                    <a href="${pageContext.request.contextPath}/dingdinglogin/test1">
                        <div class="mui-table">
                            <div class="mui-table-cell mui-col-xs-10">
                                <h4 class="mui-ellipsis-2">交换机</h4>
                                <h5>申请人：项目经理</h5>
                                <p class="mui-h6 mui-ellipsis">马鞍山机房</p>
                            </div>
                            <div class="mui-table-cell mui-col-xs-2 mui-text-right">
                                <span class="mui-h5">13:25</span>

                            </div>
                        </div>
                    </a>
                </li>
            </ul>
        </div>

    </div>
</div>
</body>
</html>
