package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CanjiapeixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CanjiapeixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CanjiapeixunView;


/**
 * 参加培训
 *
 * @author 
 * @email 
 */
public interface CanjiapeixunService extends IService<CanjiapeixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CanjiapeixunVO> selectListVO(Wrapper<CanjiapeixunEntity> wrapper);
   	
   	CanjiapeixunVO selectVO(@Param("ew") Wrapper<CanjiapeixunEntity> wrapper);
   	
   	List<CanjiapeixunView> selectListView(Wrapper<CanjiapeixunEntity> wrapper);
   	
   	CanjiapeixunView selectView(@Param("ew") Wrapper<CanjiapeixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CanjiapeixunEntity> wrapper);

   	

}

