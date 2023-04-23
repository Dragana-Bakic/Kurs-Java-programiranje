package UUP;

public class factorial {

	public static void main(String[] args) {

		int i, factorial = 1;
		int broj = 6;

		// It is the number to calculate factorial
		for (i = 1; i <= broj; i++) {
			factorial = factorial * i;
		}

		System.out.println("Faktorijal " + broj + " je: " + factorial);

	}

}
