package paket;

public class A implements Runnable {
	String ime; // ime niti
	Thread t;

	A(String name) {
		ime = name;
		t = new Thread(this, ime);
		t.start();
	}

	public void run() {

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(ime + " = " + i);
				Thread.sleep(1000);
			}
		} 
		catch (Exception e) {
		}

	}

}
