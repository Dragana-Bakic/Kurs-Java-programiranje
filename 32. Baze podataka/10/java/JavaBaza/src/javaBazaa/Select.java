package javaBazaa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	// adresa gde se nalazi baza sa kojom zelimo da se povezemo
	// korisnicko ime servera kome pristupamo
	// lozinka servera kome pristupamo

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/baza42_cas";
		String username = "root";
		String password = "";

		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			System.out.println("Uspesna konekcija ka bazi");

			String sqlselect = "SELECT * FROM korisnici"; // objekat koji sadrži upit
			Statement stmt = conn.createStatement(); // objekat za komunikaciju sa bazom
			ResultSet result = stmt.executeQuery(sqlselect); // izvršavanje(namena)

			while (result.next()) {
				String ki = result.getString(2); // čitanje podataka i smeštanje rezultata unutar promenljivih
				String lo = result.getString(3);
				String ime = result.getString(4);
				String email = result.getString(5);

				StringBuilder builder = new StringBuilder();
				builder.append("\nKorisnicko ime: ");
				builder.append(ki);
				builder.append("\nLozinka: ");
				builder.append(lo);
				builder.append("\nIme: ");
				builder.append(ime);
				builder.append("\nEmail: ");
				builder.append(email);

				System.out.println(builder.toString()); // štampanje rezultata

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
