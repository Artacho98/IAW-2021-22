package poo;

public class Principal {

	public static void main(String[] args) {
		Regalos r1 = new Regalos("Antonio Artacho", "Hasbro", 2021, 100, false, "coche");
		Regalos r2 = new Regalos("Kerry caberga", "Nancy", 2005, 5, true, "sexual");
		
		r1.modificarExistencias();
		
		r1.modificarPrecio(50);

		r1.comprobar();
		
		

	}

}