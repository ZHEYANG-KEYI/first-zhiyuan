package com.entity.vo;

import com.entity.RenwujinzhanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 任务进展
 * @author 
 * @email 
 */
public class RenwujinzhanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 任务图片
	 */
	
	private String renwutupian;
		
	/**
	 * 任务地点
	 */
	
	private String renwudidian;
		
	/**
	 * 志愿者账号
	 */
	
	private String zhiyuanzhezhanghao;
		
	/**
	 * 志愿者姓名
	 */
	
	private String zhiyuanzhexingming;
		
	/**
	 * 任务进展
	 */
	
	private String renwujinzhan;
		
	/**
	 * 任务详情
	 */
	
	private String renwuxiangqing;
		
	/**
	 * 服务时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fuwushijian;
				
	
	/**
	 * 设置：任务图片
	 */
	 
	public void setRenwutupian(String renwutupian) {
		this.renwutupian = renwutupian;
	}
	
	/**
	 * 获取：任务图片
	 */
	public String getRenwutupian() {
		return renwutupian;
	}
				
	
	/**
	 * 设置：任务地点
	 */
	 
	public void setRenwudidian(String renwudidian) {
		this.renwudidian = renwudidian;
	}
	
	/**
	 * 获取：任务地点
	 */
	public String getRenwudidian() {
		return renwudidian;
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
	 * 设置：任务进展
	 */
	 
	public void setRenwujinzhan(String renwujinzhan) {
		this.renwujinzhan = renwujinzhan;
	}
	
	/**
	 * 获取：任务进展
	 */
	public String getRenwujinzhan() {
		return renwujinzhan;
	}
				
	
	/**
	 * 设置：任务详情
	 */
	 
	public void setRenwuxiangqing(String renwuxiangqing) {
		this.renwuxiangqing = renwuxiangqing;
	}
	
	/**
	 * 获取：任务详情
	 */
	public String getRenwuxiangqing() {
		return renwuxiangqing;
	}
				
	
	/**
	 * 设置：服务时间
	 */
	 
	public void setFuwushijian(Date fuwushijian) {
		this.fuwushijian = fuwushijian;
	}
	
	/**
	 * 获取：服务时间
	 */
	public Date getFuwushijian() {
		return fuwushijian;
	}
			
}
