package com.wb.spring.beans;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

/**
 * Created by wangbin33 on 2020/2/9.
 */
public class ConsumerBean {

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ConsumerBean() {
		System.out.println("构造函数被调用了！");
	}

//	@Nullable
//	@Override
//	public Object getObject() throws Exception {
//		int a = 10;
//		int b = 20;
//		System.out.println("a + b = " + (a + b));
//		return null;
//	}

//	@Nullable
//	@Override
//	public Class<?> getObjectType() {
//		return null;
//	}


	@Override
	public String toString() {
		return "ConsumerBean{" +
				"id='" + id + '\'' +
				'}';
	}
}
