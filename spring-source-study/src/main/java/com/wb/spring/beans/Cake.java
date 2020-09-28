package com.wb.spring.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author wangbin33
 * @date Created in 12:36 2019/11/30
 */
@Component
@Qualifier(value = "cake")
public class Cake implements Dessert {
	@Override
	public String sayName() {
		return "cake.";
	}
}
