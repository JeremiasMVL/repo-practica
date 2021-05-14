package isi.died.parcial01.ejercicio01;

import java.time.Instant;

/**
 * 
 * Una venta es simplemente una clase que tiene un numero de venta, 
 * una fecha y un monto total por el valor de la venta.
 *
 */
public class Venta {
	private Integer numero;
	private Instant fecha;
	private Double montoTotal;
	
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Instant getFecha() {
		return fecha;
	}
	public void setFecha(Instant fecha) {
		this.fecha = fecha;
	}
	public Double getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(Double montoTotal) {
		this.montoTotal = montoTotal;
	}

}
