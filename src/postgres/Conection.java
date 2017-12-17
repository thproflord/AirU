package postgres;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Conection {

	Connection connection = null;
	PreparedStatement ps = null;
	ResultSet rS = null;
	
	public static void main(String[] args) {
		System.out.println("hola");
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AirUcab", "HomeFolder", "fernando1$");
			PreparedStatement ps = connection.prepareStatement("select * from lugar where lug_codigo = 10");
			ResultSet rS = ps.executeQuery();
			
			while(rS.next()) {
				System.out.println(rS.getInt(1) + " " + rS.getString(3));
			}
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		}
		
	}
	
	public void lugar() {
		System.out.println("prueba");
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AirUcab", "HomeFolder", "fernando1$");
			PreparedStatement ps = connection.prepareStatement("select * from lugar ");
			ResultSet rS = ps.executeQuery();
			
			while(rS.next()) {
				System.out.println(rS.getInt(1) + " " + rS.getString(3));
			}
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		}
	}

}
