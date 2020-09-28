package com.wb.spring.beandefinitionparser.config;

import com.wb.spring.beandefinitionparser.domain.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * Created by wangbin33 on 2020/1/9.
 *
 * 标签属性解析器
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
	@Nullable
	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		String id = element.getAttribute("id");
		String name = element.getAttribute("name");
		String sex = element.getAttribute("sex");
		String email = element.getAttribute("email");

		if (StringUtils.hasText(id)) {
			builder.addPropertyValue("id", id);
		}
		if (StringUtils.hasText(name)) {
			builder.addPropertyValue("name", name);
		}
		if (StringUtils.hasText(sex)) {
			builder.addPropertyValue("sex", sex);
		}
		if (StringUtils.hasText(email)) {
			builder.addPropertyValue("email", email);
		}
	}
}
