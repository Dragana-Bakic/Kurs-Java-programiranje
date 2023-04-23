package dragana.bakic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Zadatak3_insert {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/biblioteka";
		String username = "root";
		String password = "";

		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			System.out.println("Uspesna konekcija ka bazi");

			String insert = "INSERT INTO biblioteke(ImeBiblioteke, Ulica, Broj) VALUES (?, ?, ?)";
			PreparedStatement ps1 = conn.prepareStatement(insert);
			
			ps1.setString(1, "Glavna biblioteka");
			ps1.setString(2, "Neka ulica");
			ps1.setString(3, "7a");
			
			PreparedStatement ps2 = conn.prepareStatement(insert);
			ps2.setString(1, "Biblioteka 2");
			ps2.setString(2, "Neka ulica 2");
			ps2.setString(3, "89");

			int unetPodatak1 = ps1.executeUpdate();
			int unetPodatak2 = ps2.executeUpdate();


			if (unetPodatak1 > 0 && unetPodatak2 > 0) {
				System.out.println("Podaci su upisani!");

			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
