package com.wb.spring.t;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description:
 *
 * @author wangbin33
 * @date 2020/11/1 10:52
 */
public class TestMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acx = new AnnotationConfigApplicationContext(MyConfig.class);
		MyInterFace bean = acx.getBean(MyInterFace.class);
		acx.getBean("");
		String result = bean.show();
		System.out.println(result);
		acx.close();
	}
}
