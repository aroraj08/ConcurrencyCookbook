package com.concurrency.cinema;

public class BookMyShowCinema implements Runnable {

	private Cinema cinema;
	
	public BookMyShowCinema(Cinema cinema) {
		super();
		this.cinema = cinema;
	}

	@Override
	public void run() {
		
		cinema.sellTickets1(2);
		cinema.sellTickets2(3);
		cinema.sellTickets1(1);
		cinema.returnTickets1(2);
		cinema.sellTickets1(4);
	}

	
}
