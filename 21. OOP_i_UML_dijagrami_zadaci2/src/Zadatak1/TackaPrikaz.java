package Zadatak1;

public class TackaPrikaz {

	public static void main(String[] args) {

		Tacka t1 = new Tacka(2, 5);
		Tacka t2 = new Tacka(3, 6);

		System.out.println(t1.getx());
		System.out.println(t1.gety());
		System.out.println(t1.ispisi());

		System.out.println(t2.getx());
		System.out.println(t2.gety());
		System.out.println(t2.ispisi());

	}

}
