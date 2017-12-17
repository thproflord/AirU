package postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import com.sun.javafx.collections.MappingChange.Map;
import com.sun.prism.impl.Disposer.Record;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
import com.sun.xml.internal.fastinfoset.util.StringArray;


public class Conection {

	public static void main(String[] args) {
		System.out.println("hola");
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AirUcab16", "postgres", "20914366");
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
		Collection lugar2 = new ArrayList<>();
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/AirUcab15", "postgres", "20914366");
			PreparedStatement ps = connection.prepareStatement("select lug_nombre, lug_codigo from lugar where lug_codigo = 10");
			ResultSet lugar = ps.executeQuery();
			
			while(lugar.next()) {
				System.out.println("El codigo es :"+lugar.getString("lug_codigo")+" y el lugar es: "+lugar.getString("lug_nombre") );

			}
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		}
		
//		return lugar2;
	}

	public ArrayList clientes() {
		ArrayList cliente = new ArrayList<>();
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/AirUcab15", "postgres", "20914366");
			PreparedStatement ps = connection.prepareStatement("select cli_fecha_nac, cli_nombre, cli_apellido, cli_nacionalidad"
					+ " from cliente");
			ResultSet cli = ps.executeQuery();
			
			while(cli.next()) {
				
				cliente.add(cli.getString("cli_nacionalidad"));
				cliente.add(cli.getString("cli_fecha_nac"));
				cliente.add(cli.getString("cli_nombre"));
				cliente.add(cli.getString("cli_apellido"));


			}
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		}
		
		return cliente;
	}
}
