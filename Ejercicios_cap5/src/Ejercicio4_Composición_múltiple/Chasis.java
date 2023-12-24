package Ejercicio4_Composición_múltiple;

public class Chasis {
	//Atributos
	enum tipoChasis{Independiente,Monocasco};
	tipoChasis tipo_del_chasis;
	
	//Constructor
	public Chasis(tipoChasis tipo_del_chasis) {
		super();
		this.tipo_del_chasis = tipo_del_chasis;
	}
	
	//Getter and setter
	public tipoChasis getTipo_del_chasis() {
		return tipo_del_chasis;
	}
	public void setTipo_del_chasis(tipoChasis tipo_del_chasis) {
		this.tipo_del_chasis = tipo_del_chasis;
	}
	
	//Método imprimir
	public void Imprimir() {
		System.out.println("Chasis");
		System.out.println("Tipo: " + tipo_del_chasis);
	}
}
