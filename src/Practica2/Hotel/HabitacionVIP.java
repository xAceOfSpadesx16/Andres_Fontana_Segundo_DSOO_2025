package Practica2.Hotel;

import java.util.List;

public class HabitacionVIP extends Habitacion {
    private final List<String> serviciosExtra;

    public HabitacionVIP(int numero, double precio, List<String> serviciosExtra) {
        super(numero, "Practica2.Hotel.Habitacion VIP", precio);
        this.serviciosExtra = serviciosExtra;
    }

    public List<String> getServiciosExtra(){
        return this.serviciosExtra;
    }
}
