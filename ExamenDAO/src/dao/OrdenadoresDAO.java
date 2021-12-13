package dao;

import bean.Ordenadores;


public interface OrdenadoresDAO {
	
	public void nuevoOredenador(Ordenadores o);
	public void borrarTodo();
	public void borrarOrdenadores();
	public void buscar(String marca, int ram, String procesador);
	public void buscarOrdenadorporRyF(int ram);
	public void actualizarRam(int ram);
	public void listarOrdenadores();
}