package com.dao;

import com.entity.FuwutongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwutongjiVO;
import com.entity.view.FuwutongjiView;


/**
 * 服务统计
 * 
 * @author 
 * @email 
 */
public interface FuwutongjiDao extends BaseMapper<FuwutongjiEntity> {
	
	List<FuwutongjiVO> selectListVO(@Param("ew") Wrapper<FuwutongjiEntity> wrapper);
	
	FuwutongjiVO selectVO(@Param("ew") Wrapper<FuwutongjiEntity> wrapper);
	
	List<FuwutongjiView> selectListView(@Param("ew") Wrapper<FuwutongjiEntity> wrapper);

	List<FuwutongjiView> selectListView(Pagination page,@Param("ew") Wrapper<FuwutongjiEntity> wrapper);

	
	FuwutongjiView selectView(@Param("ew") Wrapper<FuwutongjiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<FuwutongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<FuwutongjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<FuwutongjiEntity> wrapper);



}
