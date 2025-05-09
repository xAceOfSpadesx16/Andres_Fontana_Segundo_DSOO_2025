package Practica3.Banco;

public class BancoC extends Banco {
    // Interes definido como atributo de clase, inmutable.

    private static final double tasa = 3.0;

    @Override
    public double calcularInteres(double monto) {
        return monto * (tasa / 100);
    }
}
