package com.entity.view;

import com.entity.ZhaomushenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 招募申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 */
@TableName("zhaomushenqing")
public class ZhaomushenqingView  extends ZhaomushenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhaomushenqingView(){
	}
 
 	public ZhaomushenqingView(ZhaomushenqingEntity zhaomushenqingEntity){
 	try {
			BeanUtils.copyProperties(this, zhaomushenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
