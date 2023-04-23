package Primer1b;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		CatSetGet obj = new CatSetGet();
		
		System.out.print("Unesite ime macke: ");
		String uneto = sc.nextLine();
		
		obj.setIme(uneto);
		obj.getIme();
		
		System.out.println("Ime macke je: " + obj.getIme());
		
		sc.close();

	}

}
