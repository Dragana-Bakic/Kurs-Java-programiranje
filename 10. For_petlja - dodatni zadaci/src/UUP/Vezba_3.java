package UUP;

public class Vezba_3 {

	public static void main(String[] args) {

		double s = 0, p = 1;
		for (int i = 1; i <= 50; i++) {
			for (int j = 1; j <= i; j++) {
				if (j != 3) {
					p *= (double) (j + 2) / (j - 3);

				}
			}
			s += p;

		}

		System.out.println("Dobijena vrednost je " + s);

	}
}
