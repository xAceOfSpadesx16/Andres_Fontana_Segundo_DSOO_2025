package Practica2.Curso;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecursoTest {
    private Recurso recurso;

    @BeforeEach
    void setUp() {
        this.recurso = new Recurso("Video Intro", "http://ejemplo.com/video");
    }

    @Test
    void constructorCreaInstancia() {
        assertNotNull(this.recurso);
    }

    @Test
    void constructorAsignaNombre() {
        assertEquals("Video Intro", this.recurso.getNombre());
    }

    @Test
    void constructorAsignaUrl() {
        assertEquals("http://ejemplo.com/video", this.recurso.getUrl());
    }

}