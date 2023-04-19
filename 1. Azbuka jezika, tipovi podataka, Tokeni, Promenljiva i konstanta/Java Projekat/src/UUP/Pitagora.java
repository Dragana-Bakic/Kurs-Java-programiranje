package UUP;

public class Pitagora {

	public static void main(String[] args) {

		/*
		 * Korišćenje Pitagorine teoreme za izračunavanje dužine hipotenuze na osnovu
		 * dužina kateta trougla
		 */

		double x, y, z;

		x = 3;
		y = 4;
		z = Math.sqrt(x * x + y * y);

		System.out.println("Dužina hipotenuze je " + z);

	}

}
