package Zadatak3;

public class ValjakMain {

	public static void main(String[] args) {

		Valjak v1 = new Valjak();
		Valjak v2 = new Valjak(3,5);


		System.out.println("Zapremina valjka je " + v1.zapremina());
		System.out.println(v1.opis());
		
		System.out.println("\nZapremina valjka je " + v2.zapremina());
		System.out.println(v2.opis());

	}

}
