package Operatori_i_stringovi;

import java.util.Scanner;

public class UcitavanjeVrednostiSaKonzole {

	public static void main(String[] args) {

		// Ucitavanje (i smestanje unete) vrednosti sa konzole.

		Scanner sc = new Scanner(System.in);

		System.out.println("Kako se zovete?");
		String ime = sc.nextLine();
		System.out.println("Vi se zovete: " + ime);

		System.out.println("Koliko imate godina? ");
		int brojGodina = sc.nextInt();
		System.out.println("Imate godina: " + brojGodina);

		// Deklaracija stringova

		// "dasdas@@23asdfsASDASDa#$%^&*1231"

		String name; // deklaracija stringa
		String izraz = "Dragana"; // Inicijalizacija stringa
		System.out.println(izraz); // Ispisivanje vrednosti stringa

		sc.close();

	}

}
