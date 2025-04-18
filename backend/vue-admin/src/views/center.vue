<template>
  <div :style='{"color":"#666","padding":"20px 30px 30px","fontSize":"14px"}'>
    <el-form
	  :style='{"border":"1px solid #eee","padding":"30px","boxShadow":"0 0px 0px rgba(64, 158, 255, .3)","fontSize":"inherit","borderRadius":"6px","background":"#fff"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      label-width="150px"
    >  
     <el-row>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}'   v-if="flag=='huodongzhubanfang'"  label="主办方账号" prop="zhubanfangzhanghao">
          <el-input v-model="ruleForm.zhubanfangzhanghao" readonly              placeholder="主办方账号" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}'   v-if="flag=='huodongzhubanfang'"  label="主办方名称" prop="zhubanfangmingcheng">
          <el-input v-model="ruleForm.zhubanfangmingcheng"               placeholder="主办方名称" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}'   v-if="flag=='huodongzhubanfang'"  label="联系方式" prop="lianxifangshi">
          <el-input v-model="ruleForm.lianxifangshi"               placeholder="联系方式" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-if="flag=='huodongzhubanfang'" label="图片" prop="tupian">
          <file-upload
          tip="点击上传图片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.tupian?ruleForm.tupian:''"
          @change="huodongzhubanfangtupianUploadChange"
          ></file-upload>
        </el-form-item>
		<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-if="flag=='huodongzhubanfang'" label="主办方简介" prop="zhubanfangjianjie">
		  <editor
		  	style="min-width: 200px; max-width: 600px;"
			 :style='{"width":"640px","boxShadow":"0 0 0px #eee","height":"auto"}'
		  	v-model="ruleForm.zhubanfangjianjie" 
		  	class="editor" 
		  	action="file/upload">
		  </editor>
		</el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}'   v-if="flag=='zhiyuanzhe'"  label="志愿者账号" prop="zhiyuanzhezhanghao">
          <el-input v-model="ruleForm.zhiyuanzhezhanghao" readonly              placeholder="志愿者账号" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}'   v-if="flag=='zhiyuanzhe'"  label="志愿者姓名" prop="zhiyuanzhexingming">
          <el-input v-model="ruleForm.zhiyuanzhexingming"               placeholder="志愿者姓名" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-if="flag=='zhiyuanzhe'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie"  placeholder="请选择性别">
            <el-option
                v-for="(item,index) in zhiyuanzhexingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}'  v-if="flag=='zhiyuanzhe'" label="出生日期" prop="chushengriqi">
            <el-date-picker
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd"
                v-model="ruleForm.chushengriqi" 
                type="date"
                placeholder="出生日期">
            </el-date-picker> 
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}'   v-if="flag=='zhiyuanzhe'"  label="手机号码" prop="shoujihaoma">
          <el-input v-model="ruleForm.shoujihaoma"               placeholder="手机号码" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-if="flag=='zhiyuanzhe'" label="小组编号" prop="xiaozubianhao">
          <el-select  @change="zhiyuanzhexiaozubianhaoChange"  v-model="ruleForm.xiaozubianhao" placeholder="请选择小组编号">
            <el-option
                v-for="(item,index) in zhiyuanzhexiaozubianhaoOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}'   v-if="flag=='zhiyuanzhe'"  label="组长姓名" prop="zuzhangxingming">
          <el-input v-model="ruleForm.zuzhangxingming"               placeholder="组长姓名" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-if="flag=='zhiyuanzhe'" label="头像" prop="touxiang">
          <file-upload
          tip="点击上传头像"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
          @change="zhiyuanzhetouxiangUploadChange"
          ></file-upload>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}'   v-if="flag=='zhiyuanxiaozuzhang'"  label="小组编号" prop="xiaozubianhao">
          <el-input v-model="ruleForm.xiaozubianhao" readonly              placeholder="小组编号" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}'   v-if="flag=='zhiyuanxiaozuzhang'"  label="组长姓名" prop="zuzhangxingming">
          <el-input v-model="ruleForm.zuzhangxingming"               placeholder="组长姓名" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-if="flag=='zhiyuanxiaozuzhang'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie"  placeholder="请选择性别">
            <el-option
                v-for="(item,index) in zhiyuanxiaozuzhangxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}'   v-if="flag=='zhiyuanxiaozuzhang'"  label="年龄" prop="nianling">
          <el-input v-model="ruleForm.nianling"               placeholder="年龄" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}'   v-if="flag=='zhiyuanxiaozuzhang'"  label="联系电话" prop="lianxidianhua">
          <el-input v-model="ruleForm.lianxidianhua"               placeholder="联系电话" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-if="flag=='zhiyuanxiaozuzhang'" label="照片" prop="zhaopian">
          <file-upload
          tip="点击上传照片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.zhaopian?ruleForm.zhaopian:''"
          @change="zhiyuanxiaozuzhangzhaopianUploadChange"
          ></file-upload>
        </el-form-item>
		<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-if="flag=='users'" label="用户名" prop="username">
			<el-input v-model="ruleForm.username" placeholder="用户名"></el-input>
		</el-form-item>
		<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-if="flag=='users'" label="头像" prop="image">
		  <file-upload
		  tip="点击上传头像"
		  action="file/upload"
		  :limit="1"
		  :multiple="false"
		  :fileUrls="ruleForm.image?ruleForm.image:''"
		  @change="usersimageUploadChange"
		  ></file-upload>
		</el-form-item>
		<el-form-item :style='{"width":"100%","padding":"0","margin":"0","fontSize":"inherit","textAlign":"center"}'>
			<el-button class="btn3" :style='{"border":"0","cursor":"pointer","padding":"0 24px","margin":"4px","outline":"none","color":"#fff","borderRadius":"4px","background":"rgba(86,178,198,.8)","clipPath":"polygon(0% 0%, 95% 0, 100% 50%, 95% 100%, 0% 100%)","width":"auto","fontSize":"inherit","height":"40px"}' type="primary" @click="onUpdateHandler">
				<span class="icon iconfont icon-dagou" :style='{"margin":"0 2px","fontSize":"inherit","color":"#fff","height":"40px"}'></span>
				保存
			</el-button>
		</el-form-item>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
      zhiyuanzhexingbieOptions: [],
      zhiyuanzhexiaozubianhaoOptions: [],
      zhiyuanxiaozuzhangxingbieOptions: [],
    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.zhiyuanzhexingbieOptions = "男,女".split(',')
    this.$http({
      url: `option/zhiyuanxiaozuzhang/xiaozubianhao`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.zhiyuanzhexiaozubianhaoOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.zhiyuanxiaozuzhangxingbieOptions = "男,女".split(',')
  },
  methods: {
    // 下二随
    zhiyuanzhexiaozubianhaoChange () {
      this.$http({
        url: `follow/zhiyuanxiaozuzhang/xiaozubianhao?columnValue=`+ this.ruleForm.xiaozubianhao,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
              if(data.data.zuzhangxingming){
                this.ruleForm.zuzhangxingming = data.data.zuzhangxingming
              }
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    huodongzhubanfangtupianUploadChange(fileUrls) {
        this.ruleForm.tupian = fileUrls;
    },
    zhiyuanzhetouxiangUploadChange(fileUrls) {
        this.ruleForm.touxiang = fileUrls;
    },
    zhiyuanxiaozuzhangzhaopianUploadChange(fileUrls) {
        this.ruleForm.zhaopian = fileUrls;
    },
	usersimageUploadChange(fileUrls) {
		this.ruleForm.image = fileUrls;
	},
    onUpdateHandler() {
      if((!this.ruleForm.zhubanfangzhanghao)&& 'huodongzhubanfang'==this.flag){
        this.$message.error('主办方账号不能为空');
        return
      }


      if((!this.ruleForm.mima)&& 'huodongzhubanfang'==this.flag){
        this.$message.error('密码不能为空');
        return
      }


      if((!this.ruleForm.zhubanfangmingcheng)&& 'huodongzhubanfang'==this.flag){
        this.$message.error('主办方名称不能为空');
        return
      }




      if( 'huodongzhubanfang' ==this.flag && this.ruleForm.lianxifangshi&&(!isMobile(this.ruleForm.lianxifangshi))){
        this.$message.error(`联系方式应输入手机格式`);
        return
      }


        if(this.ruleForm.tupian!=null) {
                this.ruleForm.tupian = this.ruleForm.tupian.replace(new RegExp(this.$base.url,"g"),"");
        }


      if((!this.ruleForm.zhiyuanzhezhanghao)&& 'zhiyuanzhe'==this.flag){
        this.$message.error('志愿者账号不能为空');
        return
      }


      if((!this.ruleForm.mima)&& 'zhiyuanzhe'==this.flag){
        this.$message.error('密码不能为空');
        return
      }


      if((!this.ruleForm.zhiyuanzhexingming)&& 'zhiyuanzhe'==this.flag){
        this.$message.error('志愿者姓名不能为空');
        return
      }








      if( 'zhiyuanzhe' ==this.flag && this.ruleForm.shoujihaoma&&(!isMobile(this.ruleForm.shoujihaoma))){
        this.$message.error(`手机号码应输入手机格式`);
        return
      }






        if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
        }
      if((!this.ruleForm.xiaozubianhao)&& 'zhiyuanxiaozuzhang'==this.flag){
        this.$message.error('小组编号不能为空');
        return
      }


      if((!this.ruleForm.mima)&& 'zhiyuanxiaozuzhang'==this.flag){
        this.$message.error('密码不能为空');
        return
      }


      if((!this.ruleForm.zuzhangxingming)&& 'zhiyuanxiaozuzhang'==this.flag){
        this.$message.error('组长姓名不能为空');
        return
      }






      if( 'zhiyuanxiaozuzhang' ==this.flag && this.ruleForm.nianling&&(!isIntNumer(this.ruleForm.nianling))){
       this.$message.error(`年龄应输入整数`);
        return
      }


      if( 'zhiyuanxiaozuzhang' ==this.flag && this.ruleForm.lianxidianhua&&(!isMobile(this.ruleForm.lianxidianhua))){
        this.$message.error(`联系电话应输入手机格式`);
        return
      }


        if(this.ruleForm.zhaopian!=null) {
                this.ruleForm.zhaopian = this.ruleForm.zhaopian.replace(new RegExp(this.$base.url,"g"),"");
        }
      if('users'==this.flag && this.ruleForm.username.trim().length<1) {
	this.$message.error(`用户名不能为空`);
        return	
      }
	  if(this.flag=='users'){
	  	this.ruleForm.image = this.ruleForm.image.replace(new RegExp(this.$base.url,"g"),"")
	  }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
				if(this.flag=='users'){
					this.$storage.set('headportrait',this.ruleForm.image)
				}
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  color: inherit;
	  	  font-weight: 500;
	  	  display: inline-block;
	  	  width: 150px;
	  	  font-size: inherit;
	  	  line-height: 40px;
	  	  text-align: right;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 150px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  border: 0;
	  	  border-radius: 0px;
	  	  padding: 0 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  clip-path: polygon(98% 0, 100% 50%, 98% 99%, 0% 100%, 0% 0%);
	  	  color: inherit;
	  	  background: rgba(86,178,198,.2);
	  	  width: 400px;
	  	  font-size: inherit;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  border: 0;
	  	  border-radius: 0px;
	  	  padding: 0 10px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  clip-path: polygon(96% 0, 100% 50%, 96% 99%, 0% 100%, 0% 0%);
	  	  color: inherit;
	  	  background: rgba(86,178,198,.2);
	  	  width: 200px;
	  	  font-size: inherit;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  border: 0;
	  	  border-radius: 0px;
	  	  padding: 0 10px 0 30px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  clip-path: polygon(96% 0, 100% 50%, 96% 99%, 0% 100%, 0% 0%);
	  	  color: inherit;
	  	  background: rgba(86,178,198,.2);
	  	  width: 200px;
	  	  font-size: inherit;
	  	  height: 40px;
	  	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  border: 0px solid rgba(230, 230, 230, 1);
	  	  cursor: pointer;
	  	  border-radius: 0px;
	  	  clip-path: polygon(96% 0, 100% 50%, 96% 99%, 0% 100%, 0% 0%);
	  	  color: inherit;
	  	  background: rgba(86,178,198,.2);
	  	  object-fit: cover;
	  	  width: 180px;
	  	  font-size: 32px;
	  	  line-height: 80px;
	  	  text-align: center;
	  	  height: 80px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  border: 0px solid rgba(230, 230, 230, 1);
	  	  cursor: pointer;
	  	  border-radius: 0px;
	  	  clip-path: polygon(96% 0, 100% 50%, 96% 99%, 0% 100%, 0% 0%);
	  	  color: inherit;
	  	  background: rgba(86,178,198,.2);
	  	  object-fit: cover;
	  	  width: 180px;
	  	  font-size: 32px;
	  	  line-height: 80px;
	  	  text-align: center;
	  	  height: 80px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  border: 0;
	  	  border-radius: 0px;
	  	  padding: 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  clip-path: polygon(96% 0, 100% 50%, 96% 99%, 0% 100%, 0% 0%);
	  	  color: inherit;
	  	  background: rgba(86,178,198,.2);
	  	  width: 500px;
	  	  font-size: inherit;
	  	  height: 120px;
	  	}
	
	.add-update-preview .btn3 {
				border: 0;
				cursor: pointer;
				border-radius: 4px;
				padding: 0 24px;
				margin: 4px;
				outline: none;
				clip-path: polygon(0% 0%, 95% 0, 100% 50%, 95% 100%, 0% 100%);
				color: #fff;
				background: rgba(86,178,198,.8);
				width: auto;
				font-size: inherit;
				height: 40px;
			}
	
	.add-update-preview .btn3:hover {
				opacity: 0.8;
			}
	
	.editor>.avatar-uploader {
		line-height: 0;
		height: 0;
	}
</style>
