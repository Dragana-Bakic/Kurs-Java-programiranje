package for_petlja;

public class Zadatak11 {

	// Amstrongovi brojevi

	public static void main(String[] args) {

		int broj, t, d, j;
		for (int i = 0; i < 1000; i++) {
			broj = i;
			t = i / 100;
			d = i / 10 % 10;
			j = i % 10;

			if (broj == (t * t * t + d * d * d + j * j * j)) {

				System.out.print(broj + " ");
			}
		}
	}
}
