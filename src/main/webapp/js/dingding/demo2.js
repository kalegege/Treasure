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
			type:0,
			jsApiList : [ 'runtime.info', 'biz.contact.choose',
					'device.notification.confirm', 'device.notification.alert',
					'device.notification.prompt', 'biz.ding.post',
					'biz.util.openLink','biz.util.scan','biz.user.get',
					'biz.util.uploadImage','device.geolocation.get','biz.contact.choose','biz.customContact.choose',
					'runtime.permission.requestOperateAuthCode']
		});


dd.ready(function() {
    dd.biz.navigation.setRight({
        show: false,//控制按钮显示， true 显示， false 隐藏， 默认true
        control: true,//是否控制点击事件，true 控制，false 不控制， 默认false
        text: '',//控制显示文本，空字符串表示显示默认文本
        onSuccess : function(result) {
            //如果control为true，则onSuccess将在发生按钮点击事件被回调
            /*
            {}
            */
        },
        onFail : function(err) {
            alert("error"+err);
        }
    });

    dd.biz.navigation.setTitle({
		title:'资产详情2',
		onSuccess:function (result) {
			
        },
		onFail:function (err) {
			
        }
	})
});

dd.error(function(err) {
	alert('dd error: ' + JSON.stringify(err));
});
