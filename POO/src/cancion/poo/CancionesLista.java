package cancion.poo;

import java.util.ArrayList;
import java.util.List;

public class CancionesLista implements Musical {

	private List<Cancion> lista_de_canciones = new ArrayList<Cancion>();
	
	
	@Override
	public void nuevaCancion(Cancion c) {
		lista_de_canciones.add(c);
		
	}

	@Override
	public void mostrarTodas() {
		for (Cancion canciones : lista_de_canciones) {
			System.out.println(canciones);
		}
		
	}

	@Override
	public void borrarCancion(Cancion c) {
		
		lista_de_canciones.remove(c);
		
	}

	@Override
	public void cancionAnyo(int anyo) {
		for (int i = 0; i < lista_de_canciones.size(); i++) {
			if (lista_de_canciones.get(i).getAnyo() == anyo) {
				System.out.println(lista_de_canciones.get(i));
			}
		}
		
	}

	@Override
	public void cancionGenero(String genero) {
		for (int i = 0; i < lista_de_canciones.size(); i++) {
			if (lista_de_canciones.get(i).getGenero() == genero) {
				System.out.println(lista_de_canciones.get(i));
			}
		}
		
	}

	@Override
	public void cancionInterprete(String interprete) {
		for (int i = 0; i < lista_de_canciones.size(); i++) {
			if (lista_de_canciones.get(i).getInterprete() == interprete) {
				System.out.println(lista_de_canciones.get(i));
			}
		}
		
	}

	@Override
	public void modificarCalificacion(Cancion c, int calificacion) {
		if (calificacion>=0 && calificacion<6) {
			c.setCalificaion(calificacion);
			System.out.println("Nueva calificacion: "+calificacion);
		}else {
			System.out.println("Nueva calificación incorrecta.");
		}
		
		
	}

	@Override
	public void buscarDuracion(int p, int f) {
		for (Cancion cancion : lista_de_canciones) {
			if (cancion.getDuracion()>=p && cancion.getDuracion()<=f) {
				System.out.println(cancion);
			}
			
		}
		
	}

	@Override
	public void duracionTotal() {
		int duracionTotal = 0; 
		for (int i = 0; i < lista_de_canciones.size(); i++) {
			duracionTotal += lista_de_canciones.get(i).getDuracion(); 
		}
		System.out.println("La duración total de la lista es: "+duracionTotal);
	}

	@Override
	public void calificacionMedia() {
		
		double calificacionTotal = 0;
		double contador = 0;
		for (int i = 0; i < lista_de_canciones.size(); i++) {
		contador++;
		calificacionTotal += lista_de_canciones.get(i).getCalificaion(); 
		}
		double calificacionMedia = calificacionTotal/contador;
		System.out.println("La claificación media de la lista es: "+calificacionMedia);
	}

	

	
	
	
}
