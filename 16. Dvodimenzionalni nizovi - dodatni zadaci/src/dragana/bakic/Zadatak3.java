package dragana.bakic;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x[][] = new int[5][5];

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("x[" + i + ", " + j + "]" + " = ");
				x[i][j] = sc.nextInt();
			}
		}
		// ispisivanje matrice
		System.out.println("Matrica: ");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		// izracunavanje sume
		int suma = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (x[i][j] > 3)
					suma += x[i][j];
			}

		}
		System.out.println("\nSuma elemenata vecih od 3: " + suma);
		sc.close();
	}
}
