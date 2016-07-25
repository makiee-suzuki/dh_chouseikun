package jp.co.dh.development.action;

import javax.annotation.Resource;

import jp.co.dh.development.entity.Member;
import jp.co.dh.development.form.MyPageForm;
import jp.co.dh.development.service.MemberService;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class MyPageAction {

	@ActionForm
    @Resource
    protected MyPageForm myPageForm;

    @Resource
    protected MemberService memberService;

    //Memberテーブル結果セット
    public Member member;

	@Execute(validator = false)
	public String index() {

		member = memberService.findById(new Long(1)); //テストとして固定値1を引数にセット
		initFormSet();

		return "myPage.jsp";
	}

	private void initFormSet() {
		myPageForm.setNickName(member.nickName);
		myPageForm.setSex(member.sex);
		myPageForm.setBirthDate(member.birthDate);
		myPageForm.setMailAddress(member.mailAddress);
		myPageForm.setPassword(member.password);
	}
}