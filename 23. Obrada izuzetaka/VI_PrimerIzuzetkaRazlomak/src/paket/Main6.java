package paket;

import java.util.Scanner;

public class Main6 {

	public static int Razlomak(int x, int y) {
		return x / y;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite brojilac razlomka: ");
		int x = sc.nextInt();
		System.out.println("Unesite imenilac razlomka: ");
		int y = sc.nextInt();
		try {
			int rezultat = Razlomak(x, y);

			System.out.println("Kolicnik iznosi: " + rezultat);
			
		} catch (ArithmeticException e) {
			System.out.println("Deljenje nulom");
		}
	}

}
