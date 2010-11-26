package com.mask.util;

import org.apache.struts.util.MessageResources;

public class CommonConst {
	/**
	 * �û������� 0
	 */
	public static int USER_NOT_EXSIT = 0;

	/**
	 * �û����� 1
	 */
	public static int USER_EXSIT = 1;

	/**
	 * ������� 2
	 */
	public static int PASSWORD_ERROR = 2;

	/**
	 * ��½�ɹ� 3
	 */
	public static int LOGIN_OK = 3;

	public static MessageResources DEFAULT_LANG = MessageResources
			.getMessageResources("com.mask.ApplicationResources");
	public static MessageResources MESSAGE_US_RES = MessageResources
			.getMessageResources("com.mask.ApplicationResources_en_US");
	public static MessageResources MESSAGE_CN_RES = MessageResources
			.getMessageResources("com.mask.ApplicationResources_zh_CN");
	
}
