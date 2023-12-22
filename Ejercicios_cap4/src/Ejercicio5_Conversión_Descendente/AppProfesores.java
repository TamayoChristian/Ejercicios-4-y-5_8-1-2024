package Ejercicio5_Conversión_Descendente;

public class AppProfesores {

	public static void main(String[] args) {
		/*
		 * El siguiente codigo no se compila porque se está tratando de instanciar un 
		 * objeto de tipo ProfesorTitular como si fuese uno de tipo Profesor, lo cual 
		 * no es posible porque no se puede instanciar un objeto de una clase hija como 
		 * si fuese de su clase padre.
		 */
		//ProfesorTitular profesortitular = new Profesor();
		
		
		/*
		 * La opción correcta es hacerlo al revez, intanciar el objeto de tipo Profesor 
		 * como si fuese un profesor titular,
		 */
		Profesor profesortitular = new ProfesorTitular();
		profesortitular.mostrar();
	}
}
