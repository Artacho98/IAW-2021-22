package es.iestriana.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Videojuego;

public class VideojuegoDAOBD implements VideojuegoDAO{

	@Override
	public void anadirVideojuego(Conexion c, Videojuego vj) {
String sql = "INSERT INTO videogames VALUES (null, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = c.getConector().prepareStatement(sql);
			ps.setString(1, vj.getName());
			ps.setInt(2, vj.getAnyo());
			ps.setString(3, vj.getCompany());
			ps.setString(4, vj.getType());
			ps.setBytes(5, vj.getPhoto());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
