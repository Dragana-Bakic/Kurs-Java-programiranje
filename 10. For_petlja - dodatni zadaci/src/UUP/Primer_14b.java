package UUP;

public class Primer_14b {

	public static void main(String[] args) {

		// m -trocifreni broj

		System.out.println("Celi trocifreni brojevi deljivi sa 2 i 3 su: ");

		for (int m = 100; m <= 999; m++)
			if (m % 2 == 0 && m % 3 == 0)
				System.out.println(m);
	}

}
