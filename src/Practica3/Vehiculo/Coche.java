package Practica3.Vehiculo;

public class Coche extends Vehiculo{
    private int cambio = 0;

    public Coche(String modelo, String marca) {
        super(modelo, marca);
    }

    @Override
    public void acelerar() {
        System.out.println("El coche acelera");
        this.velocidad += 10;
        if (this.velocidad > this.cambio * 20 && this.cambio < 6) {
            this.cambio++;
            System.out.println("Metiendo cambio: " + this.cambio + "°");
        }
        this.mostrarEstado();
    }

    @Override
    public void frenar() {
        System.out.println("El coche reduce su velocidad en 10 km/h");
        this.velocidad = Math.max(0, this.velocidad - 15);
        if (this.velocidad < this.cambio * 20 && this.cambio > 1 && this.velocidad > 0) {
            this.cambio--;
            System.out.println("Bajando cambio a: " + this.cambio + "°");
        } else if (this.velocidad == 0 && this.cambio >= 1) {
            System.out.println("Poniendo en punto muerto.");
            this.cambio = 0;
        }
        this.mostrarEstado();
    }

    public int getCambio() {
        return cambio;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }
}
