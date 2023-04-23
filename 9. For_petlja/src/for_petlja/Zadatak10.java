package for_petlja;

import java.util.Scanner;

public class Zadatak10 {

	// Deljivost sa 3

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj od: ");
		int x = sc.nextInt();
		System.out.print("Unesite broj do: ");
		int y = sc.nextInt();

		for (int i = x; i <= y; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}
