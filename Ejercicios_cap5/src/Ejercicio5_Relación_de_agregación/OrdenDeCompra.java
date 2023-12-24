package Ejercicio5_Relación_de_agregación;

import java.util.ArrayList;

public class OrdenDeCompra {
	//Atributos 
	public int ID;
	public ArrayList<LíneaDePedido> Listado_de_items = new ArrayList<LíneaDePedido>();

	//Constructor
	public OrdenDeCompra(int iD) {
		super();
		ID = iD;
	}

	//Getters and setters
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	//Métodos 
	
	//Calulcar el total
	/*
	 * Este método devuelve un String que concatena los siguientes
	 * atributos: Indentificador, Lineas de pedido, y el total de
	 * la orden.
	 */
	public double  Calcular_Total() {
		Double Total = 0.0;
		for (int y = 0; y < Listado_de_items.size();y++) {
			Total += Listado_de_items.get(y).producto.Precio;
		}
		return Total;
	}
	
	public void Añadir_Item(int identificador, int cantidad, Producto producto) {
		LíneaDePedido NuevaLinea = new LíneaDePedido(identificador, cantidad, producto);
		Listado_de_items.add(NuevaLinea);
	}
}