package parcial01.ejercicio01;

import java.time.LocalDate;
import java.util.ArrayList;


public class Operario extends Empleado {
	private ArrayList<Viajante> viajantes;
	
	
	public double liquidar() {
		double acum=0;
		LocalDate hoy = LocalDate.now();
		for (Viajante viaj : viajantes) {
			acum = acum+viaj.totalVtas();
		}
		if (hoy.getMonth().equals(super.fechaIng.getMonth())){ 	
			return ((super.sBasico + (acum*0.2))*1.5);}
		else {return (super.sBasico + (acum*0.2));}
	}
	
	
}
