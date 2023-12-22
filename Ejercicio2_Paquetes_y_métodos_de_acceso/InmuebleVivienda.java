package Ejercicio2_Paquetes_y_métodos_de_acceso;

public class InmuebleVivienda extends Inmuebles{

	protected int NúmeroDeHabitaciones;
	protected int NúmeroDeBaños;
	
	//Constructor
	public InmuebleVivienda(int identificadorInmobiliario, int área, String dirección, 
			int NúmeroDeHabitaciones, int NúmeroDeBaños) {
		
		super(identificadorInmobiliario, área, dirección);
		this.NúmeroDeHabitaciones = NúmeroDeHabitaciones;
		this.NúmeroDeBaños = NúmeroDeBaños;
	}
	
	//Mostrar datos en pantalla
	public void mostrar() {
		System.out.println("Identificador inmibiliario: " + IdentificadorInmobiliario);
		System.out.println("Área: " + Área + " metros cuadrados");
		System.out.println("Dirección: " + Dirección);
		System.out.println("Precio: " + precio + " dolares");
		System.out.println("Número de Habotaciones: " + NúmeroDeHabitaciones);
		System.out.println("Número de baños: " + NúmeroDeBaños);
	}
}
