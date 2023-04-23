package dragana.bakic;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();

		int x[][] = new int[red][kolona];

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("x[" + i + ", " + j + "]" + " = ");
				x[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrica: ");

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.printf("%4d", x[i][j]);
			}
			System.out.println();
		}

		int suma = 0;
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (x[i][j] < 0)
					suma += x[i][j];
			}

		}

		System.out.println("\nSuma negativnih elemenata: " + suma);
		sc.close();
	}
}
