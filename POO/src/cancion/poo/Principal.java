package cancion.poo;
/*
 * Propiedades:
Nombre, de tipo String
Intérprete, de tipo String
Duración, de tipo int
Año, de tipo int
Género, de tipo String
NúmeroDeReproducciones, de tipo int
Calificación, de tipo int (la calificación es un valor que indica
cuánto nos gusta una canción y está comprendido entre 0, muy poco, y 5, mucho)
 */

public class Principal {

	public static void main(String[] args) {
		Musical lista = new CancionesLista();
		
		Cancion c1 = new Cancion("nombre","interprete", 90, 1980, "rock");
		Cancion c2 = new Cancion("pepe","juan", 100, 2000, "jazz");
		
		lista.nuevaCancion(c1);
		lista.nuevaCancion(c2);
		
		lista.modificarCalificacion(c1, 2);
		lista.modificarCalificacion(c2, 3);
		
		lista.calificacionMedia();

	}

}
