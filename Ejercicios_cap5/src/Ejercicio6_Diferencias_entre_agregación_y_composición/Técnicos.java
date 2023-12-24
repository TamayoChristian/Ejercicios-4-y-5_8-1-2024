package Ejercicio6_Diferencias_entre_agregación_y_composición;

public class Técnicos extends Persona{
	//Atributos propios
	public int Años_de_Experiencia;
	public boolean nacionalidad;
	
	//Constructor
	public Técnicos(String nombre, String apellido, int edad, int Años_de_Experiencia, boolean nacionalidad) {
		super(nombre, apellido, edad);
		this.Años_de_Experiencia = Años_de_Experiencia;
		this.nacionalidad = nacionalidad;
	}

	//getters and setters
	public int getAños_de_Experiencia() {
		return Años_de_Experiencia;
	}

	public void setAños_de_Experiencia(int años_de_Experiencia) {
		Años_de_Experiencia = años_de_Experiencia;
	}

	public boolean isNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(boolean nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

}
