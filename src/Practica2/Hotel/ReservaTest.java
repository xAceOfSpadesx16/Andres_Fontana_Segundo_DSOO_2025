package Practica2.Hotel;// Practica2.Hotel.ReservaTest.java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {
    private Persona cliente;
    private Habitacion habitacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Reserva reserva;

    @BeforeEach
    void setUp() {
        cliente = new Persona("Ana", "Garcia", "87654321B");
        habitacion = new Habitacion(103, "Simple", 80.0);
        fechaInicio = LocalDate.of(2024, 11, 10);
        fechaFin = LocalDate.of(2024, 11, 15);
        reserva = new Reserva(cliente, habitacion, fechaInicio, fechaFin);
    }

    @Test
    void constructorAndGetters() {
        assertEquals(cliente, reserva.getCliente());
        assertEquals(habitacion, reserva.getHabitacion());
        assertEquals(fechaInicio, reserva.getFechaInicio());
        assertEquals(fechaFin, reserva.getFechaFin());
    }

    @Test
    void calcularDuracion() {

        assertEquals(5, reserva.calcularDuracion());

        LocalDate fechaInicio= LocalDate.of(2024, 11, 10);
        LocalDate fechaFinDiaSiguiente = LocalDate.of(2024, 11, 11);
        Reserva reservaDiaSiguiente = new Reserva(cliente, habitacion, fechaInicio, fechaFinDiaSiguiente);
        assertEquals(1, reservaDiaSiguiente.calcularDuracion());
    }

    @Test
    void calcularCostoTotal() {
        assertEquals(400, reserva.calcularCostoTotal());
    }

    @Test
    void setCliente() {
        Persona nuevoCliente = new Persona("Pedro", "Lopez", "98765432C");
        reserva.setCliente(nuevoCliente);
        assertEquals(nuevoCliente, reserva.getCliente());
    }

    @Test
    void setHabitacion() {
        Habitacion nuevaHabitacion = new Habitacion(104, "Suite", 200.0);
        reserva.setHabitacion(nuevaHabitacion);
        assertEquals(nuevaHabitacion, reserva.getHabitacion());
    }

    @Test
    void setFechaInicio() {
        LocalDate nuevaFechaInicio = LocalDate.of(2024, 12, 1);
        reserva.setFechaInicio(nuevaFechaInicio);
        assertEquals(nuevaFechaInicio, reserva.getFechaInicio());
    }

    @Test
    void setFechaFin() {
        LocalDate nuevaFechaFin = LocalDate.of(2024, 12, 10);
        reserva.setFechaFin(nuevaFechaFin);
        assertEquals(nuevaFechaFin, reserva.getFechaFin());
    }

    @Test
    void setPago() {
        Pago nuevoPago = new Pago(100.0, 3);
        reserva.setPago(nuevoPago);
        assertEquals(nuevoPago.getCostoTotal(), reserva.calcularCostoTotal(), 0.001);
    }
}