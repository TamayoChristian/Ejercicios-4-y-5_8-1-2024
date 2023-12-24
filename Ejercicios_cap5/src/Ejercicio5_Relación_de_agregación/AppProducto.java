package Ejercicio5_Relación_de_agregación;

public class AppProducto {
	public static void main(String[] args) {
		Producto producto1 = new Producto(1, "Carpeta", "Carpeta anillada metálica", 1000);
		Producto producto2 = new Producto(2, "Tinta", "Tinta china de color negro", 3000);
		Producto producto3 = new Producto(3, "Cinta", "Cinta adhesiva de color transparente", 800);
		Producto producto4 = new Producto(4, "Cartulina", "Pliego de cartulina 60x40", 600);
		
		
		OrdenDeCompra orden = new OrdenDeCompra(1);
		
		orden.Añadir_Item(producto1.ID, 5, producto1);
		orden.Añadir_Item(producto2.ID, 3, producto2);
		orden.Añadir_Item(producto3.ID, 2, producto3);
		orden.Añadir_Item(producto4.ID, 4, producto4);
		System.out.println("Id de la orden: "+orden.ID);
		System.out.println(orden.Listado_de_items);
		System.out.println("Total a pagar: " + orden.Calcular_Total());
	}
}
