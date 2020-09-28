package com.wb.spring.aop;

import com.wb.spring.aop.annotation.TargetDataSource;

/**
 * Created by wangbin33 on 2020/1/14.
 */
public interface UserService {

	@TargetDataSource(value = "test")
	String say();
}
