
public class Main {

	public static void main(String ...args){
		Integer val=new Integer(0);
		EvenPrinter even = new EvenPrinter(val);
		Thread t1= new Thread(even);
		OddPrinter odd = new OddPrinter(val);
		Thread t2= new Thread(odd);
		t1.start();
		t2.start();
	}
}
