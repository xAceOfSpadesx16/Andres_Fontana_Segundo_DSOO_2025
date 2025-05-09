package Practica3.Empleado;

public abstract class Empleado {
    protected String nombre;
    protected double salario;
    protected double salarioBase = 500_000;

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.salario = this.calcularSalario();
    }

    public abstract double calcularSalario();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }


    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
        this.salario = this.calcularSalario();
    }
}
