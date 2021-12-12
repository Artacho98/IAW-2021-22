package bean;

import java.io.Serializable;
import java.util.Objects;

public class Pelicula implements Serializable {

	private String titulo;
	private String genero;
	private int duracion;
	private boolean adultos;
	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pelicula(String titulo, String genero, int duracion, boolean adultos) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.adultos = adultos;
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public boolean isAdultos() {
		return adultos;
	}
	public void setAdultos(boolean adultos) {
		this.adultos = adultos;
	}
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", genero=" + genero + ", duracion=" + duracion + ", adultos=" + adultos
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(adultos, duracion, genero, titulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		return adultos == other.adultos && duracion == other.duracion && Objects.equals(genero, other.genero)
				&& Objects.equals(titulo, other.titulo);
	}
	
	
	
	
}
