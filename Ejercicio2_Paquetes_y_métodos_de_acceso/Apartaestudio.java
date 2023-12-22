package Ejercicio2_Paquetes_y_métodos_de_acceso;

public class Apartaestudio extends Apartamento{

	protected static double Valor = 1500000;
	
	public Apartaestudio(int identificadorInmobiliario, int área, String dirección, int NúmeroDeHabitaciones,
			int NúmeroDeBaños) {
		super(identificadorInmobiliario, área, dirección, NúmeroDeHabitaciones, NúmeroDeBaños);

	}
	
	public void mostrar() {
		super.mostrar();
	}
}