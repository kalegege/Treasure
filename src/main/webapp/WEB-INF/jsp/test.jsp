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

<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.dataTables.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/mystyle.css" type="text/css" charset="utf-8"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.dataTables.css" type="text/css"/>

</head>
<body>
    ${result}
    <div>
        <table id="table">
            <thead>
            <tr>
                <th>id</th>
                <th>姓名</th>
                <th>年龄</th>
                <th>消息</th>
                <th>电话号码</th>
                <th>修改时间</th>
                <th>创建时间</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${data}" var="p">
                <tr>
                    <td>${p.id}</td>
                    <td>${p.name}</td>
                    <td>${p.age}</td>
                    <td>${p.message}</td>
                    <td>${p.mobile}</td>
                    <td><fmt:formatDate value="${p.modDate}" type="date"/></td>
                    <td><fmt:formatDate value="${p.gmtDate}" type="date"/></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

    <script type="text/javascript">

        $(document).ready(function () {
            $('#table').DataTable({
                language: {
                    "sProcessing": "处理中...",
                    "sLengthMenu": "显示 _MENU_ 项结果",
                    "sZeroRecords": "没有匹配结果",
                    "sInfo": "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
                    "sInfoEmpty": "显示第 0 至 0 项结果，共 0 项",
                    "sInfoFiltered": "(由 _MAX_ 项结果过滤)",
                    "sInfoPostFix": "",
                    "sSearch": "搜索:",
                    "sUrl": "",
                    "sEmptyTable": "表中数据为空",
                    "sLoadingRecords": "载入中...",
                    "sInfoThousands": ",",
                    "oPaginate": {
                        "sFirst": "首页",
                        "sPrevious": "上页",
                        "sNext": "下页",
                        "sLast": "末页"
                    },
                    "oAria": {
                        "sSortAscending": ": 以升序排列此列",
                        "sSortDescending": ": 以降序排列此列"
                    }
                },
                ordering: false
            });
        });
    </script>
</body>
</html>
