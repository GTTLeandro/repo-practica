package parcial01.ejercicio01;

import java.time.LocalDate;
import java.util.ArrayList;

import parcial01.ejercicio01.Venta.TipoV;

public class Viajante extends Empleado {
	private ArrayList<Gasto> gastos;
	private ArrayList<Venta> ventas;
	
		
	
	public double totalVtas() {
		double acum=0;
		for (Venta vent : ventas) {
					acum =acum + vent.getTotal();
				}
		return acum;
	}
	
	public double totalGastos() {
		double acum=0;
		for (Gasto g : gastos) {
					acum =acum + g.getTotal();
				}
		return acum;
	
	}
	
	public double liquidar() {
		double acum=0;
		LocalDate hoy = LocalDate.now();
		for (Venta vent : ventas) {
			if(vent.getTipo()== TipoV.AGROQ) {
				acum = acum + (vent.getTotal()*0.15);
			}else {acum = acum + (vent.getTotal()*0.25);}
		}
		if (hoy.getMonth().equals(super.fechaIng.getMonth())){		
			return ((super.sBasico + this.totalGastos() + acum)*1.5);}
		else {return (super.sBasico + this.totalGastos() + acum);}
	}
	
	
	
	
}
