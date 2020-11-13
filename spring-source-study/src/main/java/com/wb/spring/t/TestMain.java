package com.wb.spring.t;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description:
 *
 * @author wangbin33
 * @date 2020/11/1 10:52
 */
public class TestMain {

	private static boolean flag = true;

	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext acx = new AnnotationConfigApplicationContext(MyConfig.class);
//		MyInterFace bean = acx.getBean(MyInterFace.class);
//		Object res = acx.getBean("show");
//		System.out.println(res);
//		System.out.println(res instanceof String);
//		Object child = acx.getBean("child");
//		System.out.println(child);
//		if (child instanceof Child) {
//			((Child) child).test();
//		}
//		String result = bean.show();
//		System.out.println(result);
//		acx.close();


		new Thread(() -> {
			System.out.println("=====");
			while(flag) {
				System.out.printf("77777");
			}
		}).start();
		System.out.println("--------");
		Thread.sleep(1000);
		System.out.println("*****");
		new Thread(() -> {
			flag = false;
		}).start();
	}
}
