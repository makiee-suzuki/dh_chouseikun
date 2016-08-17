package jp.co.dh.development.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import jp.co.dh.development.entity.Event;
import jp.co.dh.development.entity.EventAttendance;
import jp.co.dh.development.entity.EventDetail;
import jp.co.dh.development.entity.Member;
import jp.co.dh.development.form.DetailForm;
import jp.co.dh.development.service.EventAttendanceService;
import jp.co.dh.development.service.EventDetailService;
import jp.co.dh.development.service.EventService;

public class DetailAction {

	@ActionForm
	@Resource
	protected DetailForm detailForm;

    @Resource
    protected EventService eventService;
    @Resource
    protected EventDetailService eventDetailService;
    @Resource
    protected EventAttendanceService eventAttendanceService;

    public Event event;
    public EventDetail eventDetail;
    public EventAttendance eventAttendance;
    public Member member;

	@Execute(validator = false)
	public String index(){
		event = eventService.findById(new Long(1));
		eventDetail = eventDetailService.findById(new Long(1));
		eventAttendance = eventAttendanceService.findWithMemberById(new Long(1));
		initFormSet();

		return "detail.jsp";
	}

	private void initFormSet() {
		detailForm.setEventName(event.eventName);
		detailForm.setContent(event.content);
		detailForm.setSchedule(eventDetail.schedule);
		detailForm.setNickName(eventAttendance.member.nickName);
		detailForm.setAttendance_division(eventAttendance.attendanceDivision);
	}

}
