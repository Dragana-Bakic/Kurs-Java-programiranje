package dragana.bakic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Zadatak3_delete {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/biblioteka";
		String username = "root";
		String password = "";

		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			System.out.println("Uspesna konekcija ka bazi");

			String delete = "DELETE FROM biblioteke WHERE bibliotekaID = ?";
			PreparedStatement ps = conn.prepareStatement(delete);

			ps.setString(1, "2");

			int obrisano = ps.executeUpdate();
			if (obrisano > 0) {
				System.out.println("Uspesno ste obrisali podatak!");

			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
