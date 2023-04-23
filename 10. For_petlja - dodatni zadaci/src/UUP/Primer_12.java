package UUP;

public class Primer_12 {

	public static void main(String[] args) {

		// Štampanje zaglavlja
		System.out.println("T\tS1\tS2\tS=|S1 -S2|");
		for (int t = 0; t <= 15; t++) {

			// Izračunavanje pređenih puteva
			double s1 = 2 * Math.pow(t, 3) + Math.pow(t, 2);
			double s2 = 2 * Math.pow(t, 2) + 5 * t;
			double s = Math.abs(s1 - s2);

			// Štampanje rezultata
			System.out.println(t + "\t" + s1 + "\t" + s2 + "\t" + s);
		}
	}
}
