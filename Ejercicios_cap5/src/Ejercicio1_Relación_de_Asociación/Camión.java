package Ejercicio1_Relación_de_Asociación;

public class Camión extends Vehículo{
	//Atributos
	public int peaje;
	public int número_de_ejes;
	
	//Constrcutor
	public Camión() {
		super();
	}
	public Camión(String placa, int número_de_ejes) {
		super(placa);
		this.peaje=5000;
		this.número_de_ejes= número_de_ejes;
	}

	public int getPeaje() {
		return peaje;
	}
	public void setPeaje(int peaje) {
		this.peaje = peaje;
	}
	public int getNúmero_de_ejes() {
		return número_de_ejes;
	}
	public void setNúmero_de_ejes(int número_de_ejes) {
		this.número_de_ejes = número_de_ejes;
	}
	public void Imprimir() {
		System.out.println("Cámion");
		System.out.println("Placa: " + Placa);		
		System.out.println("Número de ejes = " + número_de_ejes);
		System.out.println("Peaje = " + peaje);
	
	}
	
	
	
}
