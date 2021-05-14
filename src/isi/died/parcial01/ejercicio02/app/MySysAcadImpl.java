package isi.died.parcial01.ejercicio02.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import isi.died.parcial01.ejercicio02.db.BaseDeDatos;
import isi.died.parcial01.ejercicio02.db.BaseDeDatosExcepcion;
import isi.died.parcial01.ejercicio02.dominio.*;


public class MySysAcadImpl implements MySysAcad {
	private static final BaseDeDatos DB = new BaseDeDatos();


	private List<Materia> materia = new ArrayList<Materia>();
	
	@Override
	public void registrarMateria(Materia d) {
		this.materia.add(d);
	}
	
	private List<Docente> docentes = new ArrayList<Docente>();
	
	@Override
	public void registrarDocente(Docente d) {
		this.docentes.add(d);
	}
	
	private List<Alumno> alumnos = new ArrayList<Alumno>();
	
	@Override
	public void registrarAlumnos(Alumno d) {
		this.alumnos.add(d);
	}
	

	@Override
	public void inscribirAlumnoCursada(Docente d, Alumno a, Materia m, Integer cicloLectivo) throws noSePudoGuardarInscripcionException, noTieneAprobadaCorrelativaException {
		List<Materia> correlativas = m.getCorrelativasRendir();
		List<Materia> aprobadas = new ArrayList<Materia>();
		
		aprobadas = a.getExamenes()
				.stream()
				.filter(e -> e.getNota() > 6)
				.map(e -> e.getMateria())
				.collect(Collectors.toList());
		for(Materia mc:correlativas) {
			if(aprobadas.contains(mc))
				throw new noTieneAprobadaCorrelativaException();
		}
		
		Inscripcion insc = new Inscripcion(cicloLectivo,Inscripcion.Estado.CURSANDO);
		d.agregarInscripcion(insc);
		a.addCursada(insc);
		m.addInscripcion(insc);
		
		try {
			DB.guardar(insc);
		} catch(BaseDeDatosExcepcion e) {
			throw new noSePudoGuardarInscripcionException();
		}
	
	}

	@Override
	public void inscribirAlumnoExamen(Docente d, Alumno a, Materia m) {
		Examen e = new Examen();
		a.addExamen(e);
		d.agregarExamen(e);
		m.addExamen(e);
		// DESCOMENTAR Y gestionar excepcion
		// DB.guardar(e);
	}
	
	//NO LLEGUE CON EL HORARIO para Pregunta 3 del cuestionario
	
	public void registrarNota(Examen e, Integer n) {
		e.setNota(n);
		
		if(n>=6) {
			//HACER HACER
			//busco ultima
			
			.sort())
		}
		
	public List<Examen> topNExamenes(Materia m, Integer n)
		
	}

}
