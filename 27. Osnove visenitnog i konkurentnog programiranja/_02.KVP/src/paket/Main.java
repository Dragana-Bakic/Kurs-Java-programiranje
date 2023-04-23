package paket;

// Pokretanje nove niti
// Novu nit pokrecete tako sto napravite instancu objekta tipa Thread
// To se moze uraditi na dva nacina:
// 1. Implementacija interfejsa Runnable  *
// 2. Prosirivanjem (nasledjivanjem) klase Thread 

// U main klasi:
// Nakon kreiranja klase koja implementira interfejs Runnable, potrebno je
// napraviti instancu objekta tipa Thread ***

public class Main {

	public static void main(String[] args) {
		
		A a = new A(); // **
		
		// ***
		// Oblik konstruktora:
		// Thread(Runnable objekatNit, String imeNiti)
		
		// objekatNit je instanca klase koja implementira interfejs Runnable.
		// Ona definise mesto gde se zapocinje nit
		
		// imeNiti - predstavlja ime nove niti (koje vi zadajete)
		
		
		Thread t1 = new Thread(a, "Nit1"); // ***
		Thread t2 = new Thread(a, "Nit2");
		Thread t3 = new Thread(a, "Nit3");
		
		t1.start(); // metoda start() poziva metodu run()
		t2.start();
		t3.start();
		
		
		//System.out.println(Runtime.getRuntime().availableProcessors());

	}

}
