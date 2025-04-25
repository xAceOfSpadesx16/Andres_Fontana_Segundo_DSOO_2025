package Biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EditorialTest {
    private Editorial editorial;

    @BeforeEach
    void setUp() {
        this.editorial = new Editorial("Planeta", "Calle falsa 123");
    }

    @Test
    void constructorYGetters() {
        assertEquals("Planeta", this.editorial.getNombre());
        assertEquals("Calle falsa 123", this.editorial.getDirección());
    }

    @Test
    void setNombre() {
        this.editorial.setNombre("Sudamericana");
        assertEquals("Sudamericana", this.editorial.getNombre());
    }

    @Test
    void setDireccion() {
        this.editorial.setDirección("Avenida siempre viva 742");
        assertEquals("Avenida siempre viva 742", this.editorial.getDirección());
    }
}