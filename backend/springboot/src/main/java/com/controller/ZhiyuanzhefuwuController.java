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

import com.entity.ZhiyuanzhefuwuEntity;
import com.entity.view.ZhiyuanzhefuwuView;

import com.service.ZhiyuanzhefuwuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 志愿者服务
 * 后端接口
 * @author 
 * @email 
 */
@RestController
@RequestMapping("/zhiyuanzhefuwu")
public class ZhiyuanzhefuwuController {
    @Autowired
    private ZhiyuanzhefuwuService zhiyuanzhefuwuService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhiyuanzhefuwuEntity zhiyuanzhefuwu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhiyuanxiaozuzhang")) {
			zhiyuanzhefuwu.setXiaozubianhao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhiyuanzhefuwuEntity> ew = new EntityWrapper<ZhiyuanzhefuwuEntity>();

		PageUtils page = zhiyuanzhefuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiyuanzhefuwu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhiyuanzhefuwuEntity zhiyuanzhefuwu, 
		HttpServletRequest request){
        EntityWrapper<ZhiyuanzhefuwuEntity> ew = new EntityWrapper<ZhiyuanzhefuwuEntity>();

		PageUtils page = zhiyuanzhefuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiyuanzhefuwu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhiyuanzhefuwuEntity zhiyuanzhefuwu){
       	EntityWrapper<ZhiyuanzhefuwuEntity> ew = new EntityWrapper<ZhiyuanzhefuwuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhiyuanzhefuwu, "zhiyuanzhefuwu")); 
        return R.ok().put("data", zhiyuanzhefuwuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhiyuanzhefuwuEntity zhiyuanzhefuwu){
        EntityWrapper< ZhiyuanzhefuwuEntity> ew = new EntityWrapper< ZhiyuanzhefuwuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhiyuanzhefuwu, "zhiyuanzhefuwu")); 
		ZhiyuanzhefuwuView zhiyuanzhefuwuView =  zhiyuanzhefuwuService.selectView(ew);
		return R.ok("查询志愿者服务成功").put("data", zhiyuanzhefuwuView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhiyuanzhefuwuEntity zhiyuanzhefuwu = zhiyuanzhefuwuService.selectById(id);
		zhiyuanzhefuwu.setClicknum(zhiyuanzhefuwu.getClicknum()+1);
		zhiyuanzhefuwu.setClicktime(new Date());
		zhiyuanzhefuwuService.updateById(zhiyuanzhefuwu);
        zhiyuanzhefuwu = zhiyuanzhefuwuService.selectView(new EntityWrapper<ZhiyuanzhefuwuEntity>().eq("id", id));
        return R.ok().put("data", zhiyuanzhefuwu);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhiyuanzhefuwuEntity zhiyuanzhefuwu = zhiyuanzhefuwuService.selectById(id);
		zhiyuanzhefuwu.setClicknum(zhiyuanzhefuwu.getClicknum()+1);
		zhiyuanzhefuwu.setClicktime(new Date());
		zhiyuanzhefuwuService.updateById(zhiyuanzhefuwu);
        zhiyuanzhefuwu = zhiyuanzhefuwuService.selectView(new EntityWrapper<ZhiyuanzhefuwuEntity>().eq("id", id));
        return R.ok().put("data", zhiyuanzhefuwu);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhiyuanzhefuwuEntity zhiyuanzhefuwu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhiyuanzhefuwu);
        zhiyuanzhefuwuService.insert(zhiyuanzhefuwu);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhiyuanzhefuwuEntity zhiyuanzhefuwu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhiyuanzhefuwu);
        zhiyuanzhefuwuService.insert(zhiyuanzhefuwu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhiyuanzhefuwuEntity zhiyuanzhefuwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhiyuanzhefuwu);
        zhiyuanzhefuwuService.updateById(zhiyuanzhefuwu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhiyuanzhefuwuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前台智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ZhiyuanzhefuwuEntity zhiyuanzhefuwu, HttpServletRequest request,String pre){
        EntityWrapper<ZhiyuanzhefuwuEntity> ew = new EntityWrapper<ZhiyuanzhefuwuEntity>();
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
		PageUtils page = zhiyuanzhefuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiyuanzhefuwu), params), params));
        return R.ok().put("data", page);
    }










}
