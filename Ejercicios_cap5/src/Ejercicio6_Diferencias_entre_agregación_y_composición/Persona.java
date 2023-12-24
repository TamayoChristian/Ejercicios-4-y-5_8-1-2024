package Ejercicio6_Diferencias_entre_agregación_y_composición;

public class Persona {
	//Atributos
	public String Nombre, Apellido;
	public int Edad;
	
	//Constructor
	public Persona(String nombre, String apellido, int edad) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Edad = edad;
	}

	//Getters and setters
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}
	
	
}
