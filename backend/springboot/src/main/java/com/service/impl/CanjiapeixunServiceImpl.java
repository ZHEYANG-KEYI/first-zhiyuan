package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CanjiapeixunDao;
import com.entity.CanjiapeixunEntity;
import com.service.CanjiapeixunService;
import com.entity.vo.CanjiapeixunVO;
import com.entity.view.CanjiapeixunView;

@Service("canjiapeixunService")
public class CanjiapeixunServiceImpl extends ServiceImpl<CanjiapeixunDao, CanjiapeixunEntity> implements CanjiapeixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CanjiapeixunEntity> page = this.selectPage(
                new Query<CanjiapeixunEntity>(params).getPage(),
                new EntityWrapper<CanjiapeixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CanjiapeixunEntity> wrapper) {
		  Page<CanjiapeixunView> page =new Query<CanjiapeixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<CanjiapeixunVO> selectListVO(Wrapper<CanjiapeixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CanjiapeixunVO selectVO(Wrapper<CanjiapeixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CanjiapeixunView> selectListView(Wrapper<CanjiapeixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CanjiapeixunView selectView(Wrapper<CanjiapeixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
