package jp.co.dh.development.form;

import java.util.Date;

import org.seasar.struts.annotation.Required;

public class DetailForm {

	public Integer eventId;

	@Required
	public String eventName;

	@Required
	public Date schedule;

	public String content;
	
	public String nickName;
	
	public String attendance_division;

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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAttendance_division() {
		return attendance_division;
	}

	public void setAttendance_division(String attendance_division) {
		this.attendance_division = attendance_division;
	}
}
