package poo;

public class Regalos {
	private String nombre;
	private String marca;
	private int anyoCompra;
	private double precio;
	private boolean existencias;
	private String tipo;
	public Regalos() {
		super();
		
	}
	public Regalos(String nombre, String marca, int anyoCompra, double precio, boolean existencias, String tipo) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.anyoCompra = anyoCompra;
		this.precio = precio;
		this.existencias = existencias;
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAnyoCompra() {
		return anyoCompra;
	}
	public void setAnyoCompra(int anyoCompra) {
		this.anyoCompra = anyoCompra;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isExistencias() {
		return existencias;
	}
	public void setExistencias(boolean existencias) {
		this.existencias = existencias;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Regalos [nombre=" + nombre + ", marca=" + marca + ", anyoCompra=" + anyoCompra + ", precio=" + precio
				+ ", existencias=" + existencias + ", tipo=" + tipo + "]";
	}
	
	// Método que actualice la posibilidad de existencias de un regalo al contrario del que tiene.
	public void modificarExistencias() {
		this.existencias = !this.existencias;
	}
	
	// Método que incremente el precio del regalo un determinado porcentaje indicado en el parámetro de entrada.
	public void modificarPrecio(double porcentaje) {
		this.precio += this.precio*(porcentaje/100);
	}
	
	// Método que modifique el tipo de regalo según el parámetro de entrada.
	public void modificarTipo(String tipo) {
		this.tipo = tipo;
	}
	
	// Método para comprobar si un regalo es de tipo coches, es de este año y tiene un precio mayor que 50€. 
	//Si es así debe devolver cierto, en caso contrario, falso.
	public void  comprobar() {
		if (this.tipo.equals("coche") && this.anyoCompra==2021 && this.precio>50) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
	
}