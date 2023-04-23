package javaBazaa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/baza42_cas";
		String username = "root";
		String pass = "";

		System.out.println("Konekcija...");
		try (Connection conn = DriverManager.getConnection(url, username, pass)) {
			System.out.println("Uspesna konekcija ka bazi!");

			String sqlupdate = "UPDATE korisnici SET lozinka = ?, ime = ?,email = ? WHERE korisnickoIme = ?";
			PreparedStatement ps = conn.prepareStatement(sqlupdate);
			ps.setString(1, "123korisnik");
			ps.setString(2, "Neko");
			ps.setString(3, "neko@gmail.com");

			ps.setString(4, "korisnik1"); // uslov

			int promenjenPodatak = ps.executeUpdate();

			if (promenjenPodatak > 0) {
				System.out.println("Uspešno je izvršena izmena!");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}