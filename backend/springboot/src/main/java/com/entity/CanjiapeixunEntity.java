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
 * 参加培训
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 */
@TableName("canjiapeixun")
public class CanjiapeixunEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CanjiapeixunEntity() {
		
	}
	
	public CanjiapeixunEntity(T t) {
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
	 * 培训名称
	 */
					
	private String peixunmingcheng;
	
	/**
	 * 培训图片
	 */
					
	private String peixuntupian;
	
	/**
	 * 培训时间
	 */
					
	private String peixunshijian;
	
	/**
	 * 培训地点
	 */
					
	private String peixundidian;
	
	/**
	 * 志愿者账号
	 */
					
	private String zhiyuanzhezhanghao;
	
	/**
	 * 志愿者姓名
	 */
					
	private String zhiyuanzhexingming;
	
	/**
	 * 手机号码
	 */
					
	private String shoujihaoma;
	
	/**
	 * 参加时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date canjiashijian;
	
	/**
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
	
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
	 * 设置：培训名称
	 */
	public void setPeixunmingcheng(String peixunmingcheng) {
		this.peixunmingcheng = peixunmingcheng;
	}
	/**
	 * 获取：培训名称
	 */
	public String getPeixunmingcheng() {
		return peixunmingcheng;
	}
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
	 * 设置：培训时间
	 */
	public void setPeixunshijian(String peixunshijian) {
		this.peixunshijian = peixunshijian;
	}
	/**
	 * 获取：培训时间
	 */
	public String getPeixunshijian() {
		return peixunshijian;
	}
	/**
	 * 设置：培训地点
	 */
	public void setPeixundidian(String peixundidian) {
		this.peixundidian = peixundidian;
	}
	/**
	 * 获取：培训地点
	 */
	public String getPeixundidian() {
		return peixundidian;
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
	 * 设置：手机号码
	 */
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
	/**
	 * 设置：参加时间
	 */
	public void setCanjiashijian(Date canjiashijian) {
		this.canjiashijian = canjiashijian;
	}
	/**
	 * 获取：参加时间
	 */
	public Date getCanjiashijian() {
		return canjiashijian;
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
