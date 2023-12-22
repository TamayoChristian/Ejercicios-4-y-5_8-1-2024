package Ejercicio3_Invocación_implícita_de_constructor_heredado;

public class Tableta extends DispositivoInformatico{

	//Constructor
	public Tableta(String marca) {
		super(marca);
		System.out.println("Marca: " + marca);
	}
}
