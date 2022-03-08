package es.iestriana.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Usuario;

public class UsuarioDAOBD implements UsuarioDAO{

	public String clave = "examen2223";
	@Override
	public boolean buscarUsuario(Conexion c, String email) {
		
		boolean existe = false;
		String query = "SELECT * FROM usuarios WHERE email = ?";
		
		try {
			PreparedStatement ps = c.getConector().prepareStatement(query);
			ps.setString(1, "email");
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				existe = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return existe;
	}
	
	public int insertarUsuario(Usuario usuario, Conexion con) {
		int filas = 0;
		
		String sql = "INSERT INTO usuarios VALUES (null,?,AES_ENCRYPT(?, ?),? , ?, ?)";
		try {
			PreparedStatement ps = con.getConector().prepareStatement(sql);
			ps.setString(1, usuario.getEmail());
			ps.setString(2,usuario.getPwd());
			ps.setString(3, clave);
			ps.setString(4, usuario.getNombre());
			ps.setString(5, usuario.getApellidos());
			ps.setInt(6, usuario.getEdad());
			
			filas = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return filas;

	
	}
}
