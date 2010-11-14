package com.mask.admin.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.mask.admin.form.AdminForm;
import com.mask.hrs.po.HotelManager;
import com.mask.hrs.service.HotelManagerService;

public class AdminAction extends DispatchAction {
	private HotelManagerService hotelManagerService;
	
	public void setHotelManagerService(HotelManagerService hotelManagerService) {
		this.hotelManagerService = hotelManagerService;
	}

	public ActionForward newAdmin(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		System.out.println("AdminAction.newAdmin");
		AdminForm adminForm = (AdminForm) form;
		HotelManager manager = new HotelManager(adminForm.getUsername(),adminForm.getPassword());
		hotelManagerService.addAdmin(manager);
		return null;
	}

	public ActionForward updateAdmin(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		AdminForm adminForm = (AdminForm) form;
		return null;
	}

	public ActionForward delAdmin(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		AdminForm adminForm = (AdminForm) form;
		return null;
	}

}