package poo;

public class Principal {

	public static void main(String[] args) {
		Regalos r1 = new Regalos("Antonio Artacho", "Hasbro", 1998, 100, false, "muñeco");
		
		r1.modificarExistencias();
		
		r1.modificarPrecio(50);

		r1.comprobar();
		
		r1.modificarTipo("Peluche");
		
		System.out.println(r1);

	}

}