package paket;

public class Main {

	public static void main(String[] args) {

		A<Integer, String> objekat1 = new A<Integer, String>(100, "Java");
		objekat1.prikaziTip();

		int intvrednost = objekat1.getObj1();
		System.out.println("Vrednost: " + intvrednost);

		String strvrednost = objekat1.getObj2();
		System.out.println("Vrednost: " + strvrednost);

		
		System.out.println("\n");

		
		A<String, Double> objekat2 = new A<String, Double>("tekst123", 123.45);
		objekat2.prikaziTip();

		String strVrednost = objekat2.getObj1();
		System.out.println("Vrednost: " + strVrednost);

		double dbvrednost = objekat2.getObj2();
		System.out.println("Vrednost: " + dbvrednost);
		
		
		System.out.println("\n");


		A<Boolean, Integer> objekat3 = new A<Boolean, Integer>(true, 101);
		objekat3.prikaziTip();

		Boolean b3 = objekat3.getObj1();
		System.out.println("Vrednost: " + b3);

		int i3 = objekat3.getObj2();
		System.out.println("Vrednost: " + i3);
	}

}
