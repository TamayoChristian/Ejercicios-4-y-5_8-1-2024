package Ejercicio3_Composición_con_partes_múltiples;

public class AppBiblioteca {

	public static void main(String[] args) {
		Biblioteca Biblioteca_Nacional = new Biblioteca("Biblioteca Nacional");
		
		Libros libro1 = new Libros("Cien años de soledad", "Gabriel García Márquez", 
				"Sudamericana", "858.67/M566", 1967);
		
		Libros libro2 = new Libros("Rayuela", "Julio Cortázar", 
				"Sudamericana", "863.55/J667", 1963);
		
		Libros libro3 = new Libros("Latia Julia y el escritor", "Mario Vargas Llosa", 
				"Seix Barral", "868.23/L567", 1977);
		
		Biblioteca_Nacional.AñadirLibro(libro1);
		Biblioteca_Nacional.AñadirLibro(libro2);
		Biblioteca_Nacional.AñadirLibro(libro3);
		System.out.println("La " + Biblioteca_Nacional.getNombre() + 
				" tiene los siguientes libros");
		System.out.println();
		Biblioteca_Nacional.ListarLibros();
	}

}
