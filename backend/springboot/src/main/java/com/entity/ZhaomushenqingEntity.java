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
 * 招募申请
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 */
@TableName("zhaomushenqing")
public class ZhaomushenqingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhaomushenqingEntity() {
		
	}
	
	public ZhaomushenqingEntity(T t) {
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
	 * 招募地点
	 */
					
	private String zhaomudidian;
	
	/**
	 * 招募时间
	 */
					
	private String zhaomushijian;
	
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
	 * 志愿者账号
	 */
					
	private String zhiyuanzhezhanghao;
	
	/**
	 * 志愿者姓名
	 */
					
	private String zhiyuanzhexingming;
	
	/**
	 * 申请说明
	 */
					
	private String shenqingshuoming;
	
	/**
	 * 申请时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shenqingshijian;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：招募时间
	 */
	public void setZhaomushijian(String zhaomushijian) {
		this.zhaomushijian = zhaomushijian;
	}
	/**
	 * 获取：招募时间
	 */
	public String getZhaomushijian() {
		return zhaomushijian;
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
	 * 设置：申请说明
	 */
	public void setShenqingshuoming(String shenqingshuoming) {
		this.shenqingshuoming = shenqingshuoming;
	}
	/**
	 * 获取：申请说明
	 */
	public String getShenqingshuoming() {
		return shenqingshuoming;
	}
	/**
	 * 设置：申请时间
	 */
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
