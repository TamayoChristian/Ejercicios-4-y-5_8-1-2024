package Ejercicio10_Interfaces;
/*
 * Las ballenas son mamíferos e implementan el método abstracto heredado, la pantalla 
 * muestra un mensaje indicando que ellas amamantan a sus crías.
 */
public class Ballenas extends Mamifero{

	@Override
	public void Amamantar() {
		System.out.println("Las ballenas amamantan a sus crias");
	}

}
