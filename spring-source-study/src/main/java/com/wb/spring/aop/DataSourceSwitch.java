package com.wb.spring.aop;

import com.wb.spring.aop.annotation.TargetDataSource;
import org.springframework.stereotype.Component;

/**
 * Created by wangbin33 on 2020/1/14.
 */
//@Component
public class DataSourceSwitch {

	@TargetDataSource(value = "test")
	public void doSwitch() {
	}
}
