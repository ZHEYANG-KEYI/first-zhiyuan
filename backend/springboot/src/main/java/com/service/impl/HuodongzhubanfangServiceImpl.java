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


import com.dao.HuodongzhubanfangDao;
import com.entity.HuodongzhubanfangEntity;
import com.service.HuodongzhubanfangService;
import com.entity.vo.HuodongzhubanfangVO;
import com.entity.view.HuodongzhubanfangView;

@Service("huodongzhubanfangService")
public class HuodongzhubanfangServiceImpl extends ServiceImpl<HuodongzhubanfangDao, HuodongzhubanfangEntity> implements HuodongzhubanfangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuodongzhubanfangEntity> page = this.selectPage(
                new Query<HuodongzhubanfangEntity>(params).getPage(),
                new EntityWrapper<HuodongzhubanfangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuodongzhubanfangEntity> wrapper) {
		  Page<HuodongzhubanfangView> page =new Query<HuodongzhubanfangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<HuodongzhubanfangVO> selectListVO(Wrapper<HuodongzhubanfangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuodongzhubanfangVO selectVO(Wrapper<HuodongzhubanfangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuodongzhubanfangView> selectListView(Wrapper<HuodongzhubanfangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuodongzhubanfangView selectView(Wrapper<HuodongzhubanfangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
