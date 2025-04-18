package com.entity.view;

import com.entity.PeixunchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 培训成绩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 */
@TableName("peixunchengji")
public class PeixunchengjiView  extends PeixunchengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeixunchengjiView(){
	}
 
 	public PeixunchengjiView(PeixunchengjiEntity peixunchengjiEntity){
 	try {
			BeanUtils.copyProperties(this, peixunchengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
