package Primer5;

public class Prikaz {

	public static void main(String[] args) {
		// Inicijalizacija vrednosti u podrazumevanom kontruktoru
		
		Box b1 = new Box();// u trenutku kreiranja objekta, pozvace se podrazumevani konstruktor
		Box b2 = new Box();
		
		b1.intBox(10, 15, 20); // poziv metode (intBox) za objekat b1, sa argumentima sirina, visina i dubina ovde 10,15,20
		b2.intBox(5, 6, 7);
		
		System.out.println("Zapremina: " + b1.volume()); // poziv druge metode (volume)
		System.out.println("Zapremina: " + b2.volume());




	}

}
