package es.iestriana.bean;

public class Usuario {

	private int idUsuario;
	private String email;
	private String pwd;
	private String nombre;
	private String apellidos;
	private int edad;
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario(int idUsuario, String email, String pwd, String nombre, String apellidos, int edad) {
		super();
		this.idUsuario = idUsuario;
		this.email = email;
		this.pwd = pwd;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	public Usuario(String email, String pwd, String nombre, String apellidos, int edad) {
		super();
		this.email = email;
		this.pwd = pwd;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", email=" + email + ", pwd=" + pwd + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}
	
	
	
	
}