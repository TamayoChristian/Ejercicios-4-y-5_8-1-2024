package Ejercicio2_Paquetes_y_métodos_de_acceso;


public class AppInmuebles {


	//Clase Main
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//Apartamento Familiar
		ApartamentoFamiliar apartamentofamiliar = new ApartamentoFamiliar(10367, 120, 
				"Avenida Santander 45-45", 3, 2, 200000);
		System.out.println("Datos del apartamento");
		apartamentofamiliar.CalcularPrecio(apartamentofamiliar.Valor);
		apartamentofamiliar.mostrar();
		
		//Casa con conjunto
		System.out.println("-------------------------------------------");
		CasaConjuntoCerrado casaconjuntocerrado = new CasaConjuntoCerrado(1039, 40, "Avenida Siempre viva", 6, 
				2, 2, 23, false, false);
		System.out.println("Datos de la casa");
		casaconjuntocerrado.CalcularPrecio(casaconjuntocerrado.Valor);
		casaconjuntocerrado.mostar();
		
		//Casa Independiente
		System.out.println("-------------------------------------------");
		CasaIndependiente casaindependiente = new CasaIndependiente(1203, 40, "Calle Colón entro Olmedo y "
				+ "salinas", 9, 3, 2);
		casaindependiente.CalcularPrecio(casaindependiente.valorArea);
		casaindependiente.mostar();
		
		//Casa Rural
		System.out.println("-------------------------------------------");
		System.out.println("Casa Rural");
		CasaRural casarural = new CasaRural(1932, 50, "México y Salínas", 10, 1, 2, 40, 1923);
		casarural.CalcularPrecio(casarural.Valor);
		casarural.mostar();
		
		//Local Comercial
		System.out.println("-------------------------------------------");
		System.out.println("Local Comercial");
		LocalComercial localcomercial = new LocalComercial(30231, 8, "Las Palmas", Local.clase.Interno, 
				"Mall del Norte");
		localcomercial.CalcularPrecio(localcomercial.Valor);
		localcomercial.mostar();
		
		//Oficina
		System.out.println("-------------------------------------------");
		System.out.println("Oficina");
		Oficina oficina = new Oficina(3293, 33, "Avenida Nueva Esperanza", Local.clase.Interno, false);
		oficina.CalcularPrecio(oficina.Valor);
		oficina.mostrar();
	}
}
