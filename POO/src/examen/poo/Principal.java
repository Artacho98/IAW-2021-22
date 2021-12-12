package examen.poo;

public class Principal {

	public static void main(String[] args) {
		Examen e1 = new Examen("02", 4, "matematicas", false);
		Examen e2 = new Examen("02", 7, "ingles", true);

		e1.comprobarAlumnos(e2);
	}

}
