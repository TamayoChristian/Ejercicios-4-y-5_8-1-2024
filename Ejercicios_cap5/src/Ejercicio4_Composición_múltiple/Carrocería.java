package Ejercicio4_Composición_múltiple;

public class Carrocería {
	
	//Atributos
	enum tipoCarrocería{Independiente, Autoportante,Tubular}
	tipoCarrocería Tipo_De_La__Carroceria;
	public String Color;
	
	//Constructor
	public Carrocería(tipoCarrocería tipo_De_La__Carroceria, String color) {
		super();
		Tipo_De_La__Carroceria = tipo_De_La__Carroceria;
		Color = color;
	}
	
	//Getters and setters
	public tipoCarrocería getTipo_De_La__Carroceria() {
		return Tipo_De_La__Carroceria;
	}
	public void setTipo_De_La__Carroceria(tipoCarrocería tipo_De_La__Carroceria) {
		Tipo_De_La__Carroceria = tipo_De_La__Carroceria;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	
	public void Imprimir() {
		System.out.println("Carroceria");
		System.out.println("Tipo: " + Tipo_De_La__Carroceria);
		System.out.println("Color: " + Color);
	}
}
