package main;

import bean.Ordenadores;
import dao.OrdenadoresDAO;
import dao.OrdenadoresDAOListas;

public class Principal {

	public static void main(String[] args) {
		
		OrdenadoresDAO lista = new OrdenadoresDAOListas();
		
		Ordenadores o1 = new Ordenadores(1, "HP", 512, "intel", 2018, true);
		Ordenadores o2 = new Ordenadores(2, "asus", 2048, "ryzen", 2019, true);
		Ordenadores o3 = new Ordenadores(3, "lenovo", 512, "xeon", 2015, false);

		lista.nuevoOrdenador(o1);
		lista.nuevoOrdenador(o2);
		lista.nuevoOrdenador(o3);
		
		lista.buscarOrdenadorPorAtributos("asus", 2048, "ryzen");
		
		
		System.out.println("---------------------------------------------------------------------------------");
		lista.buscarPorRyF(512);
		
		System.out.println("---------------------------------------------------------------------------------");
		lista.actualizarRam(1024);
		System.out.println("---------------------------------------------------------------------------------");
		lista.listarTodos();
		System.out.println("---------------------------------------------------------------------------------");
		lista.borrarTodos();
	}

}
