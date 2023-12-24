package Ejercicio6_Diferencias_entre_agregación_y_composición;

public class Mediocampos extends Jugador{
	//Atributos propios
	public int Número_de_Asistencias;
	//Constructor
	public Mediocampos(String nombre, String apellido, int edad, 
			boolean Titularidad, int Número_de_Asistencias) {
		super(nombre, apellido, edad, Titularidad);
		this.Número_de_Asistencias = Número_de_Asistencias;
	}
	
	//Getters and setters
	public int getNúmero_de_Asistencias() {
		return Número_de_Asistencias;
	}
	public void setNúmero_de_Asistencias(int número_de_Asistencias) {
		Número_de_Asistencias = número_de_Asistencias;
	}
	
}
