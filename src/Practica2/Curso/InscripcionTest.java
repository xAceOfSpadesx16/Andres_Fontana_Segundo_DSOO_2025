package Practica2.Curso;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {
    private Inscripcion inscripcion;
    private Estudiante estudiante;
    private Curso curso;
    private LocalDate fechaInscripcion;

    @BeforeEach
    void setUp() {
        this.estudiante = new Estudiante(1, "Maria Gomez", "maria@example.com");
        Instructor instructor = new Instructor("Juan Pedro Escapil", "Programacion");
        this.curso = new Curso("Introduccion a Java", instructor);
        this.fechaInscripcion = LocalDate.of(2023, 10, 1);
        this.inscripcion = new Inscripcion(this.estudiante, this.curso, this.fechaInscripcion);
    }

    @Test
    void constructorCreaInstancia() {
        assertNotNull(this.inscripcion);
    }

    @Test
    void constructorAsignaEstudiante() {
        assertEquals(this.estudiante, this.inscripcion.getEstudiante());
    }

    @Test
    void constructorAsignaCurso() {
        assertEquals(this.curso, this.inscripcion.getCurso());
    }

    @Test
    void constructorAsignaFechaInscripcion() {
        assertEquals(this.fechaInscripcion, this.inscripcion.getFechaInscripcion());
    }

}