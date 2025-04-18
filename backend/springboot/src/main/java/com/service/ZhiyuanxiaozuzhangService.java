package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiyuanxiaozuzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiyuanxiaozuzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiyuanxiaozuzhangView;


/**
 * 志愿小组长
 *
 * @author 
 * @email 
 */
public interface ZhiyuanxiaozuzhangService extends IService<ZhiyuanxiaozuzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiyuanxiaozuzhangVO> selectListVO(Wrapper<ZhiyuanxiaozuzhangEntity> wrapper);
   	
   	ZhiyuanxiaozuzhangVO selectVO(@Param("ew") Wrapper<ZhiyuanxiaozuzhangEntity> wrapper);
   	
   	List<ZhiyuanxiaozuzhangView> selectListView(Wrapper<ZhiyuanxiaozuzhangEntity> wrapper);
   	
   	ZhiyuanxiaozuzhangView selectView(@Param("ew") Wrapper<ZhiyuanxiaozuzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiyuanxiaozuzhangEntity> wrapper);

   	

}

