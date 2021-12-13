package main;

import bean.Ordenadores;
import dao.OrdenadoresDAO;
import dao.OrdenadoresDAOListas;

public class Principal {

	public static void main(String[] args) {
		OrdenadoresDAO lista = new OrdenadoresDAOListas();
		Ordenadores o1 = new Ordenadores(1, "HP", 512, "i7", 2018, true);
		Ordenadores o2 = new Ordenadores(2, "Asus", 1024, "i10", 2019, true);
		Ordenadores o3 = new Ordenadores(3, "msi", 1024, "i5", 2017, false);
		
		lista.nuevoOredenador(o1);
		lista.nuevoOredenador(o2);
		lista.nuevoOredenador(o3);
		
		lista.listarOrdenadores();
		
		lista.actualizarRam(2048);
		
		lista.borrarOrdenadores();
		
		lista.borrarTodo();
		lista.buscar("HP", 512, "i7");
		lista.buscarOrdenadorporRyF(1024);
		
		

	}

}