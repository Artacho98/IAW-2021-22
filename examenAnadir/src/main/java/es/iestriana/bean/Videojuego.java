package es.iestriana.bean;

import java.util.Arrays;

public class Videojuego {

	private int idVideogame;
	private String name;
	private int anyo;
	private String company;
	private String type;
	private byte[] photo;
	public Videojuego() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Videojuego(int idVideogame, String name, int anyo, String company, String type, byte[] photo) {
		super();
		this.idVideogame = idVideogame;
		this.name = name;
		this.anyo = anyo;
		this.company = company;
		this.type = type;
		this.photo = photo;
	}
	public Videojuego(String name, int anyo, String company, String type, byte[] photo) {
		super();
		this.name = name;
		this.anyo = anyo;
		this.company = company;
		this.type = type;
		this.photo = photo;
	}
	public int getIdVideogame() {
		return idVideogame;
	}
	public void setIdVideogame(int idVideogame) {
		this.idVideogame = idVideogame;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "Videojuego [idVideogame=" + idVideogame + ", name=" + name + ", anyo=" + anyo + ", company=" + company
				+ ", type=" + type + ", photo=" + Arrays.toString(photo) + "]";
	}
	
	
}
