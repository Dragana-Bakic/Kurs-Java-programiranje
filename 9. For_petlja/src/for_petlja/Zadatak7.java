package for_petlja;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj m: ");
		int m = sc.nextInt();
		System.out.println("Unesite broj n: ");
		int n = sc.nextInt();

		int S = 1;
		for (int i = 1; i <= m; i++) {
			int prelaz = n + i * m;
			S = S * prelaz;
		}
		System.out.println("Za brojeve " + m + " i " + n + ", S = " + (n * S));

		sc.close();

	}

}
