package com.dao;

import com.entity.HuodongzhubanfangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuodongzhubanfangVO;
import com.entity.view.HuodongzhubanfangView;


/**
 * 活动主办方
 * 
 * @author 
 * @email 
 */
public interface HuodongzhubanfangDao extends BaseMapper<HuodongzhubanfangEntity> {
	
	List<HuodongzhubanfangVO> selectListVO(@Param("ew") Wrapper<HuodongzhubanfangEntity> wrapper);
	
	HuodongzhubanfangVO selectVO(@Param("ew") Wrapper<HuodongzhubanfangEntity> wrapper);
	
	List<HuodongzhubanfangView> selectListView(@Param("ew") Wrapper<HuodongzhubanfangEntity> wrapper);

	List<HuodongzhubanfangView> selectListView(Pagination page,@Param("ew") Wrapper<HuodongzhubanfangEntity> wrapper);

	
	HuodongzhubanfangView selectView(@Param("ew") Wrapper<HuodongzhubanfangEntity> wrapper);
	

}
