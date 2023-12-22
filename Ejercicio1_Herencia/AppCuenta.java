package Ejercicio1_Herencia;
/*
 * Ejercicio 4.1
 * Clase Cuenta con herencia
 */
import java.util.Scanner;

public class AppCuenta {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("CUENTA DE AHORROS");
		System.out.println("Ingrese su saldo: ");
		float saldo = input.nextFloat();

		
		System.out.println("Ingrese su tasa de interes anual: ");
		float interes = input.nextFloat();
		
		Cuenta_de_Ahorros cuenta_de_ahorros = new Cuenta_de_Ahorros(saldo, interes);
		
		System.out.println("-------------------------------------");
		System.out.println("Vamos a hacer un deposito");
		System.out.println("Ingresa la cantidad a depositar: ");
		float deposito = input.nextFloat();
		cuenta_de_ahorros.consignar(deposito);
		
		System.out.println("Vamos a hacer un retiro");
		System.out.println("Ingresa la cantidad a retirar: ");
		float retiro = input.nextFloat();
		cuenta_de_ahorros.retirar(retiro);
		cuenta_de_ahorros.Extracto();
		cuenta_de_ahorros.imprimir();
		
		System.out.println("-------------------------------------");
		System.out.println("Cuenta Corriente");
		System.out.println("Ingrese su saldo: ");
		float saldo1 = input.nextFloat();

		
		System.out.println("Ingrese su tasa de interes anual: ");
		float interes1 = input.nextFloat();
		Cuenta_Corriente cuenta_Corriente = new Cuenta_Corriente(saldo1, interes1);
		
		System.out.println("-------------------------------------");
		System.out.println("Vamos a hacer un deposito");
		System.out.println("Ingresa la cantidad a depositar: ");
		float deposito1 = input.nextFloat();
		cuenta_Corriente.consignar(deposito1);
		
		System.out.println("-------------------------------------");
		System.out.println("Vamos a hacer un retiro");
		System.out.println("Ingresa la cantidad a retirar: ");
		float retiro1 = input.nextFloat();
		cuenta_Corriente.retirar(retiro1);
		
		cuenta_Corriente.Extracto();
		cuenta_Corriente.Imprimir();
		input.close();
	}

}
