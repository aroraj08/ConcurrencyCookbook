
public class OddPrinter implements Runnable {

Integer val;
	
	public OddPrinter(Integer val) {
		this.val=val;
	}

	@Override
	public void run() {
		synchronized (this) {
			while(val<9){
				if(val%2!=0){
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				val=val+1;
				System.out.println(val);
				notifyAll();
			}
		}
	}

}
