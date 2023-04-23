package for_petlja;

import java.util.Scanner;

public class Zadatak15 {
	
	// Prebrojavanje negativnih i pozitivnih brojeva i nula

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Koliko brojeva zelite da unesete: ");
		int x = sc.nextInt();

		int paran = 0, nula = 0, negativan = 0;

		for (int i = 1; i <= x; i++) {
			System.out.println("Unesite " + i + " broj: ");
			int y = sc.nextInt();

			if (y > 0 && y != 0) {
				paran++;
			}
			if (y == 0) {
				nula++;
			}
			if (y < 0) {
				negativan++;
			}
		}
		System.out.println("Od unetih brojeva ima: \nParnih: " + paran + "\nNula: " + nula + "\nNegativnih: " + negativan);

		sc.close();
	}
}
