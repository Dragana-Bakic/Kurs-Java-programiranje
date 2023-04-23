package javaBazaa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/baza42_cas";
		String username = "root";
		String pass = "";

		System.out.println("Konekcija...");
		try (Connection conn = DriverManager.getConnection(url, username, pass)) {
			System.out.println("Uspesna konekcija ka bazi!");

			String sqldelete = "DELETE FROM korisnici WHERE korisnickoIme = ?";
			PreparedStatement ps = conn.prepareStatement(sqldelete);
			ps.setString(1, "korisnik1");

			int obrisanpodatak = ps.executeUpdate();
			if (obrisanpodatak > 0) {
				System.out.println("Podatak je uspesno obrisan!");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
