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
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AirUcab1", "HomeFolder", "fernando1$");
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
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AirUcab1", "HomeFolder", "fernando1$");
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
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AirUcab1", "HomeFolder", "fernando1$");
			PreparedStatement ps = connection.prepareStatement("select cli_fecha_nac, cli_nombre, cli_apellido, cli_nacionalidad"
					+ " from cliente");
			ResultSet cli = ps.executeQuery();
			int i = 0;
			while(cli.next()) {
				
				cliente.add(i++);
				cliente.add(cli.getString("cli_fecha_nac"));
				cliente.add(cli.getString("cli_nombre"));
				cliente.add(cli.getString("cli_apellido"));


			}
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		}
		
		return cliente;
	}
	
	public ArrayList proveedores() {
		ArrayList proveedor = new ArrayList<>();
		try {
			
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AirUcab1", "HomeFolder", "fernando1$");
			PreparedStatement ps = connection.prepareStatement("select pro_documento_id, pro_nombre, pro_apellido, pro_nacionalidad"
					+ " from proveedor");
			ResultSet pro = ps.executeQuery();
			
			while(pro.next()) {
				
				proveedor.add(pro.getString("pro_documento_id"));
				proveedor.add(pro.getString("pro_nombre"));
				proveedor.add(pro.getString("pro_apellido"));
				proveedor.add(pro.getString("pro_nacionalidad"));


			}	
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return proveedor;
	}
	
	public ArrayList inventario() {
		ArrayList inventario = new ArrayList<>();
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AirUcab1", "HomeFolder", "fernando1$");
			PreparedStatement ps = connection.prepareStatement("select inmapi_id, inmapi_cantidad_productos"
					+ " from inventario");
			ResultSet inv = ps.executeQuery();
			while(inv.next()) {
				
				inventario.add(inv.getString("inmapi_id"));
				inventario.add(inv.getString("inmapi_cantidad_productos"));
			}	
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		return inventario;	
	}
	
	public ArrayList prueba() {
		ArrayList prueba = new ArrayList<>();
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AirUcab1", "HomeFolder", "fernando1$");
			PreparedStatement ps = connection.prepareStatement("select pru_codigo, pru_tipo, pru_descripcion"
					+ " from prueba");
			ResultSet prub = ps.executeQuery();
			
			while(prub.next()) {
				
				prueba.add(prub.getString("pru_codigo"));
				prueba.add(prub.getString("pru_tipo"));
				prueba.add(prub.getString("pru_descripcion"));
			}	
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		return prueba;	
	}

}
