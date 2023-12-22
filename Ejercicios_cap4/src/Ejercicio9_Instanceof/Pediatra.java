package Ejercicio9_Instanceof;

public class Pediatra extends Médico{
	//El enum sirve para determinar el tipo de la clase
	//En este caso el pediatra puede ser Neurólgo o Psicólogo
	enum Tipo{Neurólogo,Psicólogo};
	Tipo tipo;
	
	//Constructor
	public Pediatra(String nombre, Tipo tipo) {
		super(nombre);
		this.tipo = tipo;
	}
	
	//Get and set
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
}
