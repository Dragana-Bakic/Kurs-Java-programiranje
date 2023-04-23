package dragana.bakic;

public class Primer5 {

	static int faktorijel(int n) {
		if (n == 0)
			return 1;
		else
			return faktorijel(n - 1) * n; // rekurzija
	}

	public static void main(String[] args) {
		System.out.println("Faktorijel broja 5 je " + faktorijel(5));
	}
}
