package bean;

import java.io.Serializable;
import java.util.Objects;

public class Ordenadores implements Serializable {

	private int identificador;
	private String marca;
	private int ram;
	private String procesador;
	private int anyoCompra;
	private boolean funciona;
	public Ordenadores() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ordenadores(int identificador, String marca, int ram, String procesador, int anyoCompra, boolean funciona) {
		super();
		this.identificador = identificador;
		this.marca = marca;
		this.ram = ram;
		this.procesador = procesador;
		this.anyoCompra = anyoCompra;
		this.funciona = funciona;
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public int getAnyoCompra() {
		return anyoCompra;
	}
	public void setAnyoCompra(int anyoCompra) {
		this.anyoCompra = anyoCompra;
	}
	public boolean isFunciona() {
		return funciona;
	}
	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}
	@Override
	public String toString() {
		return "Ordenadores [identificador=" + identificador + ", marca=" + marca + ", ram=" + ram + ", procesador="
				+ procesador + ", anyoCompra=" + anyoCompra + ", funciona=" + funciona + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(anyoCompra, funciona, identificador, marca, procesador, ram);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ordenadores other = (Ordenadores) obj;
		return anyoCompra == other.anyoCompra && funciona == other.funciona && identificador == other.identificador
				&& Objects.equals(marca, other.marca) && Objects.equals(procesador, other.procesador)
				&& ram == other.ram;
	}
	
	
	
}