package Ejercicio11_Interfaces_múltiples;

import java.util.Scanner;

import Ejercicio11_Interfaces_múltiples.Vehículo_Acuatico.Tipo;
import Ejercicio11_Interfaces_múltiples.Vehículos_Terrestres.Clase;

/*
 * Se debe definir un método main que cree una camioneta y una moto 
 * acuática e invoque los métodos de cada clase e imprima sus resultados en 
 * pantalla.
 */
public class AppVehículos {
	public static void main(String[] args) {
		//Creación de los objetos camioneta y moto acuática
		Vehículos_Terrestres camioneta = new Vehículos_Terrestres(2, 180, 4, Clase.Civil);
		Vehículo_Acuatico moto_acuática = new Vehículo_Acuatico(0, 70, Tipo.Superficie, 1);
		
		System.out.println("Camioneta");
		camioneta.Imprimir();
		System.out.println("---------------------------------------------------------------");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese la velocidad que desea sumarle a su velocidad actual: ");
		double vel = input.nextDouble();
		camioneta.Acelerar(vel);
		System.out.println("Camioneta");
		camioneta.Imprimir();
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("Ingrese la velocidad que desea restarle a su velocidad actual: ");
		vel = input.nextDouble();
		camioneta.Frenar(vel);
		System.out.println("Camioneta");
		camioneta.Imprimir();
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("Moto Acuática");
		moto_acuática.Imprimir();
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("Ingrese la velocidad que desea sumarle a su velocidad actual: ");
		vel = input.nextDouble();
		moto_acuática.Acelerar(vel);
		System.out.println("Moto Acuática");
		moto_acuática.Imprimir();
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("Ingrese la velocidad que desea restarle a su velocidad actual: ");
		vel = input.nextDouble();
		moto_acuática.Frenar(vel);
		System.out.println("Moto Acuática");
		moto_acuática.Imprimir();
		
		input.close();
	}
}
