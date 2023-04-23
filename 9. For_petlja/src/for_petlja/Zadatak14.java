package for_petlja;

import java.util.Scanner;

public class Zadatak14 {

	// Aritmeticka sredina parnih brojeva

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Koliko brojeva zelite da unesete: ");
		int x = sc.nextInt();

		int suma = 0, parni = 0;
		double sredina = 0;

		for (int i = 1; i <= x; i++) {
			System.out.println("Unesite " + i + ". broj: ");
			int broj = sc.nextInt();

			if (broj % 2 == 0) {
				parni++;
				suma = suma + broj;
				sredina = suma / parni;
			}
		}

		System.out.println("Aritmeticka sredina unetih parnih brojeva je: " + sredina);

		sc.close();
	}
}
