package Practica3.Vehiculo;

public class Motocicleta extends Vehiculo {
    public Motocicleta(String modelo, String marca) {
        super(modelo, marca);
    }

    @Override
    public void acelerar() {
        System.out.println("La motocicleta acelera");
        this.velocidad += 15;
        this.mostrarEstado();
    }

    @Override
    public void frenar() {
        System.out.println("La motocicleta reduce su velocidad en 10 km/h");
        this.velocidad = Math.max(0, this.velocidad - 10);
        this.mostrarEstado();
    }

    public void frenar(boolean frenoBrusco, int intensidadFreno) {
        if (frenoBrusco) {
            System.out.println("La motocicleta reduce bruscamente su velocidad");
            this.velocidad = Math.max(0, this.velocidad - Math.max(20, intensidadFreno * 10));
        } else {
            this.frenar();
        }
        this.mostrarEstado();
    }
}
