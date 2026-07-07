
class CLibro {
    private String titulo;
    private String autor;
    private String id;

    public CLibro(String titulo, String autor, String id) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
