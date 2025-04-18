package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwutongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwutongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwutongjiView;


/**
 * 服务统计
 *
 * @author 
 * @email 
 */
public interface FuwutongjiService extends IService<FuwutongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwutongjiVO> selectListVO(Wrapper<FuwutongjiEntity> wrapper);
   	
   	FuwutongjiVO selectVO(@Param("ew") Wrapper<FuwutongjiEntity> wrapper);
   	
   	List<FuwutongjiView> selectListView(Wrapper<FuwutongjiEntity> wrapper);
   	
   	FuwutongjiView selectView(@Param("ew") Wrapper<FuwutongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwutongjiEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<FuwutongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<FuwutongjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<FuwutongjiEntity> wrapper);



}

