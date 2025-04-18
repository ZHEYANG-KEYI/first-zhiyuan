package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenwutongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenwutongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenwutongzhiView;


/**
 * 任务通知
 *
 * @author 
 * @email 
 */
public interface RenwutongzhiService extends IService<RenwutongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenwutongzhiVO> selectListVO(Wrapper<RenwutongzhiEntity> wrapper);
   	
   	RenwutongzhiVO selectVO(@Param("ew") Wrapper<RenwutongzhiEntity> wrapper);
   	
   	List<RenwutongzhiView> selectListView(Wrapper<RenwutongzhiEntity> wrapper);
   	
   	RenwutongzhiView selectView(@Param("ew") Wrapper<RenwutongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenwutongzhiEntity> wrapper);

   	

}

