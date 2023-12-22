package Ejercicio2_Paquetes_y_métodos_de_acceso;

public class Casa extends InmuebleVivienda{
	
	protected int NúmeroDePisos;
	
	//Construtor
	
	public Casa(int identificadorInmobiliario, int área, String dirección, 
			int NúmeroDeHabitaciones, int NúmeroDeBaños, int NúmeroDePisos) {

		super(identificadorInmobiliario, área, dirección, NúmeroDeHabitaciones, NúmeroDeBaños);
		this.NúmeroDePisos = NúmeroDePisos;
	}
	
	public void mostar() {
		super.mostrar();
		System.out.println("Número de pisos " + NúmeroDePisos);
	}
}
