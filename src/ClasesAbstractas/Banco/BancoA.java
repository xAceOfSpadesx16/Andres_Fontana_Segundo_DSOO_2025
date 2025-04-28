package ClasesAbstractas.Banco;

public class BancoA extends Banco {
    // Atributo de instancia, acorde a inicializacion en Constructor.

    private double interes;

    public BancoA(double interes) {
        this.interes = interes;
    }

    @Override
    public double calcularInteres(double monto) {
        return monto * (this.interes / 100);
    }

    public double getInteres() {
        return interes;
    }
    public void setInteres(double interes) {
        this.interes = interes;
    }
}
