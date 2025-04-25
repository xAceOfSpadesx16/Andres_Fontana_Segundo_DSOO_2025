package Biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibroTest {
    private Libro libro;
    private Autor autor;
    private Editorial editorial;

    @BeforeEach
    void setUp() {
        this.autor = new Autor("Gabriel Garcia Marquez", "Colombiano");
        this.editorial = new Editorial("Planeta", "Calle falsa 123");
        this.libro = new Libro("Cien años de soledad", "978-0679729584", this.autor, this.editorial);
    }

    @Test
    void constructorYGetters() {
        assertEquals("Cien años de soledad", this.libro.getTitulo());
        assertEquals("978-0679729584", this.libro.getIsbn());
        assertEquals(this.autor, this.libro.getAutor());
        assertEquals(this.editorial, this.libro.getEditorial());
    }

    @Test
    void setTitulo() {
        this.libro.setTitulo("El amor en los tiempos del cólera");
        assertEquals("El amor en los tiempos del cólera", this.libro.getTitulo());
    }

    @Test
    void setIsbn() {
        this.libro.setIsbn("978-9875801704");
        assertEquals("978-9875801704", this.libro.getIsbn());
    }

    @Test
    void setAutor() {
        Autor nuevoAutor = new Autor("Julio Cortazar", "Argentino");
        this.libro.setAutor(nuevoAutor);
        assertEquals(nuevoAutor, this.libro.getAutor());
    }

    @Test
    void setEditorial() {
        Editorial nuevaEditorial = new Editorial("Sudamericana", "Avenida siempre viva 742");
        this.libro.setEditorial(nuevaEditorial);
        assertEquals(nuevaEditorial, this.libro.getEditorial());
    }
}