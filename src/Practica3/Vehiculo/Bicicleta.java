package Practica3.Vehiculo;

public class Bicicleta extends Vehiculo {
    private int esfuerzoCiclista = 0;

    public Bicicleta(String modelo, String marca) {
        super(modelo, marca);
    }

    @Override
    public void acelerar() {
        this.velocidad += 5;
        this.esfuerzoCiclista = Math.min(100, this.esfuerzoCiclista + 10);
        this.mostrarEstado();
    }

    @Override
    public void frenar() {
        this.velocidad = Math.max(0, this.velocidad - 5);
        if (this.velocidad == 0) {
            this.esfuerzoCiclista = 0;
        }else{
            this.esfuerzoCiclista = Math.max(0, this.esfuerzoCiclista - 10);
        }
        this.mostrarEstado();
    }

    @Override
    public void mostrarEstado() {
        super.mostrarEstado();
        System.out.println("Esfuerzo del ciclista: " + esfuerzoCiclista + "%");
    }
}
