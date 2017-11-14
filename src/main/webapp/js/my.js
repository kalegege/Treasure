function click_sao() {
    //type为qrCode(二维码)、barCode(条形码)、all(全部)。默认all，如果有qrCode、barCode扫描不出来，请修改type为all
    dd.biz.util.scan({
        type: "all" , // type 为 all、qrCode、barCode，默认是all。
        onSuccess: function(data) {
            alert("扫码成功"+data.text);
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

    dd.biz.util.uploadImageFromCamera({
        compression: true,//(是否压缩，默认为true)
        quality: 50, // 图片压缩质量,
        resize: 50, // 图片缩放率
        stickers: {   // 水印信息
            time: "08:35",
            dateWeather: "2016.05.06 周六·晴转多云 16℃",
            username: "王晓",
            address: "西湖·杭州"
        },
        onSuccess : function(result) {
            alert("拍照成功"+result);
            //onSuccess将在图片上传成功之后调用
            /*
            [
              'http://gtms03.alicdn.com/tps/i3/TB1VF6uGFXXXXalaXXXmh5R_VXX-237-236.png'
            ]
            */
        },
        onFail : function(err) {
            alert(err);
            alert("拍照失败"+err[0]+err[1]);
            alert(JSON.parse(err[0]));
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
