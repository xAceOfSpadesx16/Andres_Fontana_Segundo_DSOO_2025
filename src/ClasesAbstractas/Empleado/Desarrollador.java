package ClasesAbstractas.Empleado;

public class Desarrollador extends Empleado {

    public Desarrollador(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + this.salarioBase * 0.005 * this.getHorasTrabajadas();
    }

    public int getHorasTrabajadas() {
        return 40; // ejemplo
    }
}
