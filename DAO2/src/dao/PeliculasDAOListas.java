package dao;

import java.util.ArrayList;
import java.util.List;

import bean.Pelicula;

public class PeliculasDAOListas implements PeliculasDAO {

	List<Pelicula> lista_de_peliculas = new ArrayList<Pelicula>();

	@Override
	public void buscarTitulo(String titulo) {
		for (int i = 0; i < lista_de_peliculas.size(); i++) {
			if (lista_de_peliculas.get(i).getTitulo().equals(titulo)) {
				System.out.println(lista_de_peliculas.get(i));
			}
		}
		
	}

	@Override
	public void buscarGenero(String genero) {
		for (Pelicula pelicula : lista_de_peliculas) {
			if (pelicula.getGenero().equals(genero)) {
				System.out.println(pelicula);
			}
		}
		
	}

	@Override
	public void duracionTotal() {
		int duracionTotal = 0;
		for (Pelicula pelicula : lista_de_peliculas) {
			duracionTotal += pelicula.getDuracion();
		}
		System.out.println("La duracion total de la lista de peliculas es: "+duracionTotal);
	}

	
	
	@Override
	public void cuantasAdultos() {
		int paraadultos = 0;
		for (Pelicula pelicula : lista_de_peliculas) {
			if (pelicula.isAdultos()) {
				paraadultos++;
			}
		}
		System.out.println("La lista tiene "+paraadultos+" peliculas para adultos.");
	}

	@Override
	public void buscarDuracion(int minimo, int maximo) {
		for (Pelicula pelicula : lista_de_peliculas) {
			if (pelicula.getDuracion()>=minimo && pelicula.getDuracion()<=maximo) {
				System.out.println(pelicula);
			}
		}
		
	}

	@Override
	public void nuevaPelicula(Pelicula p) {
		lista_de_peliculas.add(p);
		
	}

	@Override
	public void borrarPelicula(Pelicula p) {
		lista_de_peliculas.remove(p);
		
	}

	@Override
	public void muestraLista() {
		for (Pelicula pelicula : lista_de_peliculas) {
			System.out.println(pelicula);
		}
		
	}
		
	

}
