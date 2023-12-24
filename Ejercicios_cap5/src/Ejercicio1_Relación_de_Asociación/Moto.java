package Ejercicio1_Relación_de_Asociación;

public class Moto extends Vehículo{

	//Atributos
	public static int peaje=5000;

	//Constructores
	public Moto() {
		super();
	}

	public Moto(String placa) {
		super(placa);
	}

	//Get and set
	public int getPejae() {
		return peaje;
	}

	public void setPejae(int pejae) {
		Moto.peaje = pejae;
	}
	
	public void Imprimir() {
		System.out.println("Moto");
		System.out.println("Peaje: " + peaje);
		System.out.println("Placa: " + Placa);
	}
}
