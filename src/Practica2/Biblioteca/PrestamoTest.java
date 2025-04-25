package Practica2.Biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PrestamoTest {
    private Lector lector;
    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Prestamo prestamo;

    @BeforeEach
    void setUp() {
        this.lector = new Lector(1, "Maria Gomez", "Calle secundaria 789");
        Autor autor = new Autor("Gabriel Garcia Marquez", "Colombiano");
        Editorial editorial = new Editorial("Planeta", "Calle falsa 123");
        this.libro = new Libro("Cien años de soledad", "978-0679729584", autor, editorial);
        this.fechaPrestamo = LocalDate.of(2023, 10, 1);
        this.fechaDevolucion = LocalDate.of(2023, 10, 15); // 14 días de préstamo
        this.prestamo = new Prestamo(this.lector, this.libro, this.fechaPrestamo, this.fechaDevolucion);
    }

    @Test
    void constructorYGetters() {
        assertEquals(this.lector, this.prestamo.getLector());
        assertEquals(this.libro, this.prestamo.getLibro());
        assertEquals(this.fechaPrestamo, this.prestamo.getFechaPrestamo());
        assertEquals(this.fechaDevolucion, this.prestamo.getFechaDevolucion());
    }

    @Test
    void calcularDiasPrestamo() {
        long diasEsperados = 14;
        assertEquals(diasEsperados, this.prestamo.calcularDiasPrestamo());

        LocalDate fechaInicio = LocalDate.of(2023, 10, 1);
        LocalDate fechaFin = LocalDate.of(2023, 10, 2);
        Prestamo prestamo = new Prestamo(this.lector, this.libro, fechaInicio, fechaFin);
        assertEquals(1, prestamo.calcularDiasPrestamo());
    }

    @Test
    void setLector() {
        Lector nuevoLector = new Lector(2, "Pedro Lopez", "Avenida terciaria 101");
        this.prestamo.setLector(nuevoLector);
        assertEquals(nuevoLector, this.prestamo.getLector());
    }

    @Test
    void setLibro() {
        Autor nuevoAutor = new Autor("Julio Cortazar", "Argentino");
        Editorial nuevaEditorial = new Editorial("Sudamericana", "Avenida siempre viva 742");
        Libro nuevoLibro = new Libro("Rayuela", "978-6073112741", nuevoAutor, nuevaEditorial);
        this.prestamo.setLibro(nuevoLibro);
        assertEquals(nuevoLibro, this.prestamo.getLibro());
    }

    @Test
    void setFechaPrestamo() {
        LocalDate nuevaFechaPrestamo = LocalDate.of(2023, 11, 1);
        this.prestamo.setFechaPrestamo(nuevaFechaPrestamo);
        assertEquals(nuevaFechaPrestamo, this.prestamo.getFechaPrestamo());
    }

    @Test
    void setFechaDevolucion() {
        LocalDate nuevaFechaDevolucion = LocalDate.of(2023, 11, 15);
        this.prestamo.setFechaDevolucion(nuevaFechaDevolucion);
        assertEquals(nuevaFechaDevolucion, this.prestamo.getFechaDevolucion());
    }
}