package jp.co.dh.development.action;

import javax.annotation.Resource;

import jp.co.dh.development.form.NewForm;
import jp.co.dh.development.service.EventService;

import org.seasar.struts.annotation.Execute;

public class NewAction {

    @Resource
	protected NewForm newForm;

    @Resource
    protected EventService eventService;

	@Execute(validator = false)
	public String index(){
		return "new.jsp";
	}

}
