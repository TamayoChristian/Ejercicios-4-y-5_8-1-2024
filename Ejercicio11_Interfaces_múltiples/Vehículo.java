package Ejercicio11_Interfaces_múltiples;

public abstract class Vehículo {
	//Atributos
	public double Velocidad_Actual;
	public double Velocidad_Máxima;
	
	//Constructor
	public Vehículo(double velocidad_Actual, double velocidad_Máxima) {
		super();
		Velocidad_Actual = velocidad_Actual;
		Velocidad_Máxima = velocidad_Máxima;
	}
	
	//Métodos
	public abstract void Acelerar(double vel); //Vel es la velocidad que se acelera
	public abstract void Frenar(double vel); //Vel es la velocidad que se frena
	public abstract void Imprimir();
	
}
