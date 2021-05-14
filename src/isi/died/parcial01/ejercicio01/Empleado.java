package isi.died.parcial01.ejercicio01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * De todos los empleados se conoce su cuil que es un valor num�rico 
 * de hasta 11 digitos, su nombre, su fecha de nacimiento y su correo electr�nico. 
 * Todo empleado tambi�n puede estar relacionado a 1 o m�s ventas 
 * (por haberla vendido, por haber atendido el cliente, 
 * o por referirlo entre otras situaciones). 
 * 
 * Adem�s para todos los empleados si el mes actual es el mes del cumplea�os 
 * se les paga un bono de del 50% extra de lo que le corresponde cobrar
 * */



public abstract class Empleado {

	protected String cuil;
	protected String nombre;
	protected LocalDate fechaNacimiento; 
	protected String email;
	protected List<Venta> ventas = new ArrayList<Venta>();  
	
	public Empleado() {
		
	}
	
	public abstract Double sueldo();	
	
	
}
