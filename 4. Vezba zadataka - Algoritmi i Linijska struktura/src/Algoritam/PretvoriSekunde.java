package Algoritam;

import java.util.Scanner;

public class PretvoriSekunde {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Unesite vreme u satima: ");
		int s = input.nextInt();
		System.out.print("Unesite vreme u minutima: ");
		int m = input.nextInt();
		System.out.print("Unesite vreme u sekundama: ");
		int sec = input.nextInt();

		System.out.println("Vreme izraženo u sekundama je: : " + (s * 3600 + m * 60 + sec));

		input.close();

	}
}
