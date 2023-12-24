package Ejercicio3_Composición_con_partes_múltiples;

public class Libros {
	//Atributos
	public String Título, Autor, Editorial, Referencia_Bibliografica;
	public int Año_De_Publicación;

	//Constructor
	public Libros(String título, String autor, String editorial, String referencia_Bibliografica,
			int año_De_Publicación) {
		super();
		Título = título;
		Autor = autor;
		Editorial = editorial;
		Referencia_Bibliografica = referencia_Bibliografica;
		Año_De_Publicación = año_De_Publicación;
	}
	
	//Metodo imprimir
	public void Imprimir() {
		System.out.println("Título: " + Título);
		System.out.println("Autor: " + Autor);
		System.out.println("Editorial: " + Editorial);
		System.out.println("Referencia Bibliografica: " + Referencia_Bibliografica);
		System.out.println("Año de publicación: " + Año_De_Publicación);
	}
}
