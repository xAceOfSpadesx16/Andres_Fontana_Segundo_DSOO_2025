package ClasesAbstractas.Animal;

public abstract class Animal {
    protected boolean tieneSueño;
    protected boolean tieneHambre;

    public Animal(){
        this.tieneHambre = true;
        this.tieneSueño = true;
    }
    public abstract void hacerSonido();

    public void comer(){
        this.tieneHambre = false;
    }

    // Aca deberia ir logica que defina tieneHambre como true.

    public void dormir(){
        this.tieneSueño = false;
    }

    // Aca deberia ir logica que defina tieneSueño como true.

}
