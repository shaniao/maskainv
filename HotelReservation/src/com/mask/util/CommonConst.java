package com.mask.util;

import org.apache.struts.util.MessageResources;

public class CommonConst {
	/**
	 * 用户不存在 0
	 */
	public static int USER_NOT_EXSIT = 0;

	/**
	 * 用户存在 1
	 */
	public static int USER_EXSIT = 1;

	/**
	 * 密码错误 2
	 */
	public static int PASSWORD_ERROR = 2;

	/**
	 * 登陆成功 3
	 */
	public static int LOGIN_OK = 3;

	public static MessageResources DEFAULT_LANG = MessageResources
			.getMessageResources("com.mask.ApplicationResources");
	public static MessageResources MESSAGE_US_RES = MessageResources
			.getMessageResources("com.mask.ApplicationResources_en_US");
	public static MessageResources MESSAGE_CN_RES = MessageResources
			.getMessageResources("com.mask.ApplicationResources_zh_CN");
	
}
