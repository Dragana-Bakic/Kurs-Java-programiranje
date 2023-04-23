package nizovi_zadaci;

import java.util.Scanner;

public class Primer10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int F[] = new int[100];

		System.out.print("Koliko broj n: ");
		int n = sc.nextInt();

		F[0] = 0;
		F[1] = 1;

		for (int i = 2; i <= n; i++)
			F[i] = 3 * F[i - 1] - 2 * F[i - 2] + F[i - 1] * F[i - 2];

		for (int i = 0; i <= n; i++)
			System.out.println("F[" + i + "] = " + F[i]);

		sc.close();
	}

}
