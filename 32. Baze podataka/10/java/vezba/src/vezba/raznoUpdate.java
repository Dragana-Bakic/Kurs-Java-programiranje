package vezba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class raznoUpdate {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/vezba";
		String ime = "root";
		String sifra = "";

		try (Connection c = DriverManager.getConnection(url, ime, sifra)) {

			String menjanje = "Update razno SET datum = ?, godine = ? WHERE razno = ?";
			PreparedStatement p = c.prepareStatement(menjanje);
			p.setString(1, "1985-07-07");
			p.setInt(2, 37);
			p.setInt(3, 2);

			int menjanjamo = p.executeUpdate();

			if (menjanjamo > 0) {
				System.out.println("Podatak je promenjen");

			}

		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
