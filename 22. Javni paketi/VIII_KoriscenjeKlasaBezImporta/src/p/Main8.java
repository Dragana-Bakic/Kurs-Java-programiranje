package p;

public class Main8 {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
 	//koren.biblioteka.klasabiblioteke (java.util.Scanner)	
		
		double r, a;
		
		System.out.print("Unesite poluprecnik: ");
		r = sc.nextDouble();
		
		a = 3.14 * r * r;
		System.out.print("Povrsina kruga: " + a);
		
		sc.close();

	}

}
