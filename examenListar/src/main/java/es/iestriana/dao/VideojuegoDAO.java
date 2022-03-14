package es.iestriana.dao;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Videojuego;

public interface VideojuegoDAO {

	public void anadirVideojuego(Conexion c, Videojuego vj);
}
