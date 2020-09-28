package com.wb.spring.aop;

import org.springframework.stereotype.Service;

/**
 * Created by wangbin33 on 2020/1/14.
 */
//@Service("userService")
public class UserServiceImpl implements UserService {
	@Override
	public String say() {
		System.out.println("UserService.say...");
		return "say";
	}
}
