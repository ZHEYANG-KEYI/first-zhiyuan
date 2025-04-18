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


import com.dao.PeixunchengjiDao;
import com.entity.PeixunchengjiEntity;
import com.service.PeixunchengjiService;
import com.entity.vo.PeixunchengjiVO;
import com.entity.view.PeixunchengjiView;

@Service("peixunchengjiService")
public class PeixunchengjiServiceImpl extends ServiceImpl<PeixunchengjiDao, PeixunchengjiEntity> implements PeixunchengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeixunchengjiEntity> page = this.selectPage(
                new Query<PeixunchengjiEntity>(params).getPage(),
                new EntityWrapper<PeixunchengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeixunchengjiEntity> wrapper) {
		  Page<PeixunchengjiView> page =new Query<PeixunchengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<PeixunchengjiVO> selectListVO(Wrapper<PeixunchengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeixunchengjiVO selectVO(Wrapper<PeixunchengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeixunchengjiView> selectListView(Wrapper<PeixunchengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeixunchengjiView selectView(Wrapper<PeixunchengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
