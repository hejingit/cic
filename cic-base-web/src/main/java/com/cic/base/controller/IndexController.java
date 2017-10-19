/**
 * Project Name:cic-base-web
 * File Name:IndexController.java
 * Package Name:com.cic.base.controller
 * Date:2017年10月18日下午10:58:22
 * Copyright (c) 2017, Jin.He (mailto:hejin@primeton.com) All Rights Reserved.
 *
*/

package com.cic.base.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cic.base.mapper.UserMapper;

/**
 * ClassName:IndexController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年10月18日 下午10:58:22 <br/>
 * @author   Jin.He (mailto:hejin@primeton.com)
 * @version  
 * @see 	 
 */
@Controller
public class IndexController {
	@Autowired
    private UserMapper userMapper;
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	@ResponseBody
	public String mainPageInfo(Map<String, Object> model){
		model.put("pos", userMapper.selectAll());
		return "/index";
	}
}

