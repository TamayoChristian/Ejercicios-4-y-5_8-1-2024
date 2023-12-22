package Ejercicio2_Paquetes_y_métodos_de_acceso;

public class Inmuebles {
	protected int IdentificadorInmobiliario;
	protected int Área;
	protected String Dirección;
	protected double precio;
	
	
	//Constructor
	public Inmuebles(int identificadorInmobiliario, int área, String dirección) {
		super();
		IdentificadorInmobiliario = identificadorInmobiliario;
		Área = área;
		Dirección = dirección;
	}
	
	public double CalcularPrecio(double Valor) {
		//El precio de un inmueble viene del valor que cuesta cada metro cuadrado.
		//Por lo tanto,para determinar el precio total, hay que mutiplicar el valor por metro cuadrado
		//para cada uno de los metros cuadrados.
		precio = Valor*Área;
		return precio;
	}
	
	//Muestra los datos.
	
	public void mostrar() {
		System.out.println("Identificador inmibiliario: " + IdentificadorInmobiliario);
		System.out.println("Área: " + Área + " metros cuadrados");
		System.out.println("Dirección: " + Dirección);
		System.out.println("Precio: " + precio + " dolares");
	}
}
