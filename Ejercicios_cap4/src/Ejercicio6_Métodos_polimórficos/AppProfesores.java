package Ejercicio6_Métodos_polimórficos;

public class AppProfesores {
	public static void main(String[] args) {
		Profesor profesor= new ProfesorTitular();
		//Este comando no se compila porque el objeto profesor no tiene el metodo imprimirAños()
		//profesor.imprimirAños();
		
		//Intrucción correcta
		ProfesorTitular profesorTitular = (ProfesorTitular) profesor; //Creamos un objeto tipo Profesortirular
		//que copia los atributos de profesor y añade el metodo imprimirAños()
		profesorTitular.imprimirAños();
	}
}
