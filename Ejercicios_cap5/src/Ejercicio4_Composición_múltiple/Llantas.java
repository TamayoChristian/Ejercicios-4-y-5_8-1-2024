package Ejercicio4_Composición_múltiple;

public class Llantas {
	//Atributos
	public String Marca;
	public int Diametro_Del_Rin;
	public int Altura;
	public int Anchura;
	
	//Constructor
	public Llantas(String marca, int diametro_Del_Rin, int altura, int anchura) {
		super();
		Marca = marca;
		Diametro_Del_Rin = diametro_Del_Rin;
		Altura = altura;
		Anchura = anchura;
	}

	//Getters and setters
	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public int getDiametro_Del_Rin() {
		return Diametro_Del_Rin;
	}

	public void setDiametro_Del_Rin(int diametro_Del_Rin) {
		Diametro_Del_Rin = diametro_Del_Rin;
	}

	public int getAltura() {
		return Altura;
	}

	public void setAltura(int altura) {
		Altura = altura;
	}

	public int getAnchura() {
		return Anchura;
	}

	public void setAnchura(int anchura) {
		Anchura = anchura;
	}
	
	//Método Imprimir
	public void Imprimir() {
		System.out.println("Llanta");
		System.out.println("Marca: " + Marca);
		System.out.println("Diámetro del rin: " + Diametro_Del_Rin + " pulgadas");
		System.out.println("Altura: " + Altura + " pulgadas");
		System.out.println("Anchura: " + Anchura + " pulgadas");
	}
	
}
