package ClasesAbstractas.Empleado;

public class Vendedor extends Empleado{


    public Vendedor(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + 100_000;
    }
}
