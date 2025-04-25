package Practica2.Curso;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EstudianteTest {
    private Estudiante estudiante;

    @BeforeEach
    void setUp() {
        this.estudiante = new Estudiante(1, "Maria Gomez", "maria@example.com");
    }

    @Test
    void constructorCreaInstancia() {
        assertNotNull(this.estudiante);
    }

    @Test
    void constructorAsignaIdEstudiante() {
        assertEquals(1, this.estudiante.getIdEstudiante());
    }

    @Test
    void constructorAsignaNombre() {
        assertEquals("Maria Gomez", this.estudiante.getNombre());
    }

    @Test
    void constructorAsignaEmail() {
        assertEquals("maria@example.com", this.estudiante.getEmail());
    }

    @Test
    void getNombre() {
        assertEquals("Maria Gomez", this.estudiante.getNombre());
    }

}