package linearnizadaci;

import java.util.Scanner;

public class Bajt {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite kilobajte: ");
		double g = input.nextDouble();

		System.out.println("To je bajtova: " + (g * 1024));
		input.close();
	}
}
