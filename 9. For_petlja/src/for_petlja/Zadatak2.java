package for_petlja;

public class Zadatak2 {
	
	// Kvadrat i kub, 1-5

	public static void main(String[] args) {

		System.out.printf("%8s%8s%8s \n", "Broj", "Kvadrat", "Kub");

		for (int broj = 1; broj <= 5; broj++) {
			System.out.printf("%8s%8s%8s \n", broj, broj * broj, broj * broj * broj);
		}

	}

}
