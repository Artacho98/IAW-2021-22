package practica.poo;

public class Principal {
	public static void main(String[] args) {
	
	Pelicula p = new Pelicula("It", "Terror", 5, true);
	Pelicula p2 = new Pelicula("It", "Terror");
	Pelicula p3 = new Pelicula();
	
	System.out.println(p);
	
	
	p2.setP_entrada(7.5);
	
	p2.descuentoEntrada(30);
	
	System.out.println(p2);
	System.out.println(p3);
	}
}
