package razgranataStruktura;

import java.util.Scanner;

public class Primer_4 {

	// MinMax

	public static void main(String[] args) {

		double a, b;
		double y;

		Scanner input = new Scanner(System.in);

		System.out.print("Unesite vrednost a: ");
		a = input.nextDouble();
		System.out.println("Unesite vrednost broja b: ");
		b = input.nextDouble();

		if (a >= 0)
			y = (1 - Math.min(a, b)) / (1 + Math.max(a, b));

		else
			y = Math.min(a, b) / (Math.min(a * a, b * b) + 3);

		System.out.println("y je " + y);
		input.close();

	}

}
