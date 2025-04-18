package com.entity.view;

import com.entity.RenwujinzhanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 任务进展
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 */
@TableName("renwujinzhan")
public class RenwujinzhanView  extends RenwujinzhanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RenwujinzhanView(){
	}
 
 	public RenwujinzhanView(RenwujinzhanEntity renwujinzhanEntity){
 	try {
			BeanUtils.copyProperties(this, renwujinzhanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
