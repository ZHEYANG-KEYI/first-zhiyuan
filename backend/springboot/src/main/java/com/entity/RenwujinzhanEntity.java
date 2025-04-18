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
 * 任务进展
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 */
@TableName("renwujinzhan")
public class RenwujinzhanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public RenwujinzhanEntity() {
		
	}
	
	public RenwujinzhanEntity(T t) {
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
	 * 任务名称
	 */
					
	private String renwumingcheng;
	
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
	 * 设置：任务名称
	 */
	public void setRenwumingcheng(String renwumingcheng) {
		this.renwumingcheng = renwumingcheng;
	}
	/**
	 * 获取：任务名称
	 */
	public String getRenwumingcheng() {
		return renwumingcheng;
	}
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
