package com.dao;

import com.entity.ZhaomushenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhaomushenqingVO;
import com.entity.view.ZhaomushenqingView;


/**
 * 招募申请
 * 
 * @author 
 * @email 
 */
public interface ZhaomushenqingDao extends BaseMapper<ZhaomushenqingEntity> {
	
	List<ZhaomushenqingVO> selectListVO(@Param("ew") Wrapper<ZhaomushenqingEntity> wrapper);
	
	ZhaomushenqingVO selectVO(@Param("ew") Wrapper<ZhaomushenqingEntity> wrapper);
	
	List<ZhaomushenqingView> selectListView(@Param("ew") Wrapper<ZhaomushenqingEntity> wrapper);

	List<ZhaomushenqingView> selectListView(Pagination page,@Param("ew") Wrapper<ZhaomushenqingEntity> wrapper);

	
	ZhaomushenqingView selectView(@Param("ew") Wrapper<ZhaomushenqingEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhaomushenqingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhaomushenqingEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhaomushenqingEntity> wrapper);



}
