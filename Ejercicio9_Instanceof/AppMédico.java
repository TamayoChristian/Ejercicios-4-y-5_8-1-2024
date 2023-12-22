package Ejercicio9_Instanceof;

import java.util.Vector;

import Ejercicio9_Instanceof.Ortopedista.Clase;
import Ejercicio9_Instanceof.Pediatra.Tipo;

/*
 * Clase main que tiene un vector con objetos tanto de tipo pediatra como ortopedistas. 
 * Luego, en pantalla se debe mostrar qué tipo de objeto está ubicado en cada posición del vector
 */
public class AppMédico {
	public static void main(String[] args) {
		Vector<Médico> Lista = new Vector<Médico>();
		Médico medico = new Médico("Dr. Peréz");
		Ortopedista ortopedista = new Ortopedista("Dr. Lopéz",Clase.Maxilofacial);
		Pediatra pediatra = new Pediatra("Dr. Gonzaléz", Tipo.Neurólogo);
		
		Lista.add(medico);
		Lista.add(ortopedista);
		Lista.add(pediatra);
		
		for(int o = 0; o<Lista.size(); o++) {
			Médico i = (Médico) Lista.elementAt(o);
			if (i instanceof Ortopedista) {
				System.out.println("El " + i.getNombre() + " es un Ortopedista");
				continue;
			}
			if (i instanceof Pediatra) {
				System.out.println("El " + i.getNombre() + " es un Pediatra");
				continue;
			}
			if (i instanceof Médico) {
				System.out.println("El " + i.getNombre() + " es un Médico");
				continue;
			}
		}
	}
}
