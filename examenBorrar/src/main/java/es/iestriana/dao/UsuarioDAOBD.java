package es.iestriana.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import es.iestriana.bean.Conexion;

public class UsuarioDAOBD implements UsuarioDAO{

	// private String clave = "examen2223";
	
	public int borrarUsuario(Conexion c, String email, String pwd) {
		int cuantos = 0;
		
		String sql = "DELETE FROM usuarios WHERE email = ? AND pwd  = ?";
		
		try {
			PreparedStatement ps = c.getConector().prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, pwd);
			
			cuantos = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cuantos;
	}
}
