package main;

import bean.Pelicula;
import dao.PeliculasDAO;
import dao.PeliculasDAOListas;

public class Principal {

	public static void main(String[] args) {
		PeliculasDAO lista = new PeliculasDAOListas();
		
		Pelicula p1 = new Pelicula("It", "Terror", 120, true);
		Pelicula p2 = new Pelicula("ESDLA", "Aventura", 240, false);
		Pelicula p3 = new Pelicula("Star Wars", "Ciencia Ficcion", 200, false);
		Pelicula p4 = new Pelicula("The ring", "Gore", 120, true);

		lista.nuevaPelicula(p1);
		lista.nuevaPelicula(p2);
		lista.nuevaPelicula(p3);
		lista.nuevaPelicula(p4);
		
		lista.cuantasAdultos();
	}

}
