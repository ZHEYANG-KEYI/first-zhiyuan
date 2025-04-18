package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeixunchengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeixunchengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeixunchengjiView;


/**
 * 培训成绩
 *
 * @author 
 * @email 
 */
public interface PeixunchengjiService extends IService<PeixunchengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeixunchengjiVO> selectListVO(Wrapper<PeixunchengjiEntity> wrapper);
   	
   	PeixunchengjiVO selectVO(@Param("ew") Wrapper<PeixunchengjiEntity> wrapper);
   	
   	List<PeixunchengjiView> selectListView(Wrapper<PeixunchengjiEntity> wrapper);
   	
   	PeixunchengjiView selectView(@Param("ew") Wrapper<PeixunchengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeixunchengjiEntity> wrapper);

   	

}

