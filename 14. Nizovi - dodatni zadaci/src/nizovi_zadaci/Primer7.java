package nizovi_zadaci;

import java.util.Scanner;

public class Primer7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int parni[] = new int[100];
		int neparni[] = new int[100];

		int p = 0, n = 0;
		System.out.print("Unesite broj kuca : ");
		int k = sc.nextInt();

		System.out.println("Unesite brojeve kuca:");
		for (int i = 1; i <= k; i++) {
			int x = sc.nextInt();

			if (x % 2 == 0) {
				parni[p++] = x;
			} else
				neparni[n++] = x;

		}
		System.out.println("Parni brojevi kuca:");
		for (int i = 0; i < p; i++)
			System.out.println(parni[i]);

		System.out.println("Neparni brojevi kuca: ");
		for (int i = 0; i < n; i++)
			System.out.println(neparni[i]);

		sc.close();
	}

}
