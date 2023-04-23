package paket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] brojevi = new int[5];
		
		for(int i = 0; i < brojevi.length; i++) { // 0 . . 4 
			
			System.out.println("Unesite broj: ");
			brojevi[i] = scanner.nextInt();
			
			if((i+1) == brojevi.length) {
				System.out.println("Niz je napunjen!");

			}
		}
		System.out.println("Elementi niza su: ");
		//for(int i = 0;)


	}

}
