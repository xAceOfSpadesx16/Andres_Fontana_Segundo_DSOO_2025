package Practica2.Curso;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ModuloTest {
    private Modulo modulo;
    private Recurso recurso;

    @BeforeEach
    void setUp() {
        this.recurso = new Recurso("Presentacion", "http://ejemplo.com/slides");
        this.modulo = new Modulo("Conceptos Basicos", 45, this.recurso);
    }

    @Test
    void constructorCreaInstancia() {
        assertNotNull(this.modulo);
    }

    @Test
    void constructorAsignaTitulo() {
        assertEquals("Conceptos Basicos", this.modulo.getTitulo());
    }

    @Test
    void constructorAsignaDuracion() {
        assertEquals(45, this.modulo.getDuracion());
    }

    @Test
    void constructorAsignaRecurso() {
        assertEquals(this.recurso, this.modulo.getRecurso());
    }

}