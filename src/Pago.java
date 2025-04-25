public class Pago {

    private final double costoTotal;

    public Pago(double costoDiario, long plazoDias) {
        this.costoTotal = costoDiario * plazoDias;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

}
