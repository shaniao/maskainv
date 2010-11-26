package com.mask.hrs.service;

import com.mask.hrs.po.HotelManager;

public interface HotelManagerService {

	public void addAdmin(HotelManager manager);
	
	/**
	 * 登陆成功 3 
	 * 密码错误 2 
	 * 用户不存在 0
	 */
	public int checkLogin(String username,String password);
}
