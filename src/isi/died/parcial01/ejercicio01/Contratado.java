package isi.died.parcial01.ejercicio01;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * 
 * Contratado: son empleados que se contratan por un período 
 * de tiempo determinado y con los que se acuerda una remuneración 
 * en función de las horas trabajadas y de un costo por hora.
 * 
 * Y de los empleados contratados se conoce el total de horas 
 * que trabajo en el mes y el costo por hora.
 *
 *Los empleados perciben un sueldo diferente según su condición:


Contratado: cobran el producto del costo hora por las horas trabajadas, 
más el equivalente al valor de 5 horas trabajadas por cada venta en la que participó 
si el total de las ventas en que participo superan el objetivo de ventas. Es decir si el objetivo de ventas es 20.000 y registro 5 ventas de 5000, entonces vendió 25000, el objetivo ha sido superado, por lo que se multiplica el valor de 5 horas trabajadas * 5 ventas. 
Si no alcanza el valor minimo no suma nada
 */
public class Contratado extends Empleado{
	private Integer horasMes;
	private Double costoPorHora;
	private Integer objetivoVentas;
	
	public Contratado(String c, String n, LocalDate f, String e, ArrayList<Venta> v, Integer h, Double cph) {
		super(); 
		cuil = c;
		nombre = n;
		fechaNacimiento = f;
		email = e;
		ventas = v;
		this.horasMes = h;
		this.costoPorHora = cph;
	}
	
	
	
	public Integer getHorasMes() {
		return horasMes;
	}

	public void setHorasMes(Integer horasMes) {
		this.horasMes = horasMes;
	}

	public Double getCostoPorHora() {
		return costoPorHora;
	}

	public void setCostoPorHora(Double costoPorHora) {
		this.costoPorHora = costoPorHora;
	}

	public Integer getObjetivoVentas() {
		return objetivoVentas;
	}

	public void setObjetivoVentas(Integer objetivoVentas) {
		this.objetivoVentas = objetivoVentas;
	}


	@Override
	
	public Double sueldo(){
		LocalDate hoy = LocalDate.now();
		Double totalVentas = 0.0;
		Double totalSueldo = 0.0;
		totalSueldo = costoPorHora*horasMes;
		for(Venta v:ventas) {
			totalVentas += v.getMontoTotal();
		}
		if(totalVentas>objetivoVentas)
			totalSueldo += (5*costoPorHora)*(ventas.size());

		if(hoy.getMonthValue() == fechaNacimiento.getMonthValue())
			totalVentas += totalVentas*0.5;
		
		return totalSueldo;
			
	}

}
