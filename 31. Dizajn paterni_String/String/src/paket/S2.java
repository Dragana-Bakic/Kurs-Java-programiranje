package paket;

public class S2 {

	public static void main(String[] args) {

		char ch2;
		String s6 = "Januar";

		ch2 = s6.charAt(0);
		System.out.println("Karakter na poziciji 0: " + ch2);

		// Metoda charAt vraca karakter tipa char sa zadate pozicije u stringu.
		// Indeksiranje ide od 0.
		ch2 = "Java".charAt(3);
		System.out.println("Karakter na poziciji 3: " + ch2 + "\n");

		char ch3[] = { 'J', 'a', 'v', 'a' };
		String s7 = new String(ch3);

		// Duzina stringa dobija se pomocu metode length
		System.out.println("String = " + s7);
		System.out.println("Length = " + s7.length());
		System.out.println("Length = " + "Java programiranje".length());

		/*
		 * Metoda equals vrsi leksikografsko poredjenje stringova, pri cemu se pravi
		 * razlika izmedju velikih i malih slova. Vraca true ako su stringovi isti, u
		 * suprotnom vraca false.
		 * 
		 * Metoda iqualsIgnoreCase leksikograski poredi stringove, ali ne pravi razliku
		 * izmedju malih i velikih slova.
		 * 
		 * Metoda copareTo poziva se kao: s1.compareTo(s2) vraca 0 ako su s1 i s2
		 * jednaki, negativan broj ako je s1 manji, pozitivan broj ako je s1 veci od s2.
		 * 
		 */

		String s8 = "JAVA";
		String s9 = "JAVA";
		String s10 = "Java";

		System.out.println(s8 + " equals " + s9 + " = " + s8.equals(s9));
		System.out.println(s8 + " equals " + s9 + " = " + s8.equals(s10));
		System.out.println(s8 + " equalsIgnoreCase " + s9 + " = " + s8.equalsIgnoreCase(s10));

		System.out.println("\n");

		// == Razlikuje da li je inicijalizovan kljucnom recju new od onih koji to nisu.
		// == poredi valjda memorijske reference objekata ili šta već pa onda bude false

		String s11 = "JAVA";
		String s12 = "JAVA";
		String s13 = "Java";
		String s14 = new String("JAVA");
		String s15 = new String("JAVA");

		System.out.println(s11 + " equals " + s12 + " = " + s11.equals(s12));
		System.out.println(s11 + " == " + s12 + " = " + (s11 == s12));
		System.out.println("\n" + s11 + " equals " + s13 + " = " + s11.equals(s13));
		System.out.println(s11 + " == " + s13 + " = " + (s11 == s13));
		System.out.println("\n" + s11 + " equals " + s14 + " = " + s11.equals(s14));
		System.out.println(s11 + " == " + s14 + " = " + (s11 == s14));
		System.out.println("\n" + s14 + " equals " + s15 + " = " + s14.equals(s15));
		System.out.println(s14 + " == " + s15 + " = " + (s14 == s15));

		System.out.println("\n");

		// koristiti ugradjene metode za poredjenje stringova nikako ==

		String s16 = "JAVA";
		String s17 = "JAVA";
		String s18 = "Java";

		System.out.println(s16 + " compared to " + s17 + " = " + s16.compareTo(s17));
		System.out.println(s16 + " compared to " + s18 + " = " + s16.compareTo(s18));

		/*
		 * Dejan Bajovic: Ne umem bas da objasnim detaljno ali razlika je ako se
		 * incijalizuje String s = "Java"; se kreira u "posebnoj" memoriji radi brzog
		 * uporedjivanja da li imamo vec string identicnog sadrzaja, ako imamo onda ce
		 * promenljiva 's' samo upucivati na taj string. Dakle ne pravi se nov objekat!
		 * od String s = new String("Java"); kreira novi objekat Kada se koristi '==' u
		 * prvom slucaju ce reci "true" jer je ista memorijska lokacija. Dok u drugom ce
		 * uporedjivati adresu u memoriji, sto je false jer se razlikuje.
		 */
	}

}
