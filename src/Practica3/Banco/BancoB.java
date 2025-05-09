package Practica3.Banco;

public class BancoB extends Banco{
    // Intereses fijos acorde al monto, no definido como atributo.

    @Override
    public double calcularInteres(double monto) {
        double tasa;
        if (monto > 250_000){
            tasa = 2.0;
        } else {
            tasa = 5.0;
        };
        return monto * (tasa / 100);
    }
}
