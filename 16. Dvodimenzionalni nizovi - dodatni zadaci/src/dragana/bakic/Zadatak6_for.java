package dragana.bakic;

import java.util.Scanner;

public class Zadatak6_for {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj redova matrice:");
		int red = sc.nextInt();
		System.out.println("Unesite broj kolona matrice:");
		int kolona = sc.nextInt();

		if (red > 0 && kolona > 0) {
			int x[][] = new int[red][kolona];

			System.out.println("Unesite elemente matrice 5x5:");
			for (int i = 0; i < red; i++) {
				for (int j = 0; j < kolona; j++) {
					System.out.print("x[" + i + "," + j + "] = ");
					x[i][j] = sc.nextInt();
				}
			}

			System.out.println("Matrica :");
			for (int i = 0; i < red; i++) {
				for (int j = 0; j < kolona; j++) {
					System.out.print(x[i][j] + " ");
				}
				System.out.println();
			}

			// suma kvadrata elemenata
			int suma = 0;
			for (int i = 0; i < red; i++) {
				for (int j = 0; j < kolona; j++) {
					suma += x[i][j] * x[i][j];
				}
			}
			System.out.println("\nSuma kvadrata elemenata matrice iznosi " + suma);

		} else
			System.out.print("Greska. Unesite pozitivni broj za red i/ili kolonu");
		sc.close();
	}

}
