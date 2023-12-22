package Ejercicio9_Instanceof;

public class Ortopedista extends Médico{
	
	
	//El ortopedista puede ser Maxilofacial o pediatrica
	enum Clase{Maxilofacial,Pediátrica};
	Clase tipo;
	
	//Constructor
	public Ortopedista(String nombre, Clase tipo) {
		super(nombre);
		this.tipo=tipo;
	}
	
	public Clase getTipo() {
		return tipo;
	}
	public void setTipo(Clase tipo) {
		this.tipo = tipo;
	}
	
}
