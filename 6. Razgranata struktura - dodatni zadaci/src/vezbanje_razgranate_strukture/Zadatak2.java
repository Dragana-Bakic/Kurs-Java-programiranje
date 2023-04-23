package vezbanje_razgranate_strukture;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.println("Unesite broj: ");
		x = sc.nextInt();

		if (x < 0) {
			y = -5;
		} else if (x >= 0 && x < 1) {
			y = x + 2;
		} else if (x >= 1 && x < 5) {
			y = 3 * x - 1;
		} else {
			y = x * 2;
		}

		System.out.print("y = " + y);

		sc.close();

	}

}
