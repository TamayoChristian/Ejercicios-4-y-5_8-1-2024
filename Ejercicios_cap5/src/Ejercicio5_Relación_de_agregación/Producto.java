package Ejercicio5_Relación_de_agregación;

public class Producto {
	//Atributos
	public int ID;
	public String Nombre;
	public String Descripción;
	public double Precio;

	//Constructor
	public Producto(int iD, String nombre, String descripción, double precio) {
		super();
		ID = iD;
		Nombre = nombre;
		Descripción = descripción;
		Precio = precio;
	}

	//Getters and Setters
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripción() {
		return Descripción;
	}

	public void setDescripción(String descripción) {
		Descripción = descripción;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}
	
	public String toString() {
		return "Id: " + ID + " Nombre: "+ Nombre + " Precio: $" + Precio;
	}
}
