package linearnizadaci;

import java.util.Scanner;

public class Trougao {

	public static void main(String[] args) {

		// obim i povrsina trougla

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite vrednost stranice trougla a: ");
		double a = input.nextDouble();
		System.out.println("Unesite vrednost stranice trougla b: ");
		double b = input.nextDouble();
		System.out.println("Unesite vrednost stranice trougla c: ");
		double c = input.nextDouble();

		/*
		 * Može i: System.out.println("Unesite stranice trougla a, b, c"); 
		 * double a = input.nextDouble(); 
		 * double b = input.nextDouble(); 
		 * double c = input.nextDouble();
		 */

		// Štampanje obima trougla
		System.out.println("Obim trougla je: " + Math.sqrt(a + a + c));

		// Štampanje povšine trougla
		double s = (a + b + c) / 2;
		System.out.println("Povšina trougla je: " + Math.sqrt(s * (s - a) * (s - b) * (s - c)));

		input.close();

	}

}
