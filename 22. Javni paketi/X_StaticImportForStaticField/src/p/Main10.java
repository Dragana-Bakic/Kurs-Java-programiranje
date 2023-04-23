package p;

import java.util.Scanner;
import static java.lang.Math.PI; // Math - skup biblioteka, lang - language

public class Main10 {

	public static void main(String[] args) {
		
		double r, a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite poluprecnik: ");
		r = sc.nextDouble();
		
		a = PI * r * r;
		System.out.println("Povrsina: " + a);

		sc.close();

	}

}
