package com.dao;

import com.entity.CanjiapeixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CanjiapeixunVO;
import com.entity.view.CanjiapeixunView;


/**
 * 参加培训
 * 
 * @author 
 * @email 
 */
public interface CanjiapeixunDao extends BaseMapper<CanjiapeixunEntity> {
	
	List<CanjiapeixunVO> selectListVO(@Param("ew") Wrapper<CanjiapeixunEntity> wrapper);
	
	CanjiapeixunVO selectVO(@Param("ew") Wrapper<CanjiapeixunEntity> wrapper);
	
	List<CanjiapeixunView> selectListView(@Param("ew") Wrapper<CanjiapeixunEntity> wrapper);

	List<CanjiapeixunView> selectListView(Pagination page,@Param("ew") Wrapper<CanjiapeixunEntity> wrapper);

	
	CanjiapeixunView selectView(@Param("ew") Wrapper<CanjiapeixunEntity> wrapper);
	

}
