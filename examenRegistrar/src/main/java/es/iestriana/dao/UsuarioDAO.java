package es.iestriana.dao;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Usuario;

public interface UsuarioDAO {

	public boolean buscarUsuario(Conexion c, String email);
	public int insertarUsuario(Usuario usuario, Conexion con);
	
}
