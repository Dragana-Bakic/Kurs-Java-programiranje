package paket;

public class MainNegativnost {

	public static void main(String[] args) {

		NegativnostBroja nb = (x) -> (x) < 0;

		if (nb.provera(-6)) {
			System.out.println("Broj je negativan");
		} else
			System.out.println("Broj je pozitivan");

		/*Funkcionalni interfejsi se obično koriste u Javi 
		 * za predstavljanje funkcija koje mogu biti prosleđene 
		 * kao argumenti metodama ili vraćene kao rezultat metode. 
		 * Oni su ključni deo podrške za funkcionalno programiranje Java jezika.
		 */

	}

}
