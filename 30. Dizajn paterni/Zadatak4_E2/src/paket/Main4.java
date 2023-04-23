package paket;

public class Main4 {

	public static void main(String[] args) {

		// Sva nabrajanja imaju dve unapred definisane metode:
		// values() - vraca niz koji sadrzi listu konstanti definisanih u nabrajanju
		// valuesOf() - vraca konstantu iz nabrajanja cija vrednost odgovara znaokvnom
		// nizu prosledjenom u argumentu

		Boja b;
		System.out.println("Boje: ");

		Boja nizBoja[] = Boja.values();

		for (Boja c : nizBoja) {
			System.out.println(c + " ");

		}
		Boja c1;
		c1 = Boja.valueOf("Bela"); // ova metoda vraca vrednost iz nabrajanja koja odgovara imenu zadate konstante
		
		System.out.println("Boja: " + c1);
		



	}

}
