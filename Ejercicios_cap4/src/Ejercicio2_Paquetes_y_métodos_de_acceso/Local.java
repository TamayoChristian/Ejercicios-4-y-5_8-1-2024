package Ejercicio2_Paquetes_y_métodos_de_acceso;

public class Local extends Inmuebles{

	//Este enum es para indicar que hay dos tipos de locales, los Locales internos y los locales que 
	//estan en la calle.
	enum clase{Interno,DeCalle};
	//Este atributo nos dice el tipo de local que es.
	protected clase ClaseLocal;
	
	public Local(int identificadorInmobiliario, int área, String dirección, clase ClaseLocal) {
		super(identificadorInmobiliario, área, dirección);
		this.ClaseLocal=ClaseLocal;
	}
	public void mostrar() {
		super.mostrar();
		System.out.println("Tipo de local: " + ClaseLocal);
	}
}
