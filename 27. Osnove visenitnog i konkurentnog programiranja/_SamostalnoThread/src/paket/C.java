package paket;

public class C extends Thread {
	C(String c) {
		super(c);
	}

	public void run() {
		for (int i = 1; i <= 6; i++) {
			System.out.println(getName());
		}
	}
}
