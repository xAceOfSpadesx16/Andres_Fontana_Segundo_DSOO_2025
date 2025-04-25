package Biblioteca;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private String nombre;
    private String direccion;
    private List<Libro> libros;
    private List<Lector> lectores;
    private List<Prestamo> prestamos;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.libros = new ArrayList<>();
        this.lectores = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarLector(Lector lector) {
        lectores.add(lector);
    }

    public void realizarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public List<Prestamo> obtenerPrestamosPorLector(Lector lector) {
        List<Prestamo> prestamosLector = new ArrayList<>();
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getLector().equals(lector)) {
                prestamosLector.add(prestamo);
            }
        }
        return prestamosLector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Lector> getLectores() {
        return lectores;
    }

    public void setLectores(List<Lector> lectores) {
        this.lectores = lectores;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
}