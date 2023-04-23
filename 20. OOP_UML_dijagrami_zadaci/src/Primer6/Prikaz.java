package Primer6;

public class Prikaz {

	public static void main(String[] args) {
		// Inicijalizacija objekta koristeci difoltni kontruktor
		
		Box b1 = new Box() ;
		Box b2 = new Box();
		
		System.out.println("Zapremina:" + b1.volume());
		System.out.println("Zapremina:" + b2.volume());

		
	}

}
