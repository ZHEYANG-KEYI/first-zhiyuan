package com.entity.vo;

import com.entity.PeixunchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 培训成绩
 * @author 
 * @email 
 */
public class PeixunchengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 培训图片
	 */
	
	private String peixuntupian;
		
	/**
	 * 志愿者账号
	 */
	
	private String zhiyuanzhezhanghao;
		
	/**
	 * 志愿者姓名
	 */
	
	private String zhiyuanzhexingming;
		
	/**
	 * 考核成绩
	 */
	
	private String kaohechengji;
		
	/**
	 * 考核时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaoheshijian;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
				
	
	/**
	 * 设置：培训图片
	 */
	 
	public void setPeixuntupian(String peixuntupian) {
		this.peixuntupian = peixuntupian;
	}
	
	/**
	 * 获取：培训图片
	 */
	public String getPeixuntupian() {
		return peixuntupian;
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
	 * 设置：考核成绩
	 */
	 
	public void setKaohechengji(String kaohechengji) {
		this.kaohechengji = kaohechengji;
	}
	
	/**
	 * 获取：考核成绩
	 */
	public String getKaohechengji() {
		return kaohechengji;
	}
				
	
	/**
	 * 设置：考核时间
	 */
	 
	public void setKaoheshijian(Date kaoheshijian) {
		this.kaoheshijian = kaoheshijian;
	}
	
	/**
	 * 获取：考核时间
	 */
	public Date getKaoheshijian() {
		return kaoheshijian;
	}
				
	
	/**
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
			
}
