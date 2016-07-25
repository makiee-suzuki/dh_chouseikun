package jp.co.dh.development.action;

import javax.annotation.Resource;

import jp.co.dh.development.dto.MemberDto;
import org.seasar.struts.annotation.Execute;

public class EventListAction {
	
	@Resource
	protected MemberDto memberDto;

	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}
}