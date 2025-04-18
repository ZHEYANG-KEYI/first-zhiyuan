package com.entity.view;

import com.entity.CanjiapeixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 参加培训
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 */
@TableName("canjiapeixun")
public class CanjiapeixunView  extends CanjiapeixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CanjiapeixunView(){
	}
 
 	public CanjiapeixunView(CanjiapeixunEntity canjiapeixunEntity){
 	try {
			BeanUtils.copyProperties(this, canjiapeixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
