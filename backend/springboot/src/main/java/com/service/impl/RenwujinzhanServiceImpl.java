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


import com.dao.RenwujinzhanDao;
import com.entity.RenwujinzhanEntity;
import com.service.RenwujinzhanService;
import com.entity.vo.RenwujinzhanVO;
import com.entity.view.RenwujinzhanView;

@Service("renwujinzhanService")
public class RenwujinzhanServiceImpl extends ServiceImpl<RenwujinzhanDao, RenwujinzhanEntity> implements RenwujinzhanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenwujinzhanEntity> page = this.selectPage(
                new Query<RenwujinzhanEntity>(params).getPage(),
                new EntityWrapper<RenwujinzhanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenwujinzhanEntity> wrapper) {
		  Page<RenwujinzhanView> page =new Query<RenwujinzhanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<RenwujinzhanVO> selectListVO(Wrapper<RenwujinzhanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenwujinzhanVO selectVO(Wrapper<RenwujinzhanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenwujinzhanView> selectListView(Wrapper<RenwujinzhanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenwujinzhanView selectView(Wrapper<RenwujinzhanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<RenwujinzhanEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<RenwujinzhanEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<RenwujinzhanEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
