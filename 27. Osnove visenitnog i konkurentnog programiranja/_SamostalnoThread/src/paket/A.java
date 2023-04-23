package paket;

public class A extends Thread {

	A(String a) {
		super(a);
	}

	public void run() {
		for (int i = 1; i <= 6; i++) {
			System.out.println(getName());
		}

	}
}
