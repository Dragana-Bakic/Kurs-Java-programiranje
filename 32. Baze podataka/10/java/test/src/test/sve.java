package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sve {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/vezba";
		String ime = "root";
		String sifra = "";

		try (Connection c = DriverManager.getConnection(url, ime, sifra)) {
			System.out.println("Uspesna konekcija");

			String insert = "INSERT INTO razno(ime, datum, godine) VALUES (?,?,?)";
			PreparedStatement i = c.prepareStatement(insert);

			i.setString(1, "jana");
			i.setString(2, "2023-07-09");
			i.setInt(3, 0);

			int uneto = i.executeUpdate();

			String update = "UPDATE razno SET ime = ?, datum = ?, godine = ? WHERE razno = ?";
			PreparedStatement u = c.prepareStatement(update);

			u.setString(1, "promena");
			u.setString(2, "2022-08-08");
			u.setInt(3, 1);
			u.setInt(4, 4);

			int promena = u.executeUpdate();

			String delete = "DELETE FROM razno WHERE ime = ?";
			PreparedStatement d = c.prepareStatement(delete);

			d.setString(1, "jana");

			int obrisano = d.executeUpdate();

			if (uneto > 0 && promena > 0 && obrisano > 0) {
				System.out.println("Uneto, promenjeno i obrisano je!");
			}

			String select = "SELECT * FROM razno";
			Statement s = c.createStatement();
			ResultSet tabela = s.executeQuery(select);

			while (tabela.next()) {

				String im = tabela.getString(2);
				String datum = tabela.getString(3);
				int god = tabela.getInt(4);

				StringBuilder b = new StringBuilder();
				b.append("\nIme:");
				b.append(im);
				b.append("\nDatum:");
				b.append(datum);
				b.append("\nGodine:");
				b.append(god);

				System.out.println(b.toString());

			}

		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
