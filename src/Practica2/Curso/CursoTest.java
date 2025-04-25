package Practica2.Curso;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {
    private Curso curso;
    private Instructor instructor;
    private Modulo modulo1;
    private Modulo modulo2;

    @BeforeEach
    void setUp() {
        this.instructor = new Instructor("Juan Pedro Escapil", "Programacion");
        this.curso = new Curso("Introduccion a Java", this.instructor);

        Recurso recurso1 = new Recurso("Video 1", "url_video1");
        Recurso recurso2 = new Recurso("PDF 1", "url_pdf1");

        this.modulo1 = new Modulo("Modulo 1", 60, recurso1); // 60 minutos
        this.modulo2 = new Modulo("Modulo 2", 90, recurso2); // 90 minutos
    }

    @Test
    void constructorYGettersBasicos() {
        assertEquals("Introduccion a Java", this.curso.getNombre());
        assertEquals(this.instructor, this.curso.getInstructor());
        assertNotNull(this.curso.getModulos());
        assertTrue(this.curso.getModulos().isEmpty());
    }

    @Test
    void agregarModulo() {
        this.curso.agregarModulo(this.modulo1);
        assertEquals(1, this.curso.getModulos().size());
        assertTrue(this.curso.getModulos().contains(this.modulo1));

        this.curso.agregarModulo(this.modulo2);
        assertEquals(2, this.curso.getModulos().size());
        assertTrue(this.curso.getModulos().contains(this.modulo2));
    }

    @Test
    void calcularDuracionTotal() {
        this.curso.agregarModulo(this.modulo1);
        this.curso.agregarModulo(this.modulo2);

        assertEquals(150, this.curso.calcularDuracionTotal());
    }

}