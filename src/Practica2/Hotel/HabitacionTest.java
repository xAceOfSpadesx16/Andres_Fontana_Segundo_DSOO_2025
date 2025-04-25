package Practica2.Hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HabitacionTest {
    private Habitacion habitacion;

    @BeforeEach
    void setUp() {
        habitacion = new Habitacion(101, "Doble", 150.0);
    }

    @Test
    void constructorYGetters() {
        assertEquals(101, habitacion.getNumero());
        assertEquals("Doble", habitacion.getTipo());
        assertEquals(150.0, habitacion.getPrecio());
    }

    @Test
    void setNumero() {
        habitacion.setNumero(102);
        assertEquals(102, habitacion.getNumero());
    }

    @Test
    void setTipo() {
        habitacion.setTipo("Simple");
        assertEquals("Simple", habitacion.getTipo());
    }

    @Test
    void setPrecio() {
        habitacion.setPrecio(160.0);
        assertEquals(160.0, habitacion.getPrecio());
    }
}