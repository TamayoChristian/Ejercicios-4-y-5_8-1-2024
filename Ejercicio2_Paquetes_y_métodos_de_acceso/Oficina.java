package Ejercicio2_Paquetes_y_métodos_de_acceso;

public class Oficina extends Local{
	protected static double Valor= 3500000;
	protected boolean EsDelGobierno;
	
	//Constructor
	public Oficina(int identificadorInmobiliario, int área, String dirección, clase ClaseLocal, 
			boolean esDelGobierno) {
		super(identificadorInmobiliario, área, dirección, ClaseLocal);
		this.EsDelGobierno = esDelGobierno;
	}
	
	//metodo para mostar parametros
	public void mostrar() {
		super.mostrar();
		
		if(EsDelGobierno) {
			System.out.println("¿Es una oficina del gobierno?: " + "Si es del gobierno.");
		} else {
			System.out.println("¿Es una oficina del gobierno?: " + "No es del gobierno.");
		}
	}
	
}
