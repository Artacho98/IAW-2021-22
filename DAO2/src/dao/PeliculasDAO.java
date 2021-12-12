package dao;

import java.util.Iterator;

import bean.Pelicula;

public interface PeliculasDAO {
	
	public void buscarTitulo(String titulo);
	public void buscarGenero(String genero);
	public void duracionTotal();
	public void cuantasAdultos();
	public void buscarDuracion(int minimo, int maximo);
	public void nuevaPelicula(Pelicula p);
	public void borrarPelicula(Pelicula p);
	public void muestraLista();
}
