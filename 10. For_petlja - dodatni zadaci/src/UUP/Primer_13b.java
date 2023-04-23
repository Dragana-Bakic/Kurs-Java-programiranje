package UUP;

public class Primer_13b {

	public static void main(String[] args) {

		// m -trocifreni broj
		// s -cifra stotice broja
		// d -cifra desetice broja
		// j -cifra jedinice broja

		int s, d, j;

		System.out.println("Armstrongovi brojevi od 100 do 999 su: ");

		for (int n = 100; n <= 999; n++) {
			s = n / 100;
			d = (n % 100) / 10;
			j = n % 10;
			if (n == Math.pow(s, 3) + Math.pow(d, 3) + Math.pow(j, 3))
				System.out.println(n);
		}
	}

}
