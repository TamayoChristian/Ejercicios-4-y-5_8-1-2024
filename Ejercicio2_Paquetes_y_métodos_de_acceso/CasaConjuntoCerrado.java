package Ejercicio2_Paquetes_y_métodos_de_acceso;

public class CasaConjuntoCerrado extends CasaUrbana{
	protected static double Valor = 2500000;
	protected int ValorDeAdministración;
	protected boolean HayPiscina;
	protected boolean HayCampoDeportivo;
	
	public CasaConjuntoCerrado(int identificadorInmobiliario, int área, String dirección, int NúmeroDeHabitaciones,
			int NúmeroDeBaños, int NúmeroDePisos, int valorDeAdministración, boolean hayPiscina,
			boolean hayCampoDeportivo) {
		super(identificadorInmobiliario, área, dirección, NúmeroDeHabitaciones, NúmeroDeBaños, NúmeroDePisos);
		this.ValorDeAdministración = valorDeAdministración;
		this.HayPiscina = hayPiscina;
		this.HayCampoDeportivo = hayCampoDeportivo;
	}
	
	public void mostar() {
		super.mostar();
		System.out.println("El valor de la adminsitración es: " + ValorDeAdministración);
		
		if(HayPiscina) {
			System.out.println("¿Tiene una piscina?: " + "Si hay piscina");
		} else {
			System.out.println("¿Tiene una piscina?: " + "No hay piscina");
		}
		
		if(HayCampoDeportivo) {
			System.out.println("¿Tiene campos deportivos?: " + "Si hay campo");
		} else {
			System.out.println("¿Tiene campos deportivos?: " + "No hay campo");
		}
		
	}
}
