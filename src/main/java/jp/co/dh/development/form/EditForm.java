package jp.co.dh.development.form;

import java.util.Date;

import org.seasar.struts.annotation.Required;

public class EditForm {

	public Integer eventId;

	@Required
	public String eventName;

	@Required
	public Date schedule;

	public String content;

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Date getSchedule() {
		return schedule;
	}

	public void setSchedule(Date schedule) {
		this.schedule = schedule;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
