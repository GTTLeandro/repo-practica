package parcial01.ejercicio01;

import java.time.LocalDate;


public class Venta {
	private LocalDate fecha;
	private double total;
	public enum TipoV {AGROQ, VET};
	private	TipoV tipo;
	
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public TipoV getTipo() {
		return tipo;
	}
	public void setTipo(TipoV tipo) {
		this.tipo = tipo;
	}
}
