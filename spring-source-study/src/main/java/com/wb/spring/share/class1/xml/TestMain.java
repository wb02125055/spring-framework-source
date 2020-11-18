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
		System.out.println("beanDefinitionCount: " + acx.getBeanDefinitionCount());
		Object hotDog = acx.getBean("hotDog");
		System.out.println(hotDog);
		for (String beanName : acx.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}

//		ApplicationContext acx = new ClassPathXmlApplicationContext("spring-${user.name}.xml");
//
//		Object myProcessor = acx.getBean("otherProcessor");
//		System.out.println(myProcessor);
	}
}
