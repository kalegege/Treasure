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
					'biz.util.uploadImage','device.geolocation.get','biz.contact.choose']
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

    dd.device.geolocation.get({
        targetAccuracy : 200,
        coordinate : 1,
        withReGeocode : false,
        useCache:false, //默认是true，如果需要频繁获取地理位置，请设置false
        onSuccess : function(result) {
        	// alert(result);
			var latitude=result.latitude;
			var longitude=result.longitude;
			$('#ll').text("经纬度:"+latitude+","+longitude);
            /* 高德坐标 result 结构
            {
                longitude : Number,
                latitude : Number,
                accuracy : Number,
                address : String,
                province : String,
                city : String,
                district : String,
                road : String,
                netType : String,
                operatorType : String,
                errorMessage : String,
                errorCode : Number,
                isWifiEnabled : Boolean,
                isGpsEnabled : Boolean,
                isFromMock : Boolean,
                provider : wifi|lbs|gps,
                accuracy : Number,
                isMobileEnabled : Boolean
            }
            */
        },
        onFail : function(err) {
			alert("error"+err);
		}
    });
});

dd.error(function(err) {
	alert('dd error: ' + JSON.stringify(err));
});
