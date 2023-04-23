package vezba_grananje;

import java.util.Scanner;

public class Zadatak5 {

	// Horoskopski znaci

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite mesec rođenja (slovima): ");
		String mesec = sc.nextLine();
		System.out.print("Unesite dan rođenja (brojevima): ");
		int datum = sc.nextInt();

		switch (mesec) {

		case "Januar", "januar": {
			if (datum >= 1 && datum <= 20)
				System.out.print("\nHoroskopski znak je: Jarac ");
			else if (datum >= 21 && datum <= 31)
				System.out.print("\nHoroskopski znak je: Vodolija ");
			else
				System.out.print("Pogrešan datum! ");
			break;
		}
		case "Februar", "februar": {
			if (datum >= 1 && datum <= 19)
				System.out.print("\nHoroskopski znak je: Vodolija ");
			else if (datum >= 20 && datum <= 29)
				System.out.print("\nHoroskopski znak je: Ribe ");
			else
				System.out.print("Pogrešan datum! ");
			break;
		}
		case "Mart", "mart": {
			if (datum >= 1 && datum <= 20)
				System.out.print("\nHoroskopski znak je: Ribe ");
			else if (datum >= 21 && datum <= 31)
				System.out.print("\nHoroskopski znak je: Ovan ");
			else
				System.out.print("Pogrešan datum! ");
			break;
		}
		case "April", "april": {
			if (datum >= 1 && datum <= 20)
				System.out.print("\nHoroskopski znak je: Ovan ");
			else if (datum >= 21 && datum <= 30)
				System.out.print("\nHoroskopski znak je: Bik ");
			else
				System.out.print("Pogrešan datum! ");
			break;
		}
		case "Maj", "maj": {
			if (datum >= 1 && datum <= 21)
				System.out.print("\nHoroskopski znak je: Bik ");
			else if (datum >= 22 && datum <= 31)
				System.out.print("\nHoroskopski znak je: Blizanci ");
			else
				System.out.print("Pogrešan datum! ");
			break;
		}
		case "Jun", "jun": {
			if (datum >= 1 && datum <= 21)
				System.out.print("\nHoroskopski znak je: Blizanci ");
			else if (datum >= 22 && datum <= 30)
				System.out.print("\nHoroskopski znak je: Rak ");
			else
				System.out.print("Pogrešan datum! ");
			break;
		}
		case "Jul", "jul": {
			if (datum >= 1 && datum <= 22)
				System.out.print("\nHoroskopski znak je: Rak ");
			else if (datum >= 23 && datum <= 31)
				System.out.print("\nHoroskopski znak je: Lav ");
			else
				System.out.print("Pogrešan datum! ");
			break;
		}
		case "Avgust", "avgust": {
			if (datum >= 1 && datum <= 22)
				System.out.print("\nHoroskopski znak je: Lav ");
			else if (datum >= 23 && datum <= 31)
				System.out.print("\nHoroskopski znak je: Devica ");
			else
				System.out.print("Pogrešan datum! ");
			break;
		}
		case "Septembar", "septembar": {
			if (datum >= 1 && datum <= 22)
				System.out.print("\nHoroskopski znak je: Devica ");
			else if (datum >= 23 && datum <= 30)
				System.out.print("\nHoroskopski znak je: Vaga ");
			else
				System.out.print("Pogrešan datum! ");
			break;
		}
		case "Oktobar", "oktobar": {
			if (datum >= 1 && datum <= 23)
				System.out.print("\nHoroskopski znak je: Vaga ");
			else if (datum >= 24 && datum <= 31)
				System.out.print("\nHoroskopski znak je: Skorpija ");
			else
				System.out.print("Pogrešan datum! ");
			break;
		}
		case "Novembar", "novembar": {
			if (datum >= 1 && datum <= 22)
				System.out.print("\nHoroskopski znak je: Skorpija ");
			else if (datum >= 23 && datum <= 30)
				System.out.print("\nHoroskopski znak je: Strelac ");
			else
				System.out.print("Pogrešan datum! ");
			break;
		}
		case "Decembar", "decembar": {
			if (datum >= 1 && datum <= 21)
				System.out.print("\nHoroskopski znak je: Strelac ");
			else if (datum >= 22 && datum <= 31)
				System.out.print("\nHoroskopski znak je: Jarac ");
			else
				System.out.print("Pogrešan datum! ");
			break;
		}
		default: {
			System.out.print("Pogrešan unos meseca");
		}

		}
		sc.close();
	}
}
