package Ejercicio4_Composición_múltiple;

import Ejercicio4_Composición_múltiple.Carrocería.tipoCarrocería;
import Ejercicio4_Composición_múltiple.Chasis.tipoChasis;

public class AppCarro {

	public static void main(String[] args) {
		Carro carro = new Carro(2, tipoChasis.Monocasco, "Rojo", 
				tipoCarrocería.Tubular, "Goodyear", 25, 20, 15);
		
		carro.Imprimir();

	}

}
