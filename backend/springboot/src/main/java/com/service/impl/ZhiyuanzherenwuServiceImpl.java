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


import com.dao.ZhiyuanzherenwuDao;
import com.entity.ZhiyuanzherenwuEntity;
import com.service.ZhiyuanzherenwuService;
import com.entity.vo.ZhiyuanzherenwuVO;
import com.entity.view.ZhiyuanzherenwuView;

@Service("zhiyuanzherenwuService")
public class ZhiyuanzherenwuServiceImpl extends ServiceImpl<ZhiyuanzherenwuDao, ZhiyuanzherenwuEntity> implements ZhiyuanzherenwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiyuanzherenwuEntity> page = this.selectPage(
                new Query<ZhiyuanzherenwuEntity>(params).getPage(),
                new EntityWrapper<ZhiyuanzherenwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiyuanzherenwuEntity> wrapper) {
		  Page<ZhiyuanzherenwuView> page =new Query<ZhiyuanzherenwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZhiyuanzherenwuVO> selectListVO(Wrapper<ZhiyuanzherenwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiyuanzherenwuVO selectVO(Wrapper<ZhiyuanzherenwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiyuanzherenwuView> selectListView(Wrapper<ZhiyuanzherenwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiyuanzherenwuView selectView(Wrapper<ZhiyuanzherenwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
