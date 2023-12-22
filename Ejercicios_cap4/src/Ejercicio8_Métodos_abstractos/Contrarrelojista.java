package Ejercicio8_Métodos_abstractos;

public class Contrarrelojista extends Ciclista{
	//Atributos
	private double Velocidad_Maxima;
	
	//Constructores
	public Contrarrelojista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contrarrelojista(int id, String nombre_Ciclista, double tiempo, double Velocidad_Maxima) {
		super(id, nombre_Ciclista, tiempo);
		this.Velocidad_Maxima = Velocidad_Maxima;
	}

	//Getter and setter
	public double getVelocidad_Maxima() {
		return Velocidad_Maxima;
	}

	public void setVelocidad_Maxima(double velocidad_Maxima) {
		Velocidad_Maxima = velocidad_Maxima;
	}

	@Override
	protected String ImprimirTipo() {
		System.out.println("Es un Contrarelojista");
		return null;
	}
}
