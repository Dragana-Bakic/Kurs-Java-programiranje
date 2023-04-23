package Primer10;

import java.util.Scanner;

public class PrikazKnjige {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite ime knjige: ");
		String unetoime = sc.nextLine();
		System.out.print("Unesite broj strana knjige: ");
		int unetbrojStrana = sc.nextInt();

		Knjiga knjiga = new Knjiga(unetoime, unetbrojStrana);

		knjiga.ispis();
		
		//knjiga.imeistr();
		sc.close();

	}

}
