package Ejercicio4_Polimorfismo;

public class AppProfesor {

	public static void main(String[] args) {
		//Se crea un objeto tipo profesor y se la ininicializa como si fuese un profesor titular
		Profesor profesor = new ProfesorTitular();
		profesor.Imprimir();//Al ser instanciada como un profesor titular, heredará sus metodos
		//por lo tanto va imprimir "Es un profesor Titular"
	}

}
