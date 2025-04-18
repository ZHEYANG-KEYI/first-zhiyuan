package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.RenwutongzhiEntity;
import com.entity.view.RenwutongzhiView;

import com.service.RenwutongzhiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 任务通知
 * 后端接口
 * @author 
 * @email 
 */
@RestController
@RequestMapping("/renwutongzhi")
public class RenwutongzhiController {
    @Autowired
    private RenwutongzhiService renwutongzhiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RenwutongzhiEntity renwutongzhi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhiyuanzhe")) {
			renwutongzhi.setZhiyuanzhezhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<RenwutongzhiEntity> ew = new EntityWrapper<RenwutongzhiEntity>();

		PageUtils page = renwutongzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, renwutongzhi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RenwutongzhiEntity renwutongzhi, 
		HttpServletRequest request){
        EntityWrapper<RenwutongzhiEntity> ew = new EntityWrapper<RenwutongzhiEntity>();

		PageUtils page = renwutongzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, renwutongzhi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RenwutongzhiEntity renwutongzhi){
       	EntityWrapper<RenwutongzhiEntity> ew = new EntityWrapper<RenwutongzhiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( renwutongzhi, "renwutongzhi")); 
        return R.ok().put("data", renwutongzhiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RenwutongzhiEntity renwutongzhi){
        EntityWrapper< RenwutongzhiEntity> ew = new EntityWrapper< RenwutongzhiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( renwutongzhi, "renwutongzhi")); 
		RenwutongzhiView renwutongzhiView =  renwutongzhiService.selectView(ew);
		return R.ok("查询任务通知成功").put("data", renwutongzhiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RenwutongzhiEntity renwutongzhi = renwutongzhiService.selectById(id);
        return R.ok().put("data", renwutongzhi);
    }

    /**
     * 前台详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RenwutongzhiEntity renwutongzhi = renwutongzhiService.selectById(id);
        return R.ok().put("data", renwutongzhi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RenwutongzhiEntity renwutongzhi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(renwutongzhi);
        renwutongzhiService.insert(renwutongzhi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RenwutongzhiEntity renwutongzhi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(renwutongzhi);
        renwutongzhiService.insert(renwutongzhi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody RenwutongzhiEntity renwutongzhi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(renwutongzhi);
        renwutongzhiService.updateById(renwutongzhi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        renwutongzhiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
