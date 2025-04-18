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

import com.entity.ZhiyuanzherenwuEntity;
import com.entity.view.ZhiyuanzherenwuView;

import com.service.ZhiyuanzherenwuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 志愿者任务
 * 后端接口
 * @author 
 * @email 
 */
@RestController
@RequestMapping("/zhiyuanzherenwu")
public class ZhiyuanzherenwuController {
    @Autowired
    private ZhiyuanzherenwuService zhiyuanzherenwuService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhiyuanzherenwuEntity zhiyuanzherenwu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhiyuanzhe")) {
			zhiyuanzherenwu.setZhiyuanzhezhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhiyuanzherenwuEntity> ew = new EntityWrapper<ZhiyuanzherenwuEntity>();

		PageUtils page = zhiyuanzherenwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiyuanzherenwu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhiyuanzherenwuEntity zhiyuanzherenwu, 
		HttpServletRequest request){
        EntityWrapper<ZhiyuanzherenwuEntity> ew = new EntityWrapper<ZhiyuanzherenwuEntity>();

		PageUtils page = zhiyuanzherenwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiyuanzherenwu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhiyuanzherenwuEntity zhiyuanzherenwu){
       	EntityWrapper<ZhiyuanzherenwuEntity> ew = new EntityWrapper<ZhiyuanzherenwuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhiyuanzherenwu, "zhiyuanzherenwu")); 
        return R.ok().put("data", zhiyuanzherenwuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhiyuanzherenwuEntity zhiyuanzherenwu){
        EntityWrapper< ZhiyuanzherenwuEntity> ew = new EntityWrapper< ZhiyuanzherenwuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhiyuanzherenwu, "zhiyuanzherenwu")); 
		ZhiyuanzherenwuView zhiyuanzherenwuView =  zhiyuanzherenwuService.selectView(ew);
		return R.ok("查询志愿者任务成功").put("data", zhiyuanzherenwuView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhiyuanzherenwuEntity zhiyuanzherenwu = zhiyuanzherenwuService.selectById(id);
        return R.ok().put("data", zhiyuanzherenwu);
    }

    /**
     * 前台详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhiyuanzherenwuEntity zhiyuanzherenwu = zhiyuanzherenwuService.selectById(id);
        return R.ok().put("data", zhiyuanzherenwu);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhiyuanzherenwuEntity zhiyuanzherenwu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhiyuanzherenwu);
        zhiyuanzherenwuService.insert(zhiyuanzherenwu);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhiyuanzherenwuEntity zhiyuanzherenwu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhiyuanzherenwu);
        zhiyuanzherenwuService.insert(zhiyuanzherenwu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhiyuanzherenwuEntity zhiyuanzherenwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhiyuanzherenwu);
        zhiyuanzherenwuService.updateById(zhiyuanzherenwu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhiyuanzherenwuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
