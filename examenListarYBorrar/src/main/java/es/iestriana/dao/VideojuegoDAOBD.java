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
	
	@Override
	public byte[] obtenerPortada(int idVideogame, Conexion c) {
		byte[]portada = null;
		
		String query = "SELECT photo FROM videogames WHERE idVideogame = ?";
		
		try {
			PreparedStatement ps = c.getConector().prepareStatement(query);
			ps.setInt(1, idVideogame);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				portada = rs.getBytes("photo");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return portada;
	}
	public int borrarVideojuego(Conexion c, int idVideogame) {
		int cuantos = 0;
		
		String sql = "DELETE FROM videogames WHERE idVideogame = ?";
		
		try {
			PreparedStatement ps = c.getConector().prepareStatement(sql);
			ps.setInt(1, idVideogame);
			
			cuantos = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cuantos;
	}
	
}
