package Practica2.Curso;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ModuloConVideoTest {
    private ModuloConVideo moduloConVideo;
    private Recurso recurso;

    @BeforeEach
    void setUp() {
        this.recurso = new Recurso("Video Principal", "http://ejemplo.com/video_main");
        this.moduloConVideo = new ModuloConVideo("Tema con Video", 75, this.recurso, "http://ejemplo.com/urlvideo");
    }

    @Test
    void constructorCreaInstancia() {
        assertNotNull(this.moduloConVideo);
    }

    @Test
    void constructorAsignaTitulo() {
        assertEquals("Tema con Video", this.moduloConVideo.getTitulo());
    }

    @Test
    void constructorAsignaDuracion() {
        assertEquals(75, this.moduloConVideo.getDuracion());
    }

    @Test
    void constructorAsignaRecurso() {
        assertEquals(this.recurso, this.moduloConVideo.getRecurso());
    }

    @Test
    void constructorAsignaUrlVideo() {
        assertEquals("http://ejemplo.com/urlvideo", this.moduloConVideo.getUrlVideo());
    }

}