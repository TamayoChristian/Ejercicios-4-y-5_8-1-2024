package Ejercicio2_Paquetes_y_métodos_de_acceso;

public class Apartamento extends InmuebleVivienda{

	//Constructor
	public Apartamento(int identificadorInmobiliario, int área, String dirección, 
			int NúmeroDeHabitaciones, int NúmeroDeBaños) {
		
		super(identificadorInmobiliario, área, dirección, NúmeroDeHabitaciones, NúmeroDeBaños);
	}
	public void mostrar() {
		super.mostrar();
	}
}
