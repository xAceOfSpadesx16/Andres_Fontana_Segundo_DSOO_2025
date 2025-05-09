package Practica3.Empleado;

public class Gerente extends Empleado {

    public Gerente(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + this.salarioBase * 0.95;
    }

}
