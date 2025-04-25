package Practica2.Biblioteca;

class LibroElectronico extends Libro {
    private String formato;

    public LibroElectronico(String titulo, String isbn, Autor autor, Editorial editorial, String formato) {
        super(titulo, isbn, autor, editorial);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}