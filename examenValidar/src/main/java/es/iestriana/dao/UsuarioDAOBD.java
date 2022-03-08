package es.iestriana.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Usuario;

public class UsuarioDAOBD implements UsuarioDAO{
	private String clave = "examen2223";
	@Override
	public Usuario comprobarUsuario(String email, String pwd, Conexion con) {
		Usuario usuAux = null;
		
		String query = "SELECT * FROM usuarios "
				+ "WHERE email = ? AND pwd = AES_ENCRYPT(?, ?)";
		
		try {
			PreparedStatement ps = con.getConector().prepareStatement(query);
			
			ps.setString(1, email);
			ps.setString(2, pwd);
			ps.setString(3, clave);
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				usuAux = new Usuario(rs.getInt("idUsuario"),
									rs.getString("email"), 
									rs.getString("pwd"), 
									rs.getString("nombre"), 
									rs.getString("apellidos"), 
									rs.getInt("edad"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return usuAux;
	}
	
}
