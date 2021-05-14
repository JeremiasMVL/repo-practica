package isi.died.parcial01.ejercicio01;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * EnConvenio: son empleados efectivos que se encuentran en alg�n
 *  convenio gremial con el sindicato asociado por el tipo de actividad
 *   que desempe�a el empleado.
 *   
 *   Adem�s de los empleados en convenio, se registra la antig�edad en a�os, 
 *   que es un valor entero, entre 0 y 40 y un valor numerico con el sueldo b�sico.
 *   
 *   Los empleados perciben un sueldo diferente seg�n su condici�n:

	EnConvenio: cobran el b�sico m�s el 30% total de cada venta en la que participo. 
	A este monto total se le descuenta el 11% de jubilacion y el 3% de obra social
	Adem�s para todos los empleados si el mes actual es el mes del cumplea�os 
 * se les paga un bono de del 50% extra de lo que le corresponde cobrar
*/
public class EnConvenio extends Empleado{
	private Integer antiguedad; 
	private Integer sueldoBasico;  
	
	
	public EnConvenio(String c, String n, LocalDate f, String e, ArrayList<Venta> v, Integer a, Integer s) {
		super(); //?
		cuil = c; //?
		nombre = n;
		fechaNacimiento = f;
		email = e;
		ventas = v;
		this.antiguedad = a;
		this.sueldoBasico = s;
	}
	
	
	public Integer getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}


	public Integer getSueldoBasico() {
		return sueldoBasico;
	}


	public void setSueldoBasico(Integer sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}


	@Override
	
	public Double sueldo(){
		LocalDate hoy = LocalDate.now();
		Double totalSueldo = 0.0;
		Double totalVentas = 0.0;
		for(Venta v:ventas) {
			totalVentas += v.getMontoTotal();
		}
		totalSueldo = (sueldoBasico + 0.3*totalVentas)*((1-0.11)+(1-0.03));
		if(hoy.getMonthValue() == fechaNacimiento.getMonthValue())
			totalVentas += totalVentas*0.5;
		return totalSueldo;
			
	}

}
