package Ejercicio4_Composición_múltiple;

public class Motor {
	//Atributos
	public double Volumen;//Volumen del motor en litros

	//Constructor
	public Motor(double volumen) {
		super();
		Volumen = volumen;
	}

	//Getter and setter
	public double getVolumen() {
		return Volumen;
	}

	public void setVolumen(double volumen) {
		Volumen = volumen;
	}
	
	//Método Imprimir
	public void Imprimir() {
		System.out.println("Motor");
		System.out.println("Volumen: " + Volumen + " litros");
	}
}
