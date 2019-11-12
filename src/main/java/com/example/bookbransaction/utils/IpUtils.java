package com.example.bookbransaction.utils;

import javax.servlet.http.HttpServletRequest;

public class IpUtils {
	public static String getIp(HttpServletRequest req) {
		String ip = req.getHeader("X-Real-IP");
		if(ip == null) {
			ip = req.getRemoteAddr();
		}
		return ip;
	}
	
}