package com.dao;

import com.entity.ZhiyuanxiaozuzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiyuanxiaozuzhangVO;
import com.entity.view.ZhiyuanxiaozuzhangView;


/**
 * 志愿小组长
 * 
 * @author 
 * @email 
 */
public interface ZhiyuanxiaozuzhangDao extends BaseMapper<ZhiyuanxiaozuzhangEntity> {
	
	List<ZhiyuanxiaozuzhangVO> selectListVO(@Param("ew") Wrapper<ZhiyuanxiaozuzhangEntity> wrapper);
	
	ZhiyuanxiaozuzhangVO selectVO(@Param("ew") Wrapper<ZhiyuanxiaozuzhangEntity> wrapper);
	
	List<ZhiyuanxiaozuzhangView> selectListView(@Param("ew") Wrapper<ZhiyuanxiaozuzhangEntity> wrapper);

	List<ZhiyuanxiaozuzhangView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiyuanxiaozuzhangEntity> wrapper);

	
	ZhiyuanxiaozuzhangView selectView(@Param("ew") Wrapper<ZhiyuanxiaozuzhangEntity> wrapper);
	

}
