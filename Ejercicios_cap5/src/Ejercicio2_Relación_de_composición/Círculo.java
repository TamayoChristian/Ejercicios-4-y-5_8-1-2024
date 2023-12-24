package Ejercicio2_Relación_de_composición;

/*
 * Vamos a usar un objeto de tipo punto como atributo de la clase 
 * círculo
 * Esto es posible porque la clase circulo tiene una relación de
 * composición con la clase punto, es decir, la clase círculo no
 * puede funcionar sin la clase punto.
 */

public class Círculo {
	//Atributos
	Punto central; //Este es un objeto de tipo Punto
	int radio;
	
	//Constructor
	public Círculo(int x, int y, int radio) {
		super();
		central = new Punto(x,y);
		this.radio = radio;
	}

	//Getter and Setter
	public Punto getCentral() {
		return central;
	}

	public void setCentral(Punto central) {
		this.central = central;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	//Metodos
	public void Mostrar() {
		System.out.println("El punto central de esta circuferencia es: (" 
	+ central.getX()+"," + central.getY() + ") y su radio es de: " + radio + " cm");
	}
}
