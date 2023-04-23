package nizovi_zadaci;

import java.util.Scanner;

public class Primer6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x[] = new double[100];
		double y[] = new double[100];
		double z[] = new double[100];

		System.out.print("Unesite broj trojki trougla: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Moguce stranice " + i + ". trougla:");
			System.out.print("x = ");
			x[i] = sc.nextDouble();
			System.out.print("y = ");
			y[i] = sc.nextDouble();
			System.out.print("z = ");
			z[i] = sc.nextDouble();
		}

		System.out.println("x\ty\tz\tOdgovor");

		for (int i = 1; i <= n; i++) {
			if ((x[i] + y[i]) > z[i] && Math.abs(x[i] - y[i]) < z[i]) {
				System.out.println(x[i] + "\t" + y[i] + "\t" + z[i] + "\tda");
			} else
				System.out.println(x[i] + "\t" + y[i] + "\t" + z[i] + "\tne");

		}
		sc.close();

	}
}
