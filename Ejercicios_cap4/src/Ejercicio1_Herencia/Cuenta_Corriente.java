package Ejercicio1_Herencia;

public class Cuenta_Corriente extends Cuenta{

	//atributos
	private float Sobregiros = 0;
	public Cuenta_Corriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
	}
	@Override
	public void retirar(float cantidad) {
		/*
		 * Si el valor a retirar supera al saldo, 
		 * entonces este pasa a ser el sobregiro
		 */
		float Resultado = saldo - cantidad;
		if (Resultado < 0) {
			Sobregiros -= Resultado;
			saldo = 0;
		} else {
			super.retirar(cantidad);			
		}
	}
	
	@Override
	public void consignar(float cantidad) {
		/*
		 * Si Existe un sobregiro entonces comprobamos si el valor que se 
		 * desea ingresar es capaz de cubrir el sobregiro.
		 * Si no lo es, entoneces se resta del sobregiro la cantidad ingresada
		 * Si es capaz de cubrirlo, entonces se ingresará el dinero menos la parte que
		 * cubre el sobregiro.
		 */
		if(Sobregiros>0) {
			float resta = Sobregiros-cantidad;
			if (resta<0) {
				Sobregiros-=resta;
				saldo = 0;
			}
			else {
				Sobregiros = 0;
				saldo=resta;
			}
		}
		else {
			super.consignar(cantidad);
		}
	}
	@Override
	public void Extracto() {
		super.Extracto();
	}
	
	public void Imprimir() {
		System.out.println("Saldo: " + saldo + " Dolares");
		System.out.println("Comisión mensual: " + ComMensual + " Dolares");
		int NumTransacciones = NumConsignaciones + NumRetiros;
		System.out.println("Número de transacciones: " + NumTransacciones);
		System.out.println("Valor del sobregiro: " + Sobregiros + " Dolares");
	}
}
