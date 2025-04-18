package com.entity.vo;

import com.entity.FuwutongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 服务统计
 * @author 
 * @email 
 */
public class FuwutongjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 志愿者姓名
	 */
	
	private String zhiyuanzhexingming;
		
	/**
	 * 服务时长
	 */
	
	private Double fuwushizhang;
		
	/**
	 * 服务评价
	 */
	
	private String fuwupingjia;
		
	/**
	 * 小组编号
	 */
	
	private String xiaozubianhao;
		
	/**
	 * 组长姓名
	 */
	
	private String zuzhangxingming;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
				
	
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
	 * 设置：服务时长
	 */
	 
	public void setFuwushizhang(Double fuwushizhang) {
		this.fuwushizhang = fuwushizhang;
	}
	
	/**
	 * 获取：服务时长
	 */
	public Double getFuwushizhang() {
		return fuwushizhang;
	}
				
	
	/**
	 * 设置：服务评价
	 */
	 
	public void setFuwupingjia(String fuwupingjia) {
		this.fuwupingjia = fuwupingjia;
	}
	
	/**
	 * 获取：服务评价
	 */
	public String getFuwupingjia() {
		return fuwupingjia;
	}
				
	
	/**
	 * 设置：小组编号
	 */
	 
	public void setXiaozubianhao(String xiaozubianhao) {
		this.xiaozubianhao = xiaozubianhao;
	}
	
	/**
	 * 获取：小组编号
	 */
	public String getXiaozubianhao() {
		return xiaozubianhao;
	}
				
	
	/**
	 * 设置：组长姓名
	 */
	 
	public void setZuzhangxingming(String zuzhangxingming) {
		this.zuzhangxingming = zuzhangxingming;
	}
	
	/**
	 * 获取：组长姓名
	 */
	public String getZuzhangxingming() {
		return zuzhangxingming;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
			
}
