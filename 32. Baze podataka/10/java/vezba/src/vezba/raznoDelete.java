package vezba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class raznoDelete {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/vezba";
		String ime = "root";
		String sifra = "";

		try (Connection c = DriverManager.getConnection(url, ime, sifra)) {

			String delete = "Delete from razno where razno = ?";
			PreparedStatement ps = c.prepareStatement(delete);
			ps.setInt(1, 2);

			int brisanje = ps.executeUpdate();

			if (brisanje > 0) {
				System.out.println("Podatak je obrisan");
			}

		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
