package com.wb.spring.t;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Description:
 *
 * @author wangbin33
 * @date 2020/11/12 17:05
 */
public abstract class AbstractParent {
	@Autowired
	protected Impl impl;
}
