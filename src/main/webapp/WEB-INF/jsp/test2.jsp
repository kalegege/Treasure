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
        <input type="hidden" value="${userid}" id="userid"/>
        <input type="hidden" value="${id}" id="id"/>
    </div>
    <ul class="mui-table-view">
        <li class="mui-table-view-cell">
            <p id="assetcode">资产编号:${assetcode}</p>
        </li>
        <li class="mui-table-view-cell">
            <p id="r_saoma">扫码结果</p>
            <button type="button" id="saoma" class="mui-btn mui-btn-primary">
                扫码
            </button>
        </li>
        <li class="mui-table-view-cell">
            <div id="imageBox" style="height: 43px;">
                <img class="mui-media-object" id="assertImage" style="display: none;" src="${pageContext.request.contextPath}/image/avatar.png">
            </div>
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
                <textarea id="textarea" rows="5" placeholder="盘点备注:"></textarea>
            </div>
        </li>
    </ul>

        <div class="mui-content-padded" >
            <button id='queren' class="mui-btn mui-btn-block mui-btn-primary">确认</button>
        </div>


</div>
<script>
    $('#queren').click(function(){
//        alert("text");
        var assetcode=$('#assetcode').text().split(":")[1];
        var saoma=$('#r_saoma').text().split(":")[1];
        var ll=$('#ll').text().split(":")[1];
        var la=ll.split(",")[0];
        var lo=ll.split(",")[1];
        var mess=$('#textarea').val();
        var image=$('#assertImage')[0].src;
        var iList=image.split("/");

        if(iList[iList.length-1] == "avatar.png"){
            alert("请上传资产照片!");
            return false;
        }

        if((saoma != null)&&(saoma != assetcode)){
            alert("扫码结果和资产编码不一致，请重新扫码！");
            $('#r_saoma').text("扫码结果:");
        }else{
            window.location.href="${pageContext.request.contextPath}/dingdinglogin/update?userid=${userid}&id=${id}&assetcode="+
                    assetcode+"&saoma="+saoma+"&la="+la+"&lo="+lo+"&mess="+mess+"&image=" +image;
        }
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
