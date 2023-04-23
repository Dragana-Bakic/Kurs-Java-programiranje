package UUP;

import java.util.Scanner;

public class Vezba_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite vrednost za n: ");
		int n = input.nextInt();

		double p = 1;
		for (int i = 1; i <= n; i++) {
			p *= (1 - (double) 1 / (i + 1));
		}

		System.out.println("Dobijena vrednost proizvoda je " + p);

		input.close();

	}

}
