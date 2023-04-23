package paket;

public class Main9 {

	public static void main(String[] args) {

		finallyBlockWithException fbwe = new finallyBlockWithException();
		try {
			fbwe.procA();
		} catch (Exception e) {
			System.out.println("Exception caught"); // uhvatila demo klasa, simulacija izuzetka, izuzetak bacen kroz throw
		}
		fbwe.procB();
		fbwe.procC();

	}

}
/*Blok finally se koristi zajedno sa blokom try 
 * kako bi se osiguralo da se određeni deo koda izvršava 
 * bez obzira na to da li je izbačen izuzetak ili ne.
 * 
 * Ovo je korisno za situacije u kojima želimo da budemo sigurni 
 * da su određeni resursi pravilno očišćeni ili zatvoreni, 
 * čak i ako dođe do greške tokom izvršavanja programa.
 */

