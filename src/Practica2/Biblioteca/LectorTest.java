package Practica2.Biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LectorTest {
    private Lector lector;

    @BeforeEach
    void setUp() {
        this.lector = new Lector(1, "Maria Gomez", "Calle secundaria 789");
    }

    @Test
    void constructorYGetters() {
        assertEquals(1, this.lector.getNumeroSocio());
        assertEquals("Maria Gomez", this.lector.getNombre());
        assertEquals("Calle secundaria 789", this.lector.getDireccion());
    }

    @Test
    void setNumeroSocio() {
        this.lector.setNumeroSocio(2);
        assertEquals(2, this.lector.getNumeroSocio());
    }

    @Test
    void setNombre() {
        this.lector.setNombre("Pedro Lopez");
        assertEquals("Pedro Lopez", this.lector.getNombre());
    }

    @Test
    void setDireccion() {
        this.lector.setDireccion("Avenida terciaria 101");
        assertEquals("Avenida terciaria 101", this.lector.getDireccion());
    }
}