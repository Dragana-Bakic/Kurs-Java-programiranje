package primer8;

public class ProsledjivanjeObjektaMetodiPrikaz {

	// prosledjivanje objekta metodi

	public static void main(String[] args) {

		Circle c1 = new Circle(20); // inicijalizacija objekta preko konstruktora sa parametrom

		calcArea(c1);

	}

	public static void calcArea(Circle c) { // ova metoda ima kao objekat klasu, umesto primitivnog tipa podataka
		System.out.println("Povrsina kruga iznosi: " + c.area());

	}

}
