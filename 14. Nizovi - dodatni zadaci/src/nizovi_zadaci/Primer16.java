package nizovi_zadaci;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Primer16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");

		double x[] = new double[100];
		double a[] = new double[100];
		double y[] = new double[100];

		System.out.print("Unesite broj n: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextDouble();
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextDouble();
		}
		
		y[1] = 0;
		for (int i = 2; i <= n; i++) {
			if (x[i] > 0)
				y[i] = a[i] * x[i];
			else
				y[i] = y[i - 1];
		}
		System.out.println("R.BR.\tA\tX\tY");
		for (int i = 1; i <= n; i++)
			System.out.println(i + "\t" + df.format(a[i]) + "\t" + df.format(x[i]) + "\t" + df.format(y[i]));

		sc.close();
	}
}
