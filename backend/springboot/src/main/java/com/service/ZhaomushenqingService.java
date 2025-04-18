package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhaomushenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhaomushenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhaomushenqingView;


/**
 * 招募申请
 *
 * @author 
 * @email 
 */
public interface ZhaomushenqingService extends IService<ZhaomushenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhaomushenqingVO> selectListVO(Wrapper<ZhaomushenqingEntity> wrapper);
   	
   	ZhaomushenqingVO selectVO(@Param("ew") Wrapper<ZhaomushenqingEntity> wrapper);
   	
   	List<ZhaomushenqingView> selectListView(Wrapper<ZhaomushenqingEntity> wrapper);
   	
   	ZhaomushenqingView selectView(@Param("ew") Wrapper<ZhaomushenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhaomushenqingEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZhaomushenqingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZhaomushenqingEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZhaomushenqingEntity> wrapper);



}

