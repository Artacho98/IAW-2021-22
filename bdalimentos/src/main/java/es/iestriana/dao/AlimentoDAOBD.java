package es.iestriana.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import es.iestriana.bean.Alimento;
import es.iestriana.bean.Conexion;

public class AlimentoDAOBD implements AlimentoDAO {

	@Override
	public int insertarAlimento(Alimento alimentos, Conexion con) {
int filas = 0;
		
		String sql = "INSERT INTO alimentos VALUES (null, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = con.getConector().prepareStatement(sql);
			ps.setString(1, alimentos.getNombre());
			ps.setString(2, alimentos.getCategoría());
			ps.setInt(3, alimentos.getDiaCaducidad());
			ps.setInt(4, alimentos.getMesCaducidad());
			ps.setInt(5, alimentos.getAnyoCaducidad());
			ps.setFloat(6, alimentos.getPrecio());
			ps.setString(7, alimentos.getProveedor());
			
			filas = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return filas;
	}

}
