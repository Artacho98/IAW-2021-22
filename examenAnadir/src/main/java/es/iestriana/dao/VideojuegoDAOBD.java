package es.iestriana.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

	public List<Videojuego> listarVideojuegos (Conexion c) {
		
		List<Videojuego> videojuegos = new ArrayList<Videojuego>();	
		String query = "SELECT * FROM videogames";
		
		try {
			PreparedStatement ps = c.getConector().prepareStatement(query);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Videojuego auxiliar = new Videojuego(rs.getInt("idVideogame"), 
						rs.getString("name"), 
						rs.getInt("anyo"), 
						rs.getString("company"), 
						rs.getString("type"), 
						rs.getBytes("photo"));
				
				videojuegos.add(auxiliar);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return videojuegos;
	}

	public byte[] obtenerPortada(int idVideogame, Conexion c) {
		byte[]photo = null;
		
		String query = "SELECT photo FROM videogames WHERE idVideogame = ?";
	
		try {
			PreparedStatement ps = c.getConector().prepareStatement(query);
			ps.setInt(1, idVideogame);
		
			ResultSet rs = ps.executeQuery();
		
			while (rs.next()) {
			photo = rs.getBytes("photo");
			}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	
		return photo;
	}



}
