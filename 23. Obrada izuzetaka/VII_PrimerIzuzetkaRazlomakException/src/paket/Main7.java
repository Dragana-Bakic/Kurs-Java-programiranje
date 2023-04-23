package paket;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main7 {

	// throws (kljucna rec) koristi se u zaglavlju metode da se naznaci tip/tipove
	// izuzetaka koji ta metoda moze da baci

	public static int Razlomak(int x, int y) throws ArithmeticException {
		return x / y;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Unesite brojilac razlomka: ");
			int x = sc.nextInt();
			System.out.println("Unesite imenilac razlomka: ");
			int y = sc.nextInt();

			int rezultat = Razlomak(x, y);

			System.out.println("Kolicnik iznosi: " + rezultat);

		} catch (ArithmeticException e) {
			System.out.println("Izuzetak." + e);

		} catch (InputMismatchException e) {
			System.out.println("Unesite celobrojne brojeve!");

		}
	}

}
