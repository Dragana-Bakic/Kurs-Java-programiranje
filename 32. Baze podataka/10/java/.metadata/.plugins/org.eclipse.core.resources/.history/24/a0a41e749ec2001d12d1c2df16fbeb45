package dragana.bakic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Zadatak3 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/biblioteka";
		String username = "root";
		String password = "";

		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			System.out.println("Uspesna konekcija ka bazi");

			String select = "SELECT * FROM biblioteke";
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(select);

			while (result.next()) {
				String ime = result.getString(2);
				String ulica = result.getString(3);
				String broj = result.getString(4);

				StringBuilder builder = new StringBuilder();
				builder.append("\nIme biblioteke: ");
				builder.append(ime);
				builder.append("\nUlica: ");
				builder.append(ulica);
				builder.append("\nBroj: ");
				builder.append(broj);

				System.out.println(builder.toString());

			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
