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
    <title>Title</title>
    // 免登相关代码
    <script type="text/javascript" src="${ctx}/js/jquery-2.0.3.min.js"></script>
    <%--<script type="text/javascript" src="${ctx}/js/dingding/demo.js"></script>--%>
    <%--<script type="text/javascript" src="${ctx}/js/dingding/dingtalk.js"></script>--%>
</head>
<body>
<script >
    window.location = '${ctx}/dingdinglogin/test';
</script>
</body>
</html>
