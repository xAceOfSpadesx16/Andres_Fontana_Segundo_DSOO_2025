package ClasesAbstractas.Vehiculo;

public abstract class Vehiculo {
    protected String modelo;
    protected String marca;
    protected int velocidad = 0;
    

    public abstract void acelerar();

    public abstract void frenar();

    public void mostrarEstado() {
        System.out.println("Velocidad actual de " + this.getClass().getSimpleName() + ": " + velocidad + " km/h");
    }

    // Constructor, Getters y Setters
    public Vehiculo(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
