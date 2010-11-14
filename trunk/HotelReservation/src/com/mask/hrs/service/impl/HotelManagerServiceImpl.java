package com.mask.hrs.service.impl;

import com.mask.hrs.dao.HotelManagerDAO;
import com.mask.hrs.po.HotelManager;
import com.mask.hrs.service.HotelManagerService;

public class HotelManagerServiceImpl implements HotelManagerService{

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
		
}
