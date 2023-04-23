package paket;

public class Main {

	public static void main(String[] args) {

		A<Integer> intObjekat = new A<Integer>(100);

		// Knjiga k1 = new Knjiga("NDC", 1100);

		intObjekat.prikaziTip();
		int vrednostIntObjekta = intObjekat.getOb();
		System.out.println("Vrednost: " + vrednostIntObjekta);
		
		System.out.println("\n");

		
		A<String> strObjekat = new A<String>("tekst");
		
		strObjekat.prikaziTip();
		String str = strObjekat.getOb();
		System.out.println("Vrednost: " + str);



	}

}
