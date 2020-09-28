package com.wb.springmvc.domain;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by wangbin33 on 2020/2/27.
 */
@Service
public class User {
	@PostConstruct
	public void runTask() {
		try {
			System.out.println("启动任务......");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
