<template>
<view class="content">
	<view class="box" :style='{"padding":"80rpx 0 0 0","backgroundColor":"#fff","backgroundImage":"url(http://codegen.caihongy.cn/20231129/e8410bdf8b224d6fb345eb65254a74e8.png)","width":"100%","backgroundSize":"100% 100%","position":"relative","height":"100%"}'>
		<view :style='{"width":"100%","padding":"24rpx 100rpx","display":"block","height":"auto"}'>
			<image :style='{"width":"160rpx","margin":"0 auto 24rpx auto","borderRadius":"8rpx","display":"none","height":"160rpx"}' src="http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg" mode="aspectFill"></image>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='huodongzhubanfang'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">主办方账号：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.zhubanfangzhanghao"  type="text"  class="uni-input" name="" placeholder="主办方账号" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='huodongzhubanfang'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">密码：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='huodongzhubanfang'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">确认密码：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='huodongzhubanfang'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">主办方名称：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.zhubanfangmingcheng"  type="text"  class="uni-input" name="" placeholder="主办方名称" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='huodongzhubanfang'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">联系方式：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.lianxifangshi"  type="text"  class="uni-input" name="" placeholder="联系方式" />
			</view>
            <view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='huodongzhubanfang'" @tap="huodongzhubanfangtupianTap" class="">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">图片：</view>
				<image :style='{"width":"80rpx","borderRadius":"16rpx","background":"#F6F6F4","display":"block","height":"80rpx"}' v-if="ruleForm.tupian" class="avator" :src="baseUrl+ruleForm.tupian" mode=""></image>
                <image :style='{"width":"80rpx","borderRadius":"16rpx","background":"#F6F6F4","display":"block","height":"80rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
            </view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='huodongzhubanfang'" class="">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">主办方简介：</view>
				<xia-editor ref="editor" :style='{"minHeight":"360rpx","border":"2rpx solid #efefef","width":"100%","height":"auto"}' v-model="ruleForm.zhubanfangjianjie" placeholder="主办方简介" @editorChange="zhubanfangjianjieChange"></xia-editor>
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanzhe'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">志愿者账号：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.zhiyuanzhezhanghao"  type="text"  class="uni-input" name="" placeholder="志愿者账号" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanzhe'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">密码：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanzhe'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">确认密码：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanzhe'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">志愿者姓名：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.zhiyuanzhexingming"  type="text"  class="uni-input" name="" placeholder="志愿者姓名" />
			</view>
            <view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanzhe'" class="">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">性别：</view>
				<picker :style='{"width":"100%","margin":"0 0 24rpx 0","flexWrap":"wrap","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanzhe'"  @change="zhiyuanzhexingbieChange" :value="zhiyuanzhexingbieIndex" :range="zhiyuanzhexingbieOptions">
					<view>
						<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#D4CF5D"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
					</view>
				</picker>
			</view>
            <view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanzhe'" class="">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">出生日期：</view>
				<picker  :style='{"width":"100%","margin":"0 0 24rpx 0","flexWrap":"wrap","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanzhe'" mode="date" :value="ruleForm.chushengriqi" @change="zhiyuanzhechushengriqiDateChange">
					<view>
						<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#D4CF5D"}' class="uni-input">{{ruleForm.chushengriqi?ruleForm.chushengriqi:"请选择出生日期"}}</view>
					</view>
				</picker>
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanzhe'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">手机号码：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.shoujihaoma"  type="text"  class="uni-input" name="" placeholder="手机号码" />
			</view>
            <view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanzhe'" class="">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">小组编号：</view>
				<picker :style='{"width":"100%","margin":"0 0 24rpx 0","flexWrap":"wrap","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanzhe'"  @change="zhiyuanzhexiaozubianhaoChange" :value="zhiyuanzhexiaozubianhaoIndex" :range="zhiyuanzhexiaozubianhaoOptions">
					<view>
						<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#D4CF5D"}' class="uni-input">{{ruleForm.xiaozubianhao?ruleForm.xiaozubianhao:"请选择小组编号"}}</view>
					</view>
				</picker>
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanzhe'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">组长姓名：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.zuzhangxingming"  type="text"  class="uni-input" name="" placeholder="组长姓名" />
			</view>
            <view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanzhe'" @tap="zhiyuanzhetouxiangTap" class="">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">头像：</view>
				<image :style='{"width":"80rpx","borderRadius":"16rpx","background":"#F6F6F4","display":"block","height":"80rpx"}' v-if="ruleForm.touxiang" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
                <image :style='{"width":"80rpx","borderRadius":"16rpx","background":"#F6F6F4","display":"block","height":"80rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
            </view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanxiaozuzhang'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">小组编号：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.xiaozubianhao"  type="text"  class="uni-input" name="" placeholder="小组编号" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanxiaozuzhang'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">密码：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanxiaozuzhang'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">确认密码：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanxiaozuzhang'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">组长姓名：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.zuzhangxingming"  type="text"  class="uni-input" name="" placeholder="组长姓名" />
			</view>
            <view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanxiaozuzhang'" class="">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">性别：</view>
				<picker :style='{"width":"100%","margin":"0 0 24rpx 0","flexWrap":"wrap","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanxiaozuzhang'"  @change="zhiyuanxiaozuzhangxingbieChange" :value="zhiyuanxiaozuzhangxingbieIndex" :range="zhiyuanxiaozuzhangxingbieOptions">
					<view>
						<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#D4CF5D"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
					</view>
				</picker>
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanxiaozuzhang'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">年龄：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.nianling"  type="text"  class="uni-input" name="" placeholder="年龄" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanxiaozuzhang'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">联系电话：</view>
				<input :style='{"border":"0px solid rgb(255, 170, 51)","padding":"20rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"0","flex":"1","background":"#F6F6F4","fontSize":"28rpx","lineHeight":"88rpx"}'  v-model="ruleForm.lianxidianhua"  type="text"  class="uni-input" name="" placeholder="联系电话" />
			</view>
            <view :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='zhiyuanxiaozuzhang'" @tap="zhiyuanxiaozuzhangzhaopianTap" class="">
				<view :style='{"width":"100%","lineHeight":"88rpx","fontSize":"28rpx","color":"#000000","textAlign":"left"}' class="label">照片：</view>
				<image :style='{"width":"80rpx","borderRadius":"16rpx","background":"#F6F6F4","display":"block","height":"80rpx"}' v-if="ruleForm.zhaopian" class="avator" :src="baseUrl+ruleForm.zhaopian" mode=""></image>
                <image :style='{"width":"80rpx","borderRadius":"16rpx","background":"#F6F6F4","display":"block","height":"80rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
            </view>
			<button :style='{"border":"0","padding":"0px","margin":"0 0 24rpx 0","color":"rgb(255, 255, 255)","borderRadius":"8rpx","background":"#D4CF5D","width":"100%","lineHeight":"88rpx","fontSize":"48rpx","height":"88rpx"}' class="btn-submit" @tap="register" type="primary">注册</button>
			
			<view class="idea1" :style='{"color":"#000000","top":"40rpx","display":"none","width":"100%","fontSize":"72rpx","position":"absolute","height":"80rpx"}'>欢迎注册</view>
			<view class="idea2" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea2</view>
			<view class="idea3" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea3</view>
		</view>
	</view>
