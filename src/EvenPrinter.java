
public class EvenPrinter implements Runnable{
	
	private Integer val;
	
	public EvenPrinter(Integer val) {
		this.val=val;
	}

	@Override
	public void run() {
		synchronized (this) {
			while(val<10){
				if(val%2==0){
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				val=val+1;
				System.out.println(val);
				if(val==10){
					break;
				}
				notifyAll();
			}
		}
	}

}
