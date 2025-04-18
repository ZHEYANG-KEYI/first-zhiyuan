package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 志愿者招募
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 */
@TableName("zhiyuanzhezhaomu")
public class ZhiyuanzhezhaomuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhiyuanzhezhaomuEntity() {
		
	}
	
	public ZhiyuanzhezhaomuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 招募名称
	 */
					
	private String zhaomumingcheng;
	
	/**
	 * 招募封面
	 */
					
	private String zhaomufengmian;
	
	/**
	 * 招募时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date zhaomushijian;
	
	/**
	 * 招募地点
	 */
					
	private String zhaomudidian;
	
	/**
	 * 招募要求
	 */
					
	private String zhaomuyaoqiu;
	
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
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：招募名称
	 */
	public void setZhaomumingcheng(String zhaomumingcheng) {
		this.zhaomumingcheng = zhaomumingcheng;
	}
	/**
	 * 获取：招募名称
	 */
	public String getZhaomumingcheng() {
		return zhaomumingcheng;
	}
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
	 * 设置：招募时间
	 */
	public void setZhaomushijian(Date zhaomushijian) {
		this.zhaomushijian = zhaomushijian;
	}
	/**
	 * 获取：招募时间
	 */
	public Date getZhaomushijian() {
		return zhaomushijian;
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
	 * 设置：招募要求
	 */
	public void setZhaomuyaoqiu(String zhaomuyaoqiu) {
		this.zhaomuyaoqiu = zhaomuyaoqiu;
	}
	/**
	 * 获取：招募要求
	 */
	public String getZhaomuyaoqiu() {
		return zhaomuyaoqiu;
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
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
