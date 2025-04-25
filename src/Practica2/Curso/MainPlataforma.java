package Practica2.Curso;

import java.time.LocalDate;
import java.util.List;

public class MainPlataforma {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma("Platzi");

        Instructor instructor = new Instructor("Andres Perez", "Desarrollo Web");
        Recurso recurso = new Recurso("Introduccion", "www.ejemplo.com");
        Modulo modulo1 = new Modulo("HTML Basico", 2, recurso);
        ModuloConVideo moduloConVideo = new ModuloConVideo("CSS Avanzado", 3, recurso, "www.video.com");
        Curso curso = new Curso("Desarrollo Web", instructor);
        curso.agregarModulo(modulo1);
        curso.agregarModulo(moduloConVideo);

        plataforma.agregarCurso(curso);

        Estudiante estudiante = new Estudiante(1, "Ana Rodriguez", "ana@ejemplo.com");
        plataforma.registrarEstudiante(estudiante);

        Inscripcion inscripcion = new Inscripcion(estudiante, curso, LocalDate.of(2023, 10, 1));
        plataforma.inscribirEstudiante(inscripcion);

        System.out.println("Cursos de " + estudiante.getNombre() + ": " + plataforma.obtenerCursosPorEstudiante(estudiante));
    }
}