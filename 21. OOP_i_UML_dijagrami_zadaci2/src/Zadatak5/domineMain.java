package Zadatak5;

public class domineMain {

	public static void main(String[] args) {

		Domine d1 = new Domine(2, 4);
		Domine d2 = new Domine(3, 4);

		System.out.println("d1 = d2 je " + d1.uporediDomine(d2));

		System.out.println("d1 pre zamene");
	    System.out.println(d1.toString());
		d1.zamena();
		System.out.println("d1 nakon zamene");
		System.out.println(d1.toString());
		System.out.println("Polja druge domine su " + d2.getA() + " i " + d2.getB());

		System.out.println(d2.zamena()); // ovo moze samo ako je stampanje sa nazivom toString


	}
}
