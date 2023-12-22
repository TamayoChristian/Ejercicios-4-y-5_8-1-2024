package Ejercicio2_Paquetes_y_métodos_de_acceso;

public class CasaIndependiente extends CasaUrbana{
	
	protected static double valorArea = 3000000;
	
	public CasaIndependiente(int identificadorInmobiliario, int área, String dirección, int NúmeroDeHabitaciones,
			int NúmeroDeBaños, int NúmeroDePisos) {
		super(identificadorInmobiliario, área, dirección, NúmeroDeHabitaciones, NúmeroDeBaños, NúmeroDePisos);
	}

	public void mostar() {
		super.mostar();
	}
}
