package for_petlja;

public class Zadatak12 {
	
	// Prebrojavanje

	public static void main(String[] args) {
		
		int x = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0) {
				x = 1 + x;
				//x++
			}
		}
		System.out.print("U intervalu od 1 do 20 ima " + x + " brojeva koji su deljivi sa 3");

	}

}
