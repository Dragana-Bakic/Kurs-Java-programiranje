package visestruko_grananje;

import java.util.Scanner;

public class Zadatak7_if_else {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int K1, K2, K3;

		System.out.println("Unesite tri redna broja dana u godini: ");
		System.out.print("1. dan: ");
		K1 = sc.nextInt();
		System.out.print("2. dan: ");
		K2 = sc.nextInt();
		System.out.print("3. dan: ");
		K3 = sc.nextInt();

		if ((K1 < 1 || K1 > 366) || (K2 < 1 || K2 > 366) || (K3 < 1 || K3 > 366)) {
			System.out.println("Neka od unetih vrednosti ne predstavlja dan u godini!");
		} else {
			if ((K2 - K1) % 7 == 0 && (K3 - K1) % 7 == 0) {
				System.out.println("Navedene vrednosti predstavljaju iste dane u sedmici.");
			} else {
				System.out.println("Navedene vrednosti ne predstavljaju iste dane u sedmici.");
			}
		}

		/*
		 * II nacin:
		 * 
		 * if (K1 % 7 == 0 && K2 % 7 == 0 && K3 % 7 == 0) {
		 * System.out.println("Oznacavaju iste dane u nedelji"); } else if (K1 % 7 == 1
		 * && K2 % 7 == 1 && K3 % 7 == 1) {
		 * System.out.println("Oznacavaju iste dane u nedelji"); } else if (K1 % 7 == 2
		 * && K2 % 7 == 2 && K3 % 7 == 2) {
		 * System.out.println("Oznacavaju iste dane u nedelji"); } else if (K1 % 7 == 3
		 * && K2 % 7 == 3 && K3 % 7 == 3) {
		 * System.out.println("Oznacavaju iste dane u nedelji"); } else if (K1 % 7 == 4
		 * && K2 % 7 == 4 && K3 % 7 == 4) {
		 * System.out.println("Oznacavaju iste dane u nedelji"); } else if (K1 % 7 == 5
		 * && K2 % 7 == 5 && K3 % 7 == 5) {
		 * System.out.println("Oznacavaju iste dane u nedelji"); } else if (K1 % 7 == 6
		 * && K2 % 7 == 6 && K3 % 7 == 6) {
		 * System.out.println("Oznacavaju iste dane u nedelji"); } else {
		 * System.out.println("Ne oznacavaju iste dane u nedelji"); }
		 * 
		 */

		sc.close();
	}
}