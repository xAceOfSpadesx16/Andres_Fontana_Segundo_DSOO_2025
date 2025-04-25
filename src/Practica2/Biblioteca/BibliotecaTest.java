package Practica2.Biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {
    private Biblioteca biblioteca;
    private Libro libro1;
    private Libro libro2;
    private Lector lector1;
    private Lector lector2;
    private Prestamo prestamo1;
    private Prestamo prestamo2;
    private Prestamo prestamo3;

    @BeforeEach
    void setUp() {
        this.biblioteca = new Biblioteca("Practica2.Biblioteca Central", "Avenida Principal 456");

        Autor autor1 = new Autor("Gabriel Garcia Marquez", "Colombiano");
        Editorial editorial1 = new Editorial("Planeta", "Calle falsa 123");
        this.libro1 = new Libro("Cien años de soledad", "978-0679729584", autor1, editorial1);
        this.libro2 = new Libro("El Aleph", "978-8445076044", autor1, editorial1);

        this.lector1 = new Lector(1, "Maria Gomez", "Calle secundaria 789");
        this.lector2 = new Lector(2, "Pedro Lopez", "Avenida terciaria 101");

        this.prestamo1 = new Prestamo(this.lector1, this.libro1, LocalDate.of(2023, 10, 1), LocalDate.of(2023, 10, 15));
        this.prestamo2 = new Prestamo(this.lector2, this.libro2, LocalDate.of(2023, 10, 10), LocalDate.of(2023, 10, 20));
        this.prestamo3 = new Prestamo(this.lector1, this.libro2, LocalDate.of(2023, 11, 1), LocalDate.of(2023, 11, 5));
    }

    @Test
    void constructorYGetters() {
        assertEquals("Practica2.Biblioteca Central", this.biblioteca.getNombre());
        assertEquals("Avenida Principal 456", this.biblioteca.getDireccion());

        assertNotNull(this.biblioteca.getLibros());
        assertTrue(this.biblioteca.getLibros().isEmpty());

        assertNotNull(this.biblioteca.getLectores());
        assertTrue(this.biblioteca.getLectores().isEmpty());

        assertNotNull(this.biblioteca.getPrestamos());
        assertTrue(this.biblioteca.getPrestamos().isEmpty());
    }

    @Test
    void setNombre() {
        this.biblioteca.setNombre("Practica2.Biblioteca del Parque");
        assertEquals("Practica2.Biblioteca del Parque", this.biblioteca.getNombre());
    }

    @Test
    void setDireccion() {
        this.biblioteca.setDireccion("Plaza San Martin");
        assertEquals("Plaza San Martin", this.biblioteca.getDireccion());
    }

    @Test
    void agregarLibro() {
        this.biblioteca.agregarLibro(this.libro1);
        assertTrue(this.biblioteca.getLibros().contains(this.libro1));

        this.biblioteca.agregarLibro(this.libro2);
        assertEquals(2, this.biblioteca.getLibros().size());
        assertTrue(this.biblioteca.getLibros().contains(this.libro2));
    }

    @Test
    void registrarLector() {
        this.biblioteca.registrarLector(this.lector1);
        assertEquals(1, this.biblioteca.getLectores().size());
        assertTrue(this.biblioteca.getLectores().contains(this.lector1));

        this.biblioteca.registrarLector(this.lector2);
        assertTrue(this.biblioteca.getLectores().contains(this.lector2));

        assertEquals(2, this.biblioteca.getLectores().size());

    }

    @Test
    void realizarPrestamo() {
        this.biblioteca.realizarPrestamo(this.prestamo1);
        assertTrue(this.biblioteca.getPrestamos().contains(this.prestamo1));

        this.biblioteca.realizarPrestamo(this.prestamo2);
        assertTrue(this.biblioteca.getPrestamos().contains(this.prestamo2));

        assertEquals(2, this.biblioteca.getPrestamos().size());

    }

    @Test
    void obtenerPrestamosPorLector() {
        this.biblioteca.realizarPrestamo(this.prestamo1);
        this.biblioteca.realizarPrestamo(this.prestamo2);
        this.biblioteca.realizarPrestamo(this.prestamo3);

        List<Prestamo> prestamosLector1 = this.biblioteca.obtenerPrestamosPorLector(this.lector1);
        assertNotNull(prestamosLector1);
        assertEquals(2, prestamosLector1.size());
        assertTrue(prestamosLector1.contains(this.prestamo1));
        assertTrue(prestamosLector1.contains(this.prestamo3));

        List<Prestamo> prestamosLector2 = this.biblioteca.obtenerPrestamosPorLector(this.lector2);
        assertNotNull(prestamosLector2);
        assertEquals(1, prestamosLector2.size());
        assertTrue(prestamosLector2.contains(this.prestamo2));

        Lector lectorSinPrestamos = new Lector(3, "Ana Fernandez", "Calle inventada 99");
        List<Prestamo> prestamosLectorSinPrestamos = this.biblioteca.obtenerPrestamosPorLector(lectorSinPrestamos);
        assertNotNull(prestamosLectorSinPrestamos);
        assertTrue(prestamosLectorSinPrestamos.isEmpty());
    }

    @Test
    void getLibros() {
        this.biblioteca.agregarLibro(this.libro1);
        this.biblioteca.agregarLibro(this.libro2);
        List<Libro> librosBiblioteca = this.biblioteca.getLibros();

        assertNotNull(librosBiblioteca);
        assertEquals(2, librosBiblioteca.size());
        assertTrue(librosBiblioteca.contains(this.libro1));
        assertTrue(librosBiblioteca.contains(this.libro2));
    }

    @Test
    void setLibros() {
        Libro libro1 = new Libro("Libro 1", "111", new Autor("A1", "N1"), new Editorial("E1", "D1"));
        Libro libro2 = new Libro("Libro 2", "222", new Autor("A2", "N2"), new Editorial("E2", "D2"));
        List<Libro> nuevosLibros = new ArrayList<>();
        nuevosLibros.add(libro1);
        nuevosLibros.add(libro2);

        this.biblioteca.setLibros(nuevosLibros);
        assertEquals(2, this.biblioteca.getLibros().size());
        assertEquals("Libro 1", this.biblioteca.getLibros().getFirst().getTitulo());
        assertEquals("Libro 2", this.biblioteca.getLibros().getLast().getTitulo());
    }


    @Test
    void getLectores() {
        this.biblioteca.registrarLector(this.lector1);
        this.biblioteca.registrarLector(this.lector2);
        List<Lector> lectoresBiblioteca = this.biblioteca.getLectores();

        assertNotNull(lectoresBiblioteca);
        assertEquals(2, lectoresBiblioteca.size());
        assertTrue(lectoresBiblioteca.contains(this.lector1));
        assertTrue(lectoresBiblioteca.contains(this.lector2));
    }

    @Test
    void setLectores() {
        List<Lector> nuevosLectores = new ArrayList<>();
        Lector lector1 = new Lector(3, "Nuevo Lector", "Nueva Direccion");
        Lector lector2 = new Lector(4, "Lector 2", "Direccion 2");
        nuevosLectores.add(lector1);
        nuevosLectores.add(lector2);

        this.biblioteca.setLectores(nuevosLectores);
        assertEquals(2, this.biblioteca.getLectores().size());
        assertEquals("Nuevo Lector", this.biblioteca.getLectores().getFirst().getNombre());
        assertEquals("Lector 2", this.biblioteca.getLectores().getLast().getNombre());
    }


    @Test
    void getPrestamos() {
        this.biblioteca.realizarPrestamo(this.prestamo1);
        this.biblioteca.realizarPrestamo(this.prestamo2);
        List<Prestamo> prestamosBiblioteca = this.biblioteca.getPrestamos();

        assertNotNull(prestamosBiblioteca);
        assertEquals(2, prestamosBiblioteca.size());
        assertTrue(prestamosBiblioteca.contains(this.prestamo1));
        assertTrue(prestamosBiblioteca.contains(this.prestamo2));
    }

    @Test
    void setPrestamos() {
        List<Prestamo> nuevosPrestamos = new ArrayList<>();
        nuevosPrestamos.add(this.prestamo1);

        this.biblioteca.setPrestamos(nuevosPrestamos);
        assertEquals(1, this.biblioteca.getPrestamos().size());
    }
}