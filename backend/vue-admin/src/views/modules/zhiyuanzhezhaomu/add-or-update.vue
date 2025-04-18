<template>
	<div class="addEdit-block" :style='{"padding":"30px","fontSize":"16px","color":"#666","background":"none"}'>
		<el-form
			:style='{"border":"1px solid #eee","padding":"30px","boxShadow":"0 0px 0px rgba(64, 158, 255, .3)","fontSize":"inherit","borderRadius":"6px","background":"#fff"}'
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="150px"
		>
			<template >
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="招募名称" prop="zhaomumingcheng">
					<el-input v-model="ruleForm.zhaomumingcheng" placeholder="招募名称" clearable  :readonly="ro.zhaomumingcheng"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="招募名称" prop="zhaomumingcheng">
					<el-input v-model="ruleForm.zhaomumingcheng" placeholder="招募名称" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="upload" v-if="type!='info' && !ro.zhaomufengmian" label="招募封面" prop="zhaomufengmian">
					<file-upload
						tip="点击上传招募封面"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.zhaomufengmian?ruleForm.zhaomufengmian:''"
						@change="zhaomufengmianUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="upload" v-else-if="ruleForm.zhaomufengmian" label="招募封面" prop="zhaomufengmian">
					<img v-if="ruleForm.zhaomufengmian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.zhaomufengmian.split(',')[0]" width="100" height="100">
					<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.zhaomufengmian.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="date" v-if="type!='info'" label="招募时间" prop="zhaomushijian">
					<el-date-picker
						value-format="yyyy-MM-dd HH:mm:ss"
						v-model="ruleForm.zhaomushijian" 
						type="datetime"
						:readonly="ro.zhaomushijian"
						placeholder="招募时间"
					></el-date-picker>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-else-if="ruleForm.zhaomushijian" label="招募时间" prop="zhaomushijian">
					<el-input v-model="ruleForm.zhaomushijian" placeholder="招募时间" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="招募地点" prop="zhaomudidian">
					<el-input v-model="ruleForm.zhaomudidian" placeholder="招募地点" clearable  :readonly="ro.zhaomudidian"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="招募地点" prop="zhaomudidian">
					<el-input v-model="ruleForm.zhaomudidian" placeholder="招募地点" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="主办方账号" prop="zhubanfangzhanghao">
					<el-input v-model="ruleForm.zhubanfangzhanghao" placeholder="主办方账号" clearable  :readonly="ro.zhubanfangzhanghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="主办方账号" prop="zhubanfangzhanghao">
					<el-input v-model="ruleForm.zhubanfangzhanghao" placeholder="主办方账号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="主办方名称" prop="zhubanfangmingcheng">
					<el-input v-model="ruleForm.zhubanfangmingcheng" placeholder="主办方名称" clearable  :readonly="ro.zhubanfangmingcheng"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="主办方名称" prop="zhubanfangmingcheng">
					<el-input v-model="ruleForm.zhubanfangmingcheng" placeholder="主办方名称" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="联系方式" prop="lianxifangshi">
					<el-input v-model="ruleForm.lianxifangshi" placeholder="联系方式" clearable  :readonly="ro.lianxifangshi"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="联系方式" prop="lianxifangshi">
					<el-input v-model="ruleForm.lianxifangshi" placeholder="联系方式" readonly></el-input>
				</el-form-item>
			</template>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-if="type!='info'"  label="招募要求" prop="zhaomuyaoqiu">
					<editor 
						style="min-width: 200px; max-width: 600px;"
						v-model="ruleForm.zhaomuyaoqiu" 
						class="editor" 
						action="file/upload">
					</editor>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else-if="ruleForm.zhaomuyaoqiu" label="招募要求" prop="zhaomuyaoqiu">
                    <span :style='{"fontSize":"inherit","lineHeight":"40px","color":"inherit","fontWeight":"500","display":"inline-block"}' v-html="ruleForm.zhaomuyaoqiu"></span>
                </el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"0","fontSize":"inherit","textAlign":"center"}' class="btn">
				<el-button class="btn3"  v-if="type!='info'" type="success" @click="onSubmit">
					<span class="icon iconfont icon-dagou" :style='{"margin":"0 2px","fontSize":"inherit","color":"#fff","height":"40px"}'></span>
					保存
				</el-button>
				<el-button class="btn4" v-if="type!='info'" type="success" @click="back()">
					<span class="icon iconfont icon-shuaxin" :style='{"margin":"0 2px","fontSize":"inherit","color":"#fff","height":"40px"}'></span>
					取消
				</el-button>
				<el-button class="btn5" v-if="type=='info'" type="success" @click="back()">
					<span class="icon iconfont icon-fanhui" :style='{"margin":"0 2px","fontSize":"inherit","color":"rgba(86,178,198,1)","height":"40px"}'></span>
					返回
				</el-button>
			</el-form-item>
		</el-form>
    

  </div>
