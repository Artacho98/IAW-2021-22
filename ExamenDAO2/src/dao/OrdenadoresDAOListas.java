package dao;

import java.util.ArrayList;
import java.util.List;

import bean.Ordenadores;

public class OrdenadoresDAOListas implements OrdenadoresDAO {
	
	private List<Ordenadores> lista_de_ordenadores = new ArrayList<Ordenadores>();
	
	@Override
	public void nuevoOrdenador(Ordenadores o) {
		if (!lista_de_ordenadores.contains(o)) {
			lista_de_ordenadores.add(o);
		}else {
			System.out.println("El ordenador "+o.getIdentificador()+" ya está en la lista.");
		}
		
	}

	@Override
	public void borrarTodos() {
		lista_de_ordenadores.clear();
		System.out.println("La lista se ha borrado.");
		
	}

	@Override
	public void borrarOrdenadores() {
		for (Ordenadores o : lista_de_ordenadores) {
			if (!o.isFunciona() && o.getAnyoCompra()<2017) {
				lista_de_ordenadores.remove(o);
				System.out.println("Se ha borrado el ordenador"+o.getIdentificador());
			}
		}
		
	}

	@Override
	public void buscarOrdenadorPorAtributos(String marca, int ram, String procesador) {
		for (Ordenadores o : lista_de_ordenadores) {
			if (o.getMarca().equals(marca) && o.getRam()==ram 
					&& o.getProcesador().equals(procesador)) {
				System.out.println(o);
			}
		}
		
	}

	@Override
	public void buscarPorRyF(int ram) {
		for (Ordenadores o : lista_de_ordenadores) {
			if (o.getRam()==ram && o.isFunciona()) {
				System.out.println(o);
			}
		}
		
	}

	@Override
	public void actualizarRam(int ram) {
		for (Ordenadores o : lista_de_ordenadores) {
			if (o.getAnyoCompra()==2019) {
				o.setRam(ram);
				System.out.println("La ram de tu ordenador se ha actualizado.");
			}
		}
		
	}

	@Override
	public void listarTodos() {
		for (Ordenadores o : lista_de_ordenadores) {
			if (o.getRam()==512 && o.getAnyoCompra()==2018 && o.isFunciona()) {
				System.out.println(o);
			}
		}
		
	}

	@Override
	public void mostrarTodos() {
		for (Ordenadores o : lista_de_ordenadores) {
			System.out.println(o);
		}
		
	}

}
