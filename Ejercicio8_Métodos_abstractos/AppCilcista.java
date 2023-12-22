package Ejercicio8_Métodos_abstractos;

import java.util.Scanner;

public class AppCilcista {
/*
 * En una clase de prueba, en un método main se debe crear un equipo 
y agregar ciclistas de diferentes tipos.
 */
	public static void main(String[] args) {
		//Creamos los equipos
		Equipo_de_Ciclista Equipo1 = new Equipo_de_Ciclista("Red Hood", "Letonia");
		Equipo_de_Ciclista Equipo2 = new Equipo_de_Ciclista("Nuevo Santiago","Chile");
		
		//Se crean los velocistas
		Velocista velocista1 = new Velocista(1,"Dominiks Ivanovi", 120.2, 73, 39.2);
		Velocista velocista2 = new Velocista(1,"Pablo Morales", 115.8, 69, 40.1);
		
		Escalador escalador1 = new Escalador(2, "Tomass Kalnini", 142.2, 18, 30);
		Escalador escalador2 = new Escalador(2, "José Benavides", 140.2, 20, 32);
		
		Contrarrelojista contrarelojista1 = new Contrarrelojista(3, "Toms Ozolini", 64, 36);
		Contrarrelojista contrarelojista2 = new Contrarrelojista(3, "Juan Ramirez", 59.3, 40);
		
		//Insersión de los cilcistas en los equipos.
		Equipo1.AñadirCiclista(velocista1);
		Equipo1.AñadirCiclista(escalador1);
		Equipo1.AñadirCiclista(contrarelojista1);
		
		Equipo2.AñadirCiclista(velocista2);
		Equipo2.AñadirCiclista(escalador2);
		Equipo2.AñadirCiclista(contrarelojista2);
		
		
		/*Usando los metodos*/
		//Método Listado
		System.out.println("-------Lista de Ciclistas-------");
		//Equipo 1
		System.out.println(Equipo1.getNombre_Equipo());
		Equipo1.Lista();
		System.out.println();
		//Equipo 2
		System.out.println(Equipo2.getNombre_Equipo());
		Equipo2.Lista();
		System.out.println();
		
		//Metodo de busqueda
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese el ID del cilcista que desea buscar en el equipo: Red Hood");
		int ID = ingreso.nextInt();
		Equipo1.Busqueda(ID);
		System.out.println();
		
		System.out.println("Ingrese el ID del cilcista que desea buscar en el equipo: Nuevo Santiago");
		ID = ingreso.nextInt();
		Equipo2.Busqueda(ID);
		ingreso.close();
		System.out.println();
		
		//Método Calcular tiempos
		Equipo1.Calcular_Tiempo(); 
		Equipo1.Imprimir();
		System.out.println();
		
		Equipo2.Calcular_Tiempo();
		Equipo2.Imprimir();
		System.out.println();
		//Metodo imprimir.
	}
}
