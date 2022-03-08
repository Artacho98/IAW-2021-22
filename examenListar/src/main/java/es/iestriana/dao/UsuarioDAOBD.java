package es.iestriana.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Usuario;

public class UsuarioDAOBD implements UsuarioDAO{

	public List<Usuario> listarUsuarios(Conexion c){
		List<Usuario> usuarios = new ArrayList();

		String query = "SELECT * FROM usuarios";
		
		try {
			PreparedStatement ps = c.getConector().prepareStatement(query);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Usuario auxiliar = new Usuario(rs.getInt("idUsuario"), 
						rs.getString("email"), 
						rs.getString("pwd"), 
						rs.getString("nombre"), 
						rs.getString("apellidos"), 
						rs.getInt("edad"));
				
				usuarios.add(auxiliar);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return usuarios;
	}
}
