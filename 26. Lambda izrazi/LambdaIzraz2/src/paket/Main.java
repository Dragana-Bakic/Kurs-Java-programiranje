package paket;

public class Main {

	public static void main(String[] args) {

		DeljivostBrojeva testDeljivosti = (x, y) -> (x % y) == 0 || (y % x) == 0;

		if (testDeljivosti.test(9, 3)) {
			System.out.println("Brojevi su deljivi.");
		} else {
			System.out.println("Brojevi nisu deljivi.");

		}

	}

}
