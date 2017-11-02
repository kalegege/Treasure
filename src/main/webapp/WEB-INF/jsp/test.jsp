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
    <link rel="stylesheet" href="${ctx}/css/mystyle.css" type="text/css"/>
    <script type="text/javascript" src="${ctx}/js/my.js"></script>
    <script type="text/javascript" src="${ctx}/js/jquery-2.0.3.min.js"></script>
</head>
<body>
<div>
    <img src="${ctx}/image/head.jpg" style="width:100%"  alt="大标题" />
    <input type="hidden" value="${ctx}" id="head"/>
</div>
<div>
    <button class="ltitle" onclick="self();">个人资产</button>
    <button class="rtitle" onclick="self();">部门资产</button>
</div>
<div>
    <table class="mytable">
        <tr>
            <td width="40%">资产名称</td>
            <td width="40%">资产价格</td>
            <td width="20%">详情</td>
        </tr>
        <tr>
            <td >笔记本电脑</td>
            <td >1000元</td>
            <td ><button href="${ctx}/dingdinglogin/test1" >详情</button></td>
        </tr>
        <tr>
            <td>台式电脑</td>
            <td>2000元</td>
            <td><button onclick="">详情</button></td>
        </tr>
    </table>
</div>

</body>
</html>
