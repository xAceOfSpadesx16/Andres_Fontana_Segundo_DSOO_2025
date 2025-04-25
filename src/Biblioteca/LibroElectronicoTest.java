package Biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibroElectronicoTest {
    private LibroElectronico libro;
    private Autor autor;
    private Editorial editorial;

    @BeforeEach
    void setUp() {
        this.autor = new Autor("Jorge Luis Borges", "Argentino");
        this.editorial = new Editorial("Emecé", "Calle inventada 456");
        this.libro = new LibroElectronico("El Aleph", "978-8445076044", this.autor, this.editorial, "PDF");
    }

    @Test
    void constructorYGetters() {
        assertEquals("El Aleph", this.libro.getTitulo());
        assertEquals("978-8445076044", this.libro.getIsbn());
        assertEquals(this.autor, this.libro.getAutor());
        assertEquals(this.editorial, this.libro.getEditorial());
        assertEquals("PDF", this.libro.getFormato());
    }

    @Test
    void setFormato() {
        this.libro.setFormato("EPUB");
        assertEquals("EPUB", this.libro.getFormato());
    }
}