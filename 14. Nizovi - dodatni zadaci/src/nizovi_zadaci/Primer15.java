package nizovi_zadaci;

import java.util.Scanner;

public class Primer15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x[] = new double[50];

		System.out.print("Unesite dimenziju nizova n: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextDouble();
		}

		double xsr = 0;
		for (int i = 1; i <= n; i++)
			xsr += x[i];
		xsr /= n;

		double v = 0;
		for (int i = 1; i <= n; i++)
			v += Math.pow(x[i] - xsr, 2);

		v /= (n - 1);

		System.out.println("V=" + v);

		sc.close();
	}
}
