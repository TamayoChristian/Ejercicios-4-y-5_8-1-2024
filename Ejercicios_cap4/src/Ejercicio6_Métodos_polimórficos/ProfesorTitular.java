package Ejercicio6_Métodos_polimórficos;

public class ProfesorTitular extends Profesor{
	//Atributos
	int años = 0;
	
	//Metodo imprimir
	protected void imprimir() {
		System.out.println("Es un profesor titular");
	}
	
	protected void imprimirAños() {
		System.out.println("Años = " + años);
	}
}
