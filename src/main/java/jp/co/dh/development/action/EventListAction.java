package jp.co.dh.development.action;

import javax.annotation.Resource;

import jp.co.dh.development.entity.Event;
import jp.co.dh.development.entity.Member;
import jp.co.dh.development.entity.EventDetail;
import jp.co.dh.development.dto.MemberDto;
import jp.co.dh.development.form.EventListForm;
import jp.co.dh.development.service.EventDetailService;
import jp.co.dh.development.service.EventService;
import jp.co.dh.development.service.MemberService;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class EventListAction {
	
	@ActionForm
	@Resource
	protected EventListForm eventListForm;
	
	@Resource
	protected EventService eventService;
	@Resource
	protected EventDetailService eventDetailService;
	@Resource
	protected MemberService memberService;
	
	//イベント一覧結果
	public Event event;
	public Member member;
	public EventDetail eventDetail;

	
	@Execute(validator = false)
	public String index() {
		
		event = eventService.findById(new Long(1));
		eventDetail =eventDetailService.findById(new Long(1));
		member = memberService.findById(new Long(1));
		initFormSet();
		return "eventList.jsp";
	}
	private void initFormSet() {
		eventListForm.setEventName(event.eventName);
		eventListForm.setSchedule(eventDetail.schedule);
		eventListForm.setNickName(member.nickName);
	
	}
}