package com.dao;

import com.entity.RenwutongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenwutongzhiVO;
import com.entity.view.RenwutongzhiView;


/**
 * 任务通知
 * 
 * @author 
 * @email 
 */
public interface RenwutongzhiDao extends BaseMapper<RenwutongzhiEntity> {
	
	List<RenwutongzhiVO> selectListVO(@Param("ew") Wrapper<RenwutongzhiEntity> wrapper);
	
	RenwutongzhiVO selectVO(@Param("ew") Wrapper<RenwutongzhiEntity> wrapper);
	
	List<RenwutongzhiView> selectListView(@Param("ew") Wrapper<RenwutongzhiEntity> wrapper);

	List<RenwutongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<RenwutongzhiEntity> wrapper);

	
	RenwutongzhiView selectView(@Param("ew") Wrapper<RenwutongzhiEntity> wrapper);
	

}
