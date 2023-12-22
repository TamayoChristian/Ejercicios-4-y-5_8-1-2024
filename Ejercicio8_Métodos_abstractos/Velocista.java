package Ejercicio8_Métodos_abstractos;

public class Velocista extends Ciclista{

	//Atributos
	private double Potencia_Promedio;
	private double Velocidad_Promedio;
	
	//Constructores
	public Velocista() {
		super();
		}

	public Velocista(int id, String nombre_Ciclista, double tiempo, 
			double Potencia_Promedio, double Velocidad_Promedio) {
		
		super(id, nombre_Ciclista, tiempo);
		this.Potencia_Promedio = Potencia_Promedio;
		this.Velocidad_Promedio = Velocidad_Promedio;
		}
	
	//Getters and setters
	public double getPotencia_Promedio() {
		return Potencia_Promedio;
	}

	public void setPotencia_Promedio(double potencia_Promedio) {
		Potencia_Promedio = potencia_Promedio;
	}

	public double getVelocidad_Promedio() {
		return Velocidad_Promedio;
	}

	public void setVelocidad_Promedio(double velocidad_Promedio) {
		Velocidad_Promedio = velocidad_Promedio;
	}

	//Metodos
	@Override
	public String ImprimirTipo() {
		System.out.println("Es un Velocista");
		return null;
	}


	
}
