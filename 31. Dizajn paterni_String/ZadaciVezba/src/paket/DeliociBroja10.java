package paket;

import java.util.Scanner;

public class DeliociBroja10 {

	// Ispisati sve delioce broja 10

	public static void deljivost(int broj) {
		int suma = 0;
		for (int i = 1; i <= broj; i++) {
			if (broj % i == 0) {
				suma+=i;
				System.out.print(i + " ");
			}
		}
		System.out.print("\nSuma delilaca je " + suma);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Uensite broj");
		int broj = sc.nextInt();
		
		deljivost(broj);

	}

}
