package Ejercicio6_Diferencias_entre_agregación_y_composición;

import java.util.ArrayList;

public class EquipoDeFútbol {
	//Atributos
	public String Nombre, País;
	private Portero portero;
	public ArrayList<Defensas> defensas;
	public ArrayList<Mediocampos> mediocampos;
	public ArrayList<Delanteros> delanteros;
	private Técnicos técnicos;

	//Constructores
	public EquipoDeFútbol(String nombre, String país) {
		super();
		Nombre = nombre;
		País = país;
	}
	
	public EquipoDeFútbol(Portero portero, ArrayList<Defensas> defensas, 
			ArrayList<Mediocampos> mediocampos, ArrayList<Delanteros> delanteros, Técnicos técnicos) {
		this.portero = portero;
		this.defensas = new ArrayList<Defensas>();
		this.mediocampos = new ArrayList<Mediocampos>();
		this.delanteros = new ArrayList<Delanteros>();
		this.técnicos = técnicos;
	}
	
	//Getters and setters
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getPaís() {
		return País;
	}

	public void setPaís(String país) {
		País = país;
	}

	public Portero getPortero() {
		return portero;
	}

	public void setPortero(Portero portero) {
		this.portero = portero;
	}

	public ArrayList<Defensas> getDefensas() {
		return defensas;
	}

	public void setDefensas(ArrayList<Defensas> defensas) {
		this.defensas = defensas;
	}

	public ArrayList<Mediocampos> getMediocampos() {
		return mediocampos;
	}

	public void setMediocampos(ArrayList<Mediocampos> mediocampos) {
		this.mediocampos = mediocampos;
	}

	public ArrayList<Delanteros> getDelanteros() {
		return delanteros;
	}

	public void setDelanteros(ArrayList<Delanteros> delanteros) {
		this.delanteros = delanteros;
	}

	public Técnicos getTécnicos() {
		return técnicos;
	}

	public void setTécnicos(Técnicos técnicos) {
		this.técnicos = técnicos;
	}

	//Método imprimir
	public void Imprimir() {
		System.out.println("Nombre del equipo: " + Nombre);
		System.out.println("País: " + País);
		System.out.println();
		System.out.println("--------------------------------------------");
		
		System.out.println();
		System.out.println("Tecnico: \n" +"Nombre: " +técnicos.Nombre + "\nApellido: " + 
		técnicos.Apellido + "\nAños de Experiencia: " + técnicos.Años_de_Experiencia
		+ "\n¿Es nacional?: " + técnicos.nacionalidad);
		System.out.println();
		
		System.out.println("--------------------------------------------");
		System.out.println();
		System.out.println("Portero:" + "\nNombre: "+portero.Nombre + "\nApellido: " +
		portero.Apellido + "\nEdad: " + portero.Edad + 
		"\nGoles Recibidos: " + portero.Edad);
		System.out.println("¿Es titular?: " + portero.Titularidad);
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();
		
		System.out.println("Defensas: ");
		for(int p = 0; p < defensas.size(); p++) {
			System.out.println();
			System.out.println("Nombre: "+ defensas.get(p).Nombre + "\nApellido: " + 
		defensas.get(p).Apellido + "\nEdad: " + defensas.get(p).Edad);
			System.out.println("¿Es titular?: " + defensas.get(p).Titularidad);
			System.out.println();
		}
		System.out.println("--------------------------------------------");
		System.out.println();
		System.out.println("Mediocampistas: ");
		for(int a = 0; a < mediocampos.size(); a++) {
			System.out.println();
			System.out.println("Nombre: "+ mediocampos.get(a).Nombre);
			System.out.println("Apellidos: " + mediocampos.get(a).Apellido);
			System.out.println("Edad: "+mediocampos.get(a).Edad);
			System.out.println("Asistencias: " + mediocampos.get(a).Número_de_Asistencias);
			System.out.println("¿Es titular?: " + mediocampos.get(a).Titularidad);
			System.out.println();
		}
		System.out.println("--------------------------------------------");
		
		System.out.println();
		System.out.println("Delanteros: ");
		for(int l = 0; l < delanteros.size(); l++) {
			System.out.println();
			System.out.println("Nombre: "+delanteros.get(l).Nombre);
			System.out.println("Apellido: "+delanteros.get(l).Apellido);
			System.out.println("Edad: "+delanteros.get(l).Edad);
			System.out.println("Goles: "+delanteros.get(l).Goles_Anotados);
			System.out.println("¿Es titular?: " + delanteros.get(l).Titularidad);
			System.out.println();
		}
	}
}
