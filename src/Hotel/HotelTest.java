package Hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class HotelTest {
    private Hotel hotel;
    private Habitacion habitacion1;
    private Habitacion habitacion2;
    private Persona cliente1;
    private Persona cliente2;
    private Reserva reserva1;
    private Reserva reserva2;
    private Reserva reserva3;

    @BeforeEach
    void setUp() {
        hotel = new Hotel("Hotel.Hotel Testing", "Calle Test 456");
        habitacion1 = new Habitacion(101, "Simple", 100.0);
        habitacion2 = new Habitacion(102, "Doble", 150.0);
        cliente1 = new Persona("Carlos", "Ruiz", "11223344D");
        cliente2 = new Persona("Maria", "Lopez", "55667788E");
        reserva1 = new Reserva(cliente1, habitacion1, LocalDate.of(2025, 1, 1), LocalDate.of(2025, 1, 5));
        reserva2 = new Reserva(cliente2, habitacion2, LocalDate.of(2025, 1, 10), LocalDate.of(2025, 1, 12));
        reserva3 = new Reserva(cliente1, habitacion2, LocalDate.of(2025, 2, 1), LocalDate.of(2025, 2, 3));
    }

    @Test
    void constructorAndGetters() {
        assertEquals("Hotel.Hotel Testing", hotel.getNombre());
        assertEquals("Calle Test 456", hotel.getDireccion());
        assertNotNull(hotel.getHabitaciones());
        assertTrue(hotel.getHabitaciones().isEmpty());
        assertNotNull(hotel.getReservas());
        assertTrue(hotel.getReservas().isEmpty());
    }

    @Test
    void setNombre() {
        hotel.setNombre("Nuevo Nombre Hotel.Hotel");
        assertEquals("Nuevo Nombre Hotel.Hotel", hotel.getNombre());
    }

    @Test
    void setDireccion() {
        hotel.setDireccion("Nueva Dirección 789");
        assertEquals("Nueva Dirección 789", hotel.getDireccion());
    }


    @Test
    void agregarHabitacion() {
        hotel.agregarHabitacion(habitacion1);
        assertEquals(1, hotel.getHabitaciones().size());
        assertTrue(hotel.getHabitaciones().contains(habitacion1));

        hotel.agregarHabitacion(habitacion2);
        assertEquals(2, hotel.getHabitaciones().size());
        assertTrue(hotel.getHabitaciones().contains(habitacion2));
    }

    @Test
    void realizarReserva() {
        hotel.realizarReserva(reserva1);
        assertEquals(1, hotel.getReservas().size());
        assertTrue(hotel.getReservas().contains(reserva1));

        hotel.realizarReserva(reserva2);
        assertEquals(2, hotel.getReservas().size());
        assertTrue(hotel.getReservas().contains(reserva2));
    }

    @Test
    void obtenerReservasPorCliente() {
        hotel.realizarReserva(reserva1);
        hotel.realizarReserva(reserva2);
        hotel.realizarReserva(reserva3);

        List<Reserva> reservasCliente1 = hotel.obtenerReservasPorCliente(cliente1);
        assertNotNull(reservasCliente1);
        assertEquals(2, reservasCliente1.size());
        assertTrue(reservasCliente1.contains(reserva1));
        assertTrue(reservasCliente1.contains(reserva3));

        List<Reserva> reservasCliente2 = hotel.obtenerReservasPorCliente(cliente2);
        assertNotNull(reservasCliente2);
        assertEquals(1, reservasCliente2.size());
        assertTrue(reservasCliente2.contains(reserva2));

        // Test con un cliente sin reservas
        Persona clienteSinReservas = new Persona("Luis", "Blanco", "99887766F");
        List<Reserva> reservasClienteSinReservas = hotel.obtenerReservasPorCliente(clienteSinReservas);
        assertNotNull(reservasClienteSinReservas);
        assertTrue(reservasClienteSinReservas.isEmpty());
    }

    @Test
    void obtenerReservasPorClienteListaVacia() {
        // Sin reservas añadidas al hotel
        List<Reserva> reservasCliente = hotel.obtenerReservasPorCliente(cliente1);
        assertNotNull(reservasCliente);
        assertTrue(reservasCliente.isEmpty());
    }

    @Test
    void getHabitaciones() {
        hotel.agregarHabitacion(habitacion1);
        hotel.agregarHabitacion(habitacion2);
        List<Habitacion> habitacionesHotel = hotel.getHabitaciones();
        assertNotNull(habitacionesHotel);
        assertEquals(2, habitacionesHotel.size());
        assertTrue(habitacionesHotel.contains(habitacion1));
        assertTrue(habitacionesHotel.contains(habitacion2));
    }

    @Test
    void getReservas() {
        hotel.realizarReserva(reserva1);
        hotel.realizarReserva(reserva2);
        List<Reserva> reservasHotel = hotel.getReservas();
        assertNotNull(reservasHotel);
        assertEquals(2, reservasHotel.size());
        assertTrue(reservasHotel.contains(reserva1));
        assertTrue(reservasHotel.contains(reserva2));
    }
}