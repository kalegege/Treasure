<%--
  Created by IntelliJ IDEA.
  User: kale
  Date: 2017/10/26
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>

    <meta http-equiv=Content-Type content="text/html;charset=utf-8">
    <title>首页</title>
    <script type="text/javascript">
        var agentid='${conf.agentid}';
        var corpId='${conf.corpId}';
        var timeStamp='${conf.timeStamp}';
        var nonceStr='${conf.nonceStr}';
        var signature='${conf.signature}';
        <%--var url_db='${url_db}';--%>
        var url_page='${ctx}';
    </script>
    <script type="text/javascript" src="${ctx}/js/jquery-2.0.3.min.js"></script>
    <script type="text/javascript" src="${ctx}/js/dingding/demo.js"></script>
    <script type="text/javascript" src="${ctx}/js/dingding/dingtalk.js"></script>

</head>
<body>
我是正文
</body>
</html>
