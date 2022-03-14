package es.iestriana.dao;

import es.iestriana.bean.Alimento;
import es.iestriana.bean.Conexion;

public interface AlimentoDAO {

	int insertarAlimento(Alimento alimentos, Conexion con);

}
