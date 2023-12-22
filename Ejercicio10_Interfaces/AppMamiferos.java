package Ejercicio10_Interfaces;
/*
 * Generar un método main donde se crean una ballena y un ornitorrinco y 
 * se invocan los métodos heredados e implementados.
 */
public class AppMamiferos {

	public static void main(String[] args) {
		Ballenas ballena = new Ballenas();
		ballena.Amamantar();

		Ornitorrinco p = new Ornitorrinco();
		p.Amamantar();
		p.PonerHuevos();
	}

}
