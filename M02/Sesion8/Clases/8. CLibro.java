
public class CLibro {
    private String titulo;
    private String autor;
    private String isbn;

    // Constructor
    public CLibro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    // Método toString para mostrar información del libro
    @Override
    public String toString() {
        return "Título: " + titulo + " | Autor: " + autor + " | ISBN: " + isbn;
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }

}
