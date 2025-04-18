package com.entity.model;

import com.entity.ZhaomushenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 招募申请
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 */
public class ZhaomushenqingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 招募封面
	 */
	
	private String zhaomufengmian;
		
	/**
	 * 招募地点
	 */
	
	private String zhaomudidian;
		
	/**
	 * 招募时间
	 */
	
	private String zhaomushijian;
		
	/**
	 * 主办方账号
	 */
	
	private String zhubanfangzhanghao;
		
	/**
	 * 主办方名称
	 */
	
	private String zhubanfangmingcheng;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 志愿者账号
	 */
	
	private String zhiyuanzhezhanghao;
		
	/**
	 * 志愿者姓名
	 */
	
	private String zhiyuanzhexingming;
		
	/**
	 * 申请说明
	 */
	
	private String shenqingshuoming;
		
	/**
	 * 申请时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingshijian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：招募封面
	 */
	 
	public void setZhaomufengmian(String zhaomufengmian) {
		this.zhaomufengmian = zhaomufengmian;
	}
	
	/**
	 * 获取：招募封面
	 */
	public String getZhaomufengmian() {
		return zhaomufengmian;
	}
				
	
	/**
	 * 设置：招募地点
	 */
	 
	public void setZhaomudidian(String zhaomudidian) {
		this.zhaomudidian = zhaomudidian;
	}
	
	/**
	 * 获取：招募地点
	 */
	public String getZhaomudidian() {
		return zhaomudidian;
	}
				
	
	/**
	 * 设置：招募时间
	 */
	 
	public void setZhaomushijian(String zhaomushijian) {
		this.zhaomushijian = zhaomushijian;
	}
	
	/**
	 * 获取：招募时间
	 */
	public String getZhaomushijian() {
		return zhaomushijian;
	}
				
	
	/**
	 * 设置：主办方账号
	 */
	 
	public void setZhubanfangzhanghao(String zhubanfangzhanghao) {
		this.zhubanfangzhanghao = zhubanfangzhanghao;
	}
	
	/**
	 * 获取：主办方账号
	 */
	public String getZhubanfangzhanghao() {
		return zhubanfangzhanghao;
	}
				
	
	/**
	 * 设置：主办方名称
	 */
	 
	public void setZhubanfangmingcheng(String zhubanfangmingcheng) {
		this.zhubanfangmingcheng = zhubanfangmingcheng;
	}
	
	/**
	 * 获取：主办方名称
	 */
	public String getZhubanfangmingcheng() {
		return zhubanfangmingcheng;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：志愿者账号
	 */
	 
	public void setZhiyuanzhezhanghao(String zhiyuanzhezhanghao) {
		this.zhiyuanzhezhanghao = zhiyuanzhezhanghao;
	}
	
	/**
	 * 获取：志愿者账号
	 */
	public String getZhiyuanzhezhanghao() {
		return zhiyuanzhezhanghao;
	}
				
	
	/**
	 * 设置：志愿者姓名
	 */
	 
	public void setZhiyuanzhexingming(String zhiyuanzhexingming) {
		this.zhiyuanzhexingming = zhiyuanzhexingming;
	}
	
	/**
	 * 获取：志愿者姓名
	 */
	public String getZhiyuanzhexingming() {
		return zhiyuanzhexingming;
	}
				
	
	/**
	 * 设置：申请说明
	 */
	 
	public void setShenqingshuoming(String shenqingshuoming) {
		this.shenqingshuoming = shenqingshuoming;
	}
	
	/**
	 * 获取：申请说明
	 */
	public String getShenqingshuoming() {
		return shenqingshuoming;
	}
				
	
	/**
	 * 设置：申请时间
	 */
	 
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	
	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
