package Practica2.Hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
    private Persona persona;

    @BeforeEach
    void setUp() {
        persona = new Persona("Juan", "Perez", "12345678A");
    }

    @Test
    void constructorYGetters() {
        assertEquals("Juan", persona.getNombre());
        assertEquals("Perez", persona.getApellido());
        assertEquals("12345678A", persona.getDni());
    }

    @Test
    void getNombreCompleto() {
        assertEquals("Juan Perez", persona.getNombreCompleto());
    }

    @Test
    void setNombre() {
        persona.setNombre("Pedro");
        assertEquals("Pedro", persona.getNombre());
        assertEquals("Pedro Perez", persona.getNombreCompleto());
    }

    @Test
    void setApellido() {
        persona.setApellido("Gomez");
        assertEquals("Gomez", persona.getApellido());
        assertEquals("Juan Gomez", persona.getNombreCompleto());
    }

    @Test
    void setDni() {
        persona.setDni("87654321B");
        assertEquals("87654321B", persona.getDni());
    }
}