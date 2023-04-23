package dvodimenzionalni_nizovi;

public class Zadatak10 {

	public static void main(String[] args) {
		int[][] a = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 } };

		// ispisivanje elemenata
		System.out.println("Pocetni izgled: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Novi izgled: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j >= i)
					System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}
