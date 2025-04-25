package Practica2.Curso;

class ModuloConVideo extends Modulo {
    private String urlVideo;

    public ModuloConVideo(String titulo, int duracion, Recurso recurso, String urlVideo) {
        super(titulo, duracion, recurso);
        this.urlVideo = urlVideo;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    // Implementado para no utilizar final
    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }
}