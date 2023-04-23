package for_petlja;

import java.util.Scanner;

public class Zadatak13 {

	// Aritmeticka sredina

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Koliko brojeva zelite da unesete: ");
		int x = sc.nextInt();

		int suma = 0;
		double As = 0;

		for (int i = 1; i <= x; i++) {
			System.out.println("Unesite " + i + ". broj: ");
			int broj = sc.nextInt();
			suma += broj;
		}
		As = (double) suma / x;

		System.out.println("Aritmeticka sredina unetih brojeva je: " + As);

		sc.close();
	}

}
