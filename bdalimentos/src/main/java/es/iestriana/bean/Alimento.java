package es.iestriana.bean;

public class Alimento {

	private int idAlimento;
	private String nombre;
	private String categoría;
	private int diaCaducidad;
	private int mesCaducidad;
	private int anyoCaducidad;
	private float precio;
	private String proveedor;
	public int getIdAlimento() {
		return idAlimento;
	}
	public void setIdAlimento(int idAlimento) {
		this.idAlimento = idAlimento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoría() {
		return categoría;
	}
	public void setCategoría(String categoría) {
		this.categoría = categoría;
	}
	public int getDiaCaducidad() {
		return diaCaducidad;
	}
	public void setDiaCaducidad(int diaCaducidad) {
		this.diaCaducidad = diaCaducidad;
	}
	public int getMesCaducidad() {
		return mesCaducidad;
	}
	public void setMesCaducidad(int mesCaducidad) {
		this.mesCaducidad = mesCaducidad;
	}
	public int getAnyoCaducidad() {
		return anyoCaducidad;
	}
	public void setAnyoCaducidad(int anyoCaducidad) {
		this.anyoCaducidad = anyoCaducidad;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public Alimento(int idAlimento, String nombre, String categoría, int diaCaducidad, int mesCaducidad,
			int anyoCaducidad, float precio, String proveedor) {
		super();
		this.idAlimento = idAlimento;
		this.nombre = nombre;
		this.categoría = categoría;
		this.diaCaducidad = diaCaducidad;
		this.mesCaducidad = mesCaducidad;
		this.anyoCaducidad = anyoCaducidad;
		this.precio = precio;
		this.proveedor = proveedor;
	}
	public Alimento(String nombre, String categoría, int diaCaducidad, int mesCaducidad, int anyoCaducidad,
			float precio, String proveedor) {
		super();
		this.nombre = nombre;
		this.categoría = categoría;
		this.diaCaducidad = diaCaducidad;
		this.mesCaducidad = mesCaducidad;
		this.anyoCaducidad = anyoCaducidad;
		this.precio = precio;
		this.proveedor = proveedor;
	}
	@Override
	public String toString() {
		return "Alimento [idAlimento=" + idAlimento + ", nombre=" + nombre + ", categoría=" + categoría
				+ ", diaCaducidad=" + diaCaducidad + ", mesCaducidad=" + mesCaducidad + ", anyoCaducidad="
				+ anyoCaducidad + ", precio=" + precio + ", proveedor=" + proveedor + "]";
	}
	
	
}
