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
	
	public Videojuego obtenerVideojuegos(Conexion con, String name) {
		Videojuego aux = null;
		
		String query = "SELECT * FROM videogames WHERE name= ?";
		
		try {
			PreparedStatement ps = con.getConector().prepareStatement(query);
			ps.setString(1, name);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				aux = new Videojuego(rs.getInt("idVideogame"), rs.getString("name"), 
						rs.getInt("anyo"), rs.getString("company"), rs.getString("type"),
						rs.getBytes("photo"));				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aux;
	}
	
	public void actualizarVideojuego(Conexion con, Videojuego vj) {	
		try {
			PreparedStatement ps = null;
			if (vj.getPhoto() != null) {
				String sql = "UPDATE videogames SET name=?,anyo=?,company=?,type=?, photo=? WHERE idVideogame=?";
				
				ps = con.getConector().prepareStatement(sql);
				ps.setString(1, vj.getName());
				ps.setInt(2, vj.getAnyo());
				ps.setString(3, vj.getCompany());
				ps.setString(4, vj.getType());
				ps.setBytes(5, vj.getPhoto());
			} else {
				String sql = "UPDATE videogames SET name=?,anyo=?,company=?,type=? WHERE idVideogame=?";
				
				ps = con.getConector().prepareStatement(sql);
				ps.setString(1, vj.getName());
				ps.setInt(2, vj.getAnyo());
				ps.setString(3, vj.getCompany());
				ps.setString(4, vj.getType());
			}					
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
