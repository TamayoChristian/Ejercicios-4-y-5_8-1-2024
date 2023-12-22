package Ejercicio2_Paquetes_y_métodos_de_acceso;

public class ApartamentoFamiliar extends Apartamento{

	protected static double Valor = 2000000;
	protected int ValorDeAdminstración;
	
	//Constructor
	public ApartamentoFamiliar(int identificadorInmobiliario, int área, String dirección, 
			int NúmeroDeHabitaciones,int NúmeroDeBaños, int ValorAdminstración) {
		super(identificadorInmobiliario, área, dirección, NúmeroDeHabitaciones, NúmeroDeBaños);
		this.ValorDeAdminstración = ValorAdminstración;
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("Valor de adminsitración = " + 
		ValorDeAdminstración + "$ dolares");
	}
}
