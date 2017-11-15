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
					'biz.util.openLink','biz.util.scan','biz.util.uploadImageFromCamera','biz.user.get',
					'biz.util.uploadImage','device.geolocation.get']
		});


dd.ready(function() {

	dd.biz.util.uploadImage({
		compression:true,//(是否压缩，默认为true)
		onSuccess : function(result) {
			alert("ok");
			//onSuccess将在图片上传成功之后调用
			/*
			 [
			 'http://gtms03.alicdn.com/tps/i3/TB1VF6uGFXXXXalaXXXmh5R_VXX-237-236.png'
			 ]
			 */
		},
		onFail : function(err) {
			alert("error");
		}
	});

    // dd.device.geolocation.get({
    //     targetAccuracy : 200,
    //     coordinate : 1,
    //     withReGeocode : false,
    //     useCache:false, //默认是true，如果需要频繁获取地理位置，请设置false
    //     onSuccess : function(result) {
    //     	alert(result);
    //         /* 高德坐标 result 结构
    //         {
    //             longitude : Number,
    //             latitude : Number,
    //             accuracy : Number,
    //             address : String,
    //             province : String,
    //             city : String,
    //             district : String,
    //             road : String,
    //             netType : String,
    //             operatorType : String,
    //             errorMessage : String,
    //             errorCode : Number,
    //             isWifiEnabled : Boolean,
    //             isGpsEnabled : Boolean,
    //             isFromMock : Boolean,
    //             provider : wifi|lbs|gps,
    //             accuracy : Number,
    //             isMobileEnabled : Boolean
    //         }
    //         */
    //     },
    //     onFail : function(err) {}
    // });
});

dd.error(function(err) {
	alert('dd error: ' + JSON.stringify(err));
});
