package Ejercicio6_Diferencias_entre_agregación_y_composición;

public class Portero extends Jugador{
	//Atributos propios
	public int Goles_Recibidos;
	
	//Constructor
	public Portero(String nombre, String apellido, int edad, boolean Titularidad, int Goles_Recibidos) {
		super(nombre, apellido, edad, Titularidad);
		this.Goles_Recibidos = Goles_Recibidos;
	}
}
