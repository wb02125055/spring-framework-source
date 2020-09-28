package com.wb.spring.beandefinitionparser;

import com.wb.spring.beandefinitionparser.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangbin33 on 2020/1/9.
 */
public class TestMain {
	public static void main(String[] args) {

		 testContext();

//		List<String> ipList = getAddresses();
//		System.out.println(ipList);
	}

	private static void testContext() {
		String configPath = "mytag.xml";
		ApplicationContext acx = new ClassPathXmlApplicationContext(configPath);
		User user = (User) acx.getBean("wb");
		System.out.println(user);
	}

	private static String address = "www.baidu.com:80;www.jd.com:80;www.sina.com.cn:80;www.jinnianshizhunian.vip:80";

	public static List<String> getAddresses() {
		List<String> result = new ArrayList<String>();
		if (address != null) {
			String[] ips = address.split(";");
			String[] parts;
			int port;
			String addr;
			for (String ip : ips) {
				if (ip != null) {
					ip = ip.trim();
					if (!ip.isEmpty()) {
						//解析域名
						parts = ip.split(":");
						if (parts.length == 2) {
							try {
								port = Integer.parseInt(parts[1]);
								InetAddress[] inetAddresses = InetAddress.getAllByName(parts[0]);
								for (InetAddress inetAddress : inetAddresses) {
									addr = inetAddress.getHostAddress() + ":" + port;
									result.add(addr);
								}
							} catch (NumberFormatException ignored) {
							} catch (UnknownHostException ignored) {
							}
						} else {
						}
					}
				}
			}
		}
		return result;
	}
}
