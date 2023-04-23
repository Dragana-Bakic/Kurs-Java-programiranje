package nizovi_zadaci;

import java.util.Scanner;

public class Primer8 {

	public static void main(String[] args) {
		// bj - vektor jedinica
		//// bd - vektor desetica
		// n - željeni broj unetih cifara
		// broj - vrednost broja koja se unosi

		Scanner sc = new Scanner(System.in);

		int bj[] = new int[100];
		int bd[] = new int[100];

		int broj, j, d;

		for (int i = 0; i <= 9; i++) {
			bj[i] = 0;
			bd[i] = 0;
		}

		System.out.print("Koliko brojeva zelite da unesete: ");
		int n = sc.nextInt();

		System.out.println("Unesite brojeve:");
		for (int i = 1; i <= n; i++) {
			broj = sc.nextInt();

			if (broj >= 0 && broj <= 99) {
				d = broj / 10;
				bd[d]++;
				j = broj % 10;
				bj[j]++;
			}

			else
				System.out.println("Greska.");
		}

		System.out.println("\tCifra\tKao desetica\tKao jedinica\tUkupno");
		for (int i = 0; i <= 9; i++)

			System.out.println("\t" + i + "\t" + bd[i] + "\t" + "\t" + bj[i] + "\t\t" + (bd[i] + bj[i]));

		sc.close();
	}

}
