package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenwujinzhanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenwujinzhanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenwujinzhanView;


/**
 * 任务进展
 *
 * @author 
 * @email 
 */
public interface RenwujinzhanService extends IService<RenwujinzhanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenwujinzhanVO> selectListVO(Wrapper<RenwujinzhanEntity> wrapper);
   	
   	RenwujinzhanVO selectVO(@Param("ew") Wrapper<RenwujinzhanEntity> wrapper);
   	
   	List<RenwujinzhanView> selectListView(Wrapper<RenwujinzhanEntity> wrapper);
   	
   	RenwujinzhanView selectView(@Param("ew") Wrapper<RenwujinzhanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenwujinzhanEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<RenwujinzhanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<RenwujinzhanEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<RenwujinzhanEntity> wrapper);



}

