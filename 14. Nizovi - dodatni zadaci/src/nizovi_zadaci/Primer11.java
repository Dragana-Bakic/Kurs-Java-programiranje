package nizovi_zadaci;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Primer11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");

		double x[] = new double[100];
		double a[] = new double[100];
		double b[] = new double[100];
		double c[] = new double[100];
		double s = 0;

		System.out.print("Unesite dimenziju nizova n: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(i + ". unos podataka: ");

			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextDouble();
			System.out.print("b[" + i + "] = ");
			b[i] = sc.nextDouble();
			System.out.print("c[" + i + "] = ");
			c[i] = sc.nextDouble();

			if ((a[i] + b[i]) > c[i])
				x[i] = Math.pow(a[i], 2) + Math.pow(b[i], 2) + Math.pow(c[i], 2);
			else if (a[i] + b[i] == c[i])
				x[i] = a[i] + 2 * b[i] * c[i];
			else
				x[i] = a[i] + b[i] - c[i];

			s += x[i];
		}

		System.out.print("Zbir " + n + " sabiraka je:" + "\nS = " + df.format(s));

		sc.close();
	}

}
