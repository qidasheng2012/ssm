package com.ssm.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * API白名单列表
 * @author qp
 * @date 2019/5/1
 */
public class ApiWhiteData {

	private static List<String> whiteApis = new ArrayList<String>();

	static {
		whiteApis.add("/json");
	}

	// 获取白名单列表
	public static List<String> getWhiteApis() {
		return whiteApis;
	}

	// 添加白名单
	public static void add(String uri) {
		whiteApis.add(uri);
	}

	// 删除白名单
	public static void delete(String uri) {
		whiteApis.remove(uri);
	}

}
