package Zadatak2;

import java.util.Scanner;

public class PrikazOsobe {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Osoba o1 = new Osoba();

		System.out.println("Unesite ime: ");
		o1.ime = sc.nextLine();

		System.out.println("Unesite datum rodjenja: ");
		o1.datumRodjenja = sc.nextLine();

		System.out.println("Unesite adresu stanovanja: ");
		o1.adresaStanovanja = sc.nextLine();

		// System.out.println(o1.ispisi());

		o1.ispis();

		sc.close();
	}

}
