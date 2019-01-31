package com.concurrency.evenodd;

public class ProcessNumber {

	private int number;
	private Object controlObject = new Object();
	
	public void printEven() {
		synchronized (this) {
			
				while (number < 10) {

					if (number%2 == 0) {
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					number++;
					System.out.println("even "+number);
					if (number == 10) {
						//break;
					}
					notifyAll();
				}	
			
			}
			
		}
	
	public void printOdd() {
		
		synchronized (this) {
			
				while (number < 10) {
					if (number%2 != 0) {
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					number++;
					System.out.println("odd"+number);
					
					notifyAll();
				}
			
			}
		}
	
	
	int getNumber() {
		return number;
	}
	void setNumber(int number) {
		this.number = number;
	}
	Object getControlObject() {
		return controlObject;
	}
	void setControlObject(Object controlObject) {
		this.controlObject = controlObject;
	}
	
	
}
