import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class HabitacionVIPTest {
    private HabitacionVIP habitacionVIP;
    private List<String> serviciosExtra;

    @BeforeEach
    void setUp() {
        serviciosExtra = List.of("Jacuzzi", "Vista al mar");
        habitacionVIP = new HabitacionVIP(201, 300.0, serviciosExtra);
    }

    @Test
    void constructorAndGetters() {
        assertEquals(201, habitacionVIP.getNumero());
        assertEquals("Habitacion VIP", habitacionVIP.getTipo());
        assertEquals(300.0, habitacionVIP.getPrecio());
        assertEquals(serviciosExtra, habitacionVIP.getServiciosExtra());
    }
}