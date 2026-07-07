
import java.util.ArrayList;

class CBiblioteca {
    private String nombre;
    private ArrayList<CLibro> libros; // Relación de agregación

    // Constructor
    public CBiblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // Método para agregar libro
    public void agregarLibro(CLibro libro) {
        libros.add(libro);
        System.out.println("✓ Libro agregado: " + libro.getTitulo());
    }

    // Método para mostrar todos los libros
    public void mostrarLibros() {
        System.out.println("\n=== CATÁLOGO DE LA " + nombre.toUpperCase() + " ===");
        System.out.println("Total de libros: " + libros.size());
        System.out.println("─".repeat(60));

        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (int i = 0; i < libros.size(); i++) {
                System.out.printf("%d. %s%n", (i + 1), libros.get(i));
            }
        }
        System.out.println("─".repeat(60));
    }

    // Método para obtener la cantidad de libros
    public int getCantidadLibros() {
        return libros.size();
    }

    // Getter para el nombre
    public String getNombre() { return nombre; }

    // Método para obtener un libro específico por índice
    public CLibro getLibro(int indice) {
        if (indice >= 0 && indice < libros.size()) {
            return libros.get(indice);
        }
        return null;
    }
}
