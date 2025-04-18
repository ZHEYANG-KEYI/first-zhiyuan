package com.dao;

import com.entity.ZhiyuanzherenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiyuanzherenwuVO;
import com.entity.view.ZhiyuanzherenwuView;


/**
 * 志愿者任务
 * 
 * @author 
 * @email 
 */
public interface ZhiyuanzherenwuDao extends BaseMapper<ZhiyuanzherenwuEntity> {
	
	List<ZhiyuanzherenwuVO> selectListVO(@Param("ew") Wrapper<ZhiyuanzherenwuEntity> wrapper);
	
	ZhiyuanzherenwuVO selectVO(@Param("ew") Wrapper<ZhiyuanzherenwuEntity> wrapper);
	
	List<ZhiyuanzherenwuView> selectListView(@Param("ew") Wrapper<ZhiyuanzherenwuEntity> wrapper);

	List<ZhiyuanzherenwuView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiyuanzherenwuEntity> wrapper);

	
	ZhiyuanzherenwuView selectView(@Param("ew") Wrapper<ZhiyuanzherenwuEntity> wrapper);
	

}
