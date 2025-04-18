package com.entity.vo;

import com.entity.ZhiyuanzherenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 志愿者任务
 * @author 
 * @email 
 */
public class ZhiyuanzherenwuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 任务图片
	 */
	
	private String renwutupian;
		
	/**
	 * 任务时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date renwushijian;
		
	/**
	 * 任务地点
	 */
	
	private String renwudidian;
		
	/**
	 * 任务要求
	 */
	
	private String renwuyaoqiu;
		
	/**
	 * 志愿者账号
	 */
	
	private String zhiyuanzhezhanghao;
		
	/**
	 * 志愿者姓名
	 */
	
	private String zhiyuanzhexingming;
		
	/**
	 * 分配时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fenpeishijian;
				
	
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
	 * 设置：任务时间
	 */
	 
	public void setRenwushijian(Date renwushijian) {
		this.renwushijian = renwushijian;
	}
	
	/**
	 * 获取：任务时间
	 */
	public Date getRenwushijian() {
		return renwushijian;
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
	 * 设置：任务要求
	 */
	 
	public void setRenwuyaoqiu(String renwuyaoqiu) {
		this.renwuyaoqiu = renwuyaoqiu;
	}
	
	/**
	 * 获取：任务要求
	 */
	public String getRenwuyaoqiu() {
		return renwuyaoqiu;
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
	 * 设置：分配时间
	 */
	 
	public void setFenpeishijian(Date fenpeishijian) {
		this.fenpeishijian = fenpeishijian;
	}
	
	/**
	 * 获取：分配时间
	 */
	public Date getFenpeishijian() {
		return fenpeishijian;
	}
			
}
