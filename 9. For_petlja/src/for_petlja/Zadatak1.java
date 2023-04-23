package for_petlja;

public class Zadatak1 {

	// Cifre

	public static void main(String[] args) {

		System.out.println("Rastuci poredak cifara:");
		for (int cifra = 0; cifra < 10; cifra++) {
			System.out.print(cifra + " ");
		}
		System.out.println("\nOpadajuci poredak cifara:");
		for (int cifra = 9; cifra >= 0; cifra--) {
			System.out.print(cifra + " ");
		}
	}
}