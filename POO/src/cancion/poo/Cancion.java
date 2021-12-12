package cancion.poo;

import java.io.Serializable;

/*
 * Clase Canción:

Propiedades:
Nombre, de tipo String
Intérprete, de tipo String
Duración, de tipo int
Año, de tipo int
Género, de tipo String
NúmeroDeReproducciones, de tipo int
Calificación, de tipo int (la calificación es un valor que indica
cuánto nos gusta una canción y está comprendido entre 0, muy poco, y 5, mucho)
Reproducir, de tipo boolean

Métodos de la Clase:
- toString
- Un método constructor con sendos parámetros que representen el nombre, el intérprete, los segundos que dura la canción, 
el año y el género. 
El resto de atributos tomarán los siguientes valores por defecto: 0 para el número de reproducciones, 
0 para la calificación y true parareproducir.
 
a) Cree la interfaz MusicaI con el código siguiente:
- añadir una canción a la lista
- mostrar todas las canciones
- borrar todas las canciones
- borrar una canción de la lista pasada como parámetro
- buscar canciones de un año
- buscar canciones de un género
- buscar canciones por intérprete
- buscar canciones por nombre
- modificar la calificación de una canción pasada como parámetro
- buscar canciones de duración entre dos parámetros
- método que calcule la duración total de la lista
- método que calcule la calificación media de las canciones de la lista

d) Añada a la clase principal TestMusica el código necesario para probar todos los métodos.
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
