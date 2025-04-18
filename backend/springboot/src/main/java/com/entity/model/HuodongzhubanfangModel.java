package com.entity.model;

import com.entity.HuodongzhubanfangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 活动主办方
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 */
public class HuodongzhubanfangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 主办方名称
	 */
	
	private String zhubanfangmingcheng;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 主办方简介
	 */
	
	private String zhubanfangjianjie;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
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
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：主办方简介
	 */
	 
	public void setZhubanfangjianjie(String zhubanfangjianjie) {
		this.zhubanfangjianjie = zhubanfangjianjie;
	}
	
	/**
	 * 获取：主办方简介
	 */
	public String getZhubanfangjianjie() {
		return zhubanfangjianjie;
	}
			
}
