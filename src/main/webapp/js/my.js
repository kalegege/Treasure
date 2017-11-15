function click_sao() {
    //type为qrCode(二维码)、barCode(条形码)、all(全部)。默认all，如果有qrCode、barCode扫描不出来，请修改type为all
    dd.biz.util.scan({
        type: "all" , // type 为 all、qrCode、barCode，默认是all。
        onSuccess: function(data) {
            alert("扫码成功"+data.text);
            var text=$('#r_saoma').text()+":"+data.text;
            $('#r_saoma').text(text);
            //onSuccess将在扫码成功之后回调
            /* data结构
              { 'text': String}
            */
        },
        onFail : function(err) {
            alert("扫码失败"+err);
        }
    })
}
function click_pai() {

    //拍照接口
    dd.biz.util.uploadImageFromCamera({
        compression: true,
        onSuccess: function (info) {
            // var url=JSON.stringify(info);
            // alert(url);
            $('#assertImage').attr('src',info[0]);
        },
        onFail: function (err) {
            alert("camera fail:"+JSON.stringify(err));
        }
    });
}

function click_pai1(){
    dd.biz.util.uploadImage({
        compression:true,//(是否压缩，默认为true)
        multiple: false, //是否多选，默认false
        max: 3, //最多可选个数
        quality: 50, // 图片压缩质量,
        resize: 50, // 图片缩放率
        stickers: {   // 水印信息
            time: "08:35",
            dateWeather: "2016.05.06 周六·晴转多云 16℃",
            username: "王晓",
            address: "西湖·杭州"
        },
        onSuccess : function(result) {
            //onSuccess将在图片上传成功之后调用
            /*
            [
              'http://gtms03.alicdn.com/tps/i3/TB1VF6uGFXXXXalaXXXmh5R_VXX-237-236.png'
            ]
            */
        },
        onFail : function(err) {}
    })
}

function click_geo() {
    dd.device.geolocation.get({
        targetAccuracy : 200,
        coordinate : 1,
        withReGeocode : false,
        useCache:false, //默认是true，如果需要频繁获取地理位置，请设置false
        onSuccess : function(result) {
            alert(result);
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
            alert("error");
            alert("error:"+err);
        }
    });
}

function click_pai2() {
    dd.biz.util.uploadAttachment({
        image:{multiple:true,compress:false,max:9,spaceId: "12345"},
        space:{corpId:"xxx3020",spaceId:"12345",isCopy:1 , max:9},
        file:{spaceId:"12345",max:1},
        types:["photo","camera","file","space"],
        onSuccess : function(result) {
            //onSuccess将在文件上传成功之后调用
            /*
             {
             type:'', // 用户选择了哪种文件类型 ，image（图片）、file（手机文件）、space（钉盘文件）
             data: [
             {
             spaceId: "232323",
             fileId: "DzzzzzzNqZY",
             fileName: "审批流程.docx",
             fileSize: 1024,
             fileType: "docx"
             },
             {
             spaceId: "232323",
             fileId: "DzzzzzzNqZY",
             fileName: "审批流程1.pdf",
             fileSize: 1024,
             fileType: "pdf"
             },
             {
             spaceId: "232323",
             fileId: "DzzzzzzNqZY",
             fileName: "审批流程3.pptx",
             fileSize: 1024,
             fileType: "pptx"
             }
             ]

             }
             */
        },
        onFail : function(err) {}
    });
}
