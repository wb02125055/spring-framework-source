package com.wb.spring.share.class1;

import com.wb.spring.share.class1.config.ComponentScanConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description:
 *
 * @author wangbin33
 * @date 2020/11/1 21:07
 */
public class TestMain {
	public static void main(String[] args) {
		ConfigurableApplicationContext acx = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
		acx.close();
	}
}
