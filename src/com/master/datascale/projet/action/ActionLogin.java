package com.master.datascale.projet.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.master.datascale.projet.bean.User;


public class ActionLogin extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	{
		//String leNom = request.getParameter("leNom");
		//String lePrenom = request.getParameter("lePrenom");
		User donnees = (User)form;
		System.out.println("Je suis dans ActionLogin");
		System.out.println("Votre identité: "+donnees);
		return mapping.findForward("admin");
		
	}

}
