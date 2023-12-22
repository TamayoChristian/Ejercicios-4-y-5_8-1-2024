package Ejercicio10_Interfaces;

public class Ornitorrinco extends Mamifero implements Oviparos{

	
	
	@Override
	public void Amamantar() {
		System.out.println("Los Ornitorrincos amamantan a sus crias");
		
	}

	@Override
	public void PonerHuevos() {
		System.out.println("Los Ornitorrincos ponen huevos");
	}

}
