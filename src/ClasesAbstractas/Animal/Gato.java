package ClasesAbstractas.Animal;

public class Gato extends Animal{

    public Gato(){
        super();
    }
    @Override
    public void hacerSonido() {
        System.out.println("Miauuu!");
    }
}
