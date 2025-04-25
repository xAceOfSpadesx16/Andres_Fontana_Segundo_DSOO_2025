package Practica2.Curso;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlataformaTest {
    private Plataforma plataforma;
    private Curso curso1;
    private Curso curso2;
    private Estudiante estudiante1;
    private Estudiante estudiante2;
    private Inscripcion inscripcion1;
    private Inscripcion inscripcion2;
    private Inscripcion inscripcion3;

    @BeforeEach
    void setUp() {
        this.plataforma = new Plataforma("Plataforma Educativa");

        Instructor instructor = new Instructor("Juan Pedro Escapil", "Programacion");
        this.curso1 = new Curso("Introduccion a Java", instructor);
        this.curso2 = new Curso("Bases de Datos", instructor);

        this.estudiante1 = new Estudiante(1, "Maria Gomez", "maria@example.com");
        this.estudiante2 = new Estudiante(2, "Pedro Lopez", "pedro@example.com");

        this.inscripcion1 = new Inscripcion(this.estudiante1, this.curso1, LocalDate.of(2023, 10, 1));
        this.inscripcion2 = new Inscripcion(this.estudiante2, this.curso2, LocalDate.of(2023, 10, 5));
        this.inscripcion3 = new Inscripcion(this.estudiante1, this.curso2, LocalDate.of(2023, 11, 1));
    }

    @Test
    void constructorYGettersBasicos() {
        assertEquals("Plataforma Educativa", this.plataforma.getNombre());
        assertNotNull(this.plataforma.getCursos());
        assertTrue(this.plataforma.getCursos().isEmpty());
        assertNotNull(this.plataforma.getEstudiantes());
        assertTrue(this.plataforma.getEstudiantes().isEmpty());
        assertNotNull(this.plataforma.getInscripciones());
        assertTrue(this.plataforma.getInscripciones().isEmpty());
    }

    @Test
    void agregarCurso() {
        this.plataforma.agregarCurso(this.curso1);
        assertEquals(1, this.plataforma.getCursos().size());
        assertTrue(this.plataforma.getCursos().contains(this.curso1));

        this.plataforma.agregarCurso(this.curso2);
        assertEquals(2, this.plataforma.getCursos().size());
        assertTrue(this.plataforma.getCursos().contains(this.curso2));
    }

    @Test
    void registrarEstudiante() {
        this.plataforma.registrarEstudiante(this.estudiante1);
        assertEquals(1, this.plataforma.getEstudiantes().size());
        assertTrue(this.plataforma.getEstudiantes().contains(this.estudiante1));

        this.plataforma.registrarEstudiante(this.estudiante2);
        assertEquals(2, this.plataforma.getEstudiantes().size());
        assertTrue(this.plataforma.getEstudiantes().contains(this.estudiante2));
    }

    @Test
    void inscribirEstudiante() {
        this.plataforma.inscribirEstudiante(this.inscripcion1);
        assertEquals(1, this.plataforma.getInscripciones().size());
        assertTrue(this.plataforma.getInscripciones().contains(this.inscripcion1));

        this.plataforma.inscribirEstudiante(this.inscripcion2);
        assertEquals(2, this.plataforma.getInscripciones().size());
        assertTrue(this.plataforma.getInscripciones().contains(this.inscripcion2));
    }

    @Test
    void obtenerCursosPorEstudiante() {
        this.plataforma.inscribirEstudiante(this.inscripcion1);
        this.plataforma.inscribirEstudiante(this.inscripcion2);
        this.plataforma.inscribirEstudiante(this.inscripcion3);

        List<Curso> cursosEstudiante1 = this.plataforma.obtenerCursosPorEstudiante(this.estudiante1);
        assertNotNull(cursosEstudiante1);
        assertEquals(2, cursosEstudiante1.size());
        assertTrue(cursosEstudiante1.contains(this.curso1));
        assertTrue(cursosEstudiante1.contains(this.curso2));

        List<Curso> cursosEstudiante2 = this.plataforma.obtenerCursosPorEstudiante(this.estudiante2);
        assertNotNull(cursosEstudiante2);
        assertEquals(1, cursosEstudiante2.size());
        assertTrue(cursosEstudiante2.contains(this.curso2));

        Estudiante estudianteSinInscripciones = new Estudiante(3, "Ana Fernandez", "ana@example.com");
        List<Curso> cursosEstudianteSinInscripciones = this.plataforma.obtenerCursosPorEstudiante(estudianteSinInscripciones);
        assertNotNull(cursosEstudianteSinInscripciones);
        assertTrue(cursosEstudianteSinInscripciones.isEmpty());
    }

}