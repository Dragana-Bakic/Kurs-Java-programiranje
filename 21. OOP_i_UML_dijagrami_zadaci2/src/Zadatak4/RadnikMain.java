package Zadatak4;

public class RadnikMain {

	public static void main(String[] args) {

		Radnik r1 = new Radnik("Pera", 45000, 80);
		Radnik r2 = new Radnik("Mika", 50000, 90);

		System.out.println(r1.getPrihod());
		System.out.println(r2.getPrihod());

		r1.opis();
		r2.opis();

	}

}
