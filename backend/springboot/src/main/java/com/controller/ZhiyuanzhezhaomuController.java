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

import com.entity.ZhiyuanzhezhaomuEntity;
import com.entity.view.ZhiyuanzhezhaomuView;

import com.service.ZhiyuanzhezhaomuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 志愿者招募
 * 后端接口
 * @author 
 * @email 
 */
@RestController
@RequestMapping("/zhiyuanzhezhaomu")
public class ZhiyuanzhezhaomuController {
    @Autowired
    private ZhiyuanzhezhaomuService zhiyuanzhezhaomuService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhiyuanzhezhaomuEntity zhiyuanzhezhaomu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huodongzhubanfang")) {
			zhiyuanzhezhaomu.setZhubanfangzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhiyuanzhezhaomuEntity> ew = new EntityWrapper<ZhiyuanzhezhaomuEntity>();

		PageUtils page = zhiyuanzhezhaomuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiyuanzhezhaomu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhiyuanzhezhaomuEntity zhiyuanzhezhaomu, 
		HttpServletRequest request){
        EntityWrapper<ZhiyuanzhezhaomuEntity> ew = new EntityWrapper<ZhiyuanzhezhaomuEntity>();

		PageUtils page = zhiyuanzhezhaomuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiyuanzhezhaomu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhiyuanzhezhaomuEntity zhiyuanzhezhaomu){
       	EntityWrapper<ZhiyuanzhezhaomuEntity> ew = new EntityWrapper<ZhiyuanzhezhaomuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhiyuanzhezhaomu, "zhiyuanzhezhaomu")); 
        return R.ok().put("data", zhiyuanzhezhaomuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhiyuanzhezhaomuEntity zhiyuanzhezhaomu){
        EntityWrapper< ZhiyuanzhezhaomuEntity> ew = new EntityWrapper< ZhiyuanzhezhaomuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhiyuanzhezhaomu, "zhiyuanzhezhaomu")); 
		ZhiyuanzhezhaomuView zhiyuanzhezhaomuView =  zhiyuanzhezhaomuService.selectView(ew);
		return R.ok("查询志愿者招募成功").put("data", zhiyuanzhezhaomuView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhiyuanzhezhaomuEntity zhiyuanzhezhaomu = zhiyuanzhezhaomuService.selectById(id);
		zhiyuanzhezhaomu.setClicknum(zhiyuanzhezhaomu.getClicknum()+1);
		zhiyuanzhezhaomu.setClicktime(new Date());
		zhiyuanzhezhaomuService.updateById(zhiyuanzhezhaomu);
        zhiyuanzhezhaomu = zhiyuanzhezhaomuService.selectView(new EntityWrapper<ZhiyuanzhezhaomuEntity>().eq("id", id));
        return R.ok().put("data", zhiyuanzhezhaomu);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhiyuanzhezhaomuEntity zhiyuanzhezhaomu = zhiyuanzhezhaomuService.selectById(id);
		zhiyuanzhezhaomu.setClicknum(zhiyuanzhezhaomu.getClicknum()+1);
		zhiyuanzhezhaomu.setClicktime(new Date());
		zhiyuanzhezhaomuService.updateById(zhiyuanzhezhaomu);
        zhiyuanzhezhaomu = zhiyuanzhezhaomuService.selectView(new EntityWrapper<ZhiyuanzhezhaomuEntity>().eq("id", id));
        return R.ok().put("data", zhiyuanzhezhaomu);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhiyuanzhezhaomuEntity zhiyuanzhezhaomu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhiyuanzhezhaomu);
        zhiyuanzhezhaomuService.insert(zhiyuanzhezhaomu);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhiyuanzhezhaomuEntity zhiyuanzhezhaomu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhiyuanzhezhaomu);
        zhiyuanzhezhaomuService.insert(zhiyuanzhezhaomu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhiyuanzhezhaomuEntity zhiyuanzhezhaomu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhiyuanzhezhaomu);
        zhiyuanzhezhaomuService.updateById(zhiyuanzhezhaomu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhiyuanzhezhaomuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前台智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ZhiyuanzhezhaomuEntity zhiyuanzhezhaomu, HttpServletRequest request,String pre){
        EntityWrapper<ZhiyuanzhezhaomuEntity> ew = new EntityWrapper<ZhiyuanzhezhaomuEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = zhiyuanzhezhaomuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiyuanzhezhaomu), params), params));
        return R.ok().put("data", page);
    }










}
