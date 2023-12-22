package Ejercicio7_Clases_abstractas;

public abstract class Animal {
	//Atributos
	protected String sonido;
	protected String alimento;
	protected String hábitat;
	protected String nombre_cientifico;
	
	//Constructores
	public Animal() {
		
	}
	public Animal(String sonido, String alimento, String hábitat, String nombre_cientifico) {
		super();
		this.sonido = sonido;
		this.alimento = alimento;
		this.hábitat = hábitat;
		this.nombre_cientifico = nombre_cientifico;
	}
	
	//Getters and setters
	public abstract String getSonido();///Método abstracto
	
	public void setSonido(String sonido) {
		this.sonido = sonido;
	}
	
	///Método abstracto
	public abstract String getAlimento();

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	///Método abstracto
	public abstract String getHábitat();
	
	public void setHábitat(String hábitat) {
		this.hábitat = hábitat;
	}
	
	///Método abstracto
	public abstract String getNombre_cientifico();

	public void setNombre_cientifico(String nombre_cientifico) {
		this.nombre_cientifico = nombre_cientifico;
	}
	
}
