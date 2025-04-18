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


import com.dao.RenwutongzhiDao;
import com.entity.RenwutongzhiEntity;
import com.service.RenwutongzhiService;
import com.entity.vo.RenwutongzhiVO;
import com.entity.view.RenwutongzhiView;

@Service("renwutongzhiService")
public class RenwutongzhiServiceImpl extends ServiceImpl<RenwutongzhiDao, RenwutongzhiEntity> implements RenwutongzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenwutongzhiEntity> page = this.selectPage(
                new Query<RenwutongzhiEntity>(params).getPage(),
                new EntityWrapper<RenwutongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenwutongzhiEntity> wrapper) {
		  Page<RenwutongzhiView> page =new Query<RenwutongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<RenwutongzhiVO> selectListVO(Wrapper<RenwutongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenwutongzhiVO selectVO(Wrapper<RenwutongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenwutongzhiView> selectListView(Wrapper<RenwutongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenwutongzhiView selectView(Wrapper<RenwutongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
