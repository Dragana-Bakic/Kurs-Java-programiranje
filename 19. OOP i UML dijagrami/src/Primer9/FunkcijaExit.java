package Primer9;

public class FunkcijaExit {

	// Program koristi funkciju Exit

	public static void test() {

		int a = 10;
		System.out.println("BBB");

		if (a == 10) {

			System.exit(0);
		}
		System.out.println("CCC");
	}

	public static void main(String[] args) {

		System.out.println("AAA");
		test(); // staticka metoda se ovako poziva (bez tacke i naziva klase...)
		System.out.println("DDD");

	}

}
