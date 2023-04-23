package Zadatak7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite neki broj: ");
		double b = sc.nextDouble();

		ApsolutnaVrednost ab = new ApsolutnaVrednost(b);

		System.out.println("Apsolutna vrednost unetog broja je: " + ab.ispis());


		sc.close();

	}

}
