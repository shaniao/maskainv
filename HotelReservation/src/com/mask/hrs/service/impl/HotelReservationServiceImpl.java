package com.mask.hrs.service.impl;

import com.mask.hrs.dao.HotelReservationDAO;
import com.mask.hrs.po.HotelReservation;
import com.mask.hrs.service.HotelReservationService;

public class HotelReservationServiceImpl implements HotelReservationService {

	private HotelReservationDAO hotelReservationDAO;

	public HotelReservationDAO getHotelReservationDAO() {
		return hotelReservationDAO;
	}

	public void setHotelReservationDAO(HotelReservationDAO hotelReservationDAO) {
		this.hotelReservationDAO = hotelReservationDAO;
	}

	public void newReservation(HotelReservation hotelReservation) {
		hotelReservationDAO.save(hotelReservation);
	}

}
