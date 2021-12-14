package dao;

import bean.Ordenadores;

public interface OrdenadoresDAO {
	
	public void nuevoOrdenador(Ordenadores o);
	public void borrarTodos();
	public void borrarOrdenadores();
	public void buscarOrdenadorPorAtributos(String marca, int ram, String procesador);
	public void buscarPorRyF(int ram);
	public void actualizarRam(int ram);
	public void listarTodos();
	public void mostrarTodos();
}
