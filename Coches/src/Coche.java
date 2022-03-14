
public class Coche {

	private int codigo;
	private String marca;
	private String modelo;
	private int diaFabricacion;
	private int mesFabricacion;
	private int anyoFabricacion;
	private String color;
	private float precio;
	private int estdo;
	private float kms;
	private String lugarVenta;
	private String extras;
	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coche(int codigo, String marca, String modelo, int diaFabricacion, int mesFabricacion, int anyoFabricacion,
			String color, int estdo, float kms, String lugarVenta, String extras) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.modelo = modelo;
		this.diaFabricacion = diaFabricacion;
		this.mesFabricacion = mesFabricacion;
		this.anyoFabricacion = anyoFabricacion;
		this.color = color;
		this.precio = precio;
		this.estdo = estdo;
		this.kms = kms;
		this.lugarVenta = lugarVenta;
		this.extras = extras;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getDiaFabricacion() {
		return diaFabricacion;
	}
	public void setDiaFabricacion(int diaFabricacion) {
		this.diaFabricacion = diaFabricacion;
	}
	public int getMesFabricacion() {
		return mesFabricacion;
	}
	public void setMesFabricacion(int mesFabricacion) {
		this.mesFabricacion = mesFabricacion;
	}
	public int getAnyoFabricacion() {
		return anyoFabricacion;
	}
	public void setAnyoFabricacion(int anyoFabricacion) {
		this.anyoFabricacion = anyoFabricacion;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getEstdo() {
		return estdo;
	}
	public void setEstdo(int estdo) {
		this.estdo = estdo;
	}
	public float getKms() {
		return kms;
	}
	public void setKms(float kms) {
		this.kms = kms;
	}
	public String getLugarVenta() {
		return lugarVenta;
	}
	public void setLugarVenta(String lugarVenta) {
		this.lugarVenta = lugarVenta;
	}
	public String getExtras() {
		return extras;
	}
	public void setExtras(String extras) {
		this.extras = extras;
	}
	@Override
	public String toString() {
		return "Coche [codigo=" + codigo + ", marca=" + marca + ", modelo=" + modelo + ", diaFabricacion="
				+ diaFabricacion + ", mesFabricacion=" + mesFabricacion + ", anyoFabricacion=" + anyoFabricacion
				+ ", color=" + color + ", precio=" + precio + ", estdo=" + estdo + ", kms=" + kms + ", lugarVenta=" + lugarVenta + ", extras="
				+ extras + "]";
	}
	
	public int actualizarEstado(int kilometros) {
		this.estdo = 0;
		
		if (kilometros == 0) {
			this.estdo = 0;
 		}else if (kilometros < 1000) {
 			this.estdo = 1;
 		}else {
 			this.estdo = 2;
 		}
		
		return estdo;
	}
	
	public void mesYanyo(int d, int m, int a) {
		
		if (this.anyoFabricacion == a && this.mesFabricacion == m) {
			System.out.println("El coche se ha fabricado el mismo mes y el mismo añyo.");
		}
		
		if (this.anyoFabricacion == a) {
			System.out.println("El coche se ha fabricado el mismo año.");
		}
	}
	
	public void aumentarPrecio(int cantidad) {
		if (this.color == "blanco" && this.extras=="techo panorámico") {
			this.precio = this.precio + cantidad;
		}
	}
}
