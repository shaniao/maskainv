package com.mask.reservation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.mask.hrs.po.HotelReservation;
import com.mask.hrs.service.HotelReservationService;
import com.mask.reservation.form.ReservationForm;
import com.mask.util.UID;

public class ReservationAction extends DispatchAction {
	private HotelReservationService hotelReservationService;

	public HotelReservationService getHotelReservationService() {
		return hotelReservationService;
	}

	public void setHotelReservationService(
			HotelReservationService hotelReservationService) {
		this.hotelReservationService = hotelReservationService;
	}

	public ActionForward add(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		ReservationForm reservationForm = (ReservationForm) form;
		
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.setReservationId(new UID().toString());
		hotelReservation.setHotelId(reservationForm.getHotel_id());
		hotelReservation.setComeTime(reservationForm.getCome_time());
		hotelReservation.setLeftTime(reservationForm.getLeft_time());
		hotelReservation.setSingleRoom(Integer.parseInt(reservationForm.getSingle_room()));
		hotelReservation.setDoubleRoom(Integer.parseInt(reservationForm.getDouble_room()));
		hotelReservation.setCustomName(reservationForm.getCustom_name());
		hotelReservation.setCustomEmail(reservationForm.getCustom_email());
		hotelReservation.setCustomTel(reservationForm.getCustom_tel());
		hotelReservation.setReservationType("true");
		
		hotelReservationService.newReservation(hotelReservation);
		return null;
	}
}