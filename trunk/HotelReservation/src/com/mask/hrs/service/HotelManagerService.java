package com.mask.hrs.service;

import com.mask.hrs.po.HotelManager;

public interface HotelManagerService {

	public void addAdmin(HotelManager manager);
	
	/**
	 * ��½�ɹ� 3 
	 * ������� 2 
	 * �û������� 0
	 */
	public int checkLogin(String username,String password);
}
