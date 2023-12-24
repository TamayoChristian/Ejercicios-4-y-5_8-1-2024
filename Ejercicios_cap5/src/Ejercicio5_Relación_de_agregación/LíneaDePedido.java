package Ejercicio5_Relación_de_agregación;

public class LíneaDePedido {
	//Atributos
	public int ID;
	public int Cantidad;
	Producto producto;
	
	//Constructor
	public LíneaDePedido(int iD, int cantidad, Producto producto) {
		super();
		this.ID = iD;
		this.Cantidad = cantidad;
		this.producto = producto;
	}
	
	//Getters and setters
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	
	//Metodo toString
	/*
	 * Devuelve un string que concatena los atributos
	 */
	public String toString() {
		return "\nLínea del Pepido: " + "Id: "+ ID + " Cantidad: " + Cantidad
				+ " Producto: {" + producto+"}"; 
	}
	
	//Métodos Calcular Subtotal
	/*
	 * Devuelve el subtotal que es la multiplicación del 
	 * precio del producto por su cantidad
	 */
	public Double Calcular_Subtotal(Producto producto) {
		return producto.Precio*Cantidad;
	}
}
