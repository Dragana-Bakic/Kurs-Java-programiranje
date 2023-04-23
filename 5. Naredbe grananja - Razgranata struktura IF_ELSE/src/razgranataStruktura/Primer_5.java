package razgranataStruktura;

import java.util.Scanner;

public class Primer_5 {

	// Paran

	public static void main(String[] args) {

		double a, y;

		Scanner input = new Scanner(System.in);

		System.out.print("Unesite vrednost a: ");
		a = input.nextDouble();

		if (a > 0)
			y = Math.sqrt(a);

		else
			y = Math.pow(a, 2);

		System.out.println("y je " + y);
		input.close();

	}

}
