package cancion.poo;
/*
 * Propiedades:
Nombre, de tipo String
Int�rprete, de tipo String
Duraci�n, de tipo int
A�o, de tipo int
G�nero, de tipo String
N�meroDeReproducciones, de tipo int
Calificaci�n, de tipo int (la calificaci�n es un valor que indica
cu�nto nos gusta una canci�n y est� comprendido entre 0, muy poco, y 5, mucho)
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
