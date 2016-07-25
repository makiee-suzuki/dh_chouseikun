package jp.co.dh.development.action;

import javax.annotation.Resource;

import jp.co.dh.development.dto.MemberDto;
import jp.co.dh.development.entity.Member;
import jp.co.dh.development.form.LoginForm;
import jp.co.dh.development.service.MemberService;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ActionMessagesUtil;
import org.seasar.struts.util.RequestUtil;

public class LoginAction {

	@ActionForm
	@Resource
	protected LoginForm loginForm;

	@Resource
	protected MemberService memberService;
	
	@Resource
	protected MemberDto memberDto;
	
	public Member member;

	@Execute(validator = false)
	public String index(){
		return "login.jsp";
	}
	/**
	 * @return
	 */
	@Execute(validator = true, input="login.jsp")
	public String login(){
		System.out.println(loginForm.getEmail());
		member = memberService.findByEmailAndPassword(loginForm.getEmail(),loginForm.getPassword());
		if(member != null){
			memberDto.nickName = member.nickName;
			memberDto.mailAddress = member.mailAddress;
			return "/eventList/?redirect=true";
		} else {
			ActionMessages errors = new ActionMessages();
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("errors.login.failure"));
			ActionMessagesUtil.addErrors(RequestUtil.getRequest(), errors);
			return "login.jsp";
		}

	}

}
