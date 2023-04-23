package nizovi_zadaci;

import java.util.Scanner;

public class Primer18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x[] = new double[100];
		double y[] = new double[100];

		char oblast[] = new char[100];

		System.out.print("Unesite broj tacaka n: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextDouble();
			System.out.print("y[" + i + "] = ");
			y[i] = sc.nextDouble();
		}
		System.out.println("R.BR.\tX\tY\toblast");

		for (int i = 1; i <= n; i++) {
			boolean K1 = Math.pow(x[i] - 1, 2) + Math.pow(y[i], 2) <= 1;
			boolean K2 = Math.pow(x[i] - 1, 2) + Math.pow((y[i] - 1), 2) <= 1;
			boolean K3 = Math.pow(x[i], 2) + Math.pow(y[i] - 1, 2) <= 1;

			if (K1 && !K2 && K3)
				oblast[i] = 'A';
			else if (K1 && K2 && !K3)
				oblast[i] = 'B';
			else if (!K1 && K2 && K3)
				oblast[i] = 'C';
			else
				oblast[i] = '*';
		}
		for (int i = 1; i <= n; i++)

			System.out.println(i + "\t" + x[i] + "\t" + y[i] + "\t" + oblast[i]);

		sc.close();

	}

}
