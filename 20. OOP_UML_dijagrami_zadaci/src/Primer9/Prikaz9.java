package Primer9;

public class Prikaz9 {
	public static void main(String[] args) {
		//Preklapanje Konstruktora
		
		Box9 b1 = new Box9();
		Box9 b2 = new Box9(10,15,20);
		Box9 b3 = new Box9(10);
		Box9 b4 = new Box9(b1);

		System.out.println("Zapremina:" + b1.volume());
		System.out.println("Zapremina:" + b2.volume());
		System.out.println("Zapremina:" + b3.volume());
		System.out.println("Zapremina:" + b4.volume());

		
		
	}
}
