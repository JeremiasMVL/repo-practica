package isi.died.parcial01.ejercicio02.app;

public class noTieneAprobadaCorrelativaException extends Exception {
	
	public noTieneAprobadaCorrelativaException() {
		super("El alumno no tienes las correaltivas aprobadas para poder inscribirse a esta materia");
	}

}
