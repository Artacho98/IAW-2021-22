package es.iestriana.dao;

import java.util.List;

import es.iestriana.bean.Alimento;
import es.iestriana.bean.Conexion;

public interface AlimentoDAO {

	public List<Alimento> listarAlimentos (Conexion c);
}
