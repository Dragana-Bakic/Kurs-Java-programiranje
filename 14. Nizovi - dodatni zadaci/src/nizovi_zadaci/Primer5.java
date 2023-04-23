package nizovi_zadaci;

import java.util.Scanner;

public class Primer5 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a[] = new int[100];

		System.out.print("Unesite broj clanova niza n: ");
		int n = sc.nextInt();

		System.out.println("Unesite clanove niza: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}

		System.out.print("Niz a pre sortiranja:" + "\t");
		for (int i = 1; i <= n; i++) 
			System.out.print(a[i] + "\t");

		for (int i = 1; i <= n - 1; i++) {
			for (int j = i + 1; j <= n; j++) {
				if (a[i] < a[j]) {
					int pom = a[i];
					a[i] = a[j];
					a[j] = pom;
				}
			}
		}
		System.out.print("\nNiz a posle sortiranja:" + "\t");
		for (int i = 1; i <= n; i++)
			System.out.print(a[i] + "\t");

		sc.close();
	}

}
