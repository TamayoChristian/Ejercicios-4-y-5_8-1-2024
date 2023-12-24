package Ejercicio4_Composición_múltiple;

import Ejercicio4_Composición_múltiple.Carrocería.tipoCarrocería;
import Ejercicio4_Composición_múltiple.Chasis.tipoChasis;

public class Carro {
	/*
	 * Un carro está compuesto por un motor, un chasis, cuatro llantas y una 
	 * carrocería
	 */
	Motor Motor_Carro;
	Carrocería Carrocería_Carro;
	Chasis Chasis_Carro;
	Llantas Llanta1, Llanta2,Llanta3,Llanta4;
	
	//Constructor
	public Carro(int volumen, tipoChasis clasedeChasis, String Color, 
			tipoCarrocería TipoDeCarroceria, String Marca, int Diametro, int Altura, int Anchura) {
		
		super();
		Motor_Carro = new Motor(volumen);
		Carrocería_Carro = new Carrocería(TipoDeCarroceria,Color);
		Chasis_Carro = new Chasis(clasedeChasis);
		Llanta1 = new Llantas(Marca,Diametro,Altura,Anchura);
		Llanta2 = new Llantas(Marca,Diametro,Altura,Anchura);
		Llanta3 = new Llantas(Marca,Diametro,Altura,Anchura);
		Llanta4 = new Llantas(Marca,Diametro,Altura,Anchura);
	}
	
	public void Imprimir() {
		System.out.println("El carro tiene las siguientes caracteristicas");
		System.out.println();
		Motor_Carro.Imprimir();
		System.out.println();
		Carrocería_Carro.Imprimir();
		System.out.println();
		Chasis_Carro.Imprimir();
		System.out.println();
		System.out.print("1.- ");
		Llanta1.Imprimir();
		System.out.println();
		System.out.print("2.- ");
		Llanta2.Imprimir();
		System.out.println();
		System.out.print("3.- ");
		Llanta3.Imprimir();
		System.out.println();
		System.out.print("4.- ");
		Llanta4.Imprimir();
	}
}
