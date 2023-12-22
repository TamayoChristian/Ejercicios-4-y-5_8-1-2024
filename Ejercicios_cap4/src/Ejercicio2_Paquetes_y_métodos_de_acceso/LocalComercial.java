package Ejercicio2_Paquetes_y_métodos_de_acceso;

public class LocalComercial extends Local{
	
	protected static double Valor = 3000000;
	protected String NombreDelCentroComercial;
	
	//Constructor
	public LocalComercial(int identificadorInmobiliario, int área, String dirección, 
			clase ClaseLocal, String NombreDelCentroComercial) {
		
		super(identificadorInmobiliario, área, dirección, ClaseLocal);
		this.NombreDelCentroComercial=NombreDelCentroComercial;
	}
	
	public void mostar() {
		super.mostrar();
		System.out.println("Nombre del centro comercial: " + NombreDelCentroComercial);
	}
}
