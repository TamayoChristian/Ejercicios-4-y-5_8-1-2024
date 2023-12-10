package Ejercicio1_Herencia;

public class Cuenta_de_Ahorros extends Cuenta{
	/*
	 * Esta clase solo se activa si el saldo es mayor a $10000
	 */
	//atributo 
	private boolean EstaActiva;
	
	public boolean EstaActiva1(){
		if (saldo<10000) {
			return false;	
		}
		else {
			return true;
		}
	}
	public Cuenta_de_Ahorros(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		EstaActiva=EstaActiva1();
			
	}
	@Override
	public void consignar(float cantidad) {
	//Este metodo solo puede ser invocado si la clase está activa.
		if(EstaActiva)
			super.consignar(cantidad);
	}
	
	@Override
	public void retirar(float cantidad) {
	//Este metodo solo puede ser invcado si la clase está activa.
		if(EstaActiva)
			super.retirar(cantidad);
	}
	@Override
	public void Extracto() {
		if (NumRetiros > 4) {
			ComMensual = 1000*(NumRetiros-4);
		}
		
		if (EstaActiva)
			super.Extracto();
		
		if (saldo<10000) {
			EstaActiva = false;	
		}
		else {
			EstaActiva=true;
		}
		
	}
	public void imprimir() {
		System.out.println("Saldo: " + saldo + " Dolares");
		System.out.println("Comisión mensual: " + ComMensual + " Dolares");
		int NumTransacciones = NumConsignaciones + NumRetiros;
		System.out.println("Número de transacciones: " + NumTransacciones);
	}
}
