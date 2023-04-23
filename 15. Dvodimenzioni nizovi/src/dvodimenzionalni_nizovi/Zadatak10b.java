package dvodimenzionalni_nizovi;

public class Zadatak10b {

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
				if (i + j <= 5 - 1)
					System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}
