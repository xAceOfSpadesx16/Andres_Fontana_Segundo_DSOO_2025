package Biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutorTest {
    private Autor autor;

    @BeforeEach
    void setUp() {
        this.autor = new Autor("Gabriel Garcia Marquez", "Colombiano");
    }

    @Test
    void constructorYGetters() {
        assertEquals("Gabriel Garcia Marquez", this.autor.getNombre());
        assertEquals("Colombiano", this.autor.getNacionalidad());
    }

    @Test
    void setNombre() {
        this.autor.setNombre("Julio Cortazar");
        assertEquals("Julio Cortazar", this.autor.getNombre());
    }

    @Test
    void setNacionalidad() {
        this.autor.setNacionalidad("Argentino");
        assertEquals("Argentino", this.autor.getNacionalidad());
    }
}