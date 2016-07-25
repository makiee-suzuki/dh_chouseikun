package jp.co.dh.development.form;

import java.util.Date;

import org.seasar.struts.annotation.Required;

public class EventListForm {

		@Required
		public String nickName;
		@Required
		public String eventName;
		@Required
		public Date schedule;


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

		public String getNickName() {
			return nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		
		
	}
