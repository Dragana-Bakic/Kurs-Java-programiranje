package razgranataStruktura;

import java.util.Scanner;

public class Primer_10 {

	// Najveci broj

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Unesite vrednost za a: ");
		int a = input.nextInt();
		System.out.print("Unesite vrednost za b: ");
		int b = input.nextInt();
		System.out.print("Unesite vrednost za c: ");
		int c = input.nextInt();

		if ((a == b) && (b == c) && (a == c))
			System.out.print("Brojevi su jednaki");

		else {

			int max = a;

			if (b > max)
				max = b;
			if (c > max)
				max = c;

			System.out.print("Najveći broj je: " + max);
			input.close();

			// II nacin - nije optimalan ali radi:

			// int max;

			// if (b > a)
			// max = b;
			// else max = a;

			// if (c > a)
			// max = c;
			// else max = a;

			// if (c > b)
			// max = c;
			// else max = b;

		}
	}
}
