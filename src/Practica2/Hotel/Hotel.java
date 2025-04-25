package Practica2.Hotel;

import java.util.List;
import java.util.ArrayList;

public class Hotel {
    private String nombre;
    private String direccion;
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;


    public Hotel(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        this.habitaciones.add(habitacion);
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void realizarReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    public List<Reserva> obtenerReservasPorCliente(Persona cliente){
        List<Reserva> reservasPorCliente = new ArrayList<>();
        for(Reserva reserva: this.reservas){
            if(reserva.getCliente() == cliente){
                reservasPorCliente.add(reserva);
            }
        }
        return reservasPorCliente;
    }
}
