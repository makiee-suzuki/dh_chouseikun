package jp.co.dh.development.action;

import javax.annotation.Resource;

import jp.co.dh.development.entity.Event;
import jp.co.dh.development.entity.EventDetail;
import jp.co.dh.development.form.EditForm;
import jp.co.dh.development.service.EventDetailService;
import jp.co.dh.development.service.EventService;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class EditAction {

	@ActionForm
	@Resource
	protected EditForm editForm;

    @Resource
    protected EventService eventService;
    @Resource
    protected EventDetailService eventDetailService;

    public Event event;
    public EventDetail eventDetail;

	@Execute(validator = false)
	public String index(){
		event = eventService.findById(new Long(1));
		eventDetail =eventDetailService.findById(new Long(1));
		initFormSet();

		return "edit.jsp";
	}

	private void initFormSet() {
		editForm.setEventName(event.eventName);
		editForm.setContent(event.content);
		editForm.setSchedule(eventDetail.schedule);
	}

}
