package jp.co.dh.development.action;

import javax.annotation.Resource;

import jp.co.dh.development.form.MemberRegistrationForm;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class MemberRegistration {

	@ActionForm
    @Resource
	protected MemberRegistrationForm memberRegistrationForm;

	@Execute(validator = false)
	public String index(){
		return "memberRegistration.jsp";
	}

}