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

import com.entity.PeixunxinxiEntity;
import com.entity.view.PeixunxinxiView;

import com.service.PeixunxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 培训信息
 * 后端接口
 * @author 
 * @email 
 */
@RestController
@RequestMapping("/peixunxinxi")
public class PeixunxinxiController {
    @Autowired
    private PeixunxinxiService peixunxinxiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PeixunxinxiEntity peixunxinxi,
		HttpServletRequest request){
        EntityWrapper<PeixunxinxiEntity> ew = new EntityWrapper<PeixunxinxiEntity>();

		PageUtils page = peixunxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, peixunxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PeixunxinxiEntity peixunxinxi, 
		HttpServletRequest request){
        EntityWrapper<PeixunxinxiEntity> ew = new EntityWrapper<PeixunxinxiEntity>();

		PageUtils page = peixunxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, peixunxinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PeixunxinxiEntity peixunxinxi){
       	EntityWrapper<PeixunxinxiEntity> ew = new EntityWrapper<PeixunxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( peixunxinxi, "peixunxinxi")); 
        return R.ok().put("data", peixunxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PeixunxinxiEntity peixunxinxi){
        EntityWrapper< PeixunxinxiEntity> ew = new EntityWrapper< PeixunxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( peixunxinxi, "peixunxinxi")); 
		PeixunxinxiView peixunxinxiView =  peixunxinxiService.selectView(ew);
		return R.ok("查询培训信息成功").put("data", peixunxinxiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PeixunxinxiEntity peixunxinxi = peixunxinxiService.selectById(id);
        return R.ok().put("data", peixunxinxi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PeixunxinxiEntity peixunxinxi = peixunxinxiService.selectById(id);
        return R.ok().put("data", peixunxinxi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PeixunxinxiEntity peixunxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(peixunxinxi);
        peixunxinxiService.insert(peixunxinxi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PeixunxinxiEntity peixunxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(peixunxinxi);
        peixunxinxiService.insert(peixunxinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody PeixunxinxiEntity peixunxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(peixunxinxi);
        peixunxinxiService.updateById(peixunxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        peixunxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
