package com.mask.admin.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.Globals;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.util.MessageResources;

import com.mask.admin.form.AdminForm;
import com.mask.hrs.po.HotelManager;
import com.mask.hrs.service.HotelManagerService;
import com.mask.util.CommonConst;

public class AdminAction extends DispatchAction {
	private HotelManagerService hotelManagerService;
	private MessageResources messages;

	public void setHotelManagerService(HotelManagerService hotelManagerService) {
		this.hotelManagerService = hotelManagerService;
	}

	public ActionForward newAdmin(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		System.out.println("AdminAction.newAdmin");
		AdminForm adminForm = (AdminForm) form;
		HotelManager manager = new HotelManager(adminForm.getUsername(),
				adminForm.getPassword());
		hotelManagerService.addAdmin(manager);
		return null;
	}

	public ActionForward checkLogin(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		System.out.println("AdminAction.checkLogin");
		System.out.println(CommonConst.LOGIN_OK);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String language = request.getSession().getAttribute(Globals.LOCALE_KEY).toString();
		System.out.println(language);
		if("en_US".equals(language)){
			System.out.println("英文模式");
			messages = CommonConst.MESSAGE_US_RES;
		}else if("zh_CN".equals(language)){
			System.out.println("中文模式");
			messages = CommonConst.MESSAGE_CN_RES;
		}
		String msg = "" ;
		switch (hotelManagerService.checkLogin(username, password)) {
		case 3:
			msg = "OK";
		case 2:
			msg = messages.getMessage("login.err.psd");
		case 0:
			msg = messages.getMessage("login.err.usename");
		}
		response.setContentType("text/json; charset=utf-8");
		try {
			response.getWriter().write(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
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