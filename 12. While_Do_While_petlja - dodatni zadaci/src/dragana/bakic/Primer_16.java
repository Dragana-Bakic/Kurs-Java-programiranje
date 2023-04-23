package dragana.bakic;

import java.util.Scanner;

public class Primer_16 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite vrednost za a:");
		int a = ulaz.nextInt();

		int i = a;
		int cifra, max = 0;

		while (a != 0) {
			cifra = a % 10;
			if (cifra > max)
				max = cifra;

			a /= 10;
		}
		System.out.println("Najveca cifra unetog broja " + i + " je " + max);

		ulaz.close();
	}
}