</view>
</template>

<script>
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
                zhiyuanzhexingbieOptions: [],
                zhiyuanzhexingbieIndex: 0,
                zhiyuanzhexiaozubianhaoOptions: [],
                zhiyuanzhexiaozubianhaoIndex: 0,
                zhiyuanxiaozuzhangxingbieOptions: [],
                zhiyuanxiaozuzhangxingbieIndex: 0,
				ruleForm: {
                zhubanfangzhanghao: '',
                mima: '',
                zhubanfangmingcheng: '',
                lianxifangshi: '',
                tupian: '',
                zhubanfangjianjie: '',
                zhiyuanzhezhanghao: '',
                mima: '',
                zhiyuanzhexingming: '',
                xingbie: '',
                chushengriqi: '',
                shoujihaoma: '',
                xiaozubianhao: '',
                zuzhangxingming: '',
                touxiang: '',
                xiaozubianhao: '',
                mima: '',
                zuzhangxingming: '',
                xingbie: '',
                nianling: '',
                lianxidianhua: '',
                zhaopian: '',
				},
				tableName:""
			}
		},
        components: {
            multipleSelect
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
            this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='zhiyuanzhe'){
                this.zhiyuanzhexingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.zhiyuanzhexingbieOptions[0]
			}
            res = await this.$api.option(`zhiyuanxiaozuzhang`,`xiaozubianhao`,{});
            this.zhiyuanzhexiaozubianhaoOptions = res.data;
                        // 自定义下拉框值
			if(this.tableName=='zhiyuanxiaozuzhang'){
                this.zhiyuanxiaozuzhangxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.zhiyuanxiaozuzhangxingbieOptions[0]
			}
			
			this.styleChange()
		},
		methods: {

            huodongzhubanfangtupianTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.tupian = 'upload/' + res.file;
					_this.$forceUpdate();
                });
            },
            zhubanfangjianjieChange(e) {
                this.ruleForm.zhubanfangjianjie = e
            },
            // 下拉变化
            zhiyuanzhexingbieChange(e) {
                    this.zhiyuanzhexingbieIndex = e.target.value
                    this.ruleForm.xingbie = this.zhiyuanzhexingbieOptions[this.zhiyuanzhexingbieIndex]
            },
            zhiyuanzhechushengriqiDateChange(e) {
                this.ruleForm.chushengriqi = e.target.value;
                this.$forceUpdate();
            },
            zhiyuanzhetouxiangTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.touxiang = 'upload/' + res.file;
					_this.$forceUpdate();
                });
            },
            // 下拉变化
            zhiyuanxiaozuzhangxingbieChange(e) {
                    this.zhiyuanxiaozuzhangxingbieIndex = e.target.value
                    this.ruleForm.xingbie = this.zhiyuanxiaozuzhangxingbieOptions[this.zhiyuanxiaozuzhangxingbieIndex]
            },
            zhiyuanxiaozuzhangzhaopianTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.zhaopian = 'upload/' + res.file;
					_this.$forceUpdate();
                });
            },

            // 下二随
            async zhiyuanzhexiaozubianhaoChange (e) {
                this.zhiyuanzhexiaozubianhaoIndex = e.target.value
                this.ruleForm.xiaozubianhao = this.zhiyuanzhexiaozubianhaoOptions[this.zhiyuanzhexiaozubianhaoIndex]
                let res = await this.$api.follow(`zhiyuanxiaozuzhang`, `xiaozubianhao`,{
                    columnValue: this.ruleForm.xiaozubianhao
                });
                if(res.data.zuzhangxingming){
                    this.ruleForm.zuzhangxingming = res.data.zuzhangxingming
                }
            },
            toggleTab(str) {
                this.$refs[str].show();
            },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				
				if((!this.ruleForm.zhubanfangzhanghao) && `huodongzhubanfang` == this.tableName){
					this.$utils.msg(`主办方账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `huodongzhubanfang` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
                if(`huodongzhubanfang` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
                    return
                }
				if((!this.ruleForm.zhubanfangmingcheng) && `huodongzhubanfang` == this.tableName){
					this.$utils.msg(`主办方名称不能为空`);
					return
				}
				if(`huodongzhubanfang` == this.tableName && this.ruleForm.lianxifangshi&&(!this.$validate.isMobile(this.ruleForm.lianxifangshi))){
					this.$utils.msg(`联系方式应输入手机格式`);
					return
				}
				if((!this.ruleForm.zhiyuanzhezhanghao) && `zhiyuanzhe` == this.tableName){
					this.$utils.msg(`志愿者账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `zhiyuanzhe` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
                if(`zhiyuanzhe` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
                    return
                }
				if((!this.ruleForm.zhiyuanzhexingming) && `zhiyuanzhe` == this.tableName){
					this.$utils.msg(`志愿者姓名不能为空`);
					return
				}
				if(`zhiyuanzhe` == this.tableName && this.ruleForm.shoujihaoma&&(!this.$validate.isMobile(this.ruleForm.shoujihaoma))){
					this.$utils.msg(`手机号码应输入手机格式`);
					return
				}
				if((!this.ruleForm.xiaozubianhao) && `zhiyuanxiaozuzhang` == this.tableName){
					this.$utils.msg(`小组编号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `zhiyuanxiaozuzhang` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
                if(`zhiyuanxiaozuzhang` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
                    return
                }
				if((!this.ruleForm.zuzhangxingming) && `zhiyuanxiaozuzhang` == this.tableName){
					this.$utils.msg(`组长姓名不能为空`);
					return
				}
				if(`zhiyuanxiaozuzhang` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
					this.$utils.msg(`年龄应输入整数`);
					return
				}
				if(`zhiyuanxiaozuzhang` == this.tableName && this.ruleForm.lianxidianhua&&(!this.$validate.isMobile(this.ruleForm.lianxidianhua))){
					this.$utils.msg(`联系电话应输入手机格式`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
