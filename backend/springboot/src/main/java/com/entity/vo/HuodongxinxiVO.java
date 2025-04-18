package com.entity.vo;

import com.entity.HuodongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 活动信息
 * @author 
 * @email 
 */
public class HuodongxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 宣传图片
	 */
	
	private String xuanchuantupian;
		
	/**
	 * 活动视频
	 */
	
	private String huodongshipin;
		
	/**
	 * 活动详情
	 */
	
	private String huodongxiangqing;
				
	
	/**
	 * 设置：宣传图片
	 */
	 
	public void setXuanchuantupian(String xuanchuantupian) {
		this.xuanchuantupian = xuanchuantupian;
	}
	
	/**
	 * 获取：宣传图片
	 */
	public String getXuanchuantupian() {
		return xuanchuantupian;
	}
				
	
	/**
	 * 设置：活动视频
	 */
	 
	public void setHuodongshipin(String huodongshipin) {
		this.huodongshipin = huodongshipin;
	}
	
	/**
	 * 获取：活动视频
	 */
	public String getHuodongshipin() {
		return huodongshipin;
	}
				
	
	/**
	 * 设置：活动详情
	 */
	 
	public void setHuodongxiangqing(String huodongxiangqing) {
		this.huodongxiangqing = huodongxiangqing;
	}
	
	/**
	 * 获取：活动详情
	 */
	public String getHuodongxiangqing() {
		return huodongxiangqing;
	}
			
}
