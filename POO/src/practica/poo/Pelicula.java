package practica.poo;

public class Pelicula {
	
	private String titulo;
	private String genero;
	private double p_entrada;
	private boolean adultos;

	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Pelicula(String titulo, String genero, double p_entrada, boolean adultos) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.p_entrada = p_entrada;
		this.adultos = adultos;
	}
	
	public Pelicula(String titulo, String genero) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		p_entrada = 10;
		adultos = false;
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


	public double getP_entrada() {
		return p_entrada;
	}


	public void setP_entrada(double p_entrada) {
		this.p_entrada = p_entrada;
	}


	public boolean isAdultos() {
		return adultos;
	}


	public void setAdultos(boolean adultos) {
		this.adultos = adultos;
	}


	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", genero=" + genero + ", p_entrada=" + p_entrada + ", adultos=" + adultos
				+ "]";
	}
	
	public void descuentoEntrada(double descuento) {
		p_entrada = p_entrada - p_entrada*(descuento/100);
	
	}
	
	

}
