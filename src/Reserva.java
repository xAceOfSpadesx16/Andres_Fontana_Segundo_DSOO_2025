import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
    private Persona cliente;
    private Habitacion habitacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Pago pago;

    public Reserva(Persona cliente, Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.pago = new Pago(this.habitacion.getPrecio(), this.calcularDuracion());

    }

    public long calcularDuracion(){
        return ChronoUnit.DAYS.between(this.fechaInicio, this.fechaFin);
    }

    public double calcularCostoTotal(){
        return this.pago.getCostoTotal();
    }

    public Persona getCliente() {
        return this.cliente;
    }

    public Habitacion getHabitacion() {
        return this.habitacion;
    }

    public LocalDate getFechaInicio() {
        return this.fechaInicio;
    }

    public LocalDate getFechaFin() {
        return this.fechaFin;
    }


    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
}
