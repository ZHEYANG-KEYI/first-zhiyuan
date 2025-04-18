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


import com.dao.FuwutongjiDao;
import com.entity.FuwutongjiEntity;
import com.service.FuwutongjiService;
import com.entity.vo.FuwutongjiVO;
import com.entity.view.FuwutongjiView;

@Service("fuwutongjiService")
public class FuwutongjiServiceImpl extends ServiceImpl<FuwutongjiDao, FuwutongjiEntity> implements FuwutongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwutongjiEntity> page = this.selectPage(
                new Query<FuwutongjiEntity>(params).getPage(),
                new EntityWrapper<FuwutongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwutongjiEntity> wrapper) {
		  Page<FuwutongjiView> page =new Query<FuwutongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<FuwutongjiVO> selectListVO(Wrapper<FuwutongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwutongjiVO selectVO(Wrapper<FuwutongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwutongjiView> selectListView(Wrapper<FuwutongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwutongjiView selectView(Wrapper<FuwutongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<FuwutongjiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<FuwutongjiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<FuwutongjiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
