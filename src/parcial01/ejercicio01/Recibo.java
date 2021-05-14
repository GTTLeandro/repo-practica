package parcial01.ejercicio01;

import java.time.LocalDate;

public class Recibo {
	private int numero;
	private LocalDate fecha;
	private double total;
	private Empleado empleado;
	
	
	public Recibo(int numero, LocalDate fecha, double total, Empleado empleado) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.total = total;
		this.empleado = empleado;
	}
	
	

}
