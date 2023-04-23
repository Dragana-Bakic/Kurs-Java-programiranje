package vezba_grananje;

import java.util.Scanner;

public class Zadatak4 {
	
	// 7 dan od unetog datuma

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int d, m, g, d2 = 0, m2 = 0, g2 = 0;

		System.out.println("Unesite datum (dan-mesec-godina): ");
		d = sc.nextInt();
		m = sc.nextInt();
		g = sc.nextInt();

		switch (m) {

		case 2: {

			if (g % 4 == 0 && g / 100 != 0 || g % 400 == 0) {
				if (d > 0 && d <= 22) {
					d2 = d + 7;
					m2 = m;
					g2 = g;
				} else if (d >= 23 && d <= 29) {
					d2 = d + 7 - 29;
					m2 = m + 1;
					g2 = g;
				} else {
					System.out.print("Pogresno unet dan u mesecu u prestupnoj godini. ");
				}
			} else {
				if (d > 0 && d <= 21) {
					d2 = d + 7;
					m2 = m;
					g2 = g;
				} else if (d >= 22 && d <= 28) {
					d2 = d + 7 - 28;
					m2 = m + 1;
					g2 = g;
				} else {
					System.out.print("Pogresno unet dan u mesecu u neprestupnoj godini. ");
				}
			}
			break;
		}

		case 1, 3, 5, 7, 8, 10: {

			if (d > 0 && d <= 24) {
				d2 = d + 7;
				m2 = m;
				g2 = g;

			} else if (d > 24 && d <= 31) {
				d2 = d + 7 - 31;
				m2 = m + 1;
				g2 = g;

			} else {
				System.out.print("Pogresno unet dan u mesecu sa 31 danom. ");
			}
			break;
		}
		case 4, 6, 9, 11: {
			if (d > 0 && d <= 23) {
				d2 = d + 7;
				m2 = m;
				g2 = g;

			} else if (d >= 24 && d <= 30) {
				d2 = d + 7 - 30;
				m2 = m + 1;
				g2 = g;

			} else {
				System.out.print("Pogresno unet dan u mesecu sa 30 dana. ");
			}
			break;
		}
		case 12: {
			if (d > 0 && d <= 24) {
				d2 = d + 7;
				m2 = m;
				g2 = g;

			} else if (d > 24 && d <= 31) {
				d2 = d + 7 - 31;
				m2 = 1;
				g2 = g + 1;
			} else {
				System.out.print("Pogresno unet dan u mesecu sa 31 danom. ");
			}
			break;
		}

		default: {
			System.out.print("Pogresno unet datum meseca. ");
		}
		}
		if (d2 > 0) {
			System.out.print("7 dana nakon unetog datuma je: " + d2 + "." + m2 + "." + g2 + ".");
		}
		sc.close();

	}
}
