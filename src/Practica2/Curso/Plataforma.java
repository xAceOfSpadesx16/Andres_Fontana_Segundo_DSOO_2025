package Practica2.Curso;
import java.util.ArrayList;
import java.util.List;

class Plataforma {
    private String nombre;
    private List<Curso> cursos;
    private List<Estudiante> estudiantes;
    private List<Inscripcion> inscripciones;

    public Plataforma(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
        this.inscripciones = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void registrarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void inscribirEstudiante(Inscripcion inscripcion) {
        inscripciones.add(inscripcion);
    }

    public List<Curso> obtenerCursosPorEstudiante(Estudiante estudiante) {
        List<Curso> cursosEstudiante = new ArrayList<>();
        for (Inscripcion inscripcion : inscripciones) {
            if (inscripcion.getEstudiante().equals(estudiante)) {
                cursosEstudiante.add(inscripcion.getCurso());
            }
        }
        return cursosEstudiante;
    }

    // Implementado para no utilizar final
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Curso> getCursos() {
        return this.cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Inscripcion> getInscripciones() {
        return this.inscripciones;
    }

    public void setInscripciones(List<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }

}