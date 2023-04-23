package for_petlja;

public class Zadatak9 {

	// Parni brojevi - 0-100

	public static void main(String[] args) {

		System.out.println("I nacin");

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("\nII nacin");
		for (int m = 2; m <= 100; m += 2) {
			System.out.print(m + " ");
		}
	}
}
