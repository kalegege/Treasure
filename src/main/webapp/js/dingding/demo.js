/**
 * Created by liqiao on 8/10/15.
 */

/**
 * _config comes from server-side template. see views/index.jade
 */
dd.config({
			agentId : _config.agentid,
			corpId : _config.corpId,
			timeStamp : _config.timeStamp,
			nonceStr : _config.nonceStr,
			signature : _config.signature,
			type:0,
			jsApiList : [ 'runtime.info', 'biz.contact.choose',
					'device.notification.confirm', 'device.notification.alert',
					'device.notification.prompt', 'biz.ding.post',
					'biz.util.openLink','biz.util.scan','biz.util.uploadImageFromCamera','biz.user.get',
					'biz.util.uploadImage','device.geolocation.get','biz.util.uploadAttachment']
		});


dd.ready(function() {

	dd.runtime.permission.requestAuthCode({
		corpId : _config.corpId,
		onSuccess : function(info) {
//			alert('authcode: ' + info.code);
			$.ajax({
				url : '/treasure/dingdinglogin/userInfo?code=' + info.code + '&corpid='
                + _config.corpId,
				type : 'GET',
				success : function(data, status, xhr) {
				    // alert(data);
					var info = JSON.parse(data);
					var user=JSON.parse(info.user);
					var url;
					if(info.isSuccess == '1'){
                        window.location.href = "/treasure/dingdinglogin/test?userid="+user.userid;
					}else{
                        window.location.href = "/treasure/html/error/error.jsp";
					}
					// dd.biz.util.openLink({
					// 	url: url,//要打开链接的地址
					// 	onSuccess : function(result) {
					// 		/**/
					// 	},
					// 	onFail : function(err) {}
					// })

				},
				error : function(xhr, errorType, error) {
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
