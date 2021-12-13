package dao;
import java.util.ArrayList;
import java.util.List;

/*
 * - Añadir un ordenador a la lista de ordenadores siempre que el ordenador 
     no esté en la lista.
- Borrar todos los ordenadores de la lista
- Borrar los ordenadores que no funcionen cuyo año sea menor que el 2017.
- Buscar un ordenador por marca, ram y procesador indicados por el usuario en el programa
principal.
- Buscar todos los ordenadores que tengan una determinada ram y estén funcionando.
- Actualizar la ram de los ordenadores del 2019 con un valor solicitado por el usuario.
 */
import bean.Ordenadores;

public class OrdenadoresDAOListas implements OrdenadoresDAO {
	
	private List<Ordenadores> lista_de_ordenadores = new ArrayList<Ordenadores>();

	@Override
	public void nuevoOredenador(Ordenadores o) {
		if (lista_de_ordenadores.contains(o)==false) {
			lista_de_ordenadores.add(o);			
		}else {
			System.out.println("El ordenador "+ o +" ya está en la lista.");
		}
	}

	@Override
	public void borrarTodo() {
		lista_de_ordenadores.removeAll(lista_de_ordenadores);
		
	}

	@Override
	public void borrarOrdenadores() {
		for (Ordenadores ordenadores : lista_de_ordenadores) {
			if (ordenadores.isFunciona() == false && ordenadores.getAnyoCompra()<2017) {
				lista_de_ordenadores.remove(ordenadores);
			}
		}
		
	}

	@Override
	public void buscar(String marca, int ram, String procesador) {
		for (Ordenadores ordenadores : lista_de_ordenadores) {
			if (ordenadores.getMarca().equals(marca) && ordenadores.getRam() == ram 
				&& ordenadores.getProcesador().equals(procesador)) {
				System.out.println(ordenadores);
			}
		}
		
	}

	@Override
	public void buscarOrdenadorporRyF(int ram) {
		for (Ordenadores ordenadores : lista_de_ordenadores) {
			if (ordenadores.getRam() == ram && ordenadores.isFunciona()==true) {
				System.out.println(ordenadores);
			}
		}
		
	}

	@Override
	public void actualizarRam(int ram) {
		for (Ordenadores ordenadores : lista_de_ordenadores) {
			if (ordenadores.getAnyoCompra()==2019) {
				ordenadores.setRam(ram);
				System.out.println("La ram de tu ordenador se ha actualizado.");
			}
		}
		
	}
//- Listar todos los ordenadores que sean de 512 de ram, del año 2018 y funcionen.
	@Override
	public void listarOrdenadores() {
	for (Ordenadores ordenadores : lista_de_ordenadores) {
		if (ordenadores.getRam() == 512 && ordenadores.getAnyoCompra() == 2018 
			&& ordenadores.isFunciona()==true) {
			System.out.println(ordenadores);
			}
		
		}
	}
}