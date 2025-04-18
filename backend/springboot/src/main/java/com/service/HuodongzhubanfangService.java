package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuodongzhubanfangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuodongzhubanfangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongzhubanfangView;


/**
 * 活动主办方
 *
 * @author 
 * @email 
 */
public interface HuodongzhubanfangService extends IService<HuodongzhubanfangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuodongzhubanfangVO> selectListVO(Wrapper<HuodongzhubanfangEntity> wrapper);
   	
   	HuodongzhubanfangVO selectVO(@Param("ew") Wrapper<HuodongzhubanfangEntity> wrapper);
   	
   	List<HuodongzhubanfangView> selectListView(Wrapper<HuodongzhubanfangEntity> wrapper);
   	
   	HuodongzhubanfangView selectView(@Param("ew") Wrapper<HuodongzhubanfangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuodongzhubanfangEntity> wrapper);

   	

}

