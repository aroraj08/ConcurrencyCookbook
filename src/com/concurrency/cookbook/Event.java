package com.concurrency.cookbook;

import java.util.Date;

public class Event {

	private Date date;
	private String event;
	
	Date getDate() {
		return date;
	}
	void setDate(Date date) {
		this.date = date;
	}
	String getEvent() {
		return event;
	}
	void setEvent(String event) {
		this.event = event;
	}
	
	
}
