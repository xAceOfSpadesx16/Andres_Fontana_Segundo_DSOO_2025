package Practica3.Animal;

public class Caballo extends Animal{

    public Caballo(){
        super();
    }

    @Override
    public void hacerSonido() {
        System.out.println("*Sonido de relincho*");
    }
}
