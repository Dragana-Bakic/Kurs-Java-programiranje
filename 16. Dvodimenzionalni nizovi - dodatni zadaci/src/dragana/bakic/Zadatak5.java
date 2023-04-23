package dragana.bakic;

import java.util.Scanner;

public class Zadatak5 {

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

		// a) aritmetičku sredinu svih elemenata
		int suma = 0, a = 0;
		double as;
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				suma += x[i][j];
				a++;
			}
		}
		as = (double) suma / a;
		System.out.println("\nAritmeticka sredina svih elemenata iznosi: " + as);

		// b) aritmetičku sredinu pozitivnih elemenata
		int sumap = 0, b = 0;
		double asp;
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (x[i][j] > 0) {
					sumap += x[i][j];
					b++;
				}
			}
		}
		asp = (double) sumap / b;
		System.out.println("Aritmeticka sredina pozitivnih elemenata iznosi: " + asp);

		// c) aritmetičku sredinu pozitivnih elemenata na redovima
		double aspr = 0.0;
		for (int i = 0; i < red; i++) {
			int sumapr = 0, c = 0;
			for (int j = 0; j < kolona; j++) {
				if (x[i][j] > 0) {
					sumapr += x[i][j];
					c++;
				}
			}
			aspr = (double) sumapr / c;
			System.out.println("Aritmeticka sredina pozitivnih elemenata " + (i + 1) + ". reda iznosi: " + aspr);

		}

		// d) aritmetičku sredinu parnih elemenata na kolonama
		double aspk = 0.0;
		for (int j = 0; j < kolona; j++) {
			int sumapk = 0, d = 0;
			for (int i = 0; i < red; i++) {
				if (x[i][j] % 2 == 0) {
					sumapk += x[i][j];
					d++;
				}
			}
			aspk = (double) sumapk / d;
			System.out.println("Aritmeticka sredina parnih elemenata " + (j + 1) + ". kolone iznosi: " + aspk);
		}
		sc.close();
	}
}
