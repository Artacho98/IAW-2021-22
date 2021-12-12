package cancion.poo;

import java.io.Serializable;

/*
 * Clase Canci�n:

Propiedades:
Nombre, de tipo String
Int�rprete, de tipo String
Duraci�n, de tipo int
A�o, de tipo int
G�nero, de tipo String
N�meroDeReproducciones, de tipo int
Calificaci�n, de tipo int (la calificaci�n es un valor que indica
cu�nto nos gusta una canci�n y est� comprendido entre 0, muy poco, y 5, mucho)
Reproducir, de tipo boolean

M�todos de la Clase:
- toString
- Un m�todo constructor con sendos par�metros que representen el nombre, el int�rprete, los segundos que dura la canci�n, 
el a�o y el g�nero. 
El resto de atributos tomar�n los siguientes valores por defecto: 0 para el n�mero de reproducciones, 
0 para la calificaci�n y true parareproducir.
 
a) Cree la interfaz MusicaI con el c�digo siguiente:
- a�adir una canci�n a la lista
- mostrar todas las canciones
- borrar todas las canciones
- borrar una canci�n de la lista pasada como par�metro
- buscar canciones de un a�o
- buscar canciones de un g�nero
- buscar canciones por int�rprete
- buscar canciones por nombre
- modificar la calificaci�n de una canci�n pasada como par�metro
- buscar canciones de duraci�n entre dos par�metros
- m�todo que calcule la duraci�n total de la lista
- m�todo que calcule la calificaci�n media de las canciones de la lista

d) A�ada a la clase principal TestMusica el c�digo necesario para probar todos los m�todos.
 */
public class Cancion implements Serializable {

	private String nombre;
	private String interprete;
	private int duracion;
	private int anyo;
	private String genero;
	private int numeroReproducciones;
	private int calificaion;
	private boolean reproducir;
	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", interprete=" + interprete + ", duracion=" + duracion + ", anyo=" + anyo
				+ ", genero=" + genero + ", numeroReproducciones=" + numeroReproducciones + ", calificaion="
				+ calificaion + ", reproducir=" + reproducir + "]";
	}
	public Cancion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cancion(String nombre, String interprete, int duracion, int anyo, String genero) {
		super();
		this.nombre = nombre;
		this.interprete = interprete;
		this.duracion = duracion;
		this.anyo = anyo;
		this.genero = genero;
		numeroReproducciones = 0;
		calificaion = 0;
		reproducir = true;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getInterprete() {
		return interprete;
	}
	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getNumeroReproducciones() {
		return numeroReproducciones;
	}
	public void setNumeroReproducciones(int numeroReproducciones) {
		this.numeroReproducciones = numeroReproducciones;
	}
	public int getCalificaion() {
		return calificaion;
	}
	public void setCalificaion(int calificaion) {
		this.calificaion = calificaion;
	}
	public boolean isReproducir() {
		return reproducir;
	}
	public void setReproducir(boolean reproducir) {
		this.reproducir = reproducir;
	}
	
}
