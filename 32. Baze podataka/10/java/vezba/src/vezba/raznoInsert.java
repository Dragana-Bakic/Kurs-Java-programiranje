package vezba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class raznoInsert {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/vezba";
		String ime = "root";
		String sifra = "";

		try (Connection c = DriverManager.getConnection(url, ime, sifra)) {

			String insert = "Insert into razno(ime, datum, godine) values (?, ?, ?)";
			PreparedStatement ps = c.prepareStatement(insert);

			ps.setString(1, "ines");
			ps.setString(2, "1988-02-29");
			ps.setInt(3, 35);

			int uneto = ps.executeUpdate();

			if (uneto > 0) {
				System.out.println("Podatak je insertovan");
			}

		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
