package Primer7;

public class Prikaz {

	public static void main(String[] args) {
		// Inicijalizacija objekta sa parametrizovanim kontruktorom
		
		Box7 b1 = new Box7(10,15,20);
		Box7 b2 = new Box7(5,6,7);
		
		System.out.println("Zapremina:" + b1.volume());
		System.out.println("Zapremina:" + b2.volume());

	}

}
