package paket;

// Nit se moze napraviti i kada klasu Thread prosirite novom nasledjenom klasom, a zatim
// napravite instancu te klase.

// Nova potklasa mora da redefinise metodu run()

public class B extends Thread {

	B(String s) {
		super(s); // vezano je za nasledjivanje,
					// poziva konstruktor Thread sledeceg oblika: public Thread(String imeNiti)
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName());
		}
	}

}
