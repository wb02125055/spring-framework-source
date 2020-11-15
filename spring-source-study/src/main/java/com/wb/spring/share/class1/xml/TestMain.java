package com.wb.spring.share.class1.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 *
 * @author wangbin33
 * @date 2020/11/15 23:41
 */
public class TestMain {
	public static void main(String[] args) {
		ApplicationContext acx = new ClassPathXmlApplicationContext("class1/spring-config.xml");
		Object hotDog = acx.getBean("hotDog");
		System.out.println(hotDog);
	}
}
