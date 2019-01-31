package com.concurrency.cinema;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cinema cinema = new Cinema();
		cinema.setVacancyCinema1(100);
		cinema.setVacancyCinema2(60);
		
		BookMyShowCinema office1 = new BookMyShowCinema(cinema);
		PaytmCinema office2 = new PaytmCinema(cinema);
		
		Thread t1 = new Thread(office1);
		Thread t2 = new Thread(office2);
		
		t1.start();
		t2.start();
		
		try {
		      t1.join();
		      t2.join();
		    } catch (InterruptedException e) {
		      e.printStackTrace();
		    }
		
		System.out.printf("Room 1 Vacancies: %d\n",cinema.getVacancyCinema1());
	    System.out.printf("Room 2 Vacancies: %d\n",cinema.getVacancyCinema2());
	    
	}

}
