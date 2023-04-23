package Primer1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Macka macka = new Macka();
		System.out.print("Unesite ime macke: ");

		macka.ime = sc.nextLine();

		macka.prikazatiIme();

		sc.close();
	}

}
