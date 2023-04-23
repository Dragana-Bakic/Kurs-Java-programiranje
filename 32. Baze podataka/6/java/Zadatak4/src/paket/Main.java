package paket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite nosivost mosta: ");
		double nosivost = sc.nextDouble();

		char vrstaVozila;
		double tezina;

		System.out.print("Unesite P za putnicko i T za teretno vozilo: ");
		vrstaVozila = sc.next().charAt(0);

		switch (vrstaVozila) {

		case 'P', 'p': {
			System.out.print("Unesite tezinu putnickog vozila: ");
			tezina = sc.nextDouble();

			System.out.print("Unesite broj putnika: ");
			int broj = sc.nextInt();

			System.out.print("Unesite prosecnu tezinu putnika: ");
			double prosek = sc.nextDouble();

			PutnickoVozilo p = new PutnickoVozilo(tezina, broj, prosek);
			
			System.out.println(p.opis());
			
			if (nosivost <= p.getOpterecenje()) {
				System.out.println("Most nece izdrzati ovo vozilo! ");
			} else {
				System.out.println("Vozilo moze preci preko mosta bezbedno.");
			}
			break;

		}
		case 'T', 't': {

			System.out.print("Unesite tezinu teretnog vozila: ");
			tezina = sc.nextDouble();

			System.out.print("Unesite teret vozila: ");
			double teret = sc.nextDouble();

			TeretnoVozilo t = new TeretnoVozilo(tezina, teret);
			
			System.out.println(t.opis());

			if (nosivost <= t.getOpterecenje()) {
				System.out.println("Most nece izdrzati ovo vozilo! ");
			} else {
				System.out.println("Vozilo moze preci preko mosta bezbedno.");
			}
			break;
		}
		default: {
			System.out.println("Morate uneti T za teretno vozilo ili p za putnicko vozilo");
		}
		}
		sc.close();
	}
}
