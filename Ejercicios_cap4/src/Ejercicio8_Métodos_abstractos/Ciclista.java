package Ejercicio8_Métodos_abstractos;

public abstract class Ciclista {
	private int id;
	private String Nombre_Ciclista;
	private double Tiempo = 0;
	
	//Constructor vacio
	public Ciclista() {
	}
	
	//Constructor con atributos
	public Ciclista(int id, String nombre_Ciclista, double tiempo) {
		this.id = id;
		Nombre_Ciclista = nombre_Ciclista;
		Tiempo = tiempo;
	}

	//getters and setters
	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getNombre_Ciclista() {
		return Nombre_Ciclista;
	}

	protected void setNombre_Cilcista(String nombre_Ciclista) {
		Nombre_Ciclista = nombre_Ciclista;
	}

	protected double getTiempo() {
		return Tiempo;
	}

	protected void setTiempo(double tiempo) {
		Tiempo = tiempo;
	}

	//Metodos
	protected abstract String ImprimirTipo();
	
	protected void Imprimr() {
		System.out.println("Nombre: " + Nombre_Ciclista);
		System.out.println("Id: " + id);
		System.out.println("Tiempo: " + Tiempo);
	}
	
}
