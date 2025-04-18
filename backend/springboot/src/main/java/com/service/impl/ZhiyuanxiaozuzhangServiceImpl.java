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


import com.dao.ZhiyuanxiaozuzhangDao;
import com.entity.ZhiyuanxiaozuzhangEntity;
import com.service.ZhiyuanxiaozuzhangService;
import com.entity.vo.ZhiyuanxiaozuzhangVO;
import com.entity.view.ZhiyuanxiaozuzhangView;

@Service("zhiyuanxiaozuzhangService")
public class ZhiyuanxiaozuzhangServiceImpl extends ServiceImpl<ZhiyuanxiaozuzhangDao, ZhiyuanxiaozuzhangEntity> implements ZhiyuanxiaozuzhangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiyuanxiaozuzhangEntity> page = this.selectPage(
                new Query<ZhiyuanxiaozuzhangEntity>(params).getPage(),
                new EntityWrapper<ZhiyuanxiaozuzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiyuanxiaozuzhangEntity> wrapper) {
		  Page<ZhiyuanxiaozuzhangView> page =new Query<ZhiyuanxiaozuzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZhiyuanxiaozuzhangVO> selectListVO(Wrapper<ZhiyuanxiaozuzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiyuanxiaozuzhangVO selectVO(Wrapper<ZhiyuanxiaozuzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiyuanxiaozuzhangView> selectListView(Wrapper<ZhiyuanxiaozuzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiyuanxiaozuzhangView selectView(Wrapper<ZhiyuanxiaozuzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
