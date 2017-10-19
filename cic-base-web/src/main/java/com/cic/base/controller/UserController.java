/**
 * Project Name:cic-base-web
 * File Name:UserController.java
 * Package Name:com.cic.base.controller
 * Date:2017年10月18日下午10:27:34
 * Copyright (c) 2017, Jin.He (mailto:hejin@primeton.com) All Rights Reserved.
 *
*/

package com.cic.base.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cic.base.mapper.UserMapper;

/**
 * ClassName:UserController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年10月18日 下午10:27:34 <br/>
 * @author   Jin.He (mailto:hejin@primeton.com)
 * @version  
 * @see 	 
 */
@RequestMapping("user")
@RestController
public class UserController {
	@Autowired
    private UserMapper userMapper;
    
    @GetMapping("/list/all")
    public Object listAll() {
        return userMapper.selectAll();
    }
    
}

