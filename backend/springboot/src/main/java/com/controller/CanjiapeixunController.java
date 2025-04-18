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

import com.entity.CanjiapeixunEntity;
import com.entity.view.CanjiapeixunView;

import com.service.CanjiapeixunService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 参加培训
 * 后端接口
 * @author 
 * @email 
 */
@RestController
@RequestMapping("/canjiapeixun")
public class CanjiapeixunController {
    @Autowired
    private CanjiapeixunService canjiapeixunService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,CanjiapeixunEntity canjiapeixun,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhiyuanzhe")) {
			canjiapeixun.setZhiyuanzhezhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<CanjiapeixunEntity> ew = new EntityWrapper<CanjiapeixunEntity>();

		PageUtils page = canjiapeixunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, canjiapeixun), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,CanjiapeixunEntity canjiapeixun, 
		HttpServletRequest request){
        EntityWrapper<CanjiapeixunEntity> ew = new EntityWrapper<CanjiapeixunEntity>();

		PageUtils page = canjiapeixunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, canjiapeixun), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( CanjiapeixunEntity canjiapeixun){
       	EntityWrapper<CanjiapeixunEntity> ew = new EntityWrapper<CanjiapeixunEntity>();
      	ew.allEq(MPUtil.allEQMapPre( canjiapeixun, "canjiapeixun")); 
        return R.ok().put("data", canjiapeixunService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(CanjiapeixunEntity canjiapeixun){
        EntityWrapper< CanjiapeixunEntity> ew = new EntityWrapper< CanjiapeixunEntity>();
 		ew.allEq(MPUtil.allEQMapPre( canjiapeixun, "canjiapeixun")); 
		CanjiapeixunView canjiapeixunView =  canjiapeixunService.selectView(ew);
		return R.ok("查询参加培训成功").put("data", canjiapeixunView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        CanjiapeixunEntity canjiapeixun = canjiapeixunService.selectById(id);
        return R.ok().put("data", canjiapeixun);
    }

    /**
     * 前台详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        CanjiapeixunEntity canjiapeixun = canjiapeixunService.selectById(id);
        return R.ok().put("data", canjiapeixun);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CanjiapeixunEntity canjiapeixun, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(canjiapeixun);
        canjiapeixunService.insert(canjiapeixun);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody CanjiapeixunEntity canjiapeixun, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(canjiapeixun);
        canjiapeixunService.insert(canjiapeixun);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody CanjiapeixunEntity canjiapeixun, HttpServletRequest request){
        //ValidatorUtils.validateEntity(canjiapeixun);
        canjiapeixunService.updateById(canjiapeixun);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        canjiapeixunService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
