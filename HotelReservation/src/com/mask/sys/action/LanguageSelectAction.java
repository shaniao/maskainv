package com.mask.sys.action;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class LanguageSelectAction extends DispatchAction {
	public ActionForward selectLang(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		System.out.println("LanguageSelectAction.selectLang");
		String lang = request.getParameter("lang");  
		Locale currentLocale = Locale.getDefault();
		if ("zh".equals(lang)) {
			currentLocale = new Locale("zh", "CN");
		} else if ("en".equals(lang)) {
			currentLocale = new Locale("en", "US");
		}
		this.setLocale(request, currentLocale);
		return new ActionForward("/manager/adminLogin.jsp");
	}
}
