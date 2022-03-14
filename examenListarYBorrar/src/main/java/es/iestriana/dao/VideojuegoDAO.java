package es.iestriana.dao;

import java.util.List;

import javax.servlet.http.Part;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Videojuego;

public interface VideojuegoDAO {

	public List<Videojuego> listarVideojuegos (Conexion c);

	byte[] obtenerPortada(int idVideogame, Conexion c);
	
	public int borrarVideojuego(Conexion c, int idVideogame);
	
	public Videojuego obtenerVideojuegos(Conexion con, String name);
	
	public void actualizarVideojuego(Conexion con, Videojuego vj);
	
}
