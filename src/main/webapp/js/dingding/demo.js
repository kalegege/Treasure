/**
 * Created by liqiao on 8/10/15.
 */

/**
 * _config comes from server-side template. see views/index.jade
 */
dd.config({
			agentId : agentid,
			corpId : corpId,
			timeStamp : timeStamp,
			nonceStr : nonceStr,
			signature : signature,
			jsApiList : [ 'runtime.info', 'biz.contact.choose',
					'device.notification.confirm', 'device.notification.alert',
					'device.notification.prompt', 'biz.ding.post',
					'biz.util.openLink' ]
		});


dd.ready(function() {
	dd.runtime.permission.requestAuthCode({
		corpId : corpId,
		onSuccess : function(info) {
//			alert('authcode: ' + info.code);
			$.ajax({
				url : 'userInfo',
				type : 'GET',
				data:{
					"corpId":corpId,
					"code":info.code
				},
				success : function(data, status, xhr) {
				    // alert(data);
					var info = JSON.parse(data);
					if(info.isok == '1'){
						//正确跳转首页
						window.location.href=url_page+"/html/dingdingcache.jsp";
					}else{
                        window.location.href=url_page+"/html/error/error.jsp";
					}

				},
				error : function(xhr, errorType, error) {
					logger.e("yinyien:" + _config.corpId);
					alert(errorType + ', ' + error);
				}
			});

		},
		onFail : function(err) {
			alert('fail: ' + JSON.stringify(err));
		}
	});
});

dd.error(function(err) {
	alert('dd error: ' + JSON.stringify(err));
});