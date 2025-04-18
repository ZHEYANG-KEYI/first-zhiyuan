package com.dao;

import com.entity.RenwujinzhanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenwujinzhanVO;
import com.entity.view.RenwujinzhanView;


/**
 * 任务进展
 * 
 * @author 
 * @email 
 */
public interface RenwujinzhanDao extends BaseMapper<RenwujinzhanEntity> {
	
	List<RenwujinzhanVO> selectListVO(@Param("ew") Wrapper<RenwujinzhanEntity> wrapper);
	
	RenwujinzhanVO selectVO(@Param("ew") Wrapper<RenwujinzhanEntity> wrapper);
	
	List<RenwujinzhanView> selectListView(@Param("ew") Wrapper<RenwujinzhanEntity> wrapper);

	List<RenwujinzhanView> selectListView(Pagination page,@Param("ew") Wrapper<RenwujinzhanEntity> wrapper);

	
	RenwujinzhanView selectView(@Param("ew") Wrapper<RenwujinzhanEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<RenwujinzhanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<RenwujinzhanEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<RenwujinzhanEntity> wrapper);



}
