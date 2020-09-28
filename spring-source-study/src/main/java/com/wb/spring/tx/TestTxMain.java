package com.wb.spring.tx;

import com.wb.spring.tx.config.TxConfig;
import com.wb.spring.tx.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangbin33
 * @date Created in 22:54 2019/10/6
 */
public class TestTxMain {
	public static void main(String[] args) {
		ApplicationContext acx = new AnnotationConfigApplicationContext(TxConfig.class);
		UserService userService = acx.getBean(UserService.class);
		User user = new User();
		user.setAge(22);
		user.setName("xiaohong1");
		userService.insert(user);
//		userService.m1();

//		TestTxMain m = new TestTxMain();
//		m.test();
	}

	public void test() {
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		Integer d = 3;
		Integer e = 321;
		Integer f = 321;
		Long g = 3L;
		Integer h = 200;
		Integer i = 200;

		Integer j = 400;

		System.out.println(j == (h + i));

		System.out.println(c == d); // true
		System.out.println(e == f); // false
		System.out.println(c == (a + b)); // true
		System.out.println(c.equals(a + b)); // true
		System.out.println(g == (a + b)); // false
		System.out.println(g.equals(a + b)); // false
	}
}
