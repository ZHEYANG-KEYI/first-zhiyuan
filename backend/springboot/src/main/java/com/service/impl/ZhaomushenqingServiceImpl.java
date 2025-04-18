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


import com.dao.ZhaomushenqingDao;
import com.entity.ZhaomushenqingEntity;
import com.service.ZhaomushenqingService;
import com.entity.vo.ZhaomushenqingVO;
import com.entity.view.ZhaomushenqingView;

@Service("zhaomushenqingService")
public class ZhaomushenqingServiceImpl extends ServiceImpl<ZhaomushenqingDao, ZhaomushenqingEntity> implements ZhaomushenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhaomushenqingEntity> page = this.selectPage(
                new Query<ZhaomushenqingEntity>(params).getPage(),
                new EntityWrapper<ZhaomushenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhaomushenqingEntity> wrapper) {
		  Page<ZhaomushenqingView> page =new Query<ZhaomushenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZhaomushenqingVO> selectListVO(Wrapper<ZhaomushenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhaomushenqingVO selectVO(Wrapper<ZhaomushenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhaomushenqingView> selectListView(Wrapper<ZhaomushenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhaomushenqingView selectView(Wrapper<ZhaomushenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZhaomushenqingEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZhaomushenqingEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZhaomushenqingEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
