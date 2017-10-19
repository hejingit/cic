/**
 * Project Name:cic-base-web
 * File Name:MainApplicion.java
 * Package Name:com.cic
 * Date:2017年10月18日下午10:26:00
 * Copyright (c) 2017, Jin.He (mailto:hejin@primeton.com) All Rights Reserved.
 *
*/

package com.cic;

import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cic.base.mapper.UserMapper;

/**
 * ClassName:MainApplicion <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年10月18日 下午10:26:00 <br/>
 * @author   Jin.He (mailto:hejin@primeton.com)
 * @version  
 * @see 	 
 */
//MyBatis 支持
@MapperScan("com.cic.base.mapper")
@SpringBootApplication
@Controller
public class MainApplicion extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MainApplicion.class);
	}
	public static void main(String[] args) throws Exception {
        SpringApplication.run(MainApplicion.class, args);
    }
	@Autowired
    private UserMapper userMapper;
	
	@RequestMapping("/")
	String home() {
		return "index";
	}
}

