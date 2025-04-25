package Hotel;

import java.time.LocalDate;
import java.util.List;

//... (Clases Hotel.Persona, Hotel.Habitacion, Hotel.HabitacionVIP, Hotel.Pago, Hotel.Reserva, Hotel.Hotel - como en la respuesta anterior)

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel.Hotel Paraiso", "Calle Principal 123");

        Habitacion habitacion1 = new Habitacion(101, "Doble", 100.0);
        HabitacionVIP habitacionVIP = new HabitacionVIP(201, 200.0, List.of("Jacuzzi", "Vista al mar"));

        hotel.agregarHabitacion(habitacion1);
        hotel.agregarHabitacion(habitacionVIP);

        Persona cliente = new Persona("Juan", "Perez", "12345678A");
        Reserva reserva = new Reserva(cliente, habitacion1, LocalDate.of(2023, 10, 1), LocalDate.of(2023, 10, 5));

        hotel.realizarReserva(reserva);

        System.out.println("Reservas de " + cliente.getNombre() + ": " + hotel.obtenerReservasPorCliente(cliente));
    }
}