package es.iestriana.dao;

import es.iestriana.bean.Conexion;

public interface UsuarioDAO {
	public int borrarUsuario(Conexion c, String email, String pwd);
}