</template>
<script>
import { 
	isIntNumer,
} from "@/utils/validate";
export default {
	data() {
		var validateIntNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isIntNumer(value)) {
				callback(new Error("请输入整数"));
			} else {
				callback();
			}
		};
		return {
			id: '',
			type: '',
			
			
			ro:{
				zhaomumingcheng : false,
				zhaomufengmian : false,
				zhaomushijian : false,
				zhaomudidian : false,
				zhaomuyaoqiu : false,
				zhubanfangzhanghao : false,
				zhubanfangmingcheng : false,
				lianxifangshi : false,
				clicktime : false,
				clicknum : false,
			},
			
			
			ruleForm: {
				zhaomumingcheng: '',
				zhaomufengmian: '',
				zhaomushijian: '',
				zhaomudidian: '',
				zhaomuyaoqiu: '',
				zhubanfangzhanghao: '',
				zhubanfangmingcheng: '',
				lianxifangshi: '',
				clicktime: '',
			},
		

			
			rules: {
				zhaomumingcheng: [
					{ required: true, message: '招募名称不能为空', trigger: 'blur' },
				],
				zhaomufengmian: [
				],
				zhaomushijian: [
					{ required: true, message: '招募时间不能为空', trigger: 'blur' },
				],
				zhaomudidian: [
					{ required: true, message: '招募地点不能为空', trigger: 'blur' },
				],
				zhaomuyaoqiu: [
				],
				zhubanfangzhanghao: [
				],
				zhubanfangmingcheng: [
				],
				lianxifangshi: [
				],
				clicktime: [
				],
				clicknum: [
					{ validator: validateIntNumber, trigger: 'blur' },
				],
			}
		};
	},
	props: ["parent"],
	computed: {



	},
    components: {
    },
	created() {
	},
	methods: {
		
		// 下载
		download(file){
			window.open(`${file}`)
		},
		// 初始化
		init(id,type) {
			if (id) {
				this.id = id;
				this.type = type;
			}
			if(this.type=='info'||this.type=='else'){
				this.info(id);
			}else if(this.type=='logistics'){
				this.logistics=false;
				this.info(id);
			}else if(this.type=='cross'){
				var obj = this.$storage.getObj('crossObj');
				for (var o in obj){
						if(o=='zhaomumingcheng'){
							this.ruleForm.zhaomumingcheng = obj[o];
							this.ro.zhaomumingcheng = true;
							continue;
						}
						if(o=='zhaomufengmian'){
							this.ruleForm.zhaomufengmian = obj[o];
							this.ro.zhaomufengmian = true;
							continue;
						}
						if(o=='zhaomushijian'){
							this.ruleForm.zhaomushijian = obj[o];
							this.ro.zhaomushijian = true;
							continue;
						}
						if(o=='zhaomudidian'){
							this.ruleForm.zhaomudidian = obj[o];
							this.ro.zhaomudidian = true;
							continue;
						}
						if(o=='zhaomuyaoqiu'){
							this.ruleForm.zhaomuyaoqiu = obj[o];
							this.ro.zhaomuyaoqiu = true;
							continue;
						}
						if(o=='zhubanfangzhanghao'){
							this.ruleForm.zhubanfangzhanghao = obj[o];
							this.ro.zhubanfangzhanghao = true;
							continue;
						}
						if(o=='zhubanfangmingcheng'){
							this.ruleForm.zhubanfangmingcheng = obj[o];
							this.ro.zhubanfangmingcheng = true;
							continue;
						}
						if(o=='lianxifangshi'){
							this.ruleForm.lianxifangshi = obj[o];
							this.ro.lianxifangshi = true;
							continue;
						}
						if(o=='clicktime'){
							this.ruleForm.clicktime = obj[o];
							this.ro.clicktime = true;
							continue;
						}
						if(o=='clicknum'){
							this.ruleForm.clicknum = obj[o];
							this.ro.clicknum = true;
							continue;
						}
				}
			}
			// 获取用户信息
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					var json = data.data;
					if(((json.zhubanfangzhanghao!=''&&json.zhubanfangzhanghao) || json.zhubanfangzhanghao==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.zhubanfangzhanghao = json.zhubanfangzhanghao
						this.ro.zhubanfangzhanghao = true;
					}
					if(((json.zhubanfangmingcheng!=''&&json.zhubanfangmingcheng) || json.zhubanfangmingcheng==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.zhubanfangmingcheng = json.zhubanfangmingcheng
						this.ro.zhubanfangmingcheng = true;
					}
					if(((json.lianxifangshi!=''&&json.lianxifangshi) || json.lianxifangshi==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.lianxifangshi = json.lianxifangshi
						this.ro.lianxifangshi = true;
					}
				} else {
					this.$message.error(data.msg);
				}
			});
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `zhiyuanzhezhaomu/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
        //解决前台上传图片后台不显示的问题
        let reg=new RegExp('../../../upload','g')//g代表全部
        this.ruleForm.zhaomuyaoqiu = this.ruleForm.zhaomuyaoqiu.replace(reg,'../../../springbootfd0t5g0m/upload');
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {
	if(this.ruleForm.zhaomufengmian!=null) {
		this.ruleForm.zhaomufengmian = this.ruleForm.zhaomufengmian.replace(new RegExp(this.$base.url,"g"),"");
	}
var objcross = this.$storage.getObj('crossObj');
      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(statusColumnName && !statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
		this.$refs["ruleForm"].validate(valid => {
			if (valid) {
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid = crossuserid;
					this.ruleForm.crossrefid = crossrefid;
					let params = { 
						page: 1, 
						limit: 10, 
						crossuserid:this.ruleForm.crossuserid,
						crossrefid:this.ruleForm.crossrefid,
					} 
				this.$http({ 
					url: "zhiyuanzhezhaomu/page", 
					method: "get", 
					params: params 
				}).then(({ 
					data 
				}) => { 
					if (data && data.code === 0) { 
						if(data.data.total>=crossoptnum) {
							this.$message.error(this.$storage.get('tips'));
							return false;
						} else {
							this.$http({
								url: `zhiyuanzhezhaomu/${!this.ruleForm.id ? "save" : "update"}`,
								method: "post",
								data: this.ruleForm
							}).then(({ data }) => {
								if (data && data.code === 0) {
									this.$message({
										message: "操作成功",
										type: "success",
										duration: 1500,
										onClose: () => {
											this.parent.showFlag = true;
											this.parent.addOrUpdateFlag = false;
											this.parent.zhiyuanzhezhaomuCrossAddOrUpdateFlag = false;
											this.parent.search();
											this.parent.contentStyleChange();
										}
									});
								} else {
									this.$message.error(data.msg);
								}
							});

						}
					} else { 
				} 
			});
		} else {
			this.$http({
				url: `zhiyuanzhezhaomu/${!this.ruleForm.id ? "save" : "update"}`,
				method: "post",
			   data: this.ruleForm
			}).then(({ data }) => {
				if (data && data.code === 0) {
					this.$message({
						message: "操作成功",
						type: "success",
						duration: 1500,
						onClose: () => {
							this.parent.showFlag = true;
							this.parent.addOrUpdateFlag = false;
							this.parent.zhiyuanzhezhaomuCrossAddOrUpdateFlag = false;
							this.parent.search();
							this.parent.contentStyleChange();
						}
					});
				} else {
					this.$message.error(data.msg);
			   }
			});
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.zhiyuanzhezhaomuCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    zhaomufengmianUploadChange(fileUrls) {
	    this.ruleForm.zhaomufengmian = fileUrls;
    },
  }
};
</script>
<style lang="scss" scoped>
	.amap-wrapper {
		width: 100%;
		height: 500px;
	}
	
	.search-box {
		position: absolute;
	}
	
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
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
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
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
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
	
	.add-update-preview /deep/ .upload .upload-img {
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
	
	.add-update-preview .btn .btn1 {
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
	
	.add-update-preview .btn .btn1:hover {
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn2 {
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
	
	.add-update-preview .btn .btn2:hover {
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn3 {
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
	
	.add-update-preview .btn .btn3:hover {
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn4 {
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
	
	.add-update-preview .btn .btn4:hover {
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn5 {
				border: 0;
				cursor: pointer;
				border-radius: 4px;
				padding: 0 24px;
				margin: 4px;
				outline: none;
				clip-path: polygon(0% 0%, 95% 0, 100% 50%, 95% 100%, 0% 100%);
				color: rgba(86,178,198,1);
				background: rgba(86,178,198,.3);
				width: auto;
				font-size: inherit;
				height: 40px;
			}
	
	.add-update-preview .btn .btn5:hover {
				opacity: 0.8;
			}
</style>
