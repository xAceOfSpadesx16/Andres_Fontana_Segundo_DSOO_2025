package Practica2.Curso;
import java.util.ArrayList;
import java.util.List;

class Curso {
    private String nombre;
    private Instructor instructor;
    private List<Modulo> modulos;

    public Curso(String nombre, Instructor instructor) {
        this.nombre = nombre;
        this.instructor = instructor;
        this.modulos = new ArrayList<>();
    }

    public void agregarModulo(Modulo modulo) {
        modulos.add(modulo);
    }

    public int calcularDuracionTotal() {
        int duracionTotal = 0;
        for (Modulo modulo : modulos) {
            duracionTotal += modulo.getDuracion();
        }
        return duracionTotal;
    }

    // Implementado para no utilizar de final.
    public List<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Curso" + " " + this.nombre;
    }
}
