package com.concurrency.cinema;

public class Cinema {

	private int vacancyCinema1;
	private int vacancyCinema2;
	
	private Object controlCinema1 = new Object();
	private Object controlCinema2 = new Object();
	
	public boolean sellTickets1(int tickets) {
		
		synchronized (controlCinema1) {
			if (vacancyCinema1 >= tickets) {
				vacancyCinema1 -= tickets;
				return true;
			}
			return false;
		}
	}
		
	public boolean sellTickets2(int tickets) {
		
		synchronized (controlCinema2) {
			if (vacancyCinema2 >= tickets) {
				vacancyCinema2 -= tickets;
				return true;
			}
			return false;
		}
	}
	
	public void returnTickets1(int tickets) {
		synchronized (controlCinema1) {
			vacancyCinema1 += tickets;
		}
	}
	
	public void returnTickets2(int tickets) {
		
		synchronized (controlCinema2) {
			vacancyCinema2 += tickets;
		}
	}
	
	int getVacancyCinema1() {
		return vacancyCinema1;
	}
	void setVacancyCinema1(int vacancyCinema1) {
		this.vacancyCinema1 = vacancyCinema1;
	}
	int getVacancyCinema2() {
		return vacancyCinema2;
	}
	void setVacancyCinema2(int vacancyCinema2) {
		this.vacancyCinema2 = vacancyCinema2;
	}
	Object getControlCinema1() {
		return controlCinema1;
	}
	void setControlCinema1(Object controlCinema1) {
		this.controlCinema1 = controlCinema1;
	}
	Object getControlCinema2() {
		return controlCinema2;
	}
	void setControlCinema2(Object controlCinema2) {
		this.controlCinema2 = controlCinema2;
	}
	
	
}

