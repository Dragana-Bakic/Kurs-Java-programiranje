package paket;

public class finallyBlockWithException {
// Through an exception out odf the method

	// throws je u zaglavlju metode
	// throw koriste se za bacanje izuzetka u telu metode

	static void procA() {
		try {
			System.out.println("procA");
			throw new RuntimeException("demo"); // "mi" bacmo izuzetak

		} finally { // finally blok se izvrsava bez obzira da li je ili nije doslo do izuzetka
			System.out.println("procA finally");
		}
	}

	static void procB() {
		try {
			System.out.println(" procB");
			return; // break, continue, System.exit(0)
		} finally {
			System.out.println("procB's finally");
		}
	}

	// Execute a try block normally.
	static void procC() {
		try {
			System.out.println("inside procC");
		} finally {
			System.out.println("procC's finally");
		}
	}

}
