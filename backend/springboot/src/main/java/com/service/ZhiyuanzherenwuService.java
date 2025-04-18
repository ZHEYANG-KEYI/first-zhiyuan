package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiyuanzherenwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiyuanzherenwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiyuanzherenwuView;


/**
 * 志愿者任务
 *
 * @author 
 * @email 
 */
public interface ZhiyuanzherenwuService extends IService<ZhiyuanzherenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiyuanzherenwuVO> selectListVO(Wrapper<ZhiyuanzherenwuEntity> wrapper);
   	
   	ZhiyuanzherenwuVO selectVO(@Param("ew") Wrapper<ZhiyuanzherenwuEntity> wrapper);
   	
   	List<ZhiyuanzherenwuView> selectListView(Wrapper<ZhiyuanzherenwuEntity> wrapper);
   	
   	ZhiyuanzherenwuView selectView(@Param("ew") Wrapper<ZhiyuanzherenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiyuanzherenwuEntity> wrapper);

   	

}

