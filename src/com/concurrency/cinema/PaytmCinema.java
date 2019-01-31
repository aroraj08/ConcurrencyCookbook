package com.concurrency.cinema;

public class PaytmCinema implements Runnable {

private Cinema cinema;
	
	public PaytmCinema(Cinema cinema) {
		super();
		this.cinema = cinema;
	}

	@Override
	public void run() {
		
		cinema.sellTickets1(1);
		cinema.sellTickets2(1);
		cinema.sellTickets1(7);
		cinema.returnTickets1(5);
		cinema.sellTickets1(1);
	}


}
