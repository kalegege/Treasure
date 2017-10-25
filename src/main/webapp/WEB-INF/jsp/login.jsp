<%--
  Created by IntelliJ IDEA.
  User: kale
  Date: 2017/10/24
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ace/ace.min.css" type="text/css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ace/bootstrap.min.css" type="text/css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ace/font-awesome.min.css" type="text/css"/>

    <link type="text/javascript" href="${pageContext.request.contextPath}/js/jquery-3.2.1.js"/>
    <link type="text/javascript" href="${pageContext.request.contextPath}/js/bootstrap.min.js"/>
    <link type="text/javascript" href="${pageContext.request.contextPath}/js/typeahead-bs2.min.js"/>
    <link type="text/javascript" href="${pageContext.request.contextPath}/js/ace-elements.min.js"/>
    <link type="text/javascript" href="${pageContext.request.contextPath}/js/ace.min.js"/>

</head>
<body class="login-layout">
<div class="main-container">
    <div class="main-content">
        <div class="row">
            <div class="col-sm-10 col-sm-offset-1">
                <div class="login-container">
                    <div class="center">
                        <h1>
                            <i class="icon-leaf green"></i>
                            <span class="red"></span>
                            <span class="white">资产管理支撑系统</span>
                        </h1>
                        <h4 class="blue">wasu</h4>
                    </div>

                    <div class="space-6"></div>

                    <div class="position-relative">
                        <div id="login-box" class="login-box visible widget-box no-border">
                            <div class="widget-body">
                                <div class="toolbar clearfix">
                                    <%--<div>忘记密码</div>--%>
                                    <%--<div>注册</div>--%>
                                </div>
                                <div class="widget-main">
                                    <h4 class="header blue lighter bigger">
                                        <i class="icon-coffee green"></i>
                                        请输入用户名和密码
                                    </h4>

                                    <div class="space-6"></div>

                                    <form action="<%=basePath%>login" method="post">
                                        <fieldset>
                                            <label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="text" class="form-control" name="userId"
                                                                   placeholder="用户名"/>
															<i class="icon-user"></i>
														</span>
                                            </label>

                                            <label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" name="passwd" class="form-control"
                                                                   placeholder="密码"/>
															<i class="icon-lock"></i>
														</span>
                                            </label>

                                            <div class="space"></div>

                                            <div class="clearfix">
                                                <label class="inline">
                                                    <input type="checkbox" style="display:none"/>
                                                    <span class="lbl"> </span>
                                                </label>

                                                <button type="submit"
                                                        class="width-35 pull-right btn btn-sm btn-primary">
                                                    <i class="icon-key"></i>
                                                    登陆
                                                </button>
                                            </div>

                                            <div class="space-4"></div>
                                        </fieldset>
                                    </form>
                                </div>
                                <div class="toolbar clearfix">
                                    <%--<div>忘记密码</div>--%>
                                    <%--<div>注册</div>--%>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>
    <%--</div>--%>

</body>
</html>
