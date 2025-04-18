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
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="培训名称" prop="peixunmingcheng">
					<el-input v-model="ruleForm.peixunmingcheng" placeholder="培训名称" clearable  :readonly="ro.peixunmingcheng"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="培训名称" prop="peixunmingcheng">
					<el-input v-model="ruleForm.peixunmingcheng" placeholder="培训名称" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="upload" v-if="type!='info' && !ro.peixuntupian" label="培训图片" prop="peixuntupian">
					<file-upload
						tip="点击上传培训图片"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.peixuntupian?ruleForm.peixuntupian:''"
						@change="peixuntupianUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="upload" v-else-if="ruleForm.peixuntupian" label="培训图片" prop="peixuntupian">
					<img v-if="ruleForm.peixuntupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.peixuntupian.split(',')[0]" width="100" height="100">
					<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.peixuntupian.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="志愿者账号" prop="zhiyuanzhezhanghao">
					<el-input v-model="ruleForm.zhiyuanzhezhanghao" placeholder="志愿者账号" clearable  :readonly="ro.zhiyuanzhezhanghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="志愿者账号" prop="zhiyuanzhezhanghao">
					<el-input v-model="ruleForm.zhiyuanzhezhanghao" placeholder="志愿者账号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="志愿者姓名" prop="zhiyuanzhexingming">
					<el-input v-model="ruleForm.zhiyuanzhexingming" placeholder="志愿者姓名" clearable  :readonly="ro.zhiyuanzhexingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="志愿者姓名" prop="zhiyuanzhexingming">
					<el-input v-model="ruleForm.zhiyuanzhexingming" placeholder="志愿者姓名" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="select" v-if="type!='info'"  label="考核成绩" prop="kaohechengji">
					<el-select :disabled="ro.kaohechengji" v-model="ruleForm.kaohechengji" placeholder="请选择考核成绩" >
						<el-option
							v-for="(item,index) in kaohechengjiOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="考核成绩" prop="kaohechengji">
					<el-input v-model="ruleForm.kaohechengji"
						placeholder="考核成绩" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="date" v-if="type!='info'" label="考核时间" prop="kaoheshijian">
					<el-date-picker
						value-format="yyyy-MM-dd HH:mm:ss"
						v-model="ruleForm.kaoheshijian" 
						type="datetime"
						:readonly="ro.kaoheshijian"
						placeholder="考核时间"
					></el-date-picker>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-else-if="ruleForm.kaoheshijian" label="考核时间" prop="kaoheshijian">
					<el-input v-model="ruleForm.kaoheshijian" placeholder="考核时间" readonly></el-input>
				</el-form-item>
			</template>
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
export default {
	data() {
		return {
			id: '',
			type: '',
			
			
			ro:{
				peixunmingcheng : false,
				peixuntupian : false,
				zhiyuanzhezhanghao : false,
				zhiyuanzhexingming : false,
				kaohechengji : false,
				kaoheshijian : false,
				crossuserid : false,
				crossrefid : false,
			},
			
			
			ruleForm: {
				peixunmingcheng: '',
				peixuntupian: '',
				zhiyuanzhezhanghao: '',
				zhiyuanzhexingming: '',
				kaohechengji: '',
				kaoheshijian: '',
				crossuserid: '',
				crossrefid: '',
			},
		
			kaohechengjiOptions: [],

			
			rules: {
				peixunmingcheng: [
				],
				peixuntupian: [
				],
				zhiyuanzhezhanghao: [
				],
				zhiyuanzhexingming: [
				],
				kaohechengji: [
					{ required: true, message: '考核成绩不能为空', trigger: 'blur' },
				],
				kaoheshijian: [
				],
				crossuserid: [
				],
				crossrefid: [
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
		this.ruleForm.kaoheshijian = this.getCurDateTime()
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
						if(o=='peixunmingcheng'){
							this.ruleForm.peixunmingcheng = obj[o];
							this.ro.peixunmingcheng = true;
							continue;
						}
						if(o=='peixuntupian'){
							this.ruleForm.peixuntupian = obj[o];
							this.ro.peixuntupian = true;
							continue;
						}
						if(o=='zhiyuanzhezhanghao'){
							this.ruleForm.zhiyuanzhezhanghao = obj[o];
							this.ro.zhiyuanzhezhanghao = true;
							continue;
						}
						if(o=='zhiyuanzhexingming'){
							this.ruleForm.zhiyuanzhexingming = obj[o];
							this.ro.zhiyuanzhexingming = true;
							continue;
						}
						if(o=='kaohechengji'){
							this.ruleForm.kaohechengji = obj[o];
							this.ro.kaohechengji = true;
							continue;
						}
						if(o=='kaoheshijian'){
							this.ruleForm.kaoheshijian = obj[o];
							this.ro.kaoheshijian = true;
							continue;
						}
						if(o=='crossuserid'){
							this.ruleForm.crossuserid = obj[o];
							this.ro.crossuserid = true;
							continue;
						}
						if(o=='crossrefid'){
							this.ruleForm.crossrefid = obj[o];
							this.ro.crossrefid = true;
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
				} else {
					this.$message.error(data.msg);
				}
			});
            this.kaohechengjiOptions = "合格,不合格".split(',')
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `peixunchengji/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
        //解决前台上传图片后台不显示的问题
        let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {
	if(this.ruleForm.peixuntupian!=null) {
		this.ruleForm.peixuntupian = this.ruleForm.peixuntupian.replace(new RegExp(this.$base.url,"g"),"");
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
					url: "peixunchengji/page", 
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
								url: `peixunchengji/${!this.ruleForm.id ? "save" : "update"}`,
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
											this.parent.peixunchengjiCrossAddOrUpdateFlag = false;
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
				url: `peixunchengji/${!this.ruleForm.id ? "save" : "update"}`,
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
							this.parent.peixunchengjiCrossAddOrUpdateFlag = false;
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
      this.parent.peixunchengjiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    peixuntupianUploadChange(fileUrls) {
	    this.ruleForm.peixuntupian = fileUrls;
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
