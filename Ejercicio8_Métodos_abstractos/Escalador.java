package Ejercicio8_Métodos_abstractos;

public class Escalador extends Ciclista{
	private float Aceleracion_Promedio;
	private float Grado_de_rampa;
	
	public Escalador() {
		super();
	}

	public Escalador(int id, String nombre_Ciclista, double tiempo, 
			float Aceleracion_Promedio, float Grado_de_rampa) {
		
		super(id, nombre_Ciclista, tiempo);
		this.Aceleracion_Promedio  = Aceleracion_Promedio;
		this.Grado_de_rampa = Grado_de_rampa;
	}
	
	//Getters and setters
	public float getAceleracion_Promedio() {
		return Aceleracion_Promedio;
	}

	public void setAceleracion_Promedio(float aceleracion_Promedio) {
		Aceleracion_Promedio = aceleracion_Promedio;
	}

	public float getGrado_de_rampa() {
		return Grado_de_rampa;
	}

	public void setGrado_de_rampa(float grado_de_rampa) {
		Grado_de_rampa = grado_de_rampa;
	}

	//Metodos
	@Override
	protected String ImprimirTipo() {
		System.out.println("Es un Escalador");
		return null;
	}
	
	
}
