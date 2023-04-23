package paket;

public class Main5 {

	public static void main(String[] args) {
		try {
			int a = 0;
			System.out.println("a = " + a);
			int b = 10 / a;
			int c[] = { 1 }; 
			c[10] = 100;

		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Uhvacen exception.");
// izvedene su iz iste klase pa mogu oba slucaja da se obrade
			//e ono sto vidi kompajler kada dodje do pucanja programa do cega je
		}
		System.out.println("Nakon try/catch bloka");

	}

}
