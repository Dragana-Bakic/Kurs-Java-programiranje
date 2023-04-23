package paket;
import java.util.Scanner;
public class Main4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int a = 0;
			System.out.println("a = " + a);
			//int b = 10 / a;			
			

			System.out.println("Unesite broj elemenata niza");
			int i = sc.nextInt();
			int c[] = new int[i];


			//int c[] = {1}; // jedan od nacina inicijalizacije niza
			c[10] = 100;
					
			} catch (ArithmeticException e) {
				System.out.println("Deljenje nulom" + e);

			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Nepostojeci indeks unutar niza" + e.getMessage());

			}
		System.out.println("Poruka nakon try/catch bloka");

		


	}

}
