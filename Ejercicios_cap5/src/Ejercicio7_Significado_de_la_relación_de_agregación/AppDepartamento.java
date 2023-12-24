package Ejercicio7_Significado_de_la_relación_de_agregación;

import java.util.Scanner;

public class AppDepartamento {
	public static void main(String[] args) {
		Municipio Bolívar = new Municipio("Bolívar", 45493, 21.9, 120);
		Municipio Chone = new Municipio("Chone", 131002, 32.9, 150);
		Municipio El_Carmen = new Municipio("El Carmen", 135344, 29.82, 102);
		Municipio Jama = new Municipio("Jama", 3920, 21.9, 300);
		
		//Ingrese su municipio por teclado
		Scanner Ingreso = new Scanner(System.in);
		System.out.println("Ingrese el nombre del municipio a agregar: ");
		String Nuevo_Nombre = Ingreso.next();
		System.out.println("Ingrese su población: ");
		int Población = Ingreso.nextInt();
		System.out.println("Ingrese la temperatura: ");
		Double Temperatura = Ingreso.nextDouble();
		System.out.println("Ingrese la altitud: ");
		Double Altitud = Ingreso.nextDouble();
		Municipio Nuevo_Municipio = new Municipio(Nuevo_Nombre, Población, Temperatura, Altitud);
		
		//Agregando los municipios
		Departamento Manabí = new Departamento("Manabí");
		Manabí.AgregarMunicipio(Bolívar);
		Manabí.AgregarMunicipio(Jama);
		Manabí.AgregarMunicipio(Chone);
		Manabí.AgregarMunicipio(El_Carmen);
		Manabí.AgregarMunicipio(Nuevo_Municipio);
		System.out.println();
		
		//Buscando un municipio
		System.out.println("Ingrese el nombre del municipio que desee buscar: ");
		String Referencia_Busqueda = Ingreso.next();
		Manabí.BuscarMunicipio(Referencia_Busqueda);
		System.out.println();
		
		//Buscando un municipio con la misma población de Chone, o mayor.
		System.out.println("Municipios con la misma población de Chone o mayor: ");
		Manabí.ExistenMunicpiosMasPoblados(Chone.Población);
		//Método Censo
		System.out.println();
		Manabí.Censo();
		Ingreso.close();
	}
}
