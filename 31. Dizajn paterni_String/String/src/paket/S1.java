package paket;

public class S1 {

	public static void main(String[] args) {

		// Nacini predstavljanja niza

		// 1. Stringovi se predstavljaju klasom String
		String str = "123456fmpoaenfienfe%^&*(";
		System.out.println(str);

		// 2. Kreiranje stringa pomocu kljucne reci new
		String str1 = new String("Utorak, 24. januar. ");
		System.out.println(str1);

		// 3. Inicijalizacija Stringa postojecim Stringom
		String s1 = "Podatak1";
		System.out.println(s1);
		String s2 = new String(s1);
		System.out.println(s2);

		// 4. Inicijalizacija nizom char vrednosti
		char s3[] = { 'J', 'a', 'v', 'a' };
		System.out.println(s3);

		// 5. Inicijalizacija podnizom
		String s4 = new String(s3, 1, 3);
		String s5 = new String();
		System.out.println(s4);
		System.out.println(s5);

		
		
		String v1 = "Vrednost: " + 5 + 5; // ne sabira (Vrednost: 55)
		String v2 = "Vrednost: " + (5 + 5); // sabira (Vrednost: 10)
		System.out.println(v1);
		System.out.println(v2);


	}

}
