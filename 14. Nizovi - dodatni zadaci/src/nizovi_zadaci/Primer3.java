package nizovi_zadaci;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Primer3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		// Unos dimenzije niza
		System.out.print("Unesite broj elemenata nizova: ");
		int n = sc.nextInt();

		double a[] = new double[100];
		double x[] = new double[100];
		double y[] = new double[100];
		double A = 0.0, xt= 0.0, yt= 0.0;

		// Unos elemenata niza
		System.out.println("Unesite elemente niza: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextDouble();
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextDouble();
			System.out.print("y[" + i + "] = ");
			y[i] = sc.nextDouble();
		}

		for (int i = 1; i <= n; i++) {
			A += a[i];
			xt += a[i] * x[i];
			yt += a[i] * y[i];
		}
		xt /= A;
		yt /= A;
		
		// Stampanje reyultata
		System.out.println("A = " + df.format(A) + "\nXT = " + df.format(xt) + "\nYT = " + df.format(yt));

		sc.close();
	}

}
