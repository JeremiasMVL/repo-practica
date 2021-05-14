package isi.died.parcial01.ejercicio01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Se necesita implementar la aplicaci�n RRHH que tiene un m�todo que recibe una lista de empleados 
 * y retorna una lista de recibos de sueldo. 
 * El recibo de sueldo tiene un numero, un mes al que pertenece, y el total del pago, 
 * y un puntero al empleado que lo recibe.

Crear las clases que considere necesarias para resolver este problema 
y crear una clase de test unitario para probar el m�todo que genera un recibo de sueldo 
y escribir un test para dicha clase.
 *
 */

public class RRHH {

	
	public RRHH() {
	}
	
	public class ReciboSueldo{
		
		private Integer numero;
		private Integer mes;
		private Double totalPago;
		private Empleado empleado;
	
	
	public ReciboSueldo(Integer n, Integer m, Double t, Empleado e){
		numero = n;
		mes = m;
		totalPago = t;
		empleado = e;
	}
	
	public List<ReciboSueldo> recibos(ArrayList<Empleado> listaEmpleados){
		
		List<ReciboSueldo> listaRecibos = new ArrayList<ReciboSueldo>();
		int i = 0;
		LocalDate hoy = LocalDate.now();
		
		for(Empleado e:listaEmpleados) {
			ReciboSueldo r = new ReciboSueldo(i, hoy.getMonthValue(), e.sueldo(), e);
			listaRecibos.add(r);
			i++;
		}
		return listaRecibos;
		
	}
	
	}
	
	
}
