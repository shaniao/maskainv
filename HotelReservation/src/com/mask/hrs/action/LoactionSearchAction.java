package com.mask.hrs.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.hrs.ws.HRSServiceStub.HRSLocation;
import com.mask.hrs.form.LoactionSearchForm;
import com.mask.hrs.ws.HRSServiceHandler;

public class LoactionSearchAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		System.out.println("LoactionSearchAction execute......");
		LoactionSearchForm loactionSearchForm = (LoactionSearchForm) form;
		String destiny = loactionSearchForm.getDestiny();
		String comeTime = loactionSearchForm.getComeTime();
		String leftTime = loactionSearchForm.getLeftTime();
		String singleRooms = loactionSearchForm.getSingleRooms();
		String doubleRooms = loactionSearchForm.getDoubleRooms();
		String adult = loactionSearchForm.getAdults();
		String children = loactionSearchForm.getChildren();
		String hotelName = loactionSearchForm.getHotelName();
		HRSLocation[] locations = HRSServiceHandler.getLoaclSearch(destiny);
		while (null != locations && locations.length > 0) {
			if (locations.length == 1) {
				//�ҵ�Ψһ��ַ
				HRSServiceHandler.getHotelAvail(locations[0], comeTime,
						leftTime, singleRooms, doubleRooms, adult, children,
						hotelName);
			} else {
				//�ҵ��ദ��ַ�������ַѡ��ҳ��
				request.setAttribute("locations", locations);
				return new ActionForward("/loactionSearch.jsp");
			}
		}
		//���κν�����˴�
		return null;
	}
}