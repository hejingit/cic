/**
 * Project Name:cic-base-web
 * File Name:MainApplicion.java
 * Package Name:com.cic
 * Date:2017年10月18日下午10:26:00
 * Copyright (c) 2017, Jin.He (mailto:hejin@primeton.com) All Rights Reserved.
 *
*/

package com.cic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
public class MainApplicion {
	public static void main(String[] args) throws Exception {
        SpringApplication.run(MainApplicion.class, args);
    }
}

