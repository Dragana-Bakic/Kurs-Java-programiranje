package paket;

public class B extends Thread{
	
	B(String b) {
		super(b);
	}

	public void run() {
		for (int i = 1; i <= 6; i++) {
			System.out.println(getName());
		}
	}

}
