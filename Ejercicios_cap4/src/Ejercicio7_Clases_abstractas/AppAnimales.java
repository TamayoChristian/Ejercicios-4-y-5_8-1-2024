package Ejercicio7_Clases_abstractas;

/*
 * Este método main es generará objetos mediante un array
 */
public class AppAnimales {
	public static void main(String[] args) {
		Animal[]listadeanimales = new Animal[4];
		
		listadeanimales[0] = new Gatos();
		listadeanimales[1] = new Perros();
		listadeanimales[2] = new Leones();
		listadeanimales[3] = new Lobos();
		
		for(int o=0; o<listadeanimales.length; o++) {
			
			System.out.println("-------------------------------------");
			System.out.println("Nombre: " + listadeanimales[o].getNombre_cientifico());
			System.out.println("Su sonido es: " + listadeanimales[o].getSonido());
			System.out.println("Su habitad es: " + listadeanimales[o].getHábitat());
			System.out.println("Su alimentación es: "+listadeanimales[o].getAlimento());
			
		}
	}
}
