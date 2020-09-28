package com.wb.spring.aop;

import org.springframework.stereotype.Component;

/**
 * @author wangbin33
 * @date Created in 12:05 2019/10/10
 */
//@Component
public class TestController {
	public void test(String name) {
		System.out.println("name:" + name);
	}
}
