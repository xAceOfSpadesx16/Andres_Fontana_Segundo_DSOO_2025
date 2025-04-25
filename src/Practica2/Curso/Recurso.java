package Practica2.Curso;

class Recurso {
    private String nombre;
    private String url;

    public Recurso(String nombre, String url) {
        this.nombre = nombre;
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUrl() {
        return url;
    }

    // Implementado para no utilizar final
    public void setUrl(String url) {
        this.url = url;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}