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
					'biz.util.uploadImage','device.geolocation.get','biz.contact.choose','biz.customContact.choose',
					'runtime.permission.requestOperateAuthCode']
		});


dd.ready(function() {

    dd.biz.navigation.setRight({
        show: true,//控制按钮显示， true 显示， false 隐藏， 默认true
        control: true,//是否控制点击事件，true 控制，false 不控制， 默认false
        text: '扫码',//控制显示文本，空字符串表示显示默认文本
        onSuccess : function(result) {

            dd.biz.util.scan({
                type: "all" , // type 为 all、qrCode、barCode，默认是all。
                onSuccess: function(data) {
                    // alert("扫码成功"+data.text);
                    // alert(data.text);
                    var code=data.text;

                    $.ajax({
                        url : '/treasure/dingdinglogin/assertInfo?code=' + code,
                        type : 'GET',
                        contentType:"application/x-www-form-urlencoded;charset=utf-8",
                        success : function(data) {
                            // alert(data);
                            var info = JSON.parse(data);
                            var message,state,pId,pName,deptname,place;
                            if(info.isSuccess == '1'){
                                var item=JSON.parse(info.item);
                                if(item == null){
                                    alert("查无此资产!");
                                    return false;
                                }
                                if(item.state == 1){
                                    state="使用中";
                                }else if(item.state == 2){
                                    state="借用中";
                                }else if(item.state == 3){
                                    state="维修中";
                                }else if(item.state == 4){
                                    state="库存";
                                }else if(item.state == 5){
                                    state="报废";
                                }else if(item.state == 6){
                                    state="闲置";
                                }
								pId=item.projectid == undefined?"":item.projectid;
                                pName=item.projectname == undefined?"":item.projectname;
                                deptname=item.deptname == undefined?"":item.deptname;
                                place=item.place == undefined?"":item.place;
                                message="资产编号:" + item.assetcode +
                                    "\n资产名称:" + item.name +
                                    "\n状态:" + state +
                                    "\n部门:" + deptname +
                                    "\n归属人:" + place +
                                    "\n项目编号:" + pId +
                                    "\n项目名称:" +pName;
                            }else{
                                message="查无此资产";
                            }

                            dd.device.notification.alert({
                                message: message,
                                title: "资产详情",//可传空
                                buttonName: "确认",
                                onSuccess : function() {
                                    //onSuccess将在点击button之后回调
                                    /*回调*/
                                },
                                onFail : function(err) {}
                            });

                        },
                        error : function(xhr, errorType, error) {
                            alert("获取资产信息出错");
                        }
                    });

                },
                onFail : function(err) {
                    alert("扫码失败");
                }
            })
            //如果control为true，则onSuccess将在发生按钮点击事件被回调
            /*
            {}
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
