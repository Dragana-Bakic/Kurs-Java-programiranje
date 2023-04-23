package paket;

public class Main {

	public static void main(String[] args) {
		A oba = new A(); 
		B obb = new B(); 
		C obc = new C(); 

		
		Thread t1 = new Thread(oba); 
		Thread t2 = new Thread(obb); 
		Thread t3 = new Thread(obc); 
		
		t1.start();
		t2.start();
		t3.start();



	}

}
