package Ejercicio6_Diferencias_entre_agregación_y_composición;

public class Delanteros extends Jugador{
	//Atributos propios
	public int Goles_Anotados;
	
	//Constructor
	public Delanteros(String nombre, String apellido, int edad, boolean Titularidad, int Goles_Anotados) {
		super(nombre, apellido, edad, Titularidad);
		this.Goles_Anotados=Goles_Anotados;
	}
}
