package com.entity.view;

import com.entity.ZhiyuanzherenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 志愿者任务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 */
@TableName("zhiyuanzherenwu")
public class ZhiyuanzherenwuView  extends ZhiyuanzherenwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhiyuanzherenwuView(){
	}
 
 	public ZhiyuanzherenwuView(ZhiyuanzherenwuEntity zhiyuanzherenwuEntity){
 	try {
			BeanUtils.copyProperties(this, zhiyuanzherenwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
