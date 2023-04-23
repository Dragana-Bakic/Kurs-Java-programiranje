package dragana.bakic;

import java.util.Scanner;
import java.util.Random;

public class Igrica {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random r = new Random();
		int broj = r.nextInt(9);
		int brojac = 1;

		System.out.print("Unesite broj: ");
		int x = sc.nextInt();

		do {

			if (x > broj) {
				System.out.print("Uneti broj je veci od trazenog broja.");
				System.out.print("Unesite broj: ");
				x = sc.nextInt();
				brojac++;
			} else if (x < broj) {
				System.out.print("Uneti broj je manji od trazenog broja.");
				System.out.print("Unesite broj: ");
				x = sc.nextInt();
				brojac++;
			}
		} while (x != broj);
		System.out.print("Pogodili ste broj! Broj pokusaja je " + brojac);

		sc.close();
	}
}
