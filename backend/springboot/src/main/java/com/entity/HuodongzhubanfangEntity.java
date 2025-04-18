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
 * 活动主办方
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 */
@TableName("huodongzhubanfang")
public class HuodongzhubanfangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuodongzhubanfangEntity() {
		
	}
	
	public HuodongzhubanfangEntity(T t) {
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
    @TableId
    private Long id;
	/**
	 * 主办方账号
	 */
					
	private String zhubanfangzhanghao;
	
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
