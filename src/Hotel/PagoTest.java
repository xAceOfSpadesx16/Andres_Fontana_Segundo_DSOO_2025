package Hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PagoTest {
    private Pago pago;

    @BeforeEach
    void setUp() {
        pago = new Pago(100.0, 5);
    }

    @Test
    void constructorAndGetCostoTotal() {
        assertEquals(500.0, pago.getCostoTotal());
    }

    @Test
    void costoTotalConCeroDias() {
        Pago pagoCeroDias = new Pago(100.0, 0);
        assertEquals(0.0, pagoCeroDias.getCostoTotal());
    }

    @Test
    void costoTotalconComa() {
        Pago pagoDiferente = new Pago(75.5, 3);
        assertEquals(226.5, pagoDiferente.getCostoTotal());
    }
}