package es.iestriana.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Alimento;

public class AlimentoDAOBD implements AlimentoDAO{

public List<Alimento> listarAlimentos (Conexion c) {
		
		List<Alimento> alimentos = new ArrayList<Alimento>();	
		String query = "SELECT * FROM alimentos";
		
		try {
			PreparedStatement ps = c.getConector().prepareStatement(query);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Alimento auxiliar = new Alimento(rs.getInt("idAlimento"), 
						rs.getString("nombre"), 
						rs.getString("categoría"), 
						rs.getInt("diaCaducidad"),
						rs.getInt("mesCaducidad"),
						rs.getInt("anyoCaducidad"),
						rs.getFloat("precio"), 
						rs.getString("proveedor"));
				
				alimentos.add(auxiliar);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return alimentos;
	}
}
