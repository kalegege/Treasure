function click_sao() {
    //type为qrCode(二维码)、barCode(条形码)、all(全部)。默认all，如果有qrCode、barCode扫描不出来，请修改type为all
    dd.biz.util.scan({
        type: "all" , // type 为 all、qrCode、barCode，默认是all。
        onSuccess: function(data) {
            // alert("扫码成功"+data.text);
            var text="扫码结果:"+data.text;
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
            $('#assertImage').attr('style',"display:block");
            // $('#imageBox').empty();
            // $('#imageBox').append("<img class=\"mui-media-object\" id=\"assertImage\" src="+info[0]+">");
        },
        onFail: function (err) {
            alert("camera fail:"+JSON.stringify(err));
        }
    });
}

function jumpa(index) {
    var ids="#a"+index;
    window.location.href=$(ids).val();
}
function jumpb(id) {
    var ids="#b"+id;
    window.location.href=$(ids).val();
}
function jumpc(id) {
    var ids="#c"+id;
    window.location.href=$(ids).val();
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

function click_dept() {
    dd.biz.contact.choose({
        startWithDepartmentId: -1, //-1表示打开的通讯录从自己所在部门开始展示, 0表示从企业最上层开始，(其他数字表示从该部门开始:暂时不支持)
        multiple: false, //是否多选： true多选 false单选； 默认true
        users: [], //默认选中的用户列表，userid；成功回调中应包含该信息
        disabledUsers:[],// 不能选中的用户列表，员工userid
        corpId: "ding00fa2f34238dfc1d", //企业id
        max: Number, //人数限制，当multiple为true才生效，可选范围1-1500
        limitTips:"请指定一个人", //超过人数限制的提示语可以用这个字段自定义
        isNeedSearch:true, // 是否需要搜索功能
        onSuccess: function(data) {

        //onSuccess将在选人结束，点击确定按钮的时候被回调
        /* data结构
         [{
         "name": "张三", //姓名
         "avatar": "http://g.alicdn.com/avatar/zhangsan.png" //头像图片url，可能为空
         "emplId": '0573', //userid
         },
         ...
         ]
         */
    },
    onFail : function(err) {}
});
}

function click_dept1() {
    var ids=$('#members').val();
    var users=ids.substring(1,ids.length-2).split(", ");
    dd.biz.customContact.choose({
        title: '请选择盘点人员', //标题
        users: users,//一组员工userid
        corpId: 'ding00fa2f34238dfc1d',//加密的企业 ID，
        isShowCompanyName: true,   //true|false，默认为 false
        onSuccess: function(data) {
            var userid=data[0].emplId;
            // alert(userid);
            //获取免登录授权码
            dd.runtime.permission.requestOperateAuthCode({
                corpId: "ding00fa2f34238dfc1d",
                agentId:"134027113",
                onSuccess: function(result) {
                    // alert(result.code);
                    window.location.href="/treasure/dingdinglogin/send?code="+result.code+"&destid="+userid+"&id="+$('#id').val()+"&userid="+$('#userid').val();
                    /*{
                        code: 'hYLK98jkf0m' //string authCode
                    }*/
                },
                onFail : function(err) {
                    alert("error:"+err);
                }

            });
        /* data结构
          [{
            "name": "张三", //姓名
            "avatar": "http://g.alicdn.com/avatar/zhangsan.png" //头像图片url，可能为空
            "emplId": '0573', //userid，[<font color=red>获取成员详情接口</font>](https://open-doc.dingtalk.com/docs/doc.htm?spm=a219a.7629140.0.0.DHPTF8&treeId=385&articleId=106816&docType=1#s1)

           },
           ...
          ]
        */
    },
    onFail : function(err) {
            alert("cuowu:"+err);
    }
});
}

function test() {
    $.ajax({
        url : '/treasure/dingdinglogin/assertInfo?code=1',
        type : 'GET',
        contentType:"application/x-www-form-urlencoded;charset=utf-8",
        success : function(data) {
            alert(data);
        },
        error : function(xhr, errorType, error) {
            alert(errorType + ', ' + error);
        }
    });
}
