package Ejercicio1_Relación_de_Asociación;

public class Carro extends Vehículo{
	//Atributo
	public static int peaje = 10000;
	
	//Constructor
	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carro(String placa) {
		super(placa);
	}

	//Getter and setter
	public int getPeaje() {
		return peaje;
	}

	public void setPeaje(int peaje) {
		Carro.peaje = peaje;
	}
	
	public void Imprimir() {
		System.out.println("Carro");
		System.out.println("Peaje: " + peaje);
		System.out.println("Placa: " + Placa);
	}
}
