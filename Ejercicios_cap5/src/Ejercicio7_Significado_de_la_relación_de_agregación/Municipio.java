package Ejercicio7_Significado_de_la_relación_de_agregación;

public class Municipio {
	//Atributos
	public String Nombre;
	public int Población;
	public double Temperatura, Altitud;
	
	//Constructor
	public Municipio(String nombre, int población, double temperatura, double altitud) {
		super();
		Nombre = nombre;
		Población = población;
		Temperatura = temperatura;
		Altitud = altitud;
	}
	
	//Getters and setters
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getPoblación() {
		return Población;
	}
	public void setPoblación(int población) {
		Población = población;
	}
	public double getTemperatura() {
		return Temperatura;
	}
	public void setTemperatura(double temperatura) {
		Temperatura = temperatura;
	}
	public double getAltitud() {
		return Altitud;
	}
	public void setAltitud(double altitud) {
		Altitud = altitud;
	}
}
