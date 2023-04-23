package nizovi_zadaci;

import java.util.Scanner;

public class Primer4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj elementa niza n: ");
		int n = sc.nextInt();

		int a[] = new int[100];
		for (int i = 1; i <= n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		System.out.println("Niz a pre sortiranja:");
		for (int i = 1; i <= n; i++)
			System.out.print(a[i] + " ");

		for (int i = 1; i <= n - 1; i++) {
			for (int j = i + 1; j <= n; j++) {
				if (a[i] > a[j]) {
					int pom = a[i];
					a[i] = a[j];
					a[j] = pom;
				}
			}
		}
		System.out.println("\nNiz a posle sortiranja:");
		for (int i = 1; i <= n; i++)
			System.out.print(a[i] + " ");
		
		sc.close();
	}
}