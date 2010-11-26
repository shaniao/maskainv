package com.mask.hrs.service.impl;

import java.util.List;

import com.mask.hrs.dao.HotelManagerDAO;
import com.mask.hrs.po.HotelManager;
import com.mask.hrs.service.HotelManagerService;
import com.mask.util.CommonConst;

public class HotelManagerServiceImpl implements HotelManagerService {

	private HotelManagerDAO managerDao;

	public HotelManagerDAO getManagerDao() {
		return managerDao;
	}

	public void setManagerDao(HotelManagerDAO managerDao) {
		this.managerDao = managerDao;
	}

	public void addAdmin(HotelManager manager) {
		managerDao.save(manager);
	}

	
	public int checkLogin(String username, String password) {
		List<HotelManager> managers = managerDao.findByProperty(
				HotelManager.class, "username", username);
		if (managers.size() > 0) {
			if (managers.get(0).getPassword().equals(password))
				return CommonConst.LOGIN_OK;
			else
				return CommonConst.PASSWORD_ERROR;
		} else {
			return CommonConst.USER_NOT_EXSIT;
		}
	}

}
