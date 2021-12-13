package cancion.poo;

public interface Musical {

	public void nuevaCancion(Cancion c);
	public void mostrarTodas();
	public void borrarCancion(Cancion c);
	public void cancionAnyo(int anyo);
	public void cancionGenero(String genero);
	public void cancionInterprete(String interprete);
	public void modificarCalificacion(Cancion c, int calificacion);
	public void buscarDuracion(int p, int f);
	public void duracionTotal();
	public void calificacionMedia();
	
}
