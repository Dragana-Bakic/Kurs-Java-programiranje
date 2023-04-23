package paket;

public class Main3 {

	public static void main(String[] args) {
		
		B a1 = new B ("Nit1");
		B a2 = new B ("Nit2");
		B a3 = new B ("Nit3");
		
		a1.start(); // zapocinje izvrsavanje niti pozivanjem njene metode run()
		a2.start();
		a3.start();



	}

}
