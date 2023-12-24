package Ejercicio6_Diferencias_entre_agregación_y_composición;

public class Jugador extends Persona{
	//Atributos propios
	public boolean Titularidad;
	
	//Constructor
	public Jugador(String nombre, String apellido, int edad, boolean Titularidad) {
		super(nombre, apellido, edad);
		this.Titularidad = Titularidad;
	}

	//Getters and setters
	public boolean isTitularidad() {
		return Titularidad;
	}

	public void setTitularidad(boolean titularidad) {
		Titularidad = titularidad;
	}

}
