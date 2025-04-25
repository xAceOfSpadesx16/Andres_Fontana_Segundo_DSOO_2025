package Practica2.Curso;

class Modulo {
    private String titulo;
    private int duracion;
    private Recurso recurso;

    public Modulo(String titulo, int duracion, Recurso recurso) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.recurso = recurso;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    // Implementado para no utilizar final
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }
}