package com.wb.spring.t;

import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author wangbin33
 * @date 2020/11/12 17:06
 */
@Component
public class Child extends AbstractParent {
	public void test() {
		String result = impl.show();
		System.out.println("child result: " + result);
	}
}
