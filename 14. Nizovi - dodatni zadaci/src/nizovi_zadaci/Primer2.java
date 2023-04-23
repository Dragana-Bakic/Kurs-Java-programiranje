package nizovi_zadaci;

import java.util.Scanner;

public class Primer2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj elementa niza n: ");
		int n = sc.nextInt();

		double x[] = new double[100];
		double y[] = new double[100];
		char oblast[] = new char[100];

		if (n > 100)
			System.out.println("Greska. Unesite broj elemenata niza manji ili jednak 100.");
		else {
			System.out.println("Unesite koordinate tacaka x i y:");
			for (int i = 1; i <= n; i++) {
				System.out.print("x[" + i + "] = ");
				x[i] = sc.nextDouble();
				System.out.print("y[" + i + "] = ");
				y[i] = sc.nextDouble();

				boolean k1 = Math.pow(x[i] - 1, 2) + y[i] * y[i] <= 1;
				boolean k2 = Math.pow(x[i] - 2, 2) + y[i] * y[i] <= 1;

				if (k1 && !k2)
					oblast[i] = '1';
				else if (k1 && k2)
					oblast[i] = '2';
				else if (!k1 && k2)
					oblast[i] = '3';
				else
					oblast[i] = '*';

			}
			System.out.println("R.BR\tX\tY\tOBLAST");

			for (int i = 1; i <= n; i++)
				System.out.println(i + "\t" + x[i] + "\t" + y[i] + "\t" + oblast[i]);

			sc.close();

		}
	}
}
