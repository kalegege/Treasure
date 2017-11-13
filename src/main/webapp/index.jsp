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
    <meta http-equiv=Content-Type content="text/html;charset=utf-8">
    <title>首页</title>
    <script type="text/javascript">

        //在此拿到jsAPI权限验证配置所需要的信息
        var _config = <%= com.wasu.dingding.AuthHelper.getConfig(request) %>;
    </script>
    <script type="text/javascript" src="${ctx}/js/dingding/zepto.min.js"></script>
    <%--<script type="text/javascript" src="${ctx}/js/jquery-2.0.3.min.js"></script>--%>
    <script type="text/javascript" src="${ctx}/js/dingding/dingtalk.js"></script>
    <script type="text/javascript" src="${ctx}/js/dingding/demo.js"></script>
</head>
<body>
<script >
    window.addEventListener('load', function() {
        setTimeout(function(){
        }, 500);
    });
</script>
</body>
</html>
