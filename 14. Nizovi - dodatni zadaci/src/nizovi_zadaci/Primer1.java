package nizovi_zadaci;

import java.util.Scanner;

public class Primer1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj elementa niza n: ");
		int n = sc.nextInt();

		int x[] = new int[100];
		int y[] = new int[100];

		if (n > 100)
			System.out.println("Gre[ka. Unesite broj elemenata niza manji ili jednak 100.");
		else {
			System.out.println("Unesite koordinate ta;aka x i y:");
			for (int i = 1; i <= n; i++) {
				System.out.print("x[" + i + "] = ");
				x[i] = sc.nextInt();
				System.out.print("y[" + i + "] = ");
				y[i] = sc.nextInt();
			}

			double p, s = 0;
			for (int i = 1; i <= n; i++) {
				x[0] = x[n];
				x[n + 1] = x[1];

				y[0] = y[n];
				y[n + 1] = y[1];

				s += y[i] * (x[i - 1] - x[i + 1]);

			}
			p = s / 2;
			System.out.println("Povrsina parcele iznosi: " + p);
		}
		sc.close();
	}
}
