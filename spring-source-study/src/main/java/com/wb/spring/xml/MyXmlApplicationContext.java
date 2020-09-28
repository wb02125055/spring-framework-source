package com.wb.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;

/**
 * Description:
 *
 * @author wangbin33
 * @date 2020/8/6 14:42
 */
public class MyXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyXmlApplicationContext() {}

	public MyXmlApplicationContext(String ...locations) {
		super(locations);
	}

	@Override
	protected void initPropertySources() {
		ConfigurableEnvironment environment = getEnvironment();
		environment.getSystemProperties().put("menu.env", "dev");
		super.initPropertySources();
	}
}
