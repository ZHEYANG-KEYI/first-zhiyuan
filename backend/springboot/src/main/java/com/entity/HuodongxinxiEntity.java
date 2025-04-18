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
 * 活动信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 */
@TableName("huodongxinxi")
public class HuodongxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuodongxinxiEntity() {
		
	}
	
	public HuodongxinxiEntity(T t) {
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
	 * 活动名称
	 */
					
	private String huodongmingcheng;
	
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
	 * 设置：活动名称
	 */
	public void setHuodongmingcheng(String huodongmingcheng) {
		this.huodongmingcheng = huodongmingcheng;
	}
	/**
	 * 获取：活动名称
	 */
	public String getHuodongmingcheng() {
		return huodongmingcheng;
	}
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
