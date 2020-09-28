package com.wb.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * Created by wangbin33 on 2020/1/14.
 */
//@Component
//@Aspect
public class DataSourceAspects implements Ordered {

	public DataSourceAspects() {
		System.out.println("init aspects...");
	}

	@Pointcut("@annotation(com.wb.spring.aop.annotation.TargetDataSource)")
	public void pointCut() {}

	@Before("pointCut()")
	public void switchStart() {
		System.out.println("switchStart...");
	}
	@After("pointCut()")
	public void switchEnd() {
		System.out.println("switchEnd...");
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
