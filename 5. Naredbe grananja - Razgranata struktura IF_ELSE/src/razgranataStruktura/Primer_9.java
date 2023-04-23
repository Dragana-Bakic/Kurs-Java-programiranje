package razgranataStruktura;

import java.util.Scanner;

public class Primer_9 {

	// Nula

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Unesite vrednost za a: ");
		double a = input.nextDouble();
		System.out.print("Unesite vrednost za b: ");
		double b = input.nextDouble();

		if (b != 0)
			System.out.println(a / b);

		else
			System.out.println("Deljenje nulom");

		input.close();
	}
}
