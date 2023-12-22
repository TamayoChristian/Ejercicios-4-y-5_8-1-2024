package Ejercicio2_Paquetes_y_métodos_de_acceso;

public class CasaRural extends Casa{
	//Atributos
	protected static double Valor; //Valor de la casa
	protected int Distancia; //Distancia de la casa a la cabecera cantonal.
	protected int altitud; //
	//Constuctor
	public CasaRural(int identificadorInmobiliario, int área, String dirección, int NúmeroDeHabitaciones,
			int NúmeroDeBaños, int NúmeroDePisos, int Distancia, int altitud) {

		super(identificadorInmobiliario, área, dirección, NúmeroDeHabitaciones, NúmeroDeBaños, NúmeroDePisos);	
		Valor=15000000;
		this.Distancia=Distancia;
		this.altitud=altitud;
	}
	
	//Metodo para mostar parametros.
	public void mostar() {
		super.mostar();
		System.out.println("Distancia a la cabecera municipal: " + 
		Distancia + " km");
		System.out.println("Altitud: " + altitud + 
				" metros sobre el nivel del mar");
	}
}
