package com.wb.spring.beaninit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 *
 * @author wangbin33
 * @date 2020/4/26 20:17
 */
@Configuration
@ComponentScan(basePackages = "com.wb.spring.beaninit")
public class BeanConfig1 {

//	@Bean
//	public User user() {
//		return new User(UUID.randomUUID().toString());
//	}
}
