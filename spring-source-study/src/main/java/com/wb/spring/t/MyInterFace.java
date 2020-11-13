package com.wb.spring.t;

import org.springframework.context.annotation.Bean;

/**
 * Description:
 *
 * @author wangbin33
 * @date 2020/11/1 10:50
 */
public interface MyInterFace {
	@Bean
	default String show() {
//		System.out.println("---------------------");
		return "show";
	}
}
