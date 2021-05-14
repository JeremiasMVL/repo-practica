package isi.died.parcial01.ejercicio01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * De todos los empleados se conoce su cuil que es un valor numérico 
 * de hasta 11 digitos, su nombre, su fecha de nacimiento y su correo electrónico. 
 * Todo empleado también puede estar relacionado a 1 o más ventas 
 * (por haberla vendido, por haber atendido el cliente, 
 * o por referirlo entre otras situaciones). 
 * 
 * Además para todos los empleados si el mes actual es el mes del cumpleaños 
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
