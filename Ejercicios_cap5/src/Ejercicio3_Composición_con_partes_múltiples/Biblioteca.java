package Ejercicio3_Composición_con_partes_múltiples;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	//Atributos
	public String Nombre;
	public List<Libros> Lista_de_Libros;
	
	
	//Constructor
	public Biblioteca(String nombre) {
		super();
		Nombre = nombre;
		Lista_de_Libros = new ArrayList<Libros>();
	}

	//Getters and setters
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	//Metodos
	public void AñadirLibro(Libros Nuevo_Libro) {
		Lista_de_Libros.add(Nuevo_Libro);
	}
	
	public void ListarLibros() {
		for(int f = 0; f < Lista_de_Libros.size(); f++) {
			Lista_de_Libros.get(f).Imprimir();;
			System.out.println();
		}
	}
}
