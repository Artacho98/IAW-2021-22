package es.iestriana.dao;

import java.util.List;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Usuario;

public interface UsuarioDAO {

	public List<Usuario> listarUsuarios(Conexion c);
}
