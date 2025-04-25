package Practica2.Curso;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {
    private Instructor instructor;

    @BeforeEach
    void setUp() {
        this.instructor = new Instructor("Juan Pedro Escapil", "Programacion");
    }

    @Test
    void constructorCreaInstancia() {
        assertNotNull(this.instructor);
    }

    @Test
    void constructorAsignaNombre() {
        assertEquals("Juan Pedro Escapil", this.instructor.getNombre());
    }

    @Test
    void constructorAsignaEspecialidad() {
        assertEquals("Programacion", this.instructor.getEspecialidad());
    }

}