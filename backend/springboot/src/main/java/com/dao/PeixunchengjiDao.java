package com.dao;

import com.entity.PeixunchengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeixunchengjiVO;
import com.entity.view.PeixunchengjiView;


/**
 * 培训成绩
 * 
 * @author 
 * @email 
 */
public interface PeixunchengjiDao extends BaseMapper<PeixunchengjiEntity> {
	
	List<PeixunchengjiVO> selectListVO(@Param("ew") Wrapper<PeixunchengjiEntity> wrapper);
	
	PeixunchengjiVO selectVO(@Param("ew") Wrapper<PeixunchengjiEntity> wrapper);
	
	List<PeixunchengjiView> selectListView(@Param("ew") Wrapper<PeixunchengjiEntity> wrapper);

	List<PeixunchengjiView> selectListView(Pagination page,@Param("ew") Wrapper<PeixunchengjiEntity> wrapper);

	
	PeixunchengjiView selectView(@Param("ew") Wrapper<PeixunchengjiEntity> wrapper);
	

}
