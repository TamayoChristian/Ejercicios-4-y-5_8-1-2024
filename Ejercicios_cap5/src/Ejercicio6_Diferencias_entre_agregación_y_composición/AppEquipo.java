package Ejercicio6_Diferencias_entre_agregación_y_composición;

import java.util.ArrayList;

public class AppEquipo {

	public static void main(String[] args) {
		Técnicos Carlos = new Técnicos("Carlos","Queiroz", 66, 30,false);
		Portero David = new Portero("David", "Ospina", 30, true, 10);
		
		ArrayList<Defensas> defensas = new ArrayList<Defensas>();
		Defensas Yerry = new Defensas("Yerry", "Mina", 24, true);
		defensas.add(Yerry);
		Defensas Davinson = new Defensas("Davinson", "Sanchez", 23, true);
		defensas.add(Davinson);
		Defensas William = new Defensas("William", "Tesillo", 29, true);
		defensas.add(William);
		Defensas Stefan = new Defensas("Stefan","Medina",29, true);
		defensas.add(Stefan);
		
		ArrayList<Mediocampos> mediocampos = new ArrayList<Mediocampos>();
		Mediocampos Mateus = new Mediocampos("Mateus", "Uribe", 28, true, 12);
		mediocampos.add(Mateus);
		Mediocampos Wilmar = new Mediocampos("Wilmar", "Barrios", 25, true, 12);
		mediocampos.add(Wilmar);
		Mediocampos Juan = new Mediocampos("Juan Guillermo", "Cuadrado", 31, true, 10);
		mediocampos.add(Juan);
		Mediocampos James = new Mediocampos("James", "Rodríguez", 28, true, 32);
		mediocampos.add(James);
		
		ArrayList<Delanteros> delanteros = new ArrayList<Delanteros>();
		Delanteros Radamel = new Delanteros("Radamel", "Falcao", 33, true, 15);
		delanteros.add(Radamel);
		Delanteros Duván = new Delanteros("Duván", "Zapata", 28, true, 12);
		delanteros.add(Duván);
		
		EquipoDeFútbol Selección_Colombia = new EquipoDeFútbol("Selección", "Colombia");
		Selección_Colombia.setTécnicos(Carlos);
		Selección_Colombia.setPortero(David);
		Selección_Colombia.setDefensas(defensas);
		Selección_Colombia.setMediocampos(mediocampos);
		Selección_Colombia.setDelanteros(delanteros);
		Selección_Colombia.Imprimir();
	}

}
